package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ލ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0055 {

    /* renamed from: ԩ, reason: contains not printable characters */
    private static p000.C0055 f157;

    /* renamed from: Ԫ, reason: contains not printable characters */
    static java.lang.Object f158 = new java.lang.Object();

    /* renamed from: Ϳ, reason: contains not printable characters */
    private boolean f159 = false;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private p000.AbstractC0068<p000.InterfaceC0022> f160;

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ލ$Ϳ, reason: contains not printable characters */
    class C0056 extends p000.AbstractC0068<p000.InterfaceC0022> {
        C0056(android.content.Context context) {
            super(context);
        }

        @Override // p000.AbstractC0068
        /* renamed from: ؠ */
        protected void mo75(android.content.ComponentName componentName) {
            super.mo75(componentName);
            if (!p000.C0055.this.f159 || m244()) {
                return;
            }
            m246();
        }

        @Override // p000.AbstractC0068
        /* renamed from: ހ */
        protected void mo76(android.content.ComponentName componentName) {
            super.mo76(componentName);
            if (!p000.C0055.this.f159 || m244()) {
                return;
            }
            m246();
        }

        @Override // p000.AbstractC0068
        /* renamed from: ށ */
        protected void mo77(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            super.mo77(componentName, iBinder);
            p000.C0055.m184(p000.C0055.this);
        }

        @Override // p000.AbstractC0068
        /* renamed from: ނ */
        protected void mo78(android.content.ComponentName componentName) {
            super.mo78(componentName);
            if (!p000.C0055.this.f159 || m244()) {
                return;
            }
            m246();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.AbstractC0068
        /* renamed from: ޅ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p000.InterfaceC0022 mo74(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            return p000.InterfaceC0022.AbstractBinderC0023.m128(iBinder);
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ލ$Ԩ, reason: contains not printable characters */
    public interface InterfaceC0057 {
    }

    public C0055(android.content.Context context) {
        this.f160 = new p000.C0055.C0056(context);
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    static /* synthetic */ p000.C0055.InterfaceC0057 m184(p000.C0055 c0055) {
        c0055.getClass();
        return null;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public static p000.C0055 m186(android.content.Context context) {
        p000.C0055 c0055;
        synchronized (f158) {
            try {
                if (f157 == null) {
                    f157 = new p000.C0055(context);
                }
                c0055 = f157;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c0055;
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    private p000.InterfaceC0022 m187() {
        if (this.f160.m244()) {
            return this.f160.m243();
        }
        if (this.f159 || this.f160.m244() || this.f160.m245()) {
            return null;
        }
        this.f160.m246();
        return null;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public android.os.IBinder m188(java.lang.String str, int i) {
        p000.InterfaceC0022 m187 = m187();
        if (m187 == null) {
            return null;
        }
        return m187.mo127(str);
    }
}
