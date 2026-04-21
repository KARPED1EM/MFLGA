package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ތ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class BinderC0053 extends p000.InterfaceC0015.AbstractBinderC0016 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    boolean f152 = false;

    /* renamed from: Ԩ, reason: contains not printable characters */
    java.util.List<android.telephony.SubscriptionInfo> f153 = null;

    /* renamed from: ԩ, reason: contains not printable characters */
    boolean f154 = false;

    /* renamed from: Ԫ, reason: contains not printable characters */
    java.util.List<java.lang.String> f155 = java.util.Arrays.asList(p000.C0074.m256(new byte[]{104}, new byte[]{89, 58, -121, -14, -113, -30, -96, -52}), p000.C0074.m256(new byte[]{119}, new byte[]{68, -106, -53, -76, -105, 23, -118, -44}), p000.C0074.m256(new byte[]{-117}, new byte[]{-66, 121, 103, 94, -14, 12, 89, 29}), p000.C0074.m256(new byte[]{-23}, new byte[]{-34, 3, 45, -19, 46, 15, 62, 15}));

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ތ$Ϳ, reason: contains not printable characters */
    private static final class C0054 {

        /* renamed from: Ϳ, reason: contains not printable characters */
        static p000.BinderC0053 f156 = new p000.BinderC0053();
    }

    /* renamed from: ޤ, reason: contains not printable characters */
    public static p000.BinderC0053 m182() {
        return p000.BinderC0053.C0054.f156;
    }

    /* renamed from: ޥ, reason: contains not printable characters */
    private boolean m183(android.location.Location location) {
        android.os.Bundle extras;
        java.lang.String string;
        if (location == null || (extras = location.getExtras()) == null || (string = extras.getString(p000.C0074.m256(new byte[]{88, 20, -20, 43}, new byte[]{62, 102, -125, 70, 103, 25, 104, -45}), null)) == null) {
            return false;
        }
        return string.equals(p000.C0074.m256(new byte[]{-19, 29, -17}, new byte[]{-127, 114, -116, 125, -64, 81, -63, 11})) || string.equals(p000.C0074.m256(new byte[]{-108, -46, -3, -100, 70}, new byte[]{-26, -67, -120, -24, 35, 98, -79, 18})) || string.equals(p000.C0074.m256(new byte[]{78, -98, -52, 67, -107, 56}, new byte[]{60, -15, -81, 40, -16, 74, -61, -85})) || string.equals(p000.C0074.m256(new byte[]{-22, 34, 100}, new byte[]{-117, 82, 13, -119, 20, -86, 70, -36}));
    }

    @Override // p000.InterfaceC0015
    /* renamed from: Ϳ */
    public java.util.List<java.lang.String> mo80() {
        return p000.C0041.getAllowMockPackages();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: Ԩ */
    public void mo81(java.util.List<java.lang.String> list) {
        if (p000.C0084.m269()) {
            p000.C0041.setAllowMockPackages(list);
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ԩ */
    public void mo82(java.util.List<java.lang.String> list) {
        p000.C0041.setSafeApps(list);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: Ԫ */
    public void mo83(java.lang.String str, java.lang.String str2) {
        p000.C0084.m271(str, str2);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ԫ */
    public boolean mo84() {
        return p000.C0041.isMocking();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: Ԭ */
    public java.util.List<java.lang.String> mo85() {
        return p000.C0041.getSafeApps();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: Ԯ */
    public void mo87() {
        p000.C0058.m213();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ՠ */
    public void mo88(long j) {
        try {
            p000.C0072.m249();
            p000.C0058.m209(j);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ֈ */
    public long mo89() {
        return p000.C0041.getIntervalTimeout();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ׯ */
    public android.location.Location mo90() {
        return p000.C0041.getMockLocation();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ހ */
    public boolean mo91() {
        return p000.C0041.isMockGpsFloat();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ށ */
    public void mo92(android.os.IBinder iBinder) {
        p000.InterfaceC0030 m150 = p000.InterfaceC0030.AbstractBinderC0031.m150(iBinder);
        if (m150 == null) {
            return;
        }
        p000.C0041.addOnMockListener(m150);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ރ */
    public void mo93() {
        try {
            p000.C0072.m249();
            boolean m269 = p000.C0084.m269();
            this.f152 = m269;
            if (m269) {
                if (!p000.C0041.f124) {
                    android.content.Context m151 = p000.C0033.m151();
                    p000.C0041.init(m151);
                    p000.C0089.hook(m151.getClassLoader());
                    p000.C0077.hook(m151.getClassLoader());
                }
                p000.C0041.startMockLocation();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޅ */
    public void mo94(boolean z) {
        if (!z || p000.C0084.m269()) {
            p000.C0041.setMockGpsStatus(z);
        } else {
            p000.C0041.setMockGpsStatus(false);
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ކ */
    public boolean mo95() {
        return p000.C0058.m204();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ވ */
    public java.util.List<android.telephony.SubscriptionInfo> mo96() {
        return this.f153;
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ތ */
    public void mo97() {
        p000.C0041.stopMockLocation();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ލ */
    public void mo98(boolean z) {
        if (!z || p000.C0084.m269()) {
            p000.C0041.setMockGpsFloat(z);
        } else {
            p000.C0041.setMockGpsFloat(false);
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ގ */
    public void mo99(android.os.IBinder iBinder) {
        p000.InterfaceC0030 m150 = p000.InterfaceC0030.AbstractBinderC0031.m150(iBinder);
        if (m150 == null) {
            return;
        }
        p000.C0041.removeOnMockListener(m150);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ސ */
    public boolean mo100() {
        return false;
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޒ */
    public void mo101(boolean z) {
        p000.C0058.m207(z);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޓ */
    public boolean mo102() {
        return this.f154;
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޔ */
    public boolean mo103() {
        return p000.C0041.isMockGpsStatus();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޕ */
    public void mo104(java.util.List<p000.C0005> list) {
        try {
            p000.C0072.m249();
            if (p000.C0084.m269()) {
                p000.C0041.setMockCells(list);
            } else {
                p000.C0041.setMockCells(null);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޖ */
    public void mo105(boolean z) {
        if (p000.C0084.m269()) {
            this.f154 = z;
        } else {
            this.f154 = false;
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޗ */
    public java.util.List<p000.C0005> mo106() {
        return p000.C0041.getMockCells();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޙ */
    public float mo107() {
        return p000.C0058.m202();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޚ */
    public void mo108(android.location.Location location) {
        java.lang.String string;
        if (m183(location)) {
            try {
                p000.C0072.m249();
                if (location != null) {
                    android.os.Bundle extras = location.getExtras();
                    if (extras == null || (string = extras.getString(p000.C0074.m256(new byte[]{53, -44, 24, -100}, new byte[]{83, -90, 119, -15, 89, 72, -121, 93}), null)) == null) {
                        return;
                    }
                    if (p000.C0084.m268()) {
                        p000.C0041.setMockLocation(null);
                        return;
                    }
                    if (p000.C0041.isMocking()) {
                        if (p000.C0074.m256(new byte[]{-56, -76, Byte.MIN_VALUE, -50, -55}, new byte[]{-70, -37, -11, -70, -84, -103, -26, -94}).equals(string) && !p000.C0084.m269()) {
                            return;
                        }
                        if (p000.C0074.m256(new byte[]{-55, -115, 123, 74, 101, -20}, new byte[]{-69, -30, 24, 33, 0, -98, -53, 25}).equals(string) && p000.C0084.m268()) {
                            return;
                        }
                        if (p000.C0074.m256(new byte[]{108, 72, -36}, new byte[]{13, 56, -75, 116, -119, 95, -49, 9}).equals(string) && !p000.C0084.m269()) {
                            return;
                        }
                    }
                    extras.remove(p000.C0074.m256(new byte[]{-51, 100, 15, -48, 82, -88, 123, Byte.MIN_VALUE}, new byte[]{-67, 22, 96, -90, 59, -52, 30, -14}));
                    extras.putString(p000.C0074.m256(new byte[]{42, 62, 3, -4, 17, 89, 126, 5}, new byte[]{90, 76, 108, -118, 120, 61, 27, 119}), p000.C0074.m256(new byte[]{79, 117}, new byte[]{9, 57, 121, -37, 70, -42, 14, -73}));
                }
                p000.C0041.setMockLocation(location);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޛ */
    public long mo109() {
        return p000.C0058.m201();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޜ */
    public void mo110() {
        try {
            p000.C0072.m249();
            if (p000.C0084.m269()) {
                p000.C0058.m212();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޝ */
    public void mo111(long j) {
        p000.C0058.m208(j);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޞ */
    public void mo112(float f) {
        try {
            p000.C0072.m249();
            p000.C0058.m210(f);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޟ */
    public boolean mo113() {
        return p000.C0058.m205();
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޠ */
    public void mo114(long j) {
        p000.C0041.setIntervalTimeout(j);
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ޡ */
    public void mo115(java.util.List<android.telephony.SubscriptionInfo> list) {
        try {
            p000.C0072.m249();
            if (p000.C0084.m269()) {
                this.f153 = list;
            } else {
                this.f153 = null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p000.InterfaceC0015
    /* renamed from: ԭ */
    public void mo86(boolean z) {
    }
}
