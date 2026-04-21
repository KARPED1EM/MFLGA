package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޝ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0089 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static java.lang.Class f268 = null;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.lang.Class f269 = null;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static java.lang.Class f270 = null;

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static boolean f271 = false;

    /* renamed from: ԫ, reason: contains not printable characters */
    public static boolean f272 = false;

    /* renamed from: Ԭ, reason: contains not printable characters */
    static java.lang.ClassLoader f273 = null;

    /* renamed from: ԭ, reason: contains not printable characters */
    static int f274 = -1;

    /* renamed from: Ԯ, reason: contains not printable characters */
    static int f275 = -1;

    /* renamed from: ԯ, reason: contains not printable characters */
    static int f276 = -1;

    /* renamed from: ՠ, reason: contains not printable characters */
    static android.net.wifi.WifiInfo f277;

    /* renamed from: ֈ, reason: contains not printable characters */
    static long f278;

    /* renamed from: ֏, reason: contains not printable characters */
    static java.lang.String f279;

    /* renamed from: ׯ, reason: contains not printable characters */
    static java.util.List<android.net.wifi.ScanResult> f280 = new java.util.ArrayList();

    /* renamed from: ؠ, reason: contains not printable characters */
    static long f281 = 0;

    static int checkNull(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return ((java.lang.Integer) obj).intValue();
    }

    public static java.lang.Class forName(java.lang.ClassLoader classLoader, java.lang.String str) {
        java.lang.Class m64 = p000.C0010.m64(str, true, classLoader);
        if (m64 == null) {
            try {
                if (f273 == null) {
                    java.lang.ClassLoader systemServiceManagerClassLoader = getSystemServiceManagerClassLoader(classLoader, "/apex/com.android.wifi/javalib/service-wifi.jar");
                    f273 = systemServiceManagerClassLoader;
                    log("pathClassLoader: ", systemServiceManagerClassLoader);
                }
                java.lang.ClassLoader classLoader2 = f273;
                if (classLoader2 != null) {
                    m64 = p000.C0010.m64(str, true, classLoader2);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return m64;
            }
        }
        if (m64 != null) {
            return m64;
        }
        throw new java.lang.ClassNotFoundException(str);
    }

    public static android.net.wifi.WifiInfo getConnectionInfo(java.lang.Object obj) {
        android.net.wifi.WifiInfo wifiInfo;
        android.net.wifi.WifiInfo m230;
        log("getConnectionInfo: ", obj, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        if (isHookWifi() && (m230 = p000.C0063.m230(p000.C0063.m217())) != null) {
            return m230;
        }
        try {
            if (isHookLocation()) {
                try {
                    android.net.wifi.WifiInfo wifiInfo2 = (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
                    java.lang.reflect.Method declaredMethod = android.net.wifi.WifiInfo.class.getDeclaredMethod("setMacAddress", java.lang.String.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(wifiInfo2, "02:00:00:00:00:00");
                    java.lang.reflect.Method declaredMethod2 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setBSSID", java.lang.String.class);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(wifiInfo2, "02:00:00:00:00:00");
                    return wifiInfo2;
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            }
            if (java.lang.System.currentTimeMillis() - f278 < 2000) {
                return f277;
            }
            try {
                wifiInfo = android.os.Build.VERSION.SDK_INT >= 29 ? p000.C0090.m283(obj, null, null) : (android.net.wifi.WifiInfo) com.lerist.lib.lhooker.LHooker.m3(obj, new java.lang.Object[0]);
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
                wifiInfo = null;
            }
            log("srcConnectionInfo: " + wifiInfo);
            if (wifiInfo == null) {
                try {
                    wifiInfo = (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
                } catch (java.lang.Throwable th3) {
                    th3.printStackTrace();
                    return null;
                }
            }
            f277 = wifiInfo;
            f278 = java.lang.System.currentTimeMillis();
            return wifiInfo;
        } catch (java.lang.Throwable th4) {
            th4.printStackTrace();
            return null;
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo2(java.lang.Object obj, java.lang.String str) {
        android.net.wifi.WifiInfo wifiInfo;
        android.net.wifi.WifiInfo m230;
        log("getConnectionInfo2: ", obj, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid() + ", " + str);
        if (isHookWifi() && (m230 = p000.C0063.m230(p000.C0063.m217())) != null) {
            return m230;
        }
        try {
            if (isHookLocation()) {
                try {
                    android.net.wifi.WifiInfo wifiInfo2 = (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
                    java.lang.reflect.Method declaredMethod = android.net.wifi.WifiInfo.class.getDeclaredMethod("setMacAddress", java.lang.String.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(wifiInfo2, "02:00:00:00:00:00");
                    java.lang.reflect.Method declaredMethod2 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setBSSID", java.lang.String.class);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(wifiInfo2, "02:00:00:00:00:00");
                    return wifiInfo2;
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            }
            if (java.lang.System.currentTimeMillis() - f278 < 2000) {
                return f277;
            }
            try {
                wifiInfo = android.os.Build.VERSION.SDK_INT >= 29 ? p000.C0090.m283(obj, str, null) : (android.net.wifi.WifiInfo) com.lerist.lib.lhooker.LHooker.m3(obj, str);
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
                wifiInfo = null;
            }
            log("srcConnectionInfo: " + wifiInfo);
            if (wifiInfo == null) {
                try {
                    wifiInfo = (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
                } catch (java.lang.Throwable th3) {
                    th3.printStackTrace();
                    return null;
                }
            }
            f277 = wifiInfo;
            f278 = java.lang.System.currentTimeMillis();
            return wifiInfo;
        } catch (java.lang.Throwable th4) {
            th4.printStackTrace();
            return null;
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo2_bak(java.lang.Object obj, java.lang.String str) {
        try {
            log("getConnectionInfo2_bak", obj, str);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return getConnectionInfo2_copy(obj, str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getConnectionInfo2_copy(obj, str);
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo2_copy(java.lang.Object obj, java.lang.String str) {
        try {
            log("getConnectionInfo2_copy", obj, str);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo_R(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        android.net.wifi.WifiInfo wifiInfo;
        f279 = "jit";
        log("getConnectionInfo_R: ", obj, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid() + ", " + str);
        f279 = "jit1";
        try {
            if (isHookWifi()) {
                android.net.wifi.WifiInfo m230 = p000.C0063.m230(p000.C0063.m217());
                if (m230 != null) {
                    return m230;
                }
            }
            try {
                if (isHookLocation()) {
                    try {
                        return p000.C0063.m230(new p000.C0087("WIFI", "WIFI", "02:00:00:00:00:00", 200, 866, 5745, "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]"));
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                        return getEmptyWifiInfo();
                    }
                }
                try {
                    wifiInfo = android.os.Build.VERSION.SDK_INT >= 31 ? p000.C0090.m283(obj, str, str2) : p000.C0090.m284(obj, str, str2);
                } catch (java.lang.Throwable th2) {
                    th2.printStackTrace();
                    wifiInfo = null;
                }
                log("srcConnectionInfo: " + wifiInfo);
                if (wifiInfo != null) {
                    return wifiInfo;
                }
                try {
                    return (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
                } catch (java.lang.Throwable th3) {
                    th3.printStackTrace();
                    return getEmptyWifiInfo();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return getEmptyWifiInfo();
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return getEmptyWifiInfo();
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo_R_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getConnectionInfo_R_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            f279 = "jit_bak";
            return getConnectionInfo_R_copy(obj, str, str2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getConnectionInfo_R_copy(obj, str, str2);
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo_R_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getConnectionInfo_R_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo_bak(java.lang.Object obj) {
        try {
            log("getConnectionInfo_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return getConnectionInfo_copy(obj);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getConnectionInfo_copy(obj);
        }
    }

    public static android.net.wifi.WifiInfo getConnectionInfo_copy(java.lang.Object obj) {
        try {
            log("getConnectionInfo_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static android.net.wifi.WifiInfo getEmptyWifiInfo() {
        try {
            return (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List<android.net.wifi.ScanResult> getScanResults(java.lang.Object obj, java.lang.String str) {
        android.net.wifi.ScanResult m229;
        log("getScanResults: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        java.util.List arrayList = new java.util.ArrayList();
        try {
            if (isHookWifi() && (m229 = p000.C0063.m229(p000.C0063.m217())) != null) {
                java.util.ArrayList arrayList2 = isHookLocation() ? new java.util.ArrayList() : new java.util.ArrayList(arrayList);
                arrayList2.add(m229);
                java.util.List<p000.C0087> m218 = p000.C0063.m218();
                for (int i2 = 1; i2 < m218.size(); i2++) {
                    android.net.wifi.ScanResult m2292 = p000.C0063.m229(m218.get(i2));
                    if (m2292 != null) {
                        arrayList2.add(m2292);
                    }
                }
                return arrayList2;
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        if (isHookLocation()) {
            return new java.util.ArrayList();
        }
        if (java.lang.System.currentTimeMillis() - f281 < 2000) {
            return f280;
        }
        try {
            arrayList = android.os.Build.VERSION.SDK_INT >= 29 ? p000.C0090.m287(obj, str, null) : (java.util.List) com.lerist.lib.lhooker.LHooker.m3(obj, str);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        f280 = arrayList;
        f281 = java.lang.System.currentTimeMillis();
        return arrayList;
    }

    public static java.util.List<android.net.wifi.ScanResult> getScanResults_R(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        android.net.wifi.ScanResult m229;
        log("getScanResults_R: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        java.util.List<android.net.wifi.ScanResult> arrayList = new java.util.ArrayList<>();
        try {
            if (isHookWifi() && (m229 = p000.C0063.m229(p000.C0063.m217())) != null) {
                java.util.ArrayList arrayList2 = isHookLocation() ? new java.util.ArrayList() : new java.util.ArrayList(arrayList);
                arrayList2.add(m229);
                java.util.List<p000.C0087> m218 = p000.C0063.m218();
                for (int i = 1; i < m218.size(); i++) {
                    android.net.wifi.ScanResult m2292 = p000.C0063.m229(m218.get(i));
                    if (m2292 != null) {
                        arrayList2.add(m2292);
                    }
                }
                return arrayList2;
            }
            try {
                if (!isHookLocation()) {
                    try {
                        arrayList = p000.C0090.m287(obj, str, str2);
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                    return arrayList == null ? new java.util.ArrayList() : arrayList;
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            android.net.wifi.ScanResult m2293 = p000.C0063.m229(new p000.C0087("WIFI", "WIFI", "02:00:00:00:00:00", 200, 866, 5745, "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]"));
            if (m2293 != null) {
                arrayList3.add(m2293);
            }
            return arrayList3;
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            return new java.util.ArrayList();
        }
    }

    public static java.util.List<android.net.wifi.ScanResult> getScanResults_R_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getScanResults_R_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return getScanResults_R_copy(obj, str, str2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getScanResults_R_copy(obj, str, str2);
        }
    }

    public static java.util.List<android.net.wifi.ScanResult> getScanResults_R_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getScanResults_R_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.Object getScanResults_V(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        android.net.wifi.ScanResult m229;
        log("getScanResults_V: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        java.util.List arrayList = new java.util.ArrayList();
        try {
            if (isHookWifi() && (m229 = p000.C0063.m229(p000.C0063.m217())) != null) {
                java.util.ArrayList arrayList2 = isHookLocation() ? new java.util.ArrayList() : new java.util.ArrayList(arrayList);
                arrayList2.add(m229);
                java.util.List<p000.C0087> m218 = p000.C0063.m218();
                for (int i = 1; i < m218.size(); i++) {
                    android.net.wifi.ScanResult m2292 = p000.C0063.m229(m218.get(i));
                    if (m2292 != null) {
                        arrayList2.add(m2292);
                    }
                }
                return f269.getConstructor(java.util.List.class).newInstance(arrayList2);
            }
            try {
                if (!isHookLocation()) {
                    try {
                        arrayList = p000.C0090.m287(obj, str, str2);
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    return f269.getConstructor(java.util.List.class).newInstance(arrayList);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            android.net.wifi.ScanResult m2293 = p000.C0063.m229(new p000.C0087("WIFI", "WIFI", "02:00:00:00:00:00", 200, 866, 5745, "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]"));
            if (m2293 != null) {
                arrayList3.add(m2293);
            }
            try {
                return f269.getConstructor(java.util.List.class).newInstance(arrayList3);
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            try {
                return f269.getConstructor(java.util.List.class).newInstance(arrayList);
            } catch (java.lang.Exception unused2) {
                return null;
            }
        }
    }

    public static java.lang.Object getScanResults_VX(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        android.net.wifi.ScanResult m229;
        log("getScanResults_VX: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        java.util.List arrayList = new java.util.ArrayList();
        try {
            if (isHookWifi() && (m229 = p000.C0063.m229(p000.C0063.m217())) != null) {
                java.util.ArrayList arrayList2 = isHookLocation() ? new java.util.ArrayList() : new java.util.ArrayList(arrayList);
                arrayList2.add(m229);
                java.util.List<p000.C0087> m218 = p000.C0063.m218();
                for (int i = 1; i < m218.size(); i++) {
                    android.net.wifi.ScanResult m2292 = p000.C0063.m229(m218.get(i));
                    if (m2292 != null) {
                        arrayList2.add(m2292);
                    }
                }
                return f270.getConstructor(java.util.List.class).newInstance(arrayList2);
            }
            try {
                if (!isHookLocation()) {
                    try {
                        arrayList = p000.C0090.m287(obj, str, str2);
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    return f270.getConstructor(java.util.List.class).newInstance(arrayList);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            android.net.wifi.ScanResult m2293 = p000.C0063.m229(new p000.C0087("WIFI", "WIFI", "02:00:00:00:00:00", 200, 866, 5745, "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]"));
            if (m2293 != null) {
                arrayList3.add(m2293);
            }
            try {
                return f270.getConstructor(java.util.List.class).newInstance(arrayList3);
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            try {
                return f270.getConstructor(java.util.List.class).newInstance(arrayList);
            } catch (java.lang.Exception unused2) {
                return null;
            }
        }
    }

    public static java.lang.Object getScanResults_VX_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getScanResults_VX_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return getScanResults_VX_copy(obj, str, str2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getScanResults_VX_copy(obj, str, str2);
        }
    }

    public static java.lang.Object getScanResults_VX_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getScanResults_VX_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.Object getScanResults_V_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getScanResults_V_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return getScanResults_V_copy(obj, str, str2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getScanResults_V_copy(obj, str, str2);
        }
    }

    public static java.lang.Object getScanResults_V_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getScanResults_V_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.util.List<android.net.wifi.ScanResult> getScanResults_bak(java.lang.Object obj, java.lang.String str) {
        try {
            log("getScanResults_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return getScanResults_copy(obj, str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return getScanResults_copy(obj, str);
        }
    }

    public static java.util.List<android.net.wifi.ScanResult> getScanResults_copy(java.lang.Object obj, java.lang.String str) {
        try {
            log("getScanResults_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final java.lang.ClassLoader getSystemServiceManagerClassLoader(java.lang.ClassLoader classLoader, java.lang.String str) {
        android.util.ArrayMap arrayMap;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            arrayMap = (android.util.ArrayMap) p000.C0010.m65(null, p000.C0010.m62(classLoader, "com.android.internal.os.SystemServerClassLoaderFactory"), "sLoadedPaths");
        } else {
            java.lang.Class m62 = p000.C0010.m62(classLoader, "com.android.server.SystemServiceManager");
            arrayMap = (android.util.ArrayMap) p000.C0010.m65(com.android.server.LocalServices.getService(m62), m62, "mLoadedPaths");
        }
        if (arrayMap == null) {
            return classLoader;
        }
        dalvik.system.PathClassLoader pathClassLoader = (dalvik.system.PathClassLoader) arrayMap.get(str);
        if (pathClassLoader != null) {
            return pathClassLoader;
        }
        for (java.lang.String str2 : arrayMap.keySet()) {
            log("getSystemServiceManagerClassLoader.key: " + str2);
            if (str2.contains(str)) {
                return (dalvik.system.PathClassLoader) arrayMap.get(str2);
            }
        }
        return pathClassLoader;
    }

    private static void getTransactionCode(java.lang.Class cls) {
        try {
            f274 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getConnectionInfo"));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            f275 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getScanResults"));
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        try {
            f276 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_startScan"));
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
    }

    public static synchronized void hook(java.lang.ClassLoader classLoader) {
        synchronized (p000.C0089.class) {
            try {
                if (f271) {
                    return;
                }
                try {
                    f269 = forName(classLoader, "com.android.modules.utils.ParceledListSlice");
                    f270 = forName(classLoader, "com.android.wifi.x.com.android.modules.utils.ParceledListSlice");
                    java.lang.Class forName = forName(classLoader, "android.net.wifi.IWifiManager$Stub");
                    f268 = forName;
                    getTransactionCode(forName);
                    p000.C0072.m248(p000.C0033.m151(), "com.lerist.fakelocation", "com.android.server.wifi.WifiServiceImpl");
                    int i = android.os.Build.VERSION.SDK_INT;
                    if (i >= 29) {
                        p000.C0090.m288(classLoader);
                    }
                    if (i >= 35) {
                        java.lang.Class<?> returnType = forName(classLoader, "com.android.server.wifi.WifiServiceImpl").getMethod("getScanResults", java.lang.String.class, java.lang.String.class).getReturnType();
                        if (f269 != null && returnType.getName().equals(f269.getName())) {
                            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getScanResults", f269, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0089.class, "getScanResults_V", "getScanResults_V_bak");
                        }
                        if (f270 != null && returnType.getName().equals(f270.getName())) {
                            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getScanResults", f270, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0089.class, "getScanResults_VX", "getScanResults_VX_bak");
                        }
                    } else if (i >= 30) {
                        com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getScanResults", java.util.List.class, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0089.class, "getScanResults_R", "getScanResults_R_bak");
                    } else {
                        com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getScanResults", java.util.List.class, new java.lang.Class[]{java.lang.String.class}, p000.C0089.class, "getScanResults", "getScanResults_bak");
                    }
                    f271 = true;
                } catch (java.lang.RuntimeException unused) {
                    p000.C0063.m227(false);
                    f271 = true;
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                    f271 = false;
                }
                java.lang.String str = f279;
                if (str != null) {
                    log("jit", str);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void hookGetConnectionInfo(java.lang.ClassLoader classLoader) {
        synchronized (p000.C0089.class) {
            if (f272) {
                return;
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getConnectionInfo", android.net.wifi.WifiInfo.class, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0089.class, "getConnectionInfo_R", "getConnectionInfo_R_bak");
                } else {
                    com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getConnectionInfo", android.net.wifi.WifiInfo.class, null, p000.C0089.class, "getConnectionInfo", "getConnectionInfo_bak");
                    com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.wifi.WifiServiceImpl"), "getConnectionInfo", android.net.wifi.WifiInfo.class, new java.lang.Class[]{java.lang.String.class}, p000.C0089.class, "getConnectionInfo2", "getConnectionInfo2_bak");
                }
                f272 = true;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static boolean isHookLocation() {
        boolean z = p000.C0041.isMocking() && !p000.C0004.m33() && p000.C0041.isAllowMockPackage(p000.C0004.m29(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()));
        log("isHookLocation: " + z, "uid: " + android.os.Binder.getCallingUid(), "pid: " + android.os.Binder.getCallingPid());
        return z;
    }

    private static boolean isHookWifi() {
        boolean z = p000.C0063.m223() && !p000.C0004.m33() && p000.C0063.m221(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid());
        log("isHookWifi: " + z, "uid: " + android.os.Binder.getCallingUid(), "pid: " + android.os.Binder.getCallingPid());
        return z;
    }

    private static android.net.wifi.WifiInfo mock_getConnectionInfo() {
        android.net.wifi.WifiInfo m230;
        if (isHookWifi() && (m230 = p000.C0063.m230(p000.C0063.m217())) != null) {
            return m230;
        }
        if (!isHookLocation()) {
            return null;
        }
        try {
            return p000.C0063.m230(new p000.C0087("WIFI", "WIFI", "02:00:00:00:00:00", 200, 866, 5745, "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]"));
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return getEmptyWifiInfo();
        }
    }

    private static java.util.List<android.net.wifi.ScanResult> mock_getScanResults(java.lang.String str) {
        android.net.wifi.ScanResult m229;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (isHookWifi() && (m229 = p000.C0063.m229(p000.C0063.m217())) != null) {
                java.util.ArrayList arrayList2 = isHookLocation() ? new java.util.ArrayList() : new java.util.ArrayList(arrayList);
                arrayList2.add(m229);
                java.util.List<p000.C0087> m218 = p000.C0063.m218();
                for (int i = 1; i < m218.size(); i++) {
                    android.net.wifi.ScanResult m2292 = p000.C0063.m229(m218.get(i));
                    if (m2292 != null) {
                        arrayList2.add(m2292);
                    }
                }
                return arrayList2;
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        if (!isHookLocation()) {
            return null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        android.net.wifi.ScanResult m2293 = p000.C0063.m229(new p000.C0087("WIFI", "WIFI", "02:00:00:00:00:00", 200, 866, 5745, "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]"));
        if (m2293 != null) {
            arrayList3.add(m2293);
        }
        return arrayList3;
    }

    public static boolean onTransact(java.lang.Object obj, int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        log("onTransact", obj, java.lang.Integer.valueOf(i), parcel, parcel2, java.lang.Integer.valueOf(i2));
        if (obj != null && parcel != null && parcel2 != null) {
            try {
                if (i == f274) {
                    try {
                        android.net.wifi.WifiInfo mock_getConnectionInfo = mock_getConnectionInfo();
                        if (mock_getConnectionInfo != null) {
                            parcel.enforceInterface("android.net.wifi.IWifiManager");
                            parcel2.writeNoException();
                            parcel2.writeInt(1);
                            mock_getConnectionInfo.writeToParcel(parcel2, 1);
                            return true;
                        }
                    } catch (java.lang.Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (i == f275) {
                    try {
                        java.util.List<android.net.wifi.ScanResult> mock_getScanResults = mock_getScanResults(p000.C0004.m29(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()));
                        if (mock_getScanResults != null) {
                            parcel.enforceInterface("android.net.wifi.IWifiManager");
                            parcel.readString();
                            parcel2.writeNoException();
                            parcel2.writeTypedList(mock_getScanResults);
                            return true;
                        }
                    } catch (java.lang.Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                return ((java.lang.Boolean) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), parcel, parcel2, java.lang.Integer.valueOf(i2))).booleanValue();
            } catch (java.lang.Throwable th3) {
                th3.printStackTrace();
                try {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    stringBuffer.append("#");
                    stringBuffer.append("#");
                    for (int i3 = 0; i3 < 100; i3 += 2) {
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static boolean onTransact_bak(java.lang.Object obj, int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (obj == null || parcel == null || parcel2 == null) {
            return false;
        }
        log("onTransact_bak", obj);
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        new java.util.Random().nextBoolean();
        return onTransact_copy(obj, i, parcel, parcel2, i2);
    }

    public static boolean onTransact_copy(java.lang.Object obj, int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        try {
            log("onTransact_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean startScan(java.lang.Object obj, java.lang.String str) {
        log("startScan: ", str);
        if (isHookLocation()) {
            return true;
        }
        try {
            return ((java.lang.Boolean) com.lerist.lib.lhooker.LHooker.m3(obj, str)).booleanValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            try {
                new java.lang.StringBuffer().append("#" + obj);
                for (int i = 0; i < 100; i += 2) {
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public static void startScan2(java.lang.Object obj, java.lang.Object obj2, android.os.WorkSource workSource) {
        log("startScan: ", obj2, workSource);
        if (isHookLocation()) {
            return;
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, obj2, workSource);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void startScan2_bak(java.lang.Object obj, java.lang.Object obj2, android.os.WorkSource workSource) {
        try {
            log("startScan2_bak", obj);
            startScan2_copy(obj, obj2, workSource);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void startScan2_copy(java.lang.Object obj, java.lang.Object obj2, android.os.WorkSource workSource) {
        try {
            log("startScan2_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void startScan3(java.lang.Object obj, java.lang.Object obj2, android.os.WorkSource workSource, java.lang.String str) {
        log("startScan: ", obj2, workSource, str);
        if (isHookLocation()) {
            return;
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, obj2, workSource, str);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void startScan3_bak(java.lang.Object obj, java.lang.Object obj2, android.os.WorkSource workSource, java.lang.String str) {
        try {
            log("startScan3_bak", obj);
            startScan3_copy(obj, obj2, workSource, str);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void startScan3_copy(java.lang.Object obj, java.lang.Object obj2, android.os.WorkSource workSource, java.lang.String str) {
        try {
            log("startScan3_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean startScan_R(java.lang.Object obj, int i, java.lang.String str) {
        log("startScan_R: ", str);
        if (isHookLocation()) {
            return true;
        }
        try {
            return ((java.lang.Boolean) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str)).booleanValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            try {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("#");
                stringBuffer.append("#");
                for (int i2 = 0; i2 < 100; i2 += 2) {
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return true;
        }
    }

    public static boolean startScan_R_bak(java.lang.Object obj, int i, java.lang.String str) {
        try {
            log("startScan_R_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return startScan_R_copy(obj, i, str);
    }

    public static boolean startScan_R_copy(java.lang.Object obj, int i, java.lang.String str) {
        try {
            log("startScan_R_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean startScan_bak(java.lang.Object obj, java.lang.String str) {
        try {
            log("startScan_bak", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return startScan_copy(obj, str);
    }

    public static boolean startScan_copy(java.lang.Object obj, java.lang.String str) {
        try {
            log("startScan_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void log(java.lang.Object... objArr) {
    }
}
