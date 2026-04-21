package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޜ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0087 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p000.C0087> CREATOR = new p000.C0087.C0088();

    /* renamed from: Ϳ, reason: contains not printable characters */
    public java.lang.String f258;

    /* renamed from: Ԩ, reason: contains not printable characters */
    public java.lang.String f259;

    /* renamed from: ԩ, reason: contains not printable characters */
    private java.lang.String f260;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private java.lang.String f261;

    /* renamed from: ԫ, reason: contains not printable characters */
    private java.lang.String f262;

    /* renamed from: Ԭ, reason: contains not printable characters */
    private java.lang.String f263;

    /* renamed from: ԭ, reason: contains not printable characters */
    private int f264;

    /* renamed from: Ԯ, reason: contains not printable characters */
    private int f265;

    /* renamed from: ԯ, reason: contains not printable characters */
    private int f266;

    /* renamed from: ՠ, reason: contains not printable characters */
    private java.lang.String f267;

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޜ$Ϳ, reason: contains not printable characters */
    class C0088 implements android.os.Parcelable.Creator<p000.C0087> {
        C0088() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: Ϳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p000.C0087 createFromParcel(android.os.Parcel parcel) {
            return new p000.C0087(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: Ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p000.C0087[] newArray(int i) {
            return new p000.C0087[i];
        }
    }

    public C0087() {
        this.f258 = "" + java.lang.System.currentTimeMillis();
        this.f264 = 200;
        this.f265 = 866;
        this.f266 = 5745;
        this.f267 = "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.f258);
        parcel.writeString(this.f259);
        parcel.writeString(this.f260);
        parcel.writeString(this.f261);
        parcel.writeString(this.f262);
        parcel.writeString(this.f263);
        parcel.writeInt(this.f264);
        parcel.writeInt(this.f265);
        parcel.writeInt(this.f266);
        parcel.writeString(this.f267);
    }

    /* renamed from: Ϳ, reason: contains not printable characters */
    public java.lang.String m273() {
        return this.f261;
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public java.lang.String m274() {
        return this.f267;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    public int m275() {
        return this.f266;
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public int m276() {
        return this.f265;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public int m277() {
        return this.f264;
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public java.lang.String m278() {
        return this.f260;
    }

    public C0087(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, java.lang.String str4) {
        this.f258 = "" + java.lang.System.currentTimeMillis();
        this.f259 = str;
        this.f260 = str2;
        this.f261 = str3;
        this.f264 = i;
        this.f265 = i2;
        this.f266 = i3;
        this.f267 = str4;
    }

    protected C0087(android.os.Parcel parcel) {
        this.f258 = "" + java.lang.System.currentTimeMillis();
        this.f264 = 200;
        this.f265 = 866;
        this.f266 = 5745;
        this.f267 = "[WPA-PSK-TKIP+CCMP][WPA2-PSK-TKIP+CCMP][ESS][WPS]";
        this.f258 = parcel.readString();
        this.f259 = parcel.readString();
        this.f260 = parcel.readString();
        this.f261 = parcel.readString();
        this.f262 = parcel.readString();
        this.f263 = parcel.readString();
        this.f264 = parcel.readInt();
        this.f265 = parcel.readInt();
        this.f266 = parcel.readInt();
        this.f267 = parcel.readString();
    }
}
