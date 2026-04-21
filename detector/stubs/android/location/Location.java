package android.location;

import android.os.Bundle;

public class Location {
    public double getLatitude() { return 0; }
    public double getLongitude() { return 0; }
    public float getAccuracy() { return 0; }
    public String getProvider() { return null; }
    public boolean isMock() { return false; }
    public boolean isFromMockProvider() { return false; }
    public Bundle getExtras() { return null; }
}
