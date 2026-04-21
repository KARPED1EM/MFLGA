package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ގ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0058 {

    /* renamed from: ԫ, reason: contains not printable characters */
    private static boolean f166;

    /* renamed from: ԭ, reason: contains not printable characters */
    private static long f168;

    /* renamed from: Ԯ, reason: contains not printable characters */
    private static long f169;

    /* renamed from: ԯ, reason: contains not printable characters */
    private static boolean f170;

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static final java.lang.String f162 = p000.C0074.m256(new byte[]{11, -63, 17}, new byte[]{70, -110, 68, -77, -9, -26, -5, 84});

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static float f163 = 0.0f;

    /* renamed from: ԩ, reason: contains not printable characters */
    private static float f164 = 0.0f;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private static float f165 = 1.0f;

    /* renamed from: Ԭ, reason: contains not printable characters */
    private static boolean f167 = false;

    /* renamed from: ՠ, reason: contains not printable characters */
    private static boolean f171 = false;

    /* renamed from: ֈ, reason: contains not printable characters */
    static java.text.SimpleDateFormat f172 = new java.text.SimpleDateFormat(p000.C0074.m256(new byte[]{21, -74, 98, 126, -49, -27, -110, 9, 8, -85}, new byte[]{108, -49, 27, 7, -30, -88, -33, 36}));

    /* renamed from: ֏, reason: contains not printable characters */
    static int f173 = 50;

    public static boolean hook_nativeIsDataInjectionEnabled(long j) {
        if (!f166 || !f170) {
            return hook_nativeIsDataInjectionEnabled_bak(j);
        }
        hook_nativeIsDataInjectionEnabled_bak(j);
        return true;
    }

    public static boolean hook_nativeIsDataInjectionEnabled_bak(long j) {
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(p000.C0074.m256(new byte[]{60}, new byte[]{31, 18, 124, 86, 21, -27, -97, 0}));
            stringBuffer.append(p000.C0074.m256(new byte[]{109}, new byte[]{78, 46, 49, 23, -24, -6, -24, -69}));
            stringBuffer.append(p000.C0074.m256(new byte[]{11}, new byte[]{40, 17, -39, 116, -29, 37, 103, -109}));
            stringBuffer.append(p000.C0074.m256(new byte[]{88}, new byte[]{123, 120, -109, 49, -7, -71, -16, 83}));
            stringBuffer.append(p000.C0074.m256(new byte[]{-27}, new byte[]{-58, -121, -115, -81, -39, -79, -59, 29}));
            stringBuffer.append(p000.C0074.m256(new byte[]{-100}, new byte[]{-65, 60, 111, 74, -117, -119, -114, -102}));
            for (int i = 0; i < 100; i += 2) {
            }
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean hook_nativeIsDataInjectionEnabled_copy(long j) {
        return false;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    static /* synthetic */ float m192(float f) {
        float f2 = f164 + f;
        f164 = f2;
        return f2;
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public static long m201() {
        return (long) (f163 + f164);
    }

    /* renamed from: ׯ, reason: contains not printable characters */
    public static float m202() {
        return f165;
    }

    /* renamed from: ؠ, reason: contains not printable characters */
    private static void m203() {
        android.util.Log.e(f162, p000.C0074.m256(new byte[]{70, -63, 103, -50, -120, -106, -71}, new byte[]{47, -81, 14, -70, -90, -72, -105, -81}));
        f168 = java.lang.System.currentTimeMillis();
        new java.lang.Thread(new p000.C0058.RunnableC0059()).start();
        f167 = true;
    }

    /* renamed from: ހ, reason: contains not printable characters */
    public static boolean m204() {
        return f171;
    }

    /* renamed from: ށ, reason: contains not printable characters */
    public static boolean m205() {
        try {
            return com.lerist.inject.utils.LStepSensor.isMocking();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: ނ, reason: contains not printable characters */
    static boolean m206(long j) {
        return f172.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).equals(f172.format(java.lang.Long.valueOf(j)));
    }

    /* renamed from: ރ, reason: contains not printable characters */
    public static void m207(boolean z) {
        f171 = z;
    }

    /* renamed from: ބ, reason: contains not printable characters */
    public static void m208(long j) {
        f163 = j;
    }

    /* renamed from: ޅ, reason: contains not printable characters */
    public static void m209(long j) {
        f164 = j;
        f163 = 0.0f;
    }

    /* renamed from: ކ, reason: contains not printable characters */
    public static void m210(float f) {
        f168 = java.lang.System.currentTimeMillis();
        f165 = f;
    }

    /* renamed from: އ, reason: contains not printable characters */
    public static boolean m211(byte[] bArr, java.lang.String str) {
        return com.lerist.inject.utils.LStepSensor.m0(bArr, str);
    }

    /* renamed from: ވ, reason: contains not printable characters */
    public static void m212() {
        f168 = java.lang.System.currentTimeMillis();
        f166 = true;
        if (!f167) {
            m203();
        }
        try {
            m211(p000.C0084.m262(), p000.C0084.m263());
            com.lerist.inject.utils.LStepSensor.setMocking(f166);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: މ, reason: contains not printable characters */
    public static void m213() {
        f166 = false;
        try {
            com.lerist.inject.utils.LStepSensor.setMocking(false);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ގ$Ϳ, reason: contains not printable characters */
    class RunnableC0059 implements java.lang.Runnable {
        RunnableC0059() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01a8 A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:30:0x0143, B:34:0x0158, B:38:0x015f, B:41:0x016d, B:46:0x01a8, B:49:0x01ab, B:53:0x01a3, B:56:0x01b0, B:58:0x01bd, B:59:0x01c7, B:61:0x01cd, B:63:0x01d7, B:65:0x01e1, B:66:0x01e7, B:68:0x01c1, B:69:0x0168, B:72:0x015a, B:44:0x019e), top: B:29:0x0143, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01ab A[Catch: all -> 0x0211, TryCatch #0 {all -> 0x0211, blocks: (B:30:0x0143, B:34:0x0158, B:38:0x015f, B:41:0x016d, B:46:0x01a8, B:49:0x01ab, B:53:0x01a3, B:56:0x01b0, B:58:0x01bd, B:59:0x01c7, B:61:0x01cd, B:63:0x01d7, B:65:0x01e1, B:66:0x01e7, B:68:0x01c1, B:69:0x0168, B:72:0x015a, B:44:0x019e), top: B:29:0x0143, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x01ff  */
        /* JADX WARN: Type inference failed for: r16v11 */
        /* JADX WARN: Type inference failed for: r16v12 */
        /* JADX WARN: Type inference failed for: r16v13 */
        /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0058.RunnableC0059.run():void");
        }

        /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
        /* renamed from: ࢡ.ގ$Ϳ$Ϳ, reason: contains not printable characters */
        class C0060 implements android.hardware.SensorEventListener {
            C0060() {
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            }
        }
    }
}
