package android.content;

public abstract class Context {
    public static final String LOCATION_SERVICE = "location";
    public abstract Object getSystemService(String name);
    public abstract String getPackageName();
    public abstract android.content.pm.PackageManager getPackageManager();
    public abstract int checkSelfPermission(String permission);
    public abstract ContentResolver getContentResolver();
}
