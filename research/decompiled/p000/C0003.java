package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.Ԫ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0003 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static final java.lang.String f11 = p000.C0074.m256(new byte[]{40}, new byte[]{73, 78, 47, 3, 34, -12, -71, -117});

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static final java.lang.String f12 = p000.C0074.m256(new byte[]{16}, new byte[]{114, -75, 59, 71, 96, -14, -89, -91});

    /* renamed from: ԩ, reason: contains not printable characters */
    public static final java.lang.String f13 = p000.C0074.m256(new byte[]{-117}, new byte[]{-24, 101, -64, -69, 1, 17, 36, -12});

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static final java.lang.String f14 = p000.C0074.m256(new byte[]{-15}, new byte[]{-107, -112, -55, 64, -7, 125, -117, -95});

    /* renamed from: ԫ, reason: contains not printable characters */
    public static final java.lang.String f15 = p000.C0074.m256(new byte[]{70}, new byte[]{35, -95, 37, -40, 23, -125, -91, -103});

    /* renamed from: Ԭ, reason: contains not printable characters */
    public static final java.lang.String f16 = p000.C0074.m256(new byte[]{-92}, new byte[]{-62, 12, 50, 19, -114, -2, 17, -109});

    /* renamed from: ԭ, reason: contains not printable characters */
    public static final java.lang.String f17 = p000.C0074.m256(new byte[]{-51}, new byte[]{-86, 46, 43, 1, 93, -119, 33, 63});

    /* renamed from: Ԯ, reason: contains not printable characters */
    public static final java.lang.String f18 = p000.C0074.m256(new byte[]{-96}, new byte[]{-56, 28, -5, 89, -117, 100, -39, 69});

    /* renamed from: ԯ, reason: contains not printable characters */
    public static final java.lang.String f19 = p000.C0074.m256(new byte[]{119}, new byte[]{30, -70, 81, 77, -121, -70, -76, 125});

    /* renamed from: ՠ, reason: contains not printable characters */
    public static final java.lang.String f20 = p000.C0074.m256(new byte[]{17}, new byte[]{123, 95, 90, 4, 5, -64, 5, -26});

    /* renamed from: ֈ, reason: contains not printable characters */
    public static final java.lang.String f21 = p000.C0074.m256(new byte[]{47}, new byte[]{68, 3, -41, 53, 105, -103, -116, -11});

    /* renamed from: ֏, reason: contains not printable characters */
    public static final java.lang.String f22 = p000.C0074.m256(new byte[]{108}, new byte[]{0, 65, 12, -114, -125, 32, 81, -126});

    /* renamed from: ׯ, reason: contains not printable characters */
    public static final java.lang.String f23 = p000.C0074.m256(new byte[]{-74}, new byte[]{-37, 104, 67, 121, 43, 88, 44, 58});

    /* renamed from: ؠ, reason: contains not printable characters */
    public static final java.lang.String f24 = p000.C0074.m256(new byte[]{48}, new byte[]{94, -26, -124, -50, -25, 66, -5, 88});

    /* renamed from: ހ, reason: contains not printable characters */
    public static final java.lang.String f25 = p000.C0074.m256(new byte[]{81}, new byte[]{62, 124, -124, 61, 124, -87, -104, -53});

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m25(java.util.List<java.lang.String> list, java.lang.String str) {
        return m26(list, str, false);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m26(java.util.List<java.lang.String> list, java.lang.String str, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!list.isEmpty()) {
            for (java.lang.String str2 : list) {
                if (str2.contains(p000.C0074.m256(new byte[]{60}, new byte[]{64, -26, -29, -44, 119, 49, 121, 92}))) {
                    java.lang.String[] split = str2.split(p000.C0074.m256(new byte[]{-54, 102}, new byte[]{-106, 26, -29, -96, 46, -114, 109, 94}));
                    if (split.length >= 2) {
                        java.lang.String str3 = split[0] + "";
                        java.lang.String str4 = split[1] + "";
                        if (str3.contains(str)) {
                            if (z) {
                                str4 = str + p000.C0074.m256(new byte[]{82}, new byte[]{46, 0, 30, -96, 96, -56, -107, 4}) + str4;
                            }
                            arrayList.add(str4);
                        }
                    }
                } else {
                    if (z) {
                        str2 = str + p000.C0074.m256(new byte[]{0}, new byte[]{124, -56, -1, -53, 114, -103, -1, -92}) + str2;
                    }
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static boolean m27(java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        java.util.List<java.lang.String> m25 = m25(list, str2);
        return (m25.contains(p000.C0074.m256(new byte[]{-14}, new byte[]{-40, -5, 42, -71, -1, 53, -79, -13})) || m25.contains(str)) ? false : true;
    }
}
