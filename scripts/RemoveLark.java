import android.os.IBinder;
import android.os.Parcel;
import android.os.ServiceManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Removes com.ss.android.lark from FakeLocation's runtime safe apps list.
 * Run via: app_process -Djava.class.path=/path/to/classes.dex / RemoveLark
 */
public class RemoveLark {
    // Transaction codes from IMockLocationManager AIDL
    static final int TRANSACTION_getSafeApps = 33;
    static final int TRANSACTION_setSafeApps = 32;
    static final String DESCRIPTOR = "com.lerist.aidl.fakelocation.IMockLocationManager";
    static final String TARGET = "com.ss.android.lark";

    public static void main(String[] args) {
        try {
            IBinder binder = ServiceManager.getService("service_fl_ml");
            if (binder == null) {
                System.out.println("ERROR: service_fl_ml not found. Is FakeLocation running?");
                return;
            }

            // Step 1: Get current safe apps list
            List<String> safeApps = getSafeApps(binder);
            System.out.println("Current safe apps: " + safeApps.size() + " entries");

            boolean found = safeApps.remove(TARGET);
            if (!found) {
                System.out.println("'" + TARGET + "' not in list. Already removed or not present.");
                return;
            }

            System.out.println("Removed '" + TARGET + "'. New count: " + safeApps.size());

            // Step 2: Send modified list back
            setSafeApps(binder, safeApps);
            System.out.println("Updated safe apps list sent to FakeLocation.");

            // Step 3: Verify
            List<String> verify = getSafeApps(binder);
            if (verify.contains(TARGET)) {
                System.out.println("WARNING: '" + TARGET + "' still in list after update!");
            } else {
                System.out.println("SUCCESS: '" + TARGET + "' confirmed removed.");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static List<String> getSafeApps(IBinder binder) throws Exception {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(DESCRIPTOR);
            binder.transact(TRANSACTION_getSafeApps, data, reply, 0);
            reply.readException();
            return reply.createStringArrayList();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }

    static void setSafeApps(IBinder binder, List<String> list) throws Exception {
        Parcel data = Parcel.obtain();
        Parcel reply = Parcel.obtain();
        try {
            data.writeInterfaceToken(DESCRIPTOR);
            data.writeStringList(list);
            binder.transact(TRANSACTION_setSafeApps, data, reply, 0);
            reply.readException();
        } finally {
            data.recycle();
            reply.recycle();
        }
    }
}
