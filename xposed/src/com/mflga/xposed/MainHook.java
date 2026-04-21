package com.mflga.xposed;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.List;
import java.util.ArrayList;

public class MainHook implements IXposedHookLoadPackage {

    private static final String[] FL_SVC = {"service_fl_", "service_mock_location"};
    private static final String[] FL_PKG = {
        "com.lerist.fakelocation", "dev.lerist.fakelocation",
        "com.lerist.fakelocation.common.xposed"
    };
    // No hardcoded targets - LSPosed scope decides who gets hooked.
    // Skip only known system/FL packages that must NOT be hooked.
    private static final String[] SKIP = {
        "android",
        "com.lerist.fakelocation",
        "com.lerist.fakelocation.common.xposed"
    };

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        String pkg = lpparam.packageName;

        // system_server: only do blacklist hook
        if ("android".equals(pkg)) {
            hookAndroidProcess(lpparam);
            return;
        }

        // Skip FL itself
        for (String s : SKIP) {
            if (s.equals(pkg)) return;
        }
        // Skip system_server sub-packages: they have no appInfo or share system UID
        // Real target apps always have appInfo set by Zygote
        try {
            if (lpparam.appInfo == null) return;
            // Check if this is actually a user app (not system_server internal)
            int uid = ((android.content.pm.ApplicationInfo) lpparam.appInfo).uid;
            if (uid < 10000) return; // System UIDs are < 10000
        } catch (Throwable t) {
            return; // If we can't determine, skip to be safe
        }

