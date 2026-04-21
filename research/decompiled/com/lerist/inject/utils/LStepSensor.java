package com.lerist.inject.utils;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class LStepSensor {
    private static native int doHook(byte[] bArr, java.lang.String str);

    public static native boolean isMocking();

    public static native void setMocking(boolean z);

    public static native void setSensorValues(int i, int i2, float[] fArr);

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static boolean m0(byte[] bArr, java.lang.String str) {
        if (bArr != null && str != null) {
            try {
                java.lang.System.load(p000.C0074.m256(new byte[]{84, -72, -108, -1, 4, 76, 60, 0, 84, -19, -109, -23, 86, 81, 59, 8, 77, -14, -122}, new byte[]{123, -36, -11, -117, 101, 99, 90, 108}));
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            try {
                return doHook(bArr, str) == 0;
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
            }
        }
        return false;
    }
}
