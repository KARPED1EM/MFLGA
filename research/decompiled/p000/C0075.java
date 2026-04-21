package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޗ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public final class C0075 {
    /* renamed from: Ԩ, reason: contains not printable characters */
    private static byte[] m257(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return bArr;
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public java.lang.String m258(byte[] bArr, byte[] bArr2) {
        return new java.lang.String(m257(bArr, bArr2), java.nio.charset.StandardCharsets.UTF_8);
    }
}
