package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.Ԭ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0004 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static android.app.ActivityManager f26;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.util.List<android.app.ActivityManager.RunningAppProcessInfo> f27;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static long f28;

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static java.lang.String m28(int i) {
        return m29(i, -1);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.String m29(int i, int i2) {
        if (i2 != -1) {
            java.lang.String[] strArr = new java.lang.String[0];
            try {
                strArr = p000.C0033.m151().getPackageManager().getPackagesForUid(i2);
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        }
        java.lang.String m30 = m30(i, i2);
        return (m30 == null || !m30.contains(p000.C0074.m256(new byte[]{-49}, new byte[]{-11, -101, 20, -58, 53, 75, 51, 108}))) ? m30 : m30.split(p000.C0074.m256(new byte[]{73}, new byte[]{115, -47, -121, 7, 93, 34, -39, 60}))[0];
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static java.lang.String m30(int i, int i2) {
        try {
            if (f27 == null || java.lang.System.currentTimeMillis() - f28 > 5000) {
                if (f26 == null) {
                    f26 = (android.app.ActivityManager) p000.C0033.m151().getSystemService(p000.C0074.m256(new byte[]{122, 70, 120, -88, 80, -84, -1, 85}, new byte[]{27, 37, 12, -63, 38, -59, -117, 44}));
                }
                f27 = f26.getRunningAppProcesses();
                f28 = java.lang.System.currentTimeMillis();
            }
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> list = f27;
            if (list == null) {
                return null;
            }
            for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (runningAppProcessInfo.pid == i || (i == -1 && runningAppProcessInfo.uid == i2)) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static boolean m31(int i) {
        return p000.C0074.m256(new byte[]{-55, -91, -126, 36, 119, 76, 110, -74, -58, -81, -63, 107, 126, 71, 115, -66, -61, -82, -63, 109, 125, 80}, new byte[]{-86, -54, -17, 10, 16, 35, 1, -47}).equals(m30(-1, i));
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public static boolean m32() {
        return android.os.Binder.getCallingUid() == 2000;
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public static boolean m33() {
        int callingUid = android.os.Binder.getCallingUid();
        return (callingUid >= 10000 || !m31(callingUid)) && callingUid < 10000;
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public static boolean m34(int i) {
        return (i >= 10000 || !m31(i)) && i < 10000;
    }
}
