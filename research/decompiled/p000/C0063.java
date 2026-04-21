package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ސ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0063 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static boolean f176;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.util.List<p000.C0087> f177;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static java.util.List<java.lang.String> f178;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static final java.lang.Object f179 = new java.lang.Object();

    /* renamed from: ԫ, reason: contains not printable characters */
    private static java.util.List<java.lang.String> f180 = java.util.Collections.synchronizedList(new p000.C0063.C0064());

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ސ$Ϳ, reason: contains not printable characters */
    class C0064 extends java.util.ArrayList<java.lang.String> {
        C0064() {
            add(p000.C0074.m256(new byte[]{21}, new byte[]{63, -80, -52, -35, 123, 28, -18, 19}));
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static final java.lang.String m215(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr.length);
        for (byte b : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m216() {
        java.util.List<java.lang.String> list;
        synchronized (f179) {
            list = f178;
        }
        return list;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static p000.C0087 m217() {
        synchronized (f179) {
            try {
                java.util.List<p000.C0087> list = f177;
                if (list != null && !list.isEmpty()) {
                    return f177.get(0);
                }
                return null;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return null;
            } finally {
            }
        }
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static java.util.List<p000.C0087> m218() {
        java.util.List<p000.C0087> list;
        synchronized (f179) {
            list = f177;
        }
        return list;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m219() {
        java.util.List<java.lang.String> list;
        synchronized (f179) {
            list = f180;
        }
        return list;
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    private static boolean m220() {
        boolean z;
        synchronized (f179) {
            try {
                java.util.List<java.lang.String> list = f178;
                if (list != null) {
                    if (list.isEmpty()) {
                    }
                    z = false;
                }
                java.util.List<java.lang.String> list2 = f180;
                if (list2 != null) {
                    if (list2.isEmpty()) {
                    }
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public static boolean m221(int i, int i2) {
        if (m220()) {
            return true;
        }
        return m222(p000.C0004.m29(i, i2));
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public static boolean m222(java.lang.String str) {
        if (str == null) {
            return false;
        }
        synchronized (f179) {
            try {
                if (m220()) {
                    return true;
                }
                java.util.List<java.lang.String> list = f180;
                if (list != null && !list.isEmpty() && !p000.C0003.m27(f180, str, "c")) {
                    return false;
                }
                java.util.List<java.lang.String> list2 = f178;
                if (list2 == null || list2.isEmpty()) {
                    return true;
                }
                return f178.contains(str);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public static boolean m223() {
        return f176;
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public static void m224(java.util.List<java.lang.String> list) {
        synchronized (f179) {
            f178 = list;
        }
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public static void m225(p000.C0087 c0087) {
        synchronized (f179) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c0087);
            f177 = arrayList;
        }
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public static void m226(java.util.List<p000.C0087> list) {
        synchronized (f179) {
            f177 = list;
        }
    }

    /* renamed from: ׯ, reason: contains not printable characters */
    public static void m227(boolean z) {
        f176 = z;
    }

    /* renamed from: ؠ, reason: contains not printable characters */
    public static void m228(java.util.List<java.lang.String> list) {
        synchronized (f179) {
            if (list != null) {
                try {
                    if (!list.isEmpty() && list.size() >= 100) {
                        f180.clear();
                        f180.addAll(p000.C0011.m72());
                        f180.addAll(list);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            f180.clear();
            f180.addAll(p000.C0011.m72());
            f180.add("*");
        }
    }

    /* renamed from: ހ, reason: contains not printable characters */
    public static android.net.wifi.ScanResult m229(p000.C0087 c0087) {
        if (c0087 == null) {
            return null;
        }
        try {
            android.net.wifi.ScanResult scanResult = (android.net.wifi.ScanResult) android.net.wifi.ScanResult.class.newInstance();
            scanResult.SSID = c0087.m278();
            scanResult.BSSID = c0087.m273();
            scanResult.level = c0087.m277();
            scanResult.frequency = c0087.m275();
            scanResult.capabilities = c0087.m274();
            return scanResult;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: ށ, reason: contains not printable characters */
    public static android.net.wifi.WifiInfo m230(p000.C0087 c0087) {
        java.lang.Object obj;
        if (c0087 == null) {
            return null;
        }
        try {
            android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) android.net.wifi.WifiInfo.class.newInstance();
            try {
                if (!android.text.TextUtils.isEmpty(c0087.m278())) {
                    java.lang.Class m63 = p000.C0010.m63("android.net.wifi.WifiSsid");
                    try {
                        try {
                            try {
                                java.lang.reflect.Method declaredMethod = m63.getDeclaredMethod("fromBytes", byte[].class);
                                declaredMethod.setAccessible(true);
                                obj = declaredMethod.invoke(null, c0087.m278().getBytes());
                            } catch (java.lang.Throwable th) {
                                th.printStackTrace();
                                obj = null;
                            }
                        } catch (java.lang.Throwable unused) {
                            java.lang.reflect.Method declaredMethod2 = m63.getDeclaredMethod("createFromByteArray", byte[].class);
                            declaredMethod2.setAccessible(true);
                            obj = declaredMethod2.invoke(null, c0087.m278().getBytes());
                        }
                    } catch (java.lang.Throwable unused2) {
                        java.lang.reflect.Method declaredMethod3 = m63.getDeclaredMethod("createFromHex", java.lang.String.class);
                        declaredMethod3.setAccessible(true);
                        obj = declaredMethod3.invoke(null, m215(c0087.m278().getBytes()));
                    }
                    java.lang.reflect.Method declaredMethod4 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setSSID", m63);
                    declaredMethod4.setAccessible(true);
                    declaredMethod4.invoke(wifiInfo, obj);
                }
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
            }
            java.lang.reflect.Method declaredMethod5 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setMacAddress", java.lang.String.class);
            declaredMethod5.setAccessible(true);
            declaredMethod5.invoke(wifiInfo, c0087.m273());
            java.lang.reflect.Method declaredMethod6 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setBSSID", java.lang.String.class);
            declaredMethod6.setAccessible(true);
            declaredMethod6.invoke(wifiInfo, c0087.m273());
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.reflect.Method declaredMethod7 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setRssi", cls);
            declaredMethod7.setAccessible(true);
            declaredMethod7.invoke(wifiInfo, java.lang.Integer.valueOf(c0087.m277()));
            java.lang.reflect.Method declaredMethod8 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setLinkSpeed", cls);
            declaredMethod8.setAccessible(true);
            declaredMethod8.invoke(wifiInfo, java.lang.Integer.valueOf(c0087.m276()));
            java.lang.reflect.Method declaredMethod9 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setFrequency", cls);
            declaredMethod9.setAccessible(true);
            declaredMethod9.invoke(wifiInfo, java.lang.Integer.valueOf(c0087.m275()));
            java.lang.reflect.Method declaredMethod10 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setNetworkId", cls);
            declaredMethod10.setAccessible(true);
            declaredMethod10.invoke(wifiInfo, 1000);
            java.lang.reflect.Field declaredField = android.net.wifi.WifiInfo.class.getDeclaredField("score");
            declaredField.setAccessible(true);
            declaredField.set(wifiInfo, 60);
            java.lang.reflect.Method declaredMethod11 = android.net.wifi.WifiInfo.class.getDeclaredMethod("setSupplicantState", android.net.wifi.SupplicantState.class);
            declaredMethod11.setAccessible(true);
            declaredMethod11.invoke(wifiInfo, android.net.wifi.SupplicantState.COMPLETED);
            return wifiInfo;
        } catch (java.lang.Throwable th3) {
            th3.printStackTrace();
            return null;
        }
    }
}
