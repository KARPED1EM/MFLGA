package android.app;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Activity extends Context {
    public void onCreate(Bundle savedInstanceState) {}
    public void onDestroy() {}
    public void onResume() {}
    public void onPause() {}
    public void setContentView(View view) {}
    public void requestPermissions(String[] permissions, int requestCode) {}
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {}
    public Object getSystemService(String name) { return null; }
    public String getPackageName() { return null; }
    public android.content.pm.PackageManager getPackageManager() { return null; }
    public int checkSelfPermission(String permission) { return 0; }
    public Window getWindow() { return null; }
    public ContentResolver getContentResolver() { return null; }
}
