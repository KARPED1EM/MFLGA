package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ށ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public interface InterfaceC0015 extends android.os.IInterface {

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ށ$Ԩ, reason: contains not printable characters */
    public static class C0018 {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Ԫ, reason: contains not printable characters */
        public static <T> T m120(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ԫ, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m121(android.os.Parcel parcel, java.util.List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                m122(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Ԭ, reason: contains not printable characters */
        public static <T extends android.os.Parcelable> void m122(android.os.Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    java.util.List<java.lang.String> mo80();

    /* renamed from: Ԩ, reason: contains not printable characters */
    void mo81(java.util.List<java.lang.String> list);

    /* renamed from: ԩ, reason: contains not printable characters */
    void mo82(java.util.List<java.lang.String> list);

    /* renamed from: Ԫ, reason: contains not printable characters */
    void mo83(java.lang.String str, java.lang.String str2);

    /* renamed from: ԫ, reason: contains not printable characters */
    boolean mo84();

    /* renamed from: Ԭ, reason: contains not printable characters */
    java.util.List<java.lang.String> mo85();

    /* renamed from: ԭ, reason: contains not printable characters */
    void mo86(boolean z);

    /* renamed from: Ԯ, reason: contains not printable characters */
    void mo87();

    /* renamed from: ՠ, reason: contains not printable characters */
    void mo88(long j);

    /* renamed from: ֈ, reason: contains not printable characters */
    long mo89();

    /* renamed from: ׯ, reason: contains not printable characters */
    android.location.Location mo90();

    /* renamed from: ހ, reason: contains not printable characters */
    boolean mo91();

    /* renamed from: ށ, reason: contains not printable characters */
    void mo92(android.os.IBinder iBinder);

    /* renamed from: ރ, reason: contains not printable characters */
    void mo93();

    /* renamed from: ޅ, reason: contains not printable characters */
    void mo94(boolean z);

    /* renamed from: ކ, reason: contains not printable characters */
    boolean mo95();

    /* renamed from: ވ, reason: contains not printable characters */
    java.util.List<android.telephony.SubscriptionInfo> mo96();

    /* renamed from: ތ, reason: contains not printable characters */
    void mo97();

    /* renamed from: ލ, reason: contains not printable characters */
    void mo98(boolean z);

    /* renamed from: ގ, reason: contains not printable characters */
    void mo99(android.os.IBinder iBinder);

    /* renamed from: ސ, reason: contains not printable characters */
    boolean mo100();

    /* renamed from: ޒ, reason: contains not printable characters */
    void mo101(boolean z);

    /* renamed from: ޓ, reason: contains not printable characters */
    boolean mo102();

    /* renamed from: ޔ, reason: contains not printable characters */
    boolean mo103();

    /* renamed from: ޕ, reason: contains not printable characters */
    void mo104(java.util.List<p000.C0005> list);

    /* renamed from: ޖ, reason: contains not printable characters */
    void mo105(boolean z);

    /* renamed from: ޗ, reason: contains not printable characters */
    java.util.List<p000.C0005> mo106();

    /* renamed from: ޙ, reason: contains not printable characters */
    float mo107();

    /* renamed from: ޚ, reason: contains not printable characters */
    void mo108(android.location.Location location);

    /* renamed from: ޛ, reason: contains not printable characters */
    long mo109();

    /* renamed from: ޜ, reason: contains not printable characters */
    void mo110();

    /* renamed from: ޝ, reason: contains not printable characters */
    void mo111(long j);

    /* renamed from: ޞ, reason: contains not printable characters */
    void mo112(float f);

    /* renamed from: ޟ, reason: contains not printable characters */
    boolean mo113();

    /* renamed from: ޠ, reason: contains not printable characters */
    void mo114(long j);

    /* renamed from: ޡ, reason: contains not printable characters */
    void mo115(java.util.List<android.telephony.SubscriptionInfo> list);

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ށ$Ϳ, reason: contains not printable characters */
    public static abstract class AbstractBinderC0016 extends android.os.Binder implements p000.InterfaceC0015 {

        /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
        /* renamed from: ࢡ.ށ$Ϳ$Ϳ, reason: contains not printable characters */
        private static class C0017 implements p000.InterfaceC0015 {

            /* renamed from: Ϳ, reason: contains not printable characters */
            private android.os.IBinder f49;

            C0017(android.os.IBinder iBinder) {
                this.f49 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f49;
            }

            @Override // p000.InterfaceC0015
            /* renamed from: Ϳ */
            public java.util.List<java.lang.String> mo80() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockLocationManager");
                    this.f49.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0015
            /* renamed from: ԫ */
            public boolean mo84() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockLocationManager");
                    this.f49.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0015
            /* renamed from: Ԭ */
            public java.util.List<java.lang.String> mo85() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockLocationManager");
                    this.f49.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0015
            /* renamed from: ׯ */
            public android.location.Location mo90() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockLocationManager");
                    this.f49.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (android.location.Location) p000.InterfaceC0015.C0018.m120(obtain2, android.location.Location.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0015
            /* renamed from: ވ */
            public java.util.List<android.telephony.SubscriptionInfo> mo96() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockLocationManager");
                    this.f49.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // p000.InterfaceC0015
            /* renamed from: ޗ */
            public java.util.List<p000.C0005> mo106() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.lerist.aidl.fakelocation.IMockLocationManager");
                    this.f49.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(p000.C0005.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0016() {
            attachInterface(this, "com.lerist.aidl.fakelocation.IMockLocationManager");
        }

        /* renamed from: ޣ, reason: contains not printable characters */
        public static p000.InterfaceC0015 m116(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.lerist.aidl.fakelocation.IMockLocationManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p000.InterfaceC0015)) ? new p000.InterfaceC0015.AbstractBinderC0016.C0017(iBinder) : (p000.InterfaceC0015) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.lerist.aidl.fakelocation.IMockLocationManager");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.lerist.aidl.fakelocation.IMockLocationManager");
                return true;
            }
            switch (i) {
                case 1:
                    mo83(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    mo93();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    mo97();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean mo84 = mo84();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo84 ? 1 : 0);
                    return true;
                case 5:
                    mo108((android.location.Location) p000.InterfaceC0015.C0018.m120(parcel, android.location.Location.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    android.location.Location mo90 = mo90();
                    parcel2.writeNoException();
                    p000.InterfaceC0015.C0018.m122(parcel2, mo90, 1);
                    return true;
                case 7:
                    mo114(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    long mo89 = mo89();
                    parcel2.writeNoException();
                    parcel2.writeLong(mo89);
                    return true;
                case 9:
                    mo81(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    java.util.List<java.lang.String> mo80 = mo80();
                    parcel2.writeNoException();
                    parcel2.writeStringList(mo80);
                    return true;
                case 11:
                    mo110();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    mo87();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    boolean mo113 = mo113();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo113 ? 1 : 0);
                    return true;
                case 14:
                    mo112(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    float mo107 = mo107();
                    parcel2.writeNoException();
                    parcel2.writeFloat(mo107);
                    return true;
                case 16:
                    mo88(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    long mo109 = mo109();
                    parcel2.writeNoException();
                    parcel2.writeLong(mo109);
                    return true;
                case 18:
                    mo92(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    mo99(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    mo104(parcel.createTypedArrayList(p000.C0005.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    java.util.List<p000.C0005> mo106 = mo106();
                    parcel2.writeNoException();
                    p000.InterfaceC0015.C0018.m121(parcel2, mo106, 1);
                    return true;
                case 22:
                    boolean mo103 = mo103();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo103 ? 1 : 0);
                    return true;
                case 23:
                    mo94(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    mo86(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    boolean mo100 = mo100();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo100 ? 1 : 0);
                    return true;
                case 26:
                    boolean mo95 = mo95();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo95 ? 1 : 0);
                    return true;
                case 27:
                    mo101(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 28:
                    mo115(parcel.createTypedArrayList(android.telephony.SubscriptionInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    java.util.List<android.telephony.SubscriptionInfo> mo96 = mo96();
                    parcel2.writeNoException();
                    p000.InterfaceC0015.C0018.m121(parcel2, mo96, 1);
                    return true;
                case 30:
                    mo105(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 31:
                    boolean mo102 = mo102();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo102 ? 1 : 0);
                    return true;
                case 32:
                    mo82(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    java.util.List<java.lang.String> mo85 = mo85();
                    parcel2.writeNoException();
                    parcel2.writeStringList(mo85);
                    return true;
                case 34:
                    mo111(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 35:
                    boolean mo91 = mo91();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo91 ? 1 : 0);
                    return true;
                case 36:
                    mo98(parcel.readInt() != 0);
                    parcel2.writeNoException();
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
