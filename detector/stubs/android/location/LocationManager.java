package android.location;

public class LocationManager {
    public static final String GPS_PROVIDER = "gps";
    public static final String NETWORK_PROVIDER = "network";
    public void requestLocationUpdates(String provider, long minTime, float minDistance, LocationListener listener) {}
    public void removeUpdates(LocationListener listener) {}
    public Location getLastKnownLocation(String provider) { return null; }
    public boolean isProviderEnabled(String provider) { return false; }
}
