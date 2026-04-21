package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ހ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0012 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static final java.lang.String f48 = p000.C0074.m256(new byte[]{-125, -104, 0, 49, 27, 38, 95, -27, -109, -125, 67, 124, 24, 46, 64, -29, -114, -39, 0, 112, 20, 40, 94, -23, -110, -127, 8, 109, 89, 14, 66, -17, -117, -92, 8, 109, 1, 38, 95}, new byte[]{-32, -9, 109, 31, 119, 67, 45, -116});

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ހ$Ϳ, reason: contains not printable characters */
    class C0013 extends p000.AbstractC0068<p000.InterfaceC0019> {
        C0013(android.content.Context context) {
            super(context);
        }

        @Override // p000.AbstractC0068
        /* renamed from: ؠ, reason: contains not printable characters */
        protected void mo75(android.content.ComponentName componentName) {
            super.mo75(componentName);
            if (m244()) {
                return;
            }
            m246();
        }

        @Override // p000.AbstractC0068
        /* renamed from: ހ, reason: contains not printable characters */
        protected void mo76(android.content.ComponentName componentName) {
            super.mo76(componentName);
            if (m244()) {
                return;
            }
            m246();
        }

        @Override // p000.AbstractC0068
        /* renamed from: ށ, reason: contains not printable characters */
        protected void mo77(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            super.mo77(componentName, iBinder);
            try {
                p000.InterfaceC0019 m243 = m243();
                m243.mo124(p000.BinderC0053.m182().asBinder());
                m243.mo123(p000.BinderC0061.m214().asBinder());
                m243.mo125(p000.BinderC0065.m231().asBinder());
            } catch (android.os.RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // p000.AbstractC0068
        /* renamed from: ނ, reason: contains not printable characters */
        protected void mo78(android.content.ComponentName componentName) {
            super.mo78(componentName);
            if (m244()) {
                return;
            }
            m246();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p000.AbstractC0068
        /* renamed from: ޅ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p000.InterfaceC0019 mo74(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            return p000.InterfaceC0019.AbstractBinderC0020.m126(iBinder);
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ހ$Ԩ, reason: contains not printable characters */
    class C0014 extends android.content.BroadcastReceiver {
        C0014() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            try {
                p000.BinderC0053.m182().mo97();
            } catch (android.os.RemoteException unused) {
            }
            try {
                p000.BinderC0061.m214().mo137();
            } catch (android.os.RemoteException unused2) {
            }
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static final void m73(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        p000.C0072.m248(context, str, p000.C0074.m256(new byte[]{121, -33, 68, 51, -41, -36, 80, -43, 103, -43, 85, 46, -31, -46, 84, -28, 107, -35, 83, 55}, new byte[]{10, -70, 54, 69, -66, -65, 53, -118}));
        boolean m252 = p000.C0073.m252(context.getClassLoader(), p000.C0074.m256(new byte[]{102, 54, -68, -14, 88, 106, -58, 63, 115, 63, -111, -23, 93}, new byte[]{21, 83, -50, -124, 49, 9, -93, 96}), p000.BinderC0053.m182());
        p000.C0073.m252(context.getClassLoader(), p000.C0074.m256(new byte[]{99, 87, -21, -82, -18, -95, -69, -57, 118, 94, -58, -75, -16}, new byte[]{16, 50, -103, -40, -121, -62, -34, -104}), p000.BinderC0061.m214());
        p000.C0073.m252(context.getClassLoader(), p000.C0074.m256(new byte[]{-102, 14, -73, -48, 1, -23, 47, -74, -113, 7, -102, -56, 9}, new byte[]{-23, 107, -59, -90, 104, -118, 74, -23}), p000.BinderC0065.m231());
        p000.C0073.m253(context.getClassLoader(), p000.C0074.m256(new byte[]{-104, 39, 35, -15, -93, 122, 4, -21, -115, 46, 14, -22, -90}, new byte[]{-21, 66, 81, -121, -54, 25, 97, -76}), p000.BinderC0053.m182());
        p000.C0073.m253(context.getClassLoader(), p000.C0074.m256(new byte[]{-38, -42, -86, -41, -61, -82, -72, 22, -49, -33, -121, -52, -35}, new byte[]{-87, -77, -40, -95, -86, -51, -35, 73}), p000.BinderC0061.m214());
        p000.C0073.m253(context.getClassLoader(), p000.C0074.m256(new byte[]{97, 117, -124, 118, 42, 52, -19, 61, 116, 124, -87, 110, 34}, new byte[]{18, 16, -10, 0, 67, 87, -120, 98}), p000.BinderC0065.m231());
        if (m252) {
            str2 = str;
        } else {
            str2 = str;
            new p000.C0012.C0013(context).m239(str2, f48, null, 300L);
        }
        p000.C0072.m248(context, str2, p000.C0074.m256(new byte[]{-48, -59, 31, 31, 12, -40, 115, -111, -50, -49, 14, 2, 58, -39, 122, -69, -58, -44, 2, 6, 17, -45}, new byte[]{-93, -96, 109, 105, 101, -69, 22, -50}));
        p000.C0012.C0014 c0014 = new p000.C0012.C0014();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(new java.lang.String(android.util.Base64.decode(p000.C0074.m256(new byte[]{7, 51, -102, -23, 60, 84, 82, 79, 6, 68, -15, -9, 61, 34, 37, 68}, new byte[]{82, 2, -56, -71, 105, 18, 107, 8}), 0)));
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                context.registerReceiver(c0014, intentFilter, 2);
            } else {
                context.registerReceiver(c0014, intentFilter);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
