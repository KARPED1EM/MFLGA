package de.robv.android.xposed;
public abstract class XC_MethodHook {
    public static class Unhook {}
    public static class MethodHookParam {
        public Object thisObject;
        public Object[] args;
        private Object result;
        public Object getResult() { return result; }
        public void setResult(Object r) { this.result = r; }
        public void setThrowable(Throwable t) {}
        public boolean hasThrowable() { return false; }
    }
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {}
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {}
}
