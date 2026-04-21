package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ދ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public final class C0051 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private p000.InterfaceC0015 f149;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private java.util.HashMap<java.lang.Object, android.os.IBinder> f150 = new java.util.HashMap<>();

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ދ$Ϳ, reason: contains not printable characters */
    private static final class C0052 {

        /* renamed from: Ϳ, reason: contains not printable characters */
        static p000.C0051 f151 = new p000.C0051();
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static p000.C0051 m174() {
        return p000.C0051.C0052.f151;
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public java.util.List<java.lang.String> m175() {
        if (m180() == null) {
            return null;
        }
        try {
            return this.f149.mo80();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public java.util.List<p000.C0005> m176() {
        if (m180() == null) {
            return null;
        }
        try {
            return this.f149.mo106();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public android.location.Location m177() {
        if (m180() == null) {
            return null;
        }
        try {
            return this.f149.mo90();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public java.util.List<android.telephony.SubscriptionInfo> m178() {
        if (m180() == null) {
            return null;
        }
        try {
            return this.f149.mo96();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public java.util.List<java.lang.String> m179() {
        if (m180() == null) {
            return null;
        }
        try {
            return this.f149.mo85();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public p000.InterfaceC0015 m180() {
        if (this.f149 == null) {
            try {
                this.f149 = p000.InterfaceC0015.AbstractBinderC0016.m116(p000.C0073.m254(java.lang.ClassLoader.getSystemClassLoader(), p000.C0074.m256(new byte[]{75, 38, 91, -78, -50, -28, 99, -17, 94, 47, 118, -87, -53}, new byte[]{56, 67, 41, -60, -89, -121, 6, -80})));
            } catch (java.lang.Throwable unused) {
            }
            try {
                if (this.f149 == null) {
                    this.f149 = p000.InterfaceC0015.AbstractBinderC0016.m116(p000.C0073.m255(java.lang.ClassLoader.getSystemClassLoader(), p000.C0074.m256(new byte[]{91, 3, -105, -64, 94, 47, -10, 118, 78, 10, -70, -37, 91}, new byte[]{40, 102, -27, -74, 55, 76, -109, 41})));
                }
            } catch (java.lang.Throwable unused2) {
            }
            try {
                if (this.f149 == null) {
                    this.f149 = p000.InterfaceC0015.AbstractBinderC0016.m116(p000.C0055.m186(p000.C0033.m151()).m188(p000.C0074.m256(new byte[]{-75, 93, 110, 34, -74, -86, -94, -119, -96, 84, 67, 57, -77}, new byte[]{-58, 56, 28, 84, -33, -55, -57, -42}), 600));
                }
            } catch (java.lang.Throwable unused3) {
            }
        }
        return this.f149;
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public boolean m181() {
        if (m180() == null) {
            return false;
        }
        try {
            return this.f149.mo84();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
