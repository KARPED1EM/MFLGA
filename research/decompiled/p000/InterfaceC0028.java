package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޅ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public interface InterfaceC0028 extends android.os.IInterface {
    boolean isEnabled();

    /* renamed from: ؠ, reason: contains not printable characters */
    int mo147();

    /* renamed from: ޑ, reason: contains not printable characters */
    int mo148();

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޅ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0029 extends android.os.Binder implements p000.InterfaceC0028 {
        public AbstractBinderC0029() {
            attachInterface(this, "com.lerist.aidl.fakelocation.INativeCatchManager");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.lerist.aidl.fakelocation.INativeCatchManager");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.lerist.aidl.fakelocation.INativeCatchManager");
                return true;
            }
            if (i == 1) {
                int mo147 = mo147();
                parcel2.writeNoException();
                parcel2.writeInt(mo147);
            } else if (i == 2) {
                int mo148 = mo148();
                parcel2.writeNoException();
                parcel2.writeInt(mo148);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                boolean isEnabled = isEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(isEnabled ? 1 : 0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }
}
