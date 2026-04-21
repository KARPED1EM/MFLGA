package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޕ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0073 {
    /* renamed from: Ϳ, reason: contains not printable characters */
    public static boolean m252(java.lang.ClassLoader classLoader, java.lang.String str, android.os.IBinder iBinder) {
        try {
            p000.C0010.m68(null, p000.C0010.m64(p000.C0074.m256(new byte[]{-89, -66, -125, 49, 119, 66, 80, -24, -87, -93, -55, 16, 125, 89, 66, -81, -91, -75, -86, 34, 118, 74, 83, -93, -76}, new byte[]{-58, -48, -25, 67, 24, 43, 52, -58}), true, classLoader), p000.C0074.m256(new byte[]{-85, -107, 3, 14, 84, 126, 60, -60, -87, -108}, new byte[]{-54, -15, 103, 93, 49, 12, 74, -83}), new java.lang.Class[]{java.lang.String.class, android.os.IBinder.class}, new java.lang.Object[]{str, iBinder});
            return true;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static boolean m253(java.lang.ClassLoader classLoader, java.lang.String str, android.os.IBinder iBinder) {
        try {
            java.lang.reflect.Field declaredField = p000.C0010.m63(p000.C0074.m256(new byte[]{88, -22, -12, 34, 52, 105, -120, -73, 86, -9, -66, 3, 62, 114, -102, -16, 90, -31, -35, 49, 53, 97, -117, -4, 75}, new byte[]{57, -124, -112, 80, 91, 0, -20, -103})).getDeclaredField(p000.C0074.m256(new byte[]{27, -115, -45, 76, -112, 7}, new byte[]{104, -50, -78, 47, -8, 98, 7, 20}));
            declaredField.setAccessible(true);
            java.util.Map map = (java.util.Map) declaredField.get(null);
            synchronized (map) {
                map.put(str, iBinder);
            }
            return true;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static android.os.IBinder m254(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return (android.os.IBinder) p000.C0010.m68(null, p000.C0010.m64(p000.C0074.m256(new byte[]{-112, 55, -75, 9, -123, 9, -33, 13, -98, 42, -1, 40, -113, 18, -51, 74, -110, 60, -100, 26, -124, 1, -36, 70, -125}, new byte[]{-15, 89, -47, 123, -22, 96, -69, 35}), true, classLoader), p000.C0074.m256(new byte[]{-126, 68, -3, -122, -113, -103, -32, -12, -122, 68}, new byte[]{-27, 33, -119, -43, -22, -21, -106, -99}), new java.lang.Class[]{java.lang.String.class}, new java.lang.Object[]{str});
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static android.os.IBinder m255(java.lang.ClassLoader classLoader, java.lang.String str) {
        android.os.IBinder iBinder;
        try {
            java.lang.reflect.Field declaredField = p000.C0010.m63(p000.C0074.m256(new byte[]{-73, 126, 85, 48, -93, 110, 16, 23, -71, 99, 31, 17, -87, 117, 2, 80, -75, 117, 124, 35, -94, 102, 19, 92, -92}, new byte[]{-42, 16, 49, 66, -52, 7, 116, 57})).getDeclaredField(p000.C0074.m256(new byte[]{-70, -83, 88, 79, 46, 39}, new byte[]{-55, -18, 57, 44, 70, 66, -102, -61}));
            declaredField.setAccessible(true);
            java.util.Map map = (java.util.Map) declaredField.get(null);
            synchronized (map) {
                iBinder = (android.os.IBinder) map.get(str);
            }
            return iBinder;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
