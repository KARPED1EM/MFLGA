package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.އ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0033 {

    /* renamed from: ԭ, reason: contains not printable characters */
    private static android.os.Handler f59;

    /* renamed from: Ԯ, reason: contains not printable characters */
    private static android.content.Context f60;

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static final java.lang.String f53 = p000.C0074.m256(new byte[]{-21, 12, -112, 84, -104, -33, 60, 75, -5, 23, -45, 28, -107, -47, 43, 78, -25, 0, -100, 14, -99, -43, 32}, new byte[]{-120, 99, -3, 122, -12, -70, 78, 34});

    /* renamed from: ԩ, reason: contains not printable characters */
    public static final java.lang.String f55 = p000.C0074.m256(new byte[]{-18, 109, -126, -110, 70, -62, 64, 24, -33}, new byte[]{-89, 3, -24, -9, 37, -74, 4, 125});

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static final java.lang.String f56 = p000.C0074.m256(new byte[]{-50, -119, -29, 24, -82, 23, 86, -40}, new byte[]{-31, -19, -126, 108, -49, 56, 48, -76});

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.String f54 = p000.C0074.m256(new byte[]{-105, 79, -21, 11, -58, -17, 117, 61, -121, 84, -88, 67, -53, -31, 98, 56, -101, 67, -25, 81, -61, -27, 105}, new byte[]{-12, 32, -122, 37, -86, -118, 7, 84});

    /* renamed from: ԫ, reason: contains not printable characters */
    public static java.util.List<java.lang.Object> f57 = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: Ԭ, reason: contains not printable characters */
    static java.util.List<p000.C0033.InterfaceC0034> f58 = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.އ$Ϳ, reason: contains not printable characters */
    public interface InterfaceC0034 {
        /* renamed from: Ϳ, reason: contains not printable characters */
        void m156();
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static android.content.Context m151() {
        return f60;
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.Object[] m152(java.lang.Object obj) {
        android.os.IBinder iBinder;
        f60 = (android.content.Context) obj;
        m154(p000.C0074.m256(new byte[]{-101, -42, 1, 17, -5}, new byte[]{-38, -90, 113, 43, -37, -41, -82, 121}) + obj);
        try {
            p000.C0067.m233();
            try {
                java.lang.reflect.Field declaredField = p000.C0010.m63(p000.C0074.m256(new byte[]{92, 115, 62, 84, 0, 51, -104, 33, 82, 110, 116, 117, 10, 40, -118, 102, 94, 120, 23, 71, 1, 59, -101, 106, 79}, new byte[]{61, 29, 90, 38, 111, 90, -4, 15})).getDeclaredField(p000.C0074.m256(new byte[]{95, -8, 21, 27, 122, 52}, new byte[]{44, -69, 116, 120, 18, 81, -117, 48}));
                declaredField.setAccessible(true);
                java.util.Map map = (java.util.Map) declaredField.get(null);
                synchronized (map) {
                    iBinder = (android.os.IBinder) map.get(p000.C0074.m256(new byte[]{96, 43, -53, 11, -3}, new byte[]{38, 103, -109, 91, -75, -110, -41, 31}));
                }
                android.util.Log.d(f55, p000.C0074.m256(new byte[]{-77, 97, 54, -75, 124, -126, -44}, new byte[]{-11, 45, 110, -27, 52, -72, -12, -17}) + iBinder);
                if (iBinder != null) {
                    com.lerist.lib.lhooker.LHooker.m18(iBinder);
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            java.lang.String packageName = ((android.content.Context) obj).getPackageName();
            if (!packageName.equals(p000.C0074.m256(new byte[]{112, 102, -11, 66, 95, 37, -27, -31, 124, 96, -4, 66, 78, 35, -18, -3, 118}, new byte[]{19, 9, -104, 108, 62, 75, -127, -109}))) {
                m154(p000.C0074.m256(new byte[]{-38, 103, -104, 100, -6, -113, 42, 59, -69}, new byte[]{-101, 23, -24, 68, -101, -19, 67, 1}) + new java.io.File("" + ((android.content.Context) obj).getPackageManager().getApplicationInfo(packageName.split(p000.C0074.m256(new byte[]{-98}, new byte[]{-92, -82, -83, -21, -14, -2, -95, 15}))[0], 0).nativeLibraryDir).getName());
                if (com.lerist.lib.lhooker.LHooker.m16()) {
                    com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{-38, 34, 61, 42, -100, -35, -12, 38, -38, 112, 63, 63, -97, -64, -95, 47, -64, 104, 47}, new byte[]{-11, 70, 92, 94, -3, -14, -110, 74}));
                } else if (com.lerist.lib.lhooker.LHooker.m15()) {
                    com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{-110, 41, 83, -42, 87, -30, -25, -32, -110, 126, 84, -61, 7, -81, -30, -19, -120, 99, 65}, new byte[]{-67, 77, 50, -94, 54, -51, -127, -116}));
                } else if (com.lerist.lib.lhooker.LHooker.m13()) {
                    com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{107, -71, -4, -68, 10, 120, -1, -117, 107, -17, -1, -85, 94, 54, -3, -42, 113, -13, -18}, new byte[]{68, -35, -99, -56, 107, 87, -103, -25}));
                } else {
                    com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{-114, -89, -37, 84, 20, -71, 53, -75, -114, -10, -40, 67, 17, -92, 98, -72, -108, -19, -55}, new byte[]{-95, -61, -70, 32, 117, -106, 83, -39}));
                }
            } else if (com.lerist.lib.lhooker.LHooker.m16()) {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{71, -72, -89, -20, 63, 5, 77, 111, 71, -22, -91, -7, 60, 24, 24, 102, 93, -14, -75}, new byte[]{104, -36, -58, -104, 94, 42, 43, 3}));
            } else if (com.lerist.lib.lhooker.LHooker.m15()) {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{-51, -83, -17, -82, 120, -53, -104, -85, -51, -6, -24, -69, 40, -122, -99, -90, -41, -25, -3}, new byte[]{-30, -55, -114, -38, 25, -28, -2, -57}));
            } else if (com.lerist.lib.lhooker.LHooker.m13()) {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{97, 12, 120, -14, 114, -10, 103, -38, 97, 90, 123, -27, 38, -72, 101, -121, 123, 70, 106}, new byte[]{78, 104, 25, -122, 19, -39, 1, -74}));
            } else {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{-15, 67, -30, 22, 6, -114, -38, -25, -15, 18, -31, 1, 3, -109, -115, -22, -21, 9, -16}, new byte[]{-34, 39, -125, 98, 103, -95, -68, -117}));
            }
            if (com.lerist.lib.lhooker.LHooker.f0) {
                com.lerist.lib.lhooker.LHooker.suspendAll();
                if (packageName.equals(p000.C0074.m256(new byte[]{71, 99, -110, 63, 30, -15, -26, -72, 75, 101, -101, 63, 15, -9, -19, -92, 65}, new byte[]{36, 12, -1, 17, Byte.MAX_VALUE, -97, -126, -54}))) {
                    p000.C0076.hook(((android.content.Context) obj).getClassLoader());
                    m154(p000.C0074.m256(new byte[]{58, 76, 25, -67, -28, -108, -35, -112, 8, 84, 12, -7, -84}, new byte[]{123, 60, 105, -99, -126, -3, -77, -7}));
                    return new java.lang.Object[0];
                }
            } else {
                android.util.Log.e(f55, p000.C0074.m256(new byte[]{-39, 108, -6, 116, 61, -14, 99, 69, -10, 117, -7, 60, 45, -8, 43}, new byte[]{-104, 28, -118, 84, 72, -100, 5, 44}));
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            android.util.Log.e(f55, p000.C0074.m256(new byte[]{-124, 66, 96, -120, 30, 4, 83, -125}, new byte[]{-59, 50, 16, -88, 123, 118, 33, -71}) + th2.getMessage());
        }
        return null;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static java.lang.Object[] m153(java.lang.Object obj) {
        android.os.IBinder iBinder;
        f60 = (android.content.Context) obj;
        java.lang.String str = f55;
        android.util.Log.d(str, p000.C0074.m256(new byte[]{126, -17, 109, -93, 62}, new byte[]{23, -127, 4, -41, 16, -81, -85, -37}) + obj);
        try {
            m155((android.content.Context) obj);
            p000.C0067.m233();
            try {
                java.lang.reflect.Field declaredField = p000.C0010.m63(p000.C0074.m256(new byte[]{51, -89, 50, 126, -17, -67, 28, 68, 61, -70, 120, 95, -27, -90, 14, 3, 49, -84, 27, 109, -18, -75, 31, 15, 32}, new byte[]{82, -55, 86, 12, Byte.MIN_VALUE, -44, 120, 106})).getDeclaredField(p000.C0074.m256(new byte[]{-74, 72, -92, -28, -100, 16}, new byte[]{-59, 11, -59, -121, -12, 117, 117, -95}));
                declaredField.setAccessible(true);
                java.util.Map map = (java.util.Map) declaredField.get(null);
                synchronized (map) {
                    iBinder = (android.os.IBinder) map.get(p000.C0074.m256(new byte[]{24, 4, -104, 98, -101}, new byte[]{94, 72, -64, 50, -45, -73, 84, -45}));
                }
                android.util.Log.d(str, p000.C0074.m256(new byte[]{0, 4, 79, -78, -66, 58, -76}, new byte[]{70, 72, 23, -30, -10, 0, -108, 77}) + iBinder);
                if (iBinder != null) {
                    com.lerist.lib.lhooker.LHooker.m18(iBinder);
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            if (com.lerist.lib.lhooker.LHooker.m16()) {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{-72, 95, -102, -76, 27, 6, -47, -37, -72, 13, -104, -95, 24, 27, -124, -46, -94, 21, -120}, new byte[]{-105, 59, -5, -64, 122, 41, -73, -73}));
            } else if (com.lerist.lib.lhooker.LHooker.m15()) {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{2, 72, 124, -84, -21, -41, -8, 81, 2, 31, 123, -71, -69, -102, -3, 92, 24, 2, 110}, new byte[]{45, 44, 29, -40, -118, -8, -98, 61}));
            } else if (com.lerist.lib.lhooker.LHooker.m13()) {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{42, Byte.MAX_VALUE, -121, 46, -32, 89, 98, 113, 42, 41, -124, 57, -76, 23, 96, 44, 48, 53, -107}, new byte[]{5, 27, -26, 90, -127, 118, 4, 29}));
            } else {
                com.lerist.lib.lhooker.LHooker.m17(p000.C0074.m256(new byte[]{35, 26, -112, -8, 49, 10, -106, -98, 35, 75, -109, -17, 52, 23, -63, -109, 57, 80, -126}, new byte[]{12, 126, -15, -116, 80, 37, -16, -14}));
            }
            p000.C0012.m73((android.content.Context) obj, f53);
            if (com.lerist.lib.lhooker.LHooker.f0) {
                com.lerist.lib.lhooker.LHooker.suspendAll();
                android.util.Log.d(f55, p000.C0074.m256(new byte[]{-116, -72, -3, -123, -26, -50, 13, -54, -84, -91, -4, -33}, new byte[]{-59, -42, -108, -15, -58, -88, 100, -92}));
            } else {
                android.util.Log.e(f55, p000.C0074.m256(new byte[]{-115, 83, 38, -108, 103, -73, 55, -47, -83, 83, 38, -109, 47, -89, 61, -103}, new byte[]{-60, 61, 79, -32, 71, -62, 89, -73}));
            }
            return new java.lang.Object[0];
        } catch (java.lang.RuntimeException unused) {
            return null;
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            android.util.Log.e(f55, p000.C0074.m256(new byte[]{-69, -86, -27, -6, 98, -28, 23, 68, -99, -74, -94}, new byte[]{-14, -60, -116, -114, 66, -127, 101, 54}));
            return null;
        }
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    static void m154(java.lang.String str) {
        android.util.Log.d(f55, str);
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    private static void m155(android.content.Context context) {
        f59 = new android.os.Handler(context.getMainLooper());
        java.util.Iterator<p000.C0033.InterfaceC0034> it = f58.iterator();
        while (it.hasNext()) {
            try {
                it.next().m156();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
