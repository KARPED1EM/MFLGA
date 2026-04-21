package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޞ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0090 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static java.lang.Object f282;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.lang.Class f283;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static java.lang.Class f284;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static java.lang.Class f285;

    /* renamed from: ԫ, reason: contains not printable characters */
    private static java.lang.Class f286;

    /* renamed from: Ԭ, reason: contains not printable characters */
    private static java.lang.Class f287;

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static void m281(java.lang.Object obj) {
        p000.C0010.m68(obj, f283, "enforceAccessPermission", null, null);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.lang.Class m282(java.lang.ClassLoader classLoader, java.lang.String str) {
        return p000.C0089.forName(classLoader, str);
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static android.net.wifi.WifiInfo m283(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 33) {
            return m286(obj, null, null);
        }
        if (i >= 31) {
            return m285(obj, null, null);
        }
        if (i >= 29) {
            return m284(obj, null, null);
        }
        return null;
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static android.net.wifi.WifiInfo m284(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        m281(obj);
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            return m290(obj);
        } finally {
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public static android.net.wifi.WifiInfo m285(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        m281(obj);
        int callingUid = android.os.Binder.getCallingUid();
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            return m291(obj, callingUid, str);
        } finally {
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public static android.net.wifi.WifiInfo m286(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        m281(obj);
        int callingUid = android.os.Binder.getCallingUid();
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            return m292(obj, callingUid, str);
        } finally {
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public static java.util.List<android.net.wifi.ScanResult> m287(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        m281(obj);
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        try {
            return (java.util.List) p000.C0010.m68(p000.C0010.m65(obj, f283, "mScanRequestProxy"), f286, "getScanResults", null, null);
        } finally {
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public static void m288(java.lang.ClassLoader classLoader) {
        f283 = m282(classLoader, "com.android.server.wifi.WifiServiceImpl");
        f284 = m282(classLoader, "com.android.server.wifi.ClientModeImpl");
        f285 = m282(classLoader, "com.android.server.wifi.ClientMode");
        f286 = m282(classLoader, "com.android.server.wifi.ScanRequestProxy");
        f287 = m282(classLoader, "com.android.server.wifi.WifiThreadRunner");
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    private static java.lang.Object m289(java.lang.Object obj) {
        if (f282 == null) {
            f282 = p000.C0010.m65(obj, f283, "mClientModeImpl");
        }
        return f282;
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    private static android.net.wifi.WifiInfo m290(java.lang.Object obj) {
        return (android.net.wifi.WifiInfo) p000.C0010.m68(m289(obj), f284, "syncRequestConnectionInfo", null, null);
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    private static android.net.wifi.WifiInfo m291(java.lang.Object obj, int i, java.lang.String str) {
        return (android.net.wifi.WifiInfo) p000.C0010.m68(p000.C0010.m68(obj, f283, "getClientModeManagerIfSecondaryCmmRequestedByCallerPresent", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.String.class}, new java.lang.Object[]{java.lang.Integer.valueOf(i), str}), f285, "syncRequestConnectionInfo", null, null);
    }

    /* renamed from: ֏, reason: contains not printable characters */
    private static android.net.wifi.WifiInfo m292(java.lang.Object obj, int i, java.lang.String str) {
        return (android.net.wifi.WifiInfo) p000.C0010.m68(p000.C0010.m68(obj, f283, "getClientModeManagerIfSecondaryCmmRequestedByCallerPresent", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.String.class}, new java.lang.Object[]{java.lang.Integer.valueOf(i), str}), f285, "getConnectionInfo", null, null);
    }
}
