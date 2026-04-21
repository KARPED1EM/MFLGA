package com.mflga.detector;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ServiceManager;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.File;
import java.util.List;
import java.util.Locale;

public class DetectorActivity extends Activity implements LocationListener {

    private static final String TAG = "MockDetector";
    private static final int PERMISSION_REQUEST = 1001;
    private static final long REFRESH_INTERVAL = 2000;

    private LocationManager locationManager;
    private Handler handler;
    private Location lastLocation;

    private LinearLayout root;
    private TextView tvGps;
    private TextView tvAddress;

    private final Runnable refreshRunnable = new Runnable() {
        @Override
        public void run() {
            updateDisplay();
            handler.postDelayed(this, REFRESH_INTERVAL);
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        handler = new Handler(Looper.getMainLooper());

        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setBackgroundColor(0xFF1A1A2E);

        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(48, 160, 48, 80);

        // Title
        TextView tvTitle = makeTextView(22, 0xFFE94560, true);
        tvTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        tvTitle.setText("FakeLocation Detector");
        root.addView(tvTitle);
        addSpacer(12);
        addSeparator();
        addSpacer(12);

        // GPS section
        addLabel("GPS Location");
        tvGps = makeValueView();
        tvGps.setText("Waiting for location...");
        root.addView(tvGps);

        addLabel("Address (Geocoder)");
        tvAddress = makeValueView();
        tvAddress.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        tvAddress.setText("Waiting...");
        root.addView(tvAddress);

        addSpacer(12);
        addSeparator();
        addSpacer(12);

        scrollView.addView(root, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(scrollView);

        checkAndRequestPermissions();
    }

    private void updateDisplay() {
        // Clear dynamic views after address (keep GPS + address)
        int childCount = root.getChildCount();
        // Find where dynamic section starts (after the first separator group + GPS + address)
        // We'll just rebuild from scratch each time by removing everything after index 8
        while (root.getChildCount() > 8) {
            root.removeViewAt(8);
        }

        // === Section 1: Mock data checks ===
        addSectionTitle("Mock Data Detection");

        if (lastLocation != null) {
            tvGps.setText(String.format(Locale.US, "Lat: %.6f  Lng: %.6f\nAccuracy: %.1fm | Provider: %s",
                    lastLocation.getLatitude(), lastLocation.getLongitude(),
                    lastLocation.getAccuracy(), lastLocation.getProvider()));

            // isMock
            try {
                boolean val = lastLocation.isMock();
                addCheckResult("Location.isMock()", val ? "true" : "false", !val);
            } catch (Throwable t) {
                addCheckResult("Location.isMock()", "ERROR: " + t.getMessage(), false);
            }

            // isFromMockProvider
            try {
                boolean val = lastLocation.isFromMockProvider();
                addCheckResult("Location.isFromMockProvider()", val ? "true" : "false", !val);
            } catch (Throwable t) {
                addCheckResult("Location.isFromMockProvider()", "ERROR: " + t.getMessage(), false);
            }

            // Check extras for FL markers
            Bundle extras = lastLocation.getExtras();
            if (extras != null) {
                addCheckResult("Location.extras", extras.keySet().toString(), true);
            } else {
                addCheckResult("Location.extras", "null (clean)", true);
            }

            // Geocode
            updateGeocode();
        } else {
            addCheckResult("Location.isMock()", "No location yet", false);
            addCheckResult("Location.isFromMockProvider()", "No location yet", false);
        }

        // === Section 2: Service checks ===
        addSpacer(12);
        addSectionTitle("Service Detection");

        checkServiceAndShow("service_fl_ml");
        checkServiceAndShow("service_fl_mw");
        checkServiceAndShow("service_fl_na");
        checkServiceAndShow("service_fl_xp");
        checkServiceAndShow("service_mock_location");

        // === Section 3: Package checks ===
        addSpacer(12);
        addSectionTitle("Package Detection");

        checkPackageAndShow("com.lerist.fakelocation");
        checkPackageAndShow("dev.lerist.fakelocation");
        checkPackageAndShow("com.lerist.fakelocation.common.xposed");

        // === Section 4: File system checks ===
        addSpacer(12);
        addSectionTitle("File System Detection");

        checkFileAndShow("/data/fl/");
        checkFileAndShow("/data/fl/2da3c574.s");
        checkFileAndShow("/data/fl/system_dex");
        checkFileAndShow("/data/fl/zygote_dex");

        // === Section 5: Settings/Property checks ===
        addSpacer(12);
        addSectionTitle("System Settings Detection");

        try {
            String mockSetting = Settings.Secure.getString(getContentResolver(), "mock_location");
            addCheckResult("Settings.Secure[mock_location]",
                    mockSetting == null ? "null" : mockSetting,
                    mockSetting == null || "0".equals(mockSetting));
        } catch (Throwable t) {
            addCheckResult("Settings.Secure[mock_location]", "ERROR: " + t.getMessage(), false);
        }

        try {
            String allowMock = Settings.Secure.getString(getContentResolver(),
                    Settings.Secure.ALLOW_MOCK_LOCATION);
            addCheckResult("ALLOW_MOCK_LOCATION",
                    allowMock == null ? "null" : allowMock,
                    allowMock == null || "0".equals(allowMock));
        } catch (Throwable t) {
            addCheckResult("ALLOW_MOCK_LOCATION", "N/A (deprecated)", true);
        }

        // === Section 6: Xposed/Hook detection ===
        addSpacer(12);
        addSectionTitle("Hook Framework Detection");

        checkClassExists("de.robv.android.xposed.XposedBridge", "XposedBridge class");
        checkClassExists("de.robv.android.xposed.XposedHelpers", "XposedHelpers class");
        checkClassExists("org.lsposed.lspd.core.Main", "LSPosed core");

        // Check stack traces for hook indicators
        boolean stackHooked = false;
        try {
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            for (StackTraceElement el : stack) {
                if (el.getClassName().contains("xposed") || el.getClassName().contains("lsposed")) {
                    stackHooked = true;
                    break;
                }
            }
        } catch (Throwable ignored) {}
        addCheckResult("Stack trace hook markers", stackHooked ? "DETECTED" : "clean", !stackHooked);

        // === Section 7: Root detection ===
        addSpacer(12);
        addSectionTitle("Root Detection");

        checkFileAndShow("/system/bin/su");
        checkFileAndShow("/system/xbin/su");
        checkFileAndShow("/sbin/su");
        checkFileAndShow("/data/adb/ksu");
        checkFileAndShow("/data/adb/magisk");
        checkFileAndShow("/data/adb/ap");
        checkPackageAndShow("com.topjohnwu.magisk");
        checkPackageAndShow("me.weishu.kernelsu");

        try {
            Runtime.getRuntime().exec("su");
            addCheckResult("Runtime.exec(\"su\")", "EXECUTABLE", false);
        } catch (Throwable t) {
            addCheckResult("Runtime.exec(\"su\")", "blocked/not found", true);
        }

        // Check system properties
        String debuggable = System.getProperty("ro.debuggable", "0");
        addCheckResult("ro.debuggable", debuggable, "0".equals(debuggable));

        // === Section 8: Process/Injection detection ===
        addSpacer(12);
        addSectionTitle("Injection Detection");

        // Check /proc/self/maps for suspicious libraries
        boolean mapsHooked = false;
        String mapsDetail = "clean";
        try {
            java.io.BufferedReader br = new java.io.BufferedReader(
                    new java.io.FileReader("/proc/self/maps"));
            String line;
            while ((line = br.readLine()) != null) {
                String lower = line.toLowerCase();
                if (lower.contains("xposed") || lower.contains("lsposed") ||
                    lower.contains("riru") || lower.contains("zygisk") ||
                    lower.contains("fakeloc") || lower.contains("libfl")) {
                    mapsHooked = true;
                    mapsDetail = line.substring(line.lastIndexOf('/') + 1);
                    break;
                }
            }
            br.close();
        } catch (Throwable ignored) {
            mapsDetail = "unreadable";
        }
        addCheckResult("/proc/self/maps hook libs", mapsHooked ? mapsDetail : "clean", !mapsHooked);

        // Check if native methods were hooked (simple PLT check)
        boolean nativeHook = false;
        try {
            String[] suspiciousProps = {"ro.kernel.qemu", "init.svc.qemud", "ro.hardware.virtual_device"};
            for (String prop : suspiciousProps) {
                String val = System.getProperty(prop);
                if (val != null && !val.isEmpty()) {
                    nativeHook = true;
                    break;
                }
            }
        } catch (Throwable ignored) {}
        addCheckResult("Emulator/Virtual props", nativeHook ? "DETECTED" : "clean", !nativeHook);

        // Check global namespace for injected env
        String ldPreload = System.getenv("LD_PRELOAD");
        addCheckResult("LD_PRELOAD", ldPreload != null ? ldPreload : "null (clean)",
                ldPreload == null || ldPreload.isEmpty());

        // === Timestamp ===
        addSpacer(16);
        addSeparator();
        addSpacer(8);
        TextView tvTime = makeTextView(11, 0xFF666688, false);
        tvTime.setText("Refreshed: " + new java.text.SimpleDateFormat("HH:mm:ss.SSS", Locale.US)
                .format(new java.util.Date()));
        root.addView(tvTime);
    }

    private void updateGeocode() {
        if (lastLocation == null) return;
        try {
            Geocoder geocoder = new Geocoder(this, Locale.getDefault());
            List<Address> addresses = geocoder.getFromLocation(
                    lastLocation.getLatitude(), lastLocation.getLongitude(), 1);
            if (addresses != null && !addresses.isEmpty()) {
                Address addr = addresses.get(0);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= addr.getMaxAddressLineIndex(); i++) {
                    if (i > 0) sb.append("\n");
                    sb.append(addr.getAddressLine(i));
                }
                tvAddress.setText(sb.toString());
                tvAddress.setTextColor(0xFFCCDDFF);
            } else {
                tvAddress.setText("No result from Geocoder");
                tvAddress.setTextColor(0xFF888899);
            }
        } catch (Throwable t) {
            tvAddress.setText("Geocoder error: " + t.getMessage());
            tvAddress.setTextColor(0xFFFFAA00);
        }
    }

    private void checkServiceAndShow(String serviceName) {
        try {
            IBinder binder = ServiceManager.getService(serviceName);
            addCheckResult("svc: " + serviceName,
                    binder != null ? "FOUND" : "null",
                    binder == null);
        } catch (Throwable t) {
            addCheckResult("svc: " + serviceName, "ERROR: " + t.getMessage(), false);
        }
    }

    private void checkPackageAndShow(String pkgName) {
        boolean found = false;
        try {
            getPackageManager().getPackageInfo(pkgName, 0);
            found = true;
        } catch (PackageManager.NameNotFoundException e) {
            found = false;
        } catch (Throwable t) {
            addCheckResult("pkg: " + pkgName, "ERROR: " + t.getMessage(), false);
            return;
        }
        addCheckResult("pkg: " + pkgName, found ? "INSTALLED" : "not found", !found);
    }

    private void checkFileAndShow(String path) {
        boolean exists = new File(path).exists();
        addCheckResult("file: " + path, exists ? "EXISTS" : "not found", !exists);
    }

    private void checkClassExists(String className, String label) {
        boolean found = false;
        try {
            Class.forName(className);
            found = true;
        } catch (ClassNotFoundException e) {
            found = false;
        } catch (Throwable t) {
            found = false;
        }
        addCheckResult(label, found ? "FOUND" : "not found", !found);
    }

    private void addCheckResult(String label, String value, boolean safe) {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setPadding(0, 4, 0, 4);

        TextView dot = makeTextView(14, safe ? 0xFF44FF44 : 0xFFFF4444, true);
        dot.setText(safe ? "● " : "● ");
        dot.setMinWidth(40);

        TextView tvLabel = makeTextView(12, 0xFF9999BB, false);
        tvLabel.setText(label + ": ");

        TextView tvVal = makeTextView(12, safe ? 0xFF44FF44 : 0xFFFF4444, false);
        tvVal.setText(value);
        tvVal.setTypeface(Typeface.MONOSPACE);

        row.addView(dot);
        row.addView(tvLabel);
        row.addView(tvVal);
        root.addView(row);
    }

    private void addSectionTitle(String title) {
        TextView tv = makeTextView(14, 0xFFE94560, true);
        tv.setText("▸ " + title);
        tv.setPadding(0, 8, 0, 4);
        root.addView(tv);
    }

    private void addLabel(String text) {
        TextView tv = makeTextView(12, 0xFF8888AA, false);
        tv.setText(text);
        tv.setPadding(0, 6, 0, 2);
        root.addView(tv);
    }

    private void addSpacer(int h) {
        android.view.View v = new android.view.View(this);
        v.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, h * 3));
        root.addView(v);
    }

    private void addSeparator() {
        TextView tv = makeTextView(10, 0xFF333355, false);
        tv.setText("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        root.addView(tv);
    }

    private TextView makeTextView(float sizeSp, int color, boolean bold) {
        TextView tv = new TextView(this);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, sizeSp);
        tv.setTextColor(color);
        if (bold) tv.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return tv;
    }

    private TextView makeValueView() {
        TextView tv = makeTextView(14, 0xFFEEEEFF, false);
        tv.setTypeface(Typeface.MONOSPACE);
        tv.setPadding(0, 2, 0, 4);
        return tv;
    }

    private void checkAndRequestPermissions() {
        if (checkSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{
                    android.Manifest.permission.ACCESS_FINE_LOCATION,
                    android.Manifest.permission.ACCESS_COARSE_LOCATION
            }, PERMISSION_REQUEST);
        } else {
            startLocationUpdates();
        }
    }

    @Override
    public void onRequestPermissionsResult(int reqCode, String[] perms, int[] results) {
        super.onRequestPermissionsResult(reqCode, perms, results);
        if (reqCode == PERMISSION_REQUEST && results.length > 0 && results[0] == PackageManager.PERMISSION_GRANTED) {
            startLocationUpdates();
        }
    }

    private void startLocationUpdates() {
        try {
            locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            if (locationManager != null) {
                if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, this);
                if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER))
                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 0, this);
                Location last = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                if (last == null) last = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if (last != null) lastLocation = last;
            }
        } catch (Exception e) {
            Log.e(TAG, "Error", e);
        }
        updateDisplay();
        handler.postDelayed(refreshRunnable, REFRESH_INTERVAL);
    }

    @Override public void onLocationChanged(Location location) { lastLocation = location; updateDisplay(); }
    @Override public void onResume() { super.onResume(); handler.postDelayed(refreshRunnable, REFRESH_INTERVAL); }
    @Override public void onPause() { super.onPause(); handler.removeCallbacksAndMessages(null); }
    @Override public void onDestroy() { super.onDestroy(); handler.removeCallbacksAndMessages(null); if (locationManager != null) locationManager.removeUpdates(this); }
}
