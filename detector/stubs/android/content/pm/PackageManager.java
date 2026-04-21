package android.content.pm;

public abstract class PackageManager {
    public static final int PERMISSION_GRANTED = 0;
    public PackageInfo getPackageInfo(String packageName, int flags) throws NameNotFoundException { return null; }
    public static class NameNotFoundException extends Exception {}
}