        // Everything else: apply detection hiding (controlled by LSPosed scope)
        hookTargetApp(lpparam);
    }

    // ================================================================
    // IN SYSTEM_SERVER: fflbl approach - hook FL injection classloader
    // Key: run hooks in a NEW THREAD (exactly like fflbl did)
    // ================================================================

    private void hookAndroidProcess(XC_LoadPackage.LoadPackageParam lpparam) {
        XposedBridge.log("MFLGA: ClassLoader trap in system_server");

        XposedHelpers.findAndHookMethod(ClassLoader.class, "loadClass", String.class,
            new XC_MethodHook() {
                private volatile boolean done = false;

                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    if (done) return;
                    if (param.hasThrowable()) return;

                    try {
                        Class<?> cls = (Class<?>) param.getResult();
                        if (cls == null) return;
                        ClassLoader cl = cls.getClassLoader();
                        if (cl == null) return;
                        String s = cl.toString();
                        if (!s.contains("/data/fl/")) return;

                        done = true;
                        XposedBridge.log("MFLGA: Found FL injection CL");

                        // CRITICAL: run in new thread like fflbl did
                        final ClassLoader flCl = cl;
                        new Thread(new Runnable() {
                            public void run() {
                                hookInjectionBlacklist(flCl);
                            }
                        }).start();
                    } catch (Throwable ignored) {
                        // Never let this hook crash system_server
                    }
                }
            });
    }

    private void hookInjectionBlacklist(ClassLoader flCl) {
        // Hook setSafeApps: replace ALL real packages with dummies
        try {
            XposedHelpers.findAndHookMethod(
                "\u08A1.\u078A", flCl, "setSafeApps", java.util.List.class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        List list = (List) param.args[0];
                        if (list == null) return;
                        int size = list.size();
                        list.clear();
                        for (int i = 0; i < size; i++) {
                            list.add("x.placeholder." + i);
                        }
                        XposedBridge.log("MFLGA: setSafeApps ALL replaced (" + size + " entries)");
                    }
                });
            XposedBridge.log("MFLGA: setSafeApps hooked OK");
        } catch (Throwable t) {
            XposedBridge.log("MFLGA: setSafeApps FAIL: " + t.getMessage());
        }

        // Hook built-in blacklist: replace ALL with dummies
        try {
            XposedHelpers.findAndHookMethod(
                "\u08A1.\u0620", flCl, "\u037F",
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        ArrayList list = (ArrayList) param.getResult();
                        if (list == null) return;
                        int size = list.size();
                        list.clear();
                        for (int i = 0; i < size; i++) {
                            list.add("x.builtin." + i);
                        }
                        param.setResult(list);
                        XposedBridge.log("MFLGA: built-in ALL replaced (" + size + " entries)");
                    }
                });
            XposedBridge.log("MFLGA: built-in hooked OK");
        } catch (Throwable t) {
            XposedBridge.log("MFLGA: built-in FAIL: " + t.getMessage());
        }
    }

    // ================================================================
    // IN TARGET APPS: hide detection vectors
    // ================================================================

    private void hookTargetApp(XC_LoadPackage.LoadPackageParam lpparam) {
        XposedBridge.log("MFLGA: Hiding in " + lpparam.packageName);

        // ServiceManager - all query methods
        try {
            Class<?> sm = Class.forName("android.os.ServiceManager");
            XposedBridge.log("MFLGA: SM class found: " + sm);
            for (String m : new String[]{"getService","checkService","rawGetService","waitForService"}) {
                try {
                    XposedHelpers.findAndHookMethod(sm, m, String.class, new XC_MethodHook() {
                        @Override protected void afterHookedMethod(MethodHookParam p) throws Throwable {
                            String n = (String) p.args[0];
                            if (n != null) for (String s : FL_SVC) if (n.startsWith(s)) { p.setResult(null); return; }
                        }
                    });
                    XposedBridge.log("MFLGA: SM." + m + " hooked OK");
                } catch (Throwable t) {
                    XposedBridge.log("MFLGA: SM." + m + " FAILED: " + t.getMessage());
                }
            }
            try {
                XposedHelpers.findAndHookMethod(sm, "listServices", new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam p) throws Throwable {
                        String[] r = (String[]) p.getResult();
                        if (r == null) return;
                        ArrayList<String> f = new ArrayList<>();
                        for (String s : r) { boolean hide = false; for (String prefix : FL_SVC) if (s.startsWith(prefix)) { hide = true; break; } if (!hide) f.add(s); }
                        p.setResult(f.toArray(new String[0]));
                    }
                });
            } catch (Throwable t) {}
        } catch (Throwable t) {}

        // Location mock flags
        try {
            Class<?> loc = Class.forName("android.location.Location");
            try { XposedHelpers.findAndHookMethod(loc, "isFromMockProvider", XC_MethodReplacement.returnConstant(false)); } catch (Throwable t) {}
            try { XposedHelpers.findAndHookMethod(loc, "isMock", XC_MethodReplacement.returnConstant(false)); } catch (Throwable t) {}
        } catch (Throwable t) {}

        // Package hiding
        try {
            XposedHelpers.findAndHookMethod("android.app.ApplicationPackageManager", lpparam.classLoader,
                "getPackageInfo", String.class, int.class, new XC_MethodHook() {
                    @Override protected void beforeHookedMethod(MethodHookParam p) throws Throwable {
                        for (String fl : FL_PKG) if (fl.equals(p.args[0])) {
                            p.setThrowable((Throwable) Class.forName("android.content.pm.PackageManager$NameNotFoundException").getConstructor(String.class).newInstance((String)p.args[0]));
                            return;
                        }
                    }
                });
        } catch (Throwable t) {}

        // File access - File.exists() direct hook (JNI bypasses Os.stat)
        try {
            XposedHelpers.findAndHookMethod(java.io.File.class, "exists", new XC_MethodHook() {
                @Override protected void afterHookedMethod(MethodHookParam p) throws Throwable {
                    if (Boolean.TRUE.equals(p.getResult())) {
                        String path = ((java.io.File) p.thisObject).getAbsolutePath();
                        if (path.startsWith("/data/fl")) { p.setResult(false); }
                    }
                }
            });
            XposedBridge.log("MFLGA: File.exists hooked OK");
        } catch (Throwable t) {
            XposedBridge.log("MFLGA: File.exists FAILED: " + t.getMessage());
        }
        try {
            XposedHelpers.findAndHookMethod(java.io.File.class, "isDirectory", new XC_MethodHook() {
                @Override protected void afterHookedMethod(MethodHookParam p) throws Throwable {
                    if (Boolean.TRUE.equals(p.getResult())) {
                        String path = ((java.io.File) p.thisObject).getAbsolutePath();
                        if (path.startsWith("/data/fl")) { p.setResult(false); }
                    }
                }
            });
            XposedBridge.log("MFLGA: File.isDirectory hooked OK");
        } catch (Throwable t) {}

        // Also keep Os.stat/lstat as secondary defense
        try {
            Class<?> os = Class.forName("android.system.Os");
            Class<?> ee = Class.forName("android.system.ErrnoException");
            int ENOENT = Class.forName("android.system.OsConstants").getField("ENOENT").getInt(null);
            XposedBridge.log("MFLGA: Os class found, ENOENT=" + ENOENT);
            for (String m : new String[]{"stat", "lstat"}) {
                try {
                    final String mName = m;
                    XposedHelpers.findAndHookMethod(os, m, String.class, new XC_MethodHook() {
                        @Override protected void beforeHookedMethod(MethodHookParam p) throws Throwable {
                            String path = (String) p.args[0];
                            if (path != null && path.startsWith("/data/fl")) {
                                throw (Throwable) ee.getConstructor(String.class, int.class).newInstance(mName, ENOENT);
                            }
                        }
                    });
                    XposedBridge.log("MFLGA: Os." + m + " hooked OK");
                } catch (Throwable t) {
                    XposedBridge.log("MFLGA: Os." + m + " FAILED: " + t.getMessage());
                }
            }
        } catch (Throwable t) {
            XposedBridge.log("MFLGA: Os hooks FAILED: " + t.getMessage());
        }
    }
}
