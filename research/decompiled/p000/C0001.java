package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.Ϳ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0001 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static final java.lang.String f9 = p000.C0074.m256(new byte[]{117, 42, -71, 70, -98, -86, 65, -51, 100, 53, -52, 119, -106, -89, 60, -33}, new byte[]{29, 64, -114, 62, -90, -109, 9, -23});

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static final java.lang.String f10 = p000.C0074.m256(new byte[]{27, -114, 25, 103, 106, -8, 106, -101, 0, -98, 71, 51, 11, -89, 56, -76}, new byte[]{85, -57, Byte.MAX_VALUE, 5, 76, -63, 95, -36});

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static byte[] m19(java.lang.String str) {
        return android.util.Base64.decode(str, 0);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.String m20(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            byte[] m19 = m19(str);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(p000.C0074.m256(new byte[]{-70, 69, -48, 10, -122, -115, 119, 105, -75, 111, -45, 68, -95, -81, 92, 40, -100}, new byte[]{-5, 0, -125, 37, -59, -53, 53, 70}));
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(str2.getBytes(), p000.C0074.m256(new byte[]{-32, 114, 8}, new byte[]{-95, 55, 91, -122, -42, 115, 61, -78})), new javax.crypto.spec.IvParameterSpec(str3.getBytes()));
            return new java.lang.String(cipher.doFinal(m19)).trim();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    private static java.lang.String m21(byte[] bArr) {
        return new java.lang.String(android.util.Base64.encode(bArr, 2));
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static java.lang.String m22(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(p000.C0074.m256(new byte[]{-3, 38, -94, 17, 5, 121, -92, 78, -14, 12, -95, 95, 34, 91, -113, 15, -37}, new byte[]{-68, 99, -15, 62, 70, 63, -26, 97}));
            int blockSize = cipher.getBlockSize();
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            if (length % blockSize != 0) {
                length += blockSize - (length % blockSize);
            }
            byte[] bArr = new byte[length];
            java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            cipher.init(1, new javax.crypto.spec.SecretKeySpec(str2.getBytes(), p000.C0074.m256(new byte[]{-70, 6, -115}, new byte[]{-5, 67, -34, 86, -68, -80, 91, -72})), new javax.crypto.spec.IvParameterSpec(str3.getBytes()));
            return m21(cipher.doFinal(bArr)).trim();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
