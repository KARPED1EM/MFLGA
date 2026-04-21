package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޛ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public final class C0084 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static java.lang.String f240;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static byte[] f241;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static final java.lang.String f242 = p000.C0074.m256(new byte[]{105, 77, 51, 112, 16, -60, -122, -22, 37, 69, 53, 71, 97, -52, -119, -111}, new byte[]{1, 41, 4, 8, 40, -12, -65, -94});

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static final java.lang.String f243 = p000.C0074.m256(new byte[]{57, 72, 70, 80, 115, -27, 44, 60, 27, 89, 118, Byte.MAX_VALUE, 15, -27, 59, 97}, new byte[]{112, 29, 34, 24, 67, -114, 107, 13});

    /* renamed from: ԫ, reason: contains not printable characters */
    static p000.C0036 f244 = new p000.C0036();

    /* renamed from: Ԭ, reason: contains not printable characters */
    static java.lang.String f245 = null;

    /* renamed from: ԭ, reason: contains not printable characters */
    static java.lang.String f246 = null;

    /* renamed from: Ԯ, reason: contains not printable characters */
    static long f247 = java.lang.System.currentTimeMillis();

    /* renamed from: ԯ, reason: contains not printable characters */
    static android.os.Handler f248 = null;

    /* renamed from: ՠ, reason: contains not printable characters */
    static long f249 = 0;

    /* renamed from: ֈ, reason: contains not printable characters */
    static long f250 = 25920000000L;

    /* renamed from: ֏, reason: contains not printable characters */
    private static boolean f251;

    /* renamed from: ׯ, reason: contains not printable characters */
    private static long f252;

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޛ$Ԩ, reason: contains not printable characters */
    class RunnableC0086 implements java.lang.Runnable {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f256;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f257;

        RunnableC0086(java.lang.String str, java.lang.String str2) {
            this.f256 = str;
            this.f257 = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p000.C0084.m272(this.f256, this.f257);
        }
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static final byte[] m262() {
        return f241;
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static final java.lang.String m263() {
        return f240;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public static final long m264() {
        if (f241 != null && f240 != null) {
            try {
                if (java.lang.System.currentTimeMillis() - 1775765045421L >= f250) {
                    return -1L;
                }
                long parseLong = java.lang.Long.parseLong("" + com.lerist.lib.lhooker.LHooker.getObjs(f241, f240)[2]);
                if (parseLong - java.lang.System.currentTimeMillis() >= 5184000000L) {
                    if (!p000.C0074.m256(new byte[]{-17, 122, -79}, new byte[]{-35, 74, -127, 31, -1, 57, 7, -7}).equals(m266())) {
                        return -1L;
                    }
                }
                return parseLong;
            } catch (java.lang.Exception unused) {
            }
        }
        return -1L;
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public static final long m265() {
        java.lang.String str;
        if (f241 != null && (str = f240) != null) {
            java.lang.String str2 = f245;
            if (str2 != null && str2.equals(str)) {
                return -1L;
            }
            try {
                if (java.lang.System.currentTimeMillis() - 1775765045421L >= f250) {
                    return -1L;
                }
                long parseLong = java.lang.Long.parseLong("" + com.lerist.lib.lhooker.LHooker.getObjs(f241, f240)[1]);
                if (parseLong - java.lang.System.currentTimeMillis() >= 126144000000L) {
                    java.lang.String m266 = m266();
                    if (!p000.C0074.m256(new byte[]{82, 31, 22}, new byte[]{99, 47, 38, -93, 78, -22, 28, -107}).equals(m266)) {
                        if (!p000.C0074.m256(new byte[]{-58, 40, 43}, new byte[]{-12, 24, 27, 4, -74, -6, -117, -115}).equals(m266)) {
                            return -1L;
                        }
                    }
                }
                return parseLong;
            } catch (java.lang.Exception unused) {
            }
        }
        return -1L;
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public static final java.lang.String m266() {
        if (f241 != null && f240 != null) {
            try {
                return "" + com.lerist.lib.lhooker.LHooker.getObjs(f241, f240)[0];
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public static final boolean m267() {
        return java.lang.System.currentTimeMillis() >= m264();
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public static final boolean m268() {
        return f245 != null;
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public static final boolean m269() {
        if (java.lang.System.currentTimeMillis() - f252 < 60000) {
            return f251;
        }
        boolean z = (m267() || m270()) ? false : true;
        f251 = z;
        f252 = java.lang.System.currentTimeMillis();
        return z;
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public static final boolean m270() {
        return java.lang.System.currentTimeMillis() >= m265();
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public static final void m271(java.lang.String str, java.lang.String str2) {
        f252 = -1L;
        f241 = str == null ? null : str.getBytes();
        f240 = str2;
        if (!("" + str2).equals("" + f246) && m269()) {
            if (("" + str2).equals("" + f245)) {
                f240 = null;
                p000.C0041.stopMockLocation();
                p000.C0063.m227(false);
            } else {
                if (java.lang.System.currentTimeMillis() - f249 < 20000) {
                    return;
                }
                f249 = java.lang.System.currentTimeMillis();
                if (f248 == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread(p000.C0074.m256(new byte[]{108, 8}, new byte[]{57, 65, -30, 114, -9, -15, -115, -102}));
                    handlerThread.start();
                    f248 = new android.os.Handler(handlerThread.getLooper());
                }
                f248.postDelayed(new p000.C0084.RunnableC0086(str, str2), (new java.security.SecureRandom().nextInt(5) + 2) * 1000);
            }
        }
    }

    /* renamed from: ׯ, reason: contains not printable characters */
    public static final void m272(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = p000.C0002.m23(p000.C0033.m151(), p000.C0074.m256(new byte[]{Byte.MIN_VALUE, -69, -34, 86, -9, -119, 11, 123, -112, -96, -99, 30, -6, -121, 28, 126, -116, -73, -46, 12, -14, -125, 23}, new byte[]{-29, -44, -77, 120, -101, -20, 121, 18})) + p000.C0074.m256(new byte[]{48}, new byte[]{76, -125, -11, 113, -68, 25, -104, -54}) + p000.C0002.m24(p000.C0033.m151(), p000.C0074.m256(new byte[]{-127, 11, -3, 7, -16, -102, 13, 8, -111, 16, -66, 79, -3, -108, 26, 13, -115, 7, -15, 93, -11, -112, 17}, new byte[]{-30, 100, -112, 41, -100, -1, Byte.MAX_VALUE, 97}));
        f244.m167(new p000.C0084.C0085(str, str2, str3));
        if (!f244.m164()) {
            f244.m162(p000.C0074.m256(new byte[]{88, 82, -33, -87, -59, -89, 59, -47, 72, 86, -46, -30, -56, -72, 49, -47, 77, 84}, new byte[]{46, 55, -71, -121, -92, -41, 82, -1}), 12309);
            return;
        }
        try {
            f244.m166(p000.C0001.m22(str + p000.C0074.m256(new byte[]{41}, new byte[]{5, -101, -17, 45, -16, -2, -62, -125}) + str2 + p000.C0074.m256(new byte[]{25}, new byte[]{53, -68, 60, -39, -4, 63, 10, -96}) + str3, f242, f243));
        } catch (java.lang.Throwable unused) {
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޛ$Ϳ, reason: contains not printable characters */
    class C0085 implements p000.C0036.InterfaceC0040 {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f253;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f254;

        /* renamed from: ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f255;

        C0085(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f253 = str;
            this.f254 = str2;
            this.f255 = str3;
        }

        @Override // p000.C0036.InterfaceC0040
        /* renamed from: Ԩ */
        public void mo171() {
            p000.C0084.f247 = java.lang.System.currentTimeMillis();
            try {
                p000.C0084.f244.m166(p000.C0001.m22(this.f253 + p000.C0074.m256(new byte[]{-11}, new byte[]{-39, -127, 85, 42, -62, -105, -86, -4}) + this.f254 + p000.C0074.m256(new byte[]{70}, new byte[]{106, 11, -56, -27, 81, 70, -53, -76}) + this.f255, p000.C0074.m256(new byte[]{112, 86, 15, 33, 122, 69, 74, 50, 60, 94, 9, 22, 11, 77, 69, 73}, new byte[]{24, 50, 56, 89, 66, 117, 115, 122}), p000.C0074.m256(new byte[]{-102, -99, 35, -17, -114, 33, -56, 61, -72, -116, 19, -64, -14, 33, -33, 96}, new byte[]{-45, -56, 71, -89, -66, 74, -113, 12})));
            } catch (java.lang.Throwable unused) {
            }
        }

        @Override // p000.C0036.InterfaceC0040
        /* renamed from: ԩ */
        public void mo172(java.lang.String str) {
            try {
                java.lang.String str2 = "" + p000.C0001.m20(str, p000.C0074.m256(new byte[]{-79, -19, -105, 60, 76, 85, -59, -91, -3, -27, -111, 11, 61, 93, -54, -34}, new byte[]{-39, -119, -96, 68, 116, 101, -4, -19}), p000.C0074.m256(new byte[]{63, -78, -68, -35, 107, -79, 13, -116, 29, -93, -116, -14, 23, -79, 26, -47}, new byte[]{118, -25, -40, -107, 91, -38, 74, -67}));
                if (str2.contains(p000.C0074.m256(new byte[]{57, 17, -95, 49, 123, 47, 112}, new byte[]{119, 94, -15, 112, 40, 124, 94, 32}))) {
                    p000.C0084.f245 = this.f254;
                    p000.C0084.f246 = null;
                    java.lang.String unused = p000.C0084.f240 = null;
                    byte[] unused2 = p000.C0084.f241 = null;
                    p000.C0041.stopMockLocation();
                    p000.C0063.m227(false);
                }
                if (str2.contains(p000.C0074.m256(new byte[]{-25, -38, -83, 99, -85}, new byte[]{-105, -69, -34, 16, -123, 95, 36, -112}))) {
                    p000.C0084.f246 = this.f254;
                    p000.C0084.f245 = null;
                }
            } catch (java.lang.Throwable unused3) {
            }
        }

        @Override // p000.C0036.InterfaceC0040
        /* renamed from: Ԫ */
        public void mo173(java.lang.String str) {
            if (java.lang.System.currentTimeMillis() - p000.C0084.f247 > 3600000) {
                p000.C0084.f244.m162(p000.C0074.m256(new byte[]{30, 65, -26, -84, 119, -4, 44, -84, 28, 66, -7, -69, 113}, new byte[]{47, 117, -41, -126, 70, -54, 24, -126}), 12309);
            } else if (java.lang.System.currentTimeMillis() - p000.C0084.f247 > 1800000) {
                p000.C0084.f244.m162(p000.C0074.m256(new byte[]{-87, 8, 1, -14, 14, 39, -20, 109, -81, 4, 73, -80, 13, 57, -85, Byte.MAX_VALUE, -85, 67, 3, -71, 30}, new byte[]{-33, 109, 103, -36, 104, 75, -62, 12}), 12309);
            } else {
                p000.C0084.f244.m165();
            }
            if (java.lang.System.currentTimeMillis() - p000.C0084.f247 <= 86400000 || p000.C0084.f246 != null) {
                return;
            }
            p000.C0084.f245 = this.f254;
            p000.C0084.f246 = null;
            java.lang.String unused = p000.C0084.f240 = null;
            byte[] unused2 = p000.C0084.f241 = null;
            p000.C0041.stopMockLocation();
            p000.C0063.m227(false);
        }

        @Override // p000.C0036.InterfaceC0040
        /* renamed from: Ϳ */
        public void mo170() {
        }
    }
}
