package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ׯ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0010 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static java.lang.reflect.Method f42;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.lang.reflect.Method f43;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static java.lang.reflect.Method f44;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> f45 = new java.util.concurrent.ConcurrentHashMap<>();

    static {
        try {
            f42 = java.lang.Class.class.getDeclaredMethod(p000.C0074.m256(new byte[]{109, 11, -4, 78, -44, -28, -35, -3, 120, 11, -20, 71, -44, -13, -39, -13, 110}, new byte[]{10, 110, -120, 10, -79, -121, -79, -100}), java.lang.String.class, java.lang.Class[].class);
            f43 = java.lang.Class.class.getDeclaredMethod(p000.C0074.m256(new byte[]{44, 62, 2, -51, -13, 84, 10}, new byte[]{74, 81, 112, -125, -110, 57, 111, 42}), java.lang.String.class);
            f44 = java.lang.Class.class.getDeclaredMethod(p000.C0074.m256(new byte[]{-102, 115, 68, 1, -96, -24, -120}, new byte[]{-4, 28, 54, 79, -63, -123, -19, -36}), java.lang.String.class, java.lang.Boolean.TYPE, java.lang.ClassLoader.class);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static java.lang.Class m62(java.lang.ClassLoader classLoader, java.lang.String str) {
        return m64(str, true, classLoader);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.Class m63(java.lang.String str) {
        java.lang.reflect.Method method = f43;
        if (method != null) {
            try {
                return (java.lang.Class) method.invoke(null, str);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return java.lang.Class.forName(str);
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static java.lang.Class m64(java.lang.String str, boolean z, java.lang.ClassLoader classLoader) {
        try {
            java.lang.reflect.Method method = f44;
            if (method != null) {
                try {
                    return (java.lang.Class) method.invoke(null, str, java.lang.Boolean.valueOf(z), classLoader);
                } catch (java.lang.Exception unused) {
                }
            }
            return java.lang.Class.forName(str, z, classLoader);
        } catch (java.lang.ClassNotFoundException | java.lang.Exception unused2) {
            return null;
        }
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static <E> E m65(java.lang.Object obj, java.lang.Class cls, java.lang.String str) {
        java.lang.Class cls2 = cls;
        java.lang.reflect.Field field = null;
        do {
            try {
                try {
                    field = cls2.getDeclaredField(str);
                } catch (java.lang.NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null) {
                        break;
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return null;
            }
        } while (field == null);
        if (field != null) {
            field.setAccessible(true);
            return (E) field.get(obj);
        }
        throw new java.lang.NoSuchFieldException(cls.toString() + " " + str);
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public static java.lang.reflect.Method m66(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        if (cls == null) {
            throw new java.lang.NullPointerException(p000.C0074.m256(new byte[]{22, 98, -81, 44, 23, -73, -126, 50, 58, 101, -85, 45, 94, -34, -117, 33, 33, 74, -85, 60, 8, -97, -98, 33, 49, 67, -85, 43, 12, -111, -120, 100, 54, 98, -81, 44, 23, -34, -123, 55, 117, 96, -69, 51, 8, -48}, new byte[]{85, 14, -50, 95, 100, -2, -20, 68}));
        }
        java.lang.String m67 = m67(cls, str, clsArr);
        java.lang.reflect.Method method = f45.get(m67);
        if (method != null) {
            return method;
        }
        java.lang.reflect.Method method2 = null;
        java.lang.Class cls2 = cls;
        do {
            try {
                java.lang.reflect.Method method3 = f42;
                method2 = method3 != null ? (java.lang.reflect.Method) method3.invoke(cls2, str, clsArr) : cls2.getDeclaredMethod(str, clsArr);
            } catch (java.lang.NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } catch (java.lang.Exception e) {
                throw e;
            }
        } while (method2 == null);
        if (method2 != null) {
            method2.setAccessible(true);
            f45.put(m67, method2);
            return method2;
        }
        throw new java.lang.NoSuchMethodException(cls.getName() + " " + str + " " + java.util.Arrays.toString(clsArr));
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    private static java.lang.String m67(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls.getName());
        sb.append(p000.C0074.m256(new byte[]{-9}, new byte[]{-44, 32, -36, -93, 25, -94, -79, 124}));
        sb.append(str);
        if (clsArr != null) {
            int length = clsArr.length;
            for (int i = 0; i < length; i++) {
                java.lang.Class cls2 = clsArr[i];
                sb.append(p000.C0074.m256(new byte[]{11}, new byte[]{38, -17, -110, 113, -117, -102, -76, 106}));
                sb.append(cls2 == null ? p000.C0074.m256(new byte[]{-121, -114, 99, -100}, new byte[]{-23, -5, 15, -16, -32, 108, 32, 93}) : cls2.getName());
            }
        }
        return sb.toString();
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public static <E> E m68(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            if (cls == null) {
                throw new java.lang.NullPointerException(p000.C0074.m256(new byte[]{38, 85, -105, -61, -5, 68, 112, 28, 10, 82, -109, -62, -78, 45, 87, 4, 19, 86, -99, -43, -88, 110, 114, 11, 22, 74, -42, -39, -5, 45, 112, 31, 9, 85, -40}, new byte[]{101, 57, -10, -80, -120, 13, 30, 106}));
            }
            java.lang.reflect.Method m66 = m66(cls, str, clsArr);
            if (m66 != null) {
                return (E) m66.invoke(obj, objArr);
            }
            throw new java.lang.NoSuchMethodException(str + " " + java.util.Arrays.toString(clsArr));
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (e.getTargetException() != null) {
                throw new java.lang.RuntimeException(e.getTargetException());
            }
            throw e;
        } catch (java.lang.Exception e2) {
            throw e2;
        }
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public static <E> E m69(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        return (E) m68(obj, m63(str), str2, clsArr, objArr);
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public static <E> E m70(java.lang.Class cls, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        java.lang.reflect.Constructor declaredConstructor;
        try {
            declaredConstructor = cls.getConstructor(clsArr);
        } catch (java.lang.NoSuchMethodException unused) {
            declaredConstructor = cls.getDeclaredConstructor(clsArr);
        }
        declaredConstructor.setAccessible(true);
        return (E) declaredConstructor.newInstance(objArr);
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public static void m71(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.Object obj2) {
        java.lang.reflect.Field field = null;
        java.lang.Class cls2 = cls;
        do {
            try {
                try {
                    field = cls2.getDeclaredField(str);
                } catch (java.lang.NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null) {
                        break;
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            }
        } while (field == null);
        if (field != null) {
            field.setAccessible(true);
            field.set(obj, obj2);
        } else {
            throw new java.lang.NoSuchFieldException(cls.toString() + " " + str);
        }
    }
}
