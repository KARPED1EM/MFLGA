package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.֏, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0009 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static java.lang.reflect.Method f39;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.lang.reflect.Method f40;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static java.lang.reflect.Method f41;

    static {
        try {
            f39 = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
            f40 = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
            f41 = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class, java.lang.Boolean.TYPE, java.lang.ClassLoader.class);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static <E> E m61(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        if (cls == null) {
            throw new java.lang.NullPointerException("ClassInvoker: Invoke class is null.");
        }
        java.lang.reflect.Method method = null;
        do {
            try {
                java.lang.reflect.Method method2 = f39;
                method = method2 != null ? (java.lang.reflect.Method) method2.invoke(cls, str, clsArr) : cls.getDeclaredMethod(str, clsArr);
            } catch (java.lang.NoSuchMethodException unused) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    break;
                }
            } catch (java.lang.reflect.InvocationTargetException e) {
                if (e.getTargetException() != null) {
                    throw new java.lang.RuntimeException(e.getTargetException());
                }
                throw e;
            } catch (java.lang.Exception e2) {
                throw e2;
            }
        } while (method == null);
        if (method != null) {
            method.setAccessible(true);
            return (E) method.invoke(obj, objArr);
        }
        throw new java.lang.NoSuchMethodException(str + " " + java.util.Arrays.toString(clsArr));
    }
}
