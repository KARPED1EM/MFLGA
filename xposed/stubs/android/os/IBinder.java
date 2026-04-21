package android.os;
public interface IBinder {
    boolean transact(int code, Parcel data, Parcel reply, int flags) throws Exception;
}
