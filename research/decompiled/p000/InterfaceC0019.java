package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ނ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public interface InterfaceC0019 extends android.os.IInterface {

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ނ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0020 extends android.os.Binder implements p000.InterfaceC0019 {

        /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
        /* renamed from: ࢡ.ނ$Ϳ$Ϳ, reason: contains not printable characters */
        private static class C0021 implements p000.InterfaceC0019 {

            /* renamed from: Ϳ, reason: contains not printable characters */
            private android.os.IBinder f50;

            C0021(android.os.IBinder iBinder) {
                this.f50 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f50;
            }

            @Override // p000.InterfaceC0019
            /* renamed from: ֏ */
            public void mo123(android.os.IBinder iBinder) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockServer");
                    obtain.writeStrongBinder(iBinder);
                    this.f50.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0019
            /* renamed from: އ */
            public void mo124(android.os.IBinder iBinder) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockServer");
                    obtain.writeStrongBinder(iBinder);
                    this.f50.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0019
            /* renamed from: ދ */
            public void mo125(android.os.IBinder iBinder) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockServer");
                    obtain.writeStrongBinder(iBinder);
                    this.f50.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ޣ, reason: contains not printable characters */
        public static p000.InterfaceC0019 m126(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.lerist.aidl.fakelocation.IMockServer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p000.InterfaceC0019)) ? new p000.InterfaceC0019.AbstractBinderC0020.C0021(iBinder) : (p000.InterfaceC0019) queryLocalInterface;
        }
    }

    /* renamed from: ֏, reason: contains not printable characters */
    void mo123(android.os.IBinder iBinder);

    /* renamed from: އ, reason: contains not printable characters */
    void mo124(android.os.IBinder iBinder);

    /* renamed from: ދ, reason: contains not printable characters */
    void mo125(android.os.IBinder iBinder);
}
