package com.lerist.lib.lhooker;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class LHooker {

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static boolean f0 = false;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static boolean f1 = false;

    /* renamed from: ԩ, reason: contains not printable characters */
    public static boolean f2 = false;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static java.lang.Object f3;

    /* renamed from: ԫ, reason: contains not printable characters */
    static java.util.Map<java.lang.String, com.lerist.lib.lhooker.LHooker.C0000> f4 = new java.util.concurrent.ConcurrentHashMap();

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: com.lerist.lib.lhooker.LHooker$Ϳ, reason: contains not printable characters */
    static class C0000 {

        /* renamed from: Ϳ, reason: contains not printable characters */
        java.lang.String f5;

        /* renamed from: Ԩ, reason: contains not printable characters */
        java.lang.reflect.Member f6;

        /* renamed from: ԩ, reason: contains not printable characters */
        java.lang.reflect.Method f7;

        /* renamed from: Ԫ, reason: contains not printable characters */
        java.lang.reflect.Method f8;

        public C0000(java.lang.String str, java.lang.reflect.Member member, java.lang.reflect.Method method, java.lang.reflect.Method method2) {
            this.f5 = str;
            this.f6 = member;
            this.f7 = method;
            this.f8 = method2;
        }
    }

    public static native boolean call(java.lang.String str, java.lang.String str2);

    public static native void ensureDeclareClass(java.lang.reflect.Member member, java.lang.reflect.Method method);

    public static native void ensureMethodCached(java.lang.reflect.Method method, java.lang.reflect.Method method2);

    public static native java.lang.Object findMethodNative(java.lang.Class cls, java.lang.String str, java.lang.String str2);

    public static native java.lang.Object[] getObjs(byte[] bArr, java.lang.String str);

    private static native long getThread();

    private static native boolean hookMethodNative(java.lang.Object obj, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3);

    public static native int init(int i);

    public static native void resumeAll(long j);

    private static native boolean shouldVisiblyInit();

    public static native long suspendAll();

    private static native int visiblyInit(long j);

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static void m1(java.lang.reflect.Member member, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
        if (member == null) {
            throw new java.lang.IllegalArgumentException("null target method");
        }
        if (method == null) {
            throw new java.lang.IllegalArgumentException("null hook method");
        }
        if (!java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
            throw new java.lang.IllegalArgumentException("Hook must be a static method: " + method);
        }
        m5(member, method, "Original", "Hook");
        if (method2 != null) {
            if (!java.lang.reflect.Modifier.isStatic(method2.getModifiers())) {
                throw new java.lang.IllegalArgumentException("Backup must be a static method: " + method2);
            }
            m5(member, method2, "Original", "Backup");
        }
        if (m12() != 0) {
            android.util.Log.e("LHooker", "initClass failed");
        }
        f1 = true;
        if (!hookMethodNative(member, method, method2, method3)) {
            f1 = false;
            throw new java.lang.RuntimeException("Failed to hook " + member + " with " + method);
        }
        if (method2 != null && !method2.isAccessible()) {
            method2.setAccessible(true);
        }
        f1 = false;
        if (member instanceof java.lang.reflect.Method) {
            ((java.lang.reflect.Method) member).setAccessible(true);
        }
        f4.put(method.getDeclaringClass().getName() + "/" + method.getName(), new com.lerist.lib.lhooker.LHooker.C0000(member.getName(), member, method, method2));
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static final <T> T m2(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        T t;
        com.lerist.lib.lhooker.LHooker.C0000 c0000 = f4.get(str + "/" + str2);
        if (c0000 == null || (t = (T) m4(c0000.f6, c0000.f8, obj, objArr)) == null) {
            return null;
        }
        return t;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static final <T> T m3(java.lang.Object obj, java.lang.Object... objArr) {
        java.lang.Object obj2 = f3;
        if (obj2 != null) {
            try {
                return (T) p000.C0009.m61(obj2, obj2.getClass(), "callOriginMethod", new java.lang.Class[]{java.lang.Object.class, java.lang.Object[].class}, new java.lang.Object[]{obj, objArr});
            } catch (java.lang.NoSuchMethodException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                if (e.getTargetException() != null) {
                    throw new java.lang.RuntimeException(e.getTargetException());
                }
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
        java.lang.StackTraceElement stackTraceElement = java.lang.Thread.currentThread().getStackTrace()[3];
        return (T) m2(obj, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), objArr);
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static final java.lang.Object m4(java.lang.reflect.Member member, java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) {
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 1];
        objArr2[0] = obj;
        java.lang.System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        try {
            if (java.lang.reflect.Modifier.isStatic(member.getModifiers())) {
                try {
                    return method.invoke(null, objArr2);
                } catch (java.lang.reflect.InvocationTargetException e) {
                    if (e.getTargetException() != null) {
                        throw new java.lang.RuntimeException(e.getTargetException());
                    }
                }
            } else {
                try {
                    return method.invoke(obj, objArr2);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    if (e2.getTargetException() != null) {
                        throw new java.lang.RuntimeException(e2.getTargetException());
                    }
                }
            }
        } catch (java.lang.IllegalAccessException unused) {
        }
        return null;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    private static void m5(java.lang.Object obj, java.lang.reflect.Method method, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList;
        boolean z = obj instanceof java.lang.reflect.Method;
        if (z) {
            arrayList = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.reflect.Method) obj).getParameterTypes()));
        } else if (!(obj instanceof java.lang.reflect.Constructor)) {
            return;
        } else {
            arrayList = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.reflect.Constructor) obj).getParameterTypes()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(method.getParameterTypes()));
        if (z && !java.lang.reflect.Modifier.isStatic(((java.lang.reflect.Method) obj).getModifiers())) {
            arrayList.add(0, java.lang.Object.class);
        } else if (obj instanceof java.lang.reflect.Constructor) {
            arrayList.add(0, java.lang.Object.class);
        }
        if (!java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
            arrayList2.add(0, java.lang.Object.class);
        }
        if (!z || method.getReturnType().isAssignableFrom(((java.lang.reflect.Method) obj).getReturnType())) {
            if (!((obj instanceof java.lang.reflect.Constructor) && method.getReturnType().equals(java.lang.Void.class)) && arrayList.size() == arrayList2.size()) {
                for (int i = 0; i < arrayList.size() && ((java.lang.Class) arrayList2.get(i)).isAssignableFrom((java.lang.Class) arrayList.get(i)); i++) {
                }
            }
        }
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public static void m6(java.lang.Class cls, java.lang.String str, java.lang.String str2, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
        m1(m10(cls, str, str2), method, method2, method3);
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public static void m7(java.lang.Class cls, java.lang.String str, java.lang.Class cls2, java.lang.Class[] clsArr, java.lang.Class cls3, java.lang.String str2, java.lang.String str3) {
        m8(cls, str, cls2, clsArr, cls3, str2, str3, str3.replaceAll("_bak", "_copy"));
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public static void m8(java.lang.Class cls, java.lang.String str, java.lang.Class cls2, java.lang.Class[] clsArr, java.lang.Class cls3, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.reflect.Method method = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        for (java.lang.reflect.Method method4 : cls3.getMethods()) {
            if (method4.getName().equals(str2)) {
                method = method4;
            }
            if (method4.getName().equals(str3)) {
                method2 = method4;
            }
            if (method4.getName().equals(str4)) {
                method3 = method4;
            }
        }
        try {
            m9(cls, str, cls2, clsArr, method, method2, method3);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public static void m9(java.lang.Class cls, java.lang.String str, java.lang.Class cls2, java.lang.Class[] clsArr, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
        java.lang.Object obj = f3;
        if (obj == null) {
            m6(cls, str, m11(cls2, clsArr), method, method2, method3);
            return;
        }
        try {
            p000.C0009.m61(obj, obj.getClass(), "findAndHookMethod", new java.lang.Class[]{java.lang.Class.class, java.lang.String.class, java.lang.Class.class, java.lang.Class[].class, java.lang.reflect.Method.class, java.lang.reflect.Method.class, java.lang.reflect.Method.class}, new java.lang.Object[]{cls, str, cls2, clsArr, method, method2, method3});
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    private static java.lang.reflect.Member m10(java.lang.Class cls, java.lang.String str, java.lang.String str2) {
        if (cls == null) {
            throw new java.lang.IllegalArgumentException("null class");
        }
        if (str == null) {
            throw new java.lang.IllegalArgumentException("null method name");
        }
        if (str2 != null) {
            return (java.lang.reflect.Member) findMethodNative(cls, str, str2);
        }
        throw new java.lang.IllegalArgumentException("null method signature");
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public static java.lang.String m11(java.lang.Class cls, java.lang.Class... clsArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        int i2;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        java.lang.String str6 = "D";
        if (clsArr != null) {
            java.lang.String str7 = "S";
            int i3 = 0;
            for (int length = clsArr.length; i3 < length; length = i2) {
                java.lang.Class cls2 = clsArr[i3];
                if (cls2 == null) {
                    i = i3;
                    i2 = length;
                } else {
                    i = i3;
                    java.lang.String name = cls2.getName();
                    if (name.equals("double")) {
                        i2 = length;
                        str4 = str6;
                        str5 = str7;
                        sb.append(str4);
                    } else {
                        if (name.equals("int")) {
                            i2 = length;
                            str5 = str7;
                            sb.append("I");
                        } else if (name.equals("byte")) {
                            i2 = length;
                            str5 = str7;
                            sb.append("B");
                        } else if (name.equals("char")) {
                            i2 = length;
                            str5 = str7;
                            sb.append("C");
                        } else if (name.equals("long")) {
                            i2 = length;
                            str5 = str7;
                            sb.append("J");
                        } else if (name.equals("boolean")) {
                            i2 = length;
                            str5 = str7;
                            sb.append("Z");
                        } else if (name.equals("float")) {
                            i2 = length;
                            str5 = str7;
                            sb.append("F");
                        } else if (name.equals("short")) {
                            i2 = length;
                            str5 = str7;
                            sb.append(str5);
                        } else {
                            java.lang.String replaceAll = name.replaceAll("\\.", "/");
                            if (replaceAll.contains("/")) {
                                if (replaceAll.startsWith("L") || replaceAll.startsWith("[")) {
                                    i2 = length;
                                } else {
                                    i2 = length;
                                    replaceAll = "L" + replaceAll;
                                }
                                if (!replaceAll.endsWith(";")) {
                                    replaceAll = replaceAll + ";";
                                }
                            } else {
                                i2 = length;
                            }
                            sb.append(replaceAll);
                        }
                        str4 = str6;
                    }
                    str7 = str5;
                    i3 = i + 1;
                    str6 = str4;
                }
                str4 = str6;
                str5 = str7;
                str7 = str5;
                i3 = i + 1;
                str6 = str4;
            }
            str = str7;
        } else {
            str = "S";
        }
        sb.append(")");
        java.lang.String name2 = cls != null ? cls.getName() : "void";
        char c = 65535;
        switch (name2.hashCode()) {
            case -1325958191:
                str2 = name2;
                if (str2.equals("double")) {
                    c = 0;
                    break;
                }
                break;
            case 104431:
                str3 = name2;
                if (str3.equals("int")) {
                    str2 = str3;
                    c = 1;
                    break;
                }
                str2 = str3;
                break;
            case 3039496:
                str3 = name2;
                if (str3.equals("byte")) {
                    str2 = str3;
                    c = 2;
                    break;
                }
                str2 = str3;
                break;
            case 3052374:
                str3 = name2;
                if (str3.equals("char")) {
                    str2 = str3;
                    c = 3;
                    break;
                }
                str2 = str3;
                break;
            case 3327612:
                str3 = name2;
                if (str3.equals("long")) {
                    str2 = str3;
                    c = 4;
                    break;
                }
                str2 = str3;
                break;
            case 3625364:
                str3 = name2;
                if (str3.equals("void")) {
                    str2 = str3;
                    c = 5;
                    break;
                }
                str2 = str3;
                break;
            case 64711720:
                str3 = name2;
                if (str3.equals("boolean")) {
                    str2 = str3;
                    c = 6;
                    break;
                }
                str2 = str3;
                break;
            case 97526364:
                str3 = name2;
                if (str3.equals("float")) {
                    str2 = str3;
                    c = 7;
                    break;
                }
                str2 = str3;
                break;
            case 109413500:
                str3 = name2;
                if (str3.equals("short")) {
                    str2 = str3;
                    c = '\b';
                    break;
                }
                str2 = str3;
                break;
            default:
                str2 = name2;
                break;
        }
        switch (c) {
            case 0:
                sb.append(str6);
                break;
            case 1:
                sb.append("I");
                break;
            case 2:
                sb.append("B");
                break;
            case 3:
                sb.append("C");
                break;
            case 4:
                sb.append("J");
                break;
            case 5:
                sb.append("V");
                break;
            case 6:
                sb.append("Z");
                break;
            case 7:
                sb.append("F");
                break;
            case '\b':
                sb.append(str);
                break;
            default:
                java.lang.String replaceAll2 = str2.replaceAll("\\.", "/");
                if (replaceAll2.contains("/")) {
                    if (!replaceAll2.startsWith("L") && !replaceAll2.startsWith("[")) {
                        replaceAll2 = "L" + replaceAll2;
                    }
                    if (!replaceAll2.endsWith(";")) {
                        replaceAll2 = replaceAll2 + ";";
                    }
                }
                sb.append(replaceAll2);
                break;
        }
        return sb.toString();
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public static int m12() {
        try {
            if (shouldVisiblyInit()) {
                return visiblyInit(getThread());
            }
            return 0;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* renamed from: ׯ, reason: contains not printable characters */
    public static boolean m13() {
        return m14(android.os.Build.SUPPORTED_ABIS);
    }

    /* renamed from: ؠ, reason: contains not printable characters */
    public static boolean m14(java.lang.String[] strArr) {
        return java.util.Arrays.toString(strArr).toLowerCase().contains("arm64");
    }

    /* renamed from: ހ, reason: contains not printable characters */
    public static boolean m15() {
        return java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS).toLowerCase().contains("x86");
    }

    /* renamed from: ށ, reason: contains not printable characters */
    public static boolean m16() {
        return java.util.Arrays.toString(android.os.Build.SUPPORTED_ABIS).toLowerCase().contains("x86_64");
    }

    /* renamed from: ނ, reason: contains not printable characters */
    public static synchronized void m17(java.lang.String str) {
        synchronized (com.lerist.lib.lhooker.LHooker.class) {
            if (f0) {
                return;
            }
            try {
                java.lang.System.load(str);
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            try {
                int i = android.os.Build.VERSION.SDK_INT;
                if (i >= 23) {
                    try {
                        if (android.os.Build.VERSION.PREVIEW_SDK_INT > 0) {
                            i++;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
                f0 = init(i) == 0;
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: ރ, reason: contains not printable characters */
    public static void m18(java.lang.Object obj) {
        if (obj != null) {
            try {
                java.lang.Object m61 = p000.C0009.m61(obj, obj.getClass(), "getVersionCode", null, null);
                if (m61 == null) {
                    return;
                }
                if (((java.lang.Integer) m61).intValue() < 6) {
                    return;
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        f2 = obj != null;
        f3 = obj;
    }
}
