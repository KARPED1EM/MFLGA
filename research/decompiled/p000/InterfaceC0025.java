package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ބ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public interface InterfaceC0025 extends android.os.IInterface {

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ބ$Ԩ, reason: contains not printable characters */
    public static class C0027 {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Ԫ, reason: contains not printable characters */
        public static <T> T m144(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ԫ, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m145(android.os.Parcel parcel, java.util.List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                m146(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Ԭ, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m146(android.os.Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    java.util.List<java.lang.String> mo129();

    /* renamed from: Ԩ, reason: contains not printable characters */
    void mo130(java.util.List<java.lang.String> list);

    /* renamed from: ԩ, reason: contains not printable characters */
    void mo131(java.util.List<java.lang.String> list);

    /* renamed from: Ԫ, reason: contains not printable characters */
    void mo132(java.lang.String str, java.lang.String str2);

    /* renamed from: ԫ, reason: contains not printable characters */
    boolean mo133();

    /* renamed from: Ԭ, reason: contains not printable characters */
    java.util.List<java.lang.String> mo134();

    /* renamed from: ԯ, reason: contains not printable characters */
    p000.C0087 mo135();

    /* renamed from: ބ, reason: contains not printable characters */
    java.util.List<p000.C0087> mo136();

    /* renamed from: ފ, reason: contains not printable characters */
    void mo137();

    /* renamed from: ޏ, reason: contains not printable characters */
    void mo138();

    /* renamed from: ޘ, reason: contains not printable characters */
    void mo139(java.util.List<p000.C0087> list);

    /* renamed from: ޢ, reason: contains not printable characters */
    void mo140(p000.C0087 c0087);

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ބ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0026 extends android.os.Binder implements p000.InterfaceC0025 {
        public AbstractBinderC0026() {
            attachInterface(this, "com.lerist.aidl.fakelocation.IMockWifiManager");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.lerist.aidl.fakelocation.IMockWifiManager");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.lerist.aidl.fakelocation.IMockWifiManager");
                return true;
            }
            switch (i) {
                case 1:
                    mo132(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    mo138();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    mo137();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean mo133 = mo133();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo133 ? 1 : 0);
                    return true;
                case 5:
                    mo140((p000.C0087) p000.InterfaceC0025.C0027.m144(parcel, p000.C0087.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    p000.C0087 mo135 = mo135();
                    parcel2.writeNoException();
                    p000.InterfaceC0025.C0027.m146(parcel2, mo135, 1);
                    return true;
                case 7:
                    mo130(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    java.util.List<java.lang.String> mo129 = mo129();
                    parcel2.writeNoException();
                    parcel2.writeStringList(mo129);
                    return true;
                case 9:
                    mo139(parcel.createTypedArrayList(p000.C0087.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    java.util.List<p000.C0087> mo136 = mo136();
                    parcel2.writeNoException();
                    p000.InterfaceC0025.C0027.m145(parcel2, mo136, 1);
                    return true;
                case 11:
                    mo131(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    java.util.List<java.lang.String> mo134 = mo134();
                    parcel2.writeNoException();
                    parcel2.writeStringList(mo134);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }
}
