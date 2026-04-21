package android.os;

public class Handler {
    public Handler() {}
    public Handler(Looper looper) {}
    public boolean postDelayed(Runnable r, long delayMillis) { return false; }
    public void removeCallbacksAndMessages(Object token) {}
}
