package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.Ԩ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0002 {
    /* renamed from: Ϳ, reason: contains not printable characters */
    public static int m23(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static java.lang.String m24(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
