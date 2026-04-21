package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ރ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public interface InterfaceC0022 extends android.os.IInterface {

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ރ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0023 extends android.os.Binder implements p000.InterfaceC0022 {

        /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
        /* renamed from: ࢡ.ރ$Ϳ$Ϳ, reason: contains not printable characters */
        private static class C0024 implements p000.InterfaceC0022 {

            /* renamed from: Ϳ, reason: contains not printable characters */
            private android.os.IBinder f51;

            C0024(android.os.IBinder iBinder) {
                this.f51 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f51;
            }

            @Override // p000.InterfaceC0022
            /* renamed from: މ */
            public android.os.IBinder mo127(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockServiceProvider");
                    obtain.writeString(str);
                    this.f51.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ޣ, reason: contains not printable characters */
        public static p000.InterfaceC0022 m128(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.lerist.aidl.fakelocation.IMockServiceProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p000.InterfaceC0022)) ? new p000.InterfaceC0022.AbstractBinderC0023.C0024(iBinder) : (p000.InterfaceC0022) queryLocalInterface;
        }
    }

    /* renamed from: މ, reason: contains not printable characters */
    android.os.IBinder mo127(java.lang.String str);
}
