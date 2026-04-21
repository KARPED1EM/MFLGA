package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.Ԯ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0005 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.C0005> CREATOR = new p000.C0005.C0006();

    /* renamed from: Ϳ, reason: contains not printable characters */
    private java.lang.String f29;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private int f30;

    /* renamed from: ԩ, reason: contains not printable characters */
    private int f31;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private int f32;

    /* renamed from: ԫ, reason: contains not printable characters */
    private int f33;

    /* renamed from: Ԭ, reason: contains not printable characters */
    private long f34;

    /* renamed from: ԭ, reason: contains not printable characters */
    private double f35;

    /* renamed from: Ԯ, reason: contains not printable characters */
    private double f36;

    /* renamed from: ԯ, reason: contains not printable characters */
    private float f37;

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.Ԯ$Ϳ, reason: contains not printable characters */
    class C0006 implements android.os.Parcelable.Creator<p000.C0005> {
        C0006() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p000.C0005 createFromParcel(android.os.Parcel parcel) {
            return new p000.C0005(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: Ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p000.C0005[] newArray(int i) {
            return new p000.C0005[i];
        }
    }

    public C0005() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f29);
        parcel.writeInt(this.f30);
        parcel.writeInt(this.f31);
        parcel.writeInt(this.f32);
        parcel.writeInt(this.f33);
        parcel.writeLong(this.f34);
        parcel.writeDouble(this.f35);
        parcel.writeDouble(this.f36);
        parcel.writeFloat(this.f37);
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public long m35() {
        return this.f34;
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public int m36() {
        return this.f32;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public double m37() {
        return this.f35;
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public double m38() {
        return this.f36;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public int m39() {
        return this.f30;
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public int m40() {
        return this.f31;
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public java.lang.String m41() {
        return this.f29;
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public float m42() {
        return this.f37;
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public int m43() {
        return this.f33;
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public void m44(double d) {
        this.f35 = d;
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public void m45(double d) {
        this.f36 = d;
    }

    protected C0005(android.os.Parcel parcel) {
        this.f29 = parcel.readString();
        this.f30 = parcel.readInt();
        this.f31 = parcel.readInt();
        this.f32 = parcel.readInt();
        this.f33 = parcel.readInt();
        this.f34 = parcel.readLong();
        this.f35 = parcel.readDouble();
        this.f36 = parcel.readDouble();
        this.f37 = parcel.readFloat();
    }
}
