package android.provider;

import android.content.ContentResolver;

public class Settings {
    public static class Secure {
        public static final String ALLOW_MOCK_LOCATION = "mock_location";
        public static String getString(ContentResolver resolver, String name) { return null; }
    }
}
