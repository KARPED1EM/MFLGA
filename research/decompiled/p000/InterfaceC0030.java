package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ކ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public interface InterfaceC0030 extends android.os.IInterface {

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ކ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0031 extends android.os.Binder implements p000.InterfaceC0030 {

        /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
        /* renamed from: ࢡ.ކ$Ϳ$Ϳ, reason: contains not printable characters */
        private static class C0032 implements p000.InterfaceC0030 {

            /* renamed from: Ϳ, reason: contains not printable characters */
            private android.os.IBinder f52;

            C0032(android.os.IBinder iBinder) {
                this.f52 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f52;
            }

            @Override // p000.InterfaceC0030
            /* renamed from: ނ */
            public void mo149(java.lang.String str, int i, boolean z) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.common.ipc.IOnMockLocationListener");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.f52.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ޣ, reason: contains not printable characters */
        public static p000.InterfaceC0030 m150(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.lerist.common.ipc.IOnMockLocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p000.InterfaceC0030)) ? new p000.InterfaceC0030.AbstractBinderC0031.C0032(iBinder) : (p000.InterfaceC0030) queryLocalInterface;
        }
    }

    /* renamed from: ނ, reason: contains not printable characters */
    void mo149(java.lang.String str, int i, boolean z);
}
