package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޏ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class BinderC0061 extends p000.InterfaceC0025.AbstractBinderC0026 {

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޏ$Ϳ, reason: contains not printable characters */
    private static final class C0062 {

        /* renamed from: Ϳ, reason: contains not printable characters */
        static p000.BinderC0061 f175 = new p000.BinderC0061();
    }

    /* renamed from: ޣ, reason: contains not printable characters */
    public static p000.BinderC0061 m214() {
        return p000.BinderC0061.C0062.f175;
    }

    @Override // p000.InterfaceC0025
    /* renamed from: Ϳ */
    public java.util.List<java.lang.String> mo129() {
        return p000.C0063.m216();
    }

    @Override // p000.InterfaceC0025
    /* renamed from: Ԩ */
    public void mo130(java.util.List<java.lang.String> list) {
        p000.C0063.m224(list);
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ԩ */
    public void mo131(java.util.List<java.lang.String> list) {
        p000.C0063.m228(list);
    }

    @Override // p000.InterfaceC0025
    /* renamed from: Ԫ */
    public void mo132(java.lang.String str, java.lang.String str2) {
        p000.C0084.m271(str, str2);
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ԫ */
    public boolean mo133() {
        return p000.C0063.m223();
    }

    @Override // p000.InterfaceC0025
    /* renamed from: Ԭ */
    public java.util.List<java.lang.String> mo134() {
        return p000.C0063.m219();
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ԯ */
    public p000.C0087 mo135() {
        return p000.C0063.m217();
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ބ */
    public java.util.List<p000.C0087> mo136() {
        return p000.C0063.m218();
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ފ */
    public void mo137() {
        p000.C0063.m227(false);
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ޏ */
    public void mo138() {
        try {
            p000.C0072.m249();
            if (p000.C0084.m269()) {
                if (!p000.C0089.f271) {
                    p000.C0089.hook(p000.C0033.m151().getClassLoader());
                }
                if (!p000.C0089.f272) {
                    p000.C0089.hookGetConnectionInfo(p000.C0033.m151().getClassLoader());
                }
                p000.C0063.m227(true);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ޘ */
    public void mo139(java.util.List<p000.C0087> list) {
        try {
            p000.C0072.m249();
            p000.C0063.m226(list);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0025
    /* renamed from: ޢ */
    public void mo140(p000.C0087 c0087) {
        try {
            p000.C0072.m249();
            if (p000.C0084.m269()) {
                p000.C0063.m225(c0087);
            } else {
                p000.C0063.m225(new p000.C0087());
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
