package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޒ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0067 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static java.lang.reflect.Method f182;

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.reflect.Method f183;

    /* renamed from: ԩ, reason: contains not printable characters */
    static java.lang.Class f184;

    /* renamed from: Ԫ, reason: contains not printable characters */
    static java.lang.reflect.Method f185;

    /* renamed from: ԫ, reason: contains not printable characters */
    static java.lang.Object f186;

    static {
        try {
            f183 = java.lang.Class.class.getDeclaredMethod(p000.C0074.m256(new byte[]{16, -42, -24, -41, -78, -29, 102, -64, 5, -42, -8, -34, -78, -12, 98, -50, 19}, new byte[]{119, -77, -100, -109, -41, Byte.MIN_VALUE, 10, -95}), java.lang.String.class, java.lang.Class[].class);
            java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod(p000.C0074.m256(new byte[]{97, 72, -46, 13, 19, 56, 72}, new byte[]{7, 39, -96, 67, 114, 85, 45, -104}), java.lang.String.class);
            f182 = declaredMethod;
            java.lang.Class cls = (java.lang.Class) declaredMethod.invoke(null, p000.C0074.m256(new byte[]{104, -7, 87, 83, -15, -42, -103, 54, 117, -21, 79, 64, -11, -109, -31, 8, 94, -19, 85, 81, -15, -48, -46}, new byte[]{12, -104, 59, 37, -104, -67, -73, 69}));
            f184 = cls;
            f185 = (java.lang.reflect.Method) f183.invoke(cls, p000.C0074.m256(new byte[]{-74, -41, 86, 6, -17, -114, 46, -63, -85, -13, 82, 39, -61, -110, 47, -55, -75, -58, 75, 33, -24, -103}, new byte[]{-59, -78, 34, 78, -122, -22, 74, -92}), new java.lang.Class[]{java.lang.String[].class});
            f186 = ((java.lang.reflect.Method) f183.invoke(f184, p000.C0074.m256(new byte[]{-13, -115, -29, 18, 42, -70, 118, -80, -7, -115}, new byte[]{-108, -24, -105, 64, 95, -44, 2, -39}), null)).invoke(null, null);
        } catch (java.lang.Exception e) {
            android.util.Log.e(p000.C0074.m256(new byte[]{118, -113, -54, -61, -1, 64, -60, 96, 75, -124, -7, -37, -13, 79, -61}, new byte[]{36, -22, -84, -81, -102, 35, -80, 9}), p000.C0074.m256(new byte[]{47, -24, 54, 70, 61, 70, 78, -15, 62, -70, 41, 76, 59, 14, 70, -16, 57}, new byte[]{74, -102, 68, 41, 79, 102, 41, -108}), e);
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static void m232(java.lang.String... strArr) {
        f185.invoke(f186, strArr);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static boolean m233() {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return true;
        }
        try {
            m232(p000.C0074.m256(new byte[]{52, -35, 87, -19, -90, -47, -122, -102, 87}, new byte[]{120, -68, 57, -119, -44, -66, -17, -2}), p000.C0074.m256(new byte[]{-96, 38, -66, 2, -109, 118, 66, -95, -98, 42, -72, 11, -109}, new byte[]{-20, 69, -47, 111, -68, 23, 44, -59}), p000.C0074.m256(new byte[]{55, -99, -5, -11, -8, 16, -58, -24, 21, -112, -75}, new byte[]{123, -9, -102, -125, -103, 63, -86, -119}), p000.C0074.m256(new byte[]{-121, -103, 57, -108, 91, -68, 39, 33, -72, -124, 43, -116, 72, -72, 99}, new byte[]{-53, -3, 88, -8, 45, -43, 76, 14}), p000.C0074.m256(new byte[]{23, 99, -42, -24, 77, 53, -99, -84, 116, 102, -48, -91}, new byte[]{91, 15, -65, -118, 46, 90, -17, -55}));
            return true;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
