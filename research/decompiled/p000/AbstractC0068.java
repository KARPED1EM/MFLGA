package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޓ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public abstract class AbstractC0068<T extends android.os.IInterface> {

    /* renamed from: ՠ, reason: contains not printable characters */
    private static final java.lang.String f187 = p000.C0074.m256(new byte[]{-30, 93, 58, 63, -29, 89, -50, -54, -58, 87, 60, 53, -27}, new byte[]{-80, 56, 87, 80, -105, 60, -121, -92});

    /* renamed from: Ϳ, reason: contains not printable characters */
    private final android.content.Context f188;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private android.content.ServiceConnection f189;

    /* renamed from: ԩ, reason: contains not printable characters */
    private boolean f190;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private boolean f191;

    /* renamed from: Ԭ, reason: contains not printable characters */
    private T f193;

    /* renamed from: ԯ, reason: contains not printable characters */
    private android.content.Intent f196;

    /* renamed from: ԫ, reason: contains not printable characters */
    boolean f192 = false;

    /* renamed from: ԭ, reason: contains not printable characters */
    private java.util.Queue<java.lang.Runnable> f194 = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: Ԯ, reason: contains not printable characters */
    private java.lang.Object f195 = new java.lang.Object();

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޓ$Ϳ, reason: contains not printable characters */
    class RunnableC0069 implements java.lang.Runnable {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f197;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f198;

        /* renamed from: ԩ, reason: contains not printable characters */
        final /* synthetic */ android.os.Bundle f199;

        /* renamed from: Ԫ, reason: contains not printable characters */
        final /* synthetic */ long f200;

        RunnableC0069(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
            this.f197 = str;
            this.f198 = str2;
            this.f199 = bundle;
            this.f200 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            p000.AbstractC0068.this.m241(this.f197, this.f198, this.f199, this.f200);
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޓ$Ԩ, reason: contains not printable characters */
    class RunnableC0070 implements java.lang.Runnable {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ android.content.Intent f202;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ long f203;

        RunnableC0070(android.content.Intent intent, long j) {
            this.f202 = intent;
            this.f203 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            p000.AbstractC0068.this.m240(this.f202, this.f203);
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޓ$Ԫ, reason: contains not printable characters */
    class ServiceConnectionC0071 implements android.content.ServiceConnection {
        ServiceConnectionC0071() {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(android.content.ComponentName componentName) {
            android.util.Log.d(p000.C0074.m256(new byte[]{52, 95, 86, 42, 109, -41, 44, 17, 16, 85, 80, 32, 107}, new byte[]{102, 58, 59, 69, 25, -78, 101, Byte.MAX_VALUE}), componentName.getClassName() + p000.C0074.m256(new byte[]{90, -54, 76, -79, -34, 61, 29, -99, 20, -62, 102, -102, -46, 55, 87}, new byte[]{122, -91, 34, -13, -73, 83, 121, -12}));
            p000.AbstractC0068.this.f191 = false;
            p000.AbstractC0068.this.f189 = null;
            p000.AbstractC0068.this.f193 = null;
            p000.AbstractC0068.this.f190 = false;
            p000.AbstractC0068.this.mo75(componentName);
        }

        @Override // android.content.ServiceConnection
        public /* synthetic */ void onNullBinding(android.content.ComponentName componentName) {
            android.content.ServiceConnection.-CC.$default$onNullBinding(this, componentName);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            android.util.Log.d(p000.C0074.m256(new byte[]{-38, 25, -76, -13, -25, 10, -115, -107, -2, 19, -78, -7, -31}, new byte[]{-120, 124, -39, -100, -109, 111, -60, -5}), componentName.getClassName() + p000.C0074.m256(new byte[]{65, -73, -97, 105, 20, -26, -122, -97, 2, -67, -78, 85, 31, -6, -107, -107, 21, -67, -107, 20}, new byte[]{97, -40, -15, 58, 113, -108, -16, -10}));
            p000.AbstractC0068 abstractC0068 = p000.AbstractC0068.this;
            abstractC0068.f193 = abstractC0068.mo74(componentName, iBinder);
            p000.AbstractC0068.this.f191 = true;
            p000.AbstractC0068.this.f190 = false;
            p000.AbstractC0068.this.mo77(componentName, iBinder);
            p000.AbstractC0068.this.f192 = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            android.util.Log.d(p000.C0074.m256(new byte[]{116, -10, -99, 51, 28, -73, -18, 81, 80, -4, -101, 57, 26}, new byte[]{38, -109, -16, 92, 104, -46, -89, 63}), componentName.getClassName() + p000.C0074.m256(new byte[]{29, -10, 67, -74, -68, -113, -50, 99, 94, -4, 105, -116, -86, -98, -41, 100, 83, -4, 78, -111, -68, -103, -106}, new byte[]{61, -103, 45, -27, -39, -3, -72, 10}));
            p000.AbstractC0068.this.f191 = false;
            p000.AbstractC0068.this.f189 = null;
            p000.AbstractC0068.this.f193 = null;
            p000.AbstractC0068.this.f190 = false;
            p000.AbstractC0068.this.mo78(componentName);
        }
    }

    public AbstractC0068(android.content.Context context) {
        this.f188 = context.getApplicationContext();
    }

    /* renamed from: ԫ */
    protected abstract T mo74(android.content.ComponentName componentName, android.os.IBinder iBinder);

    /* renamed from: Ԭ, reason: contains not printable characters */
    public void m238(android.content.Intent intent, long j) {
        new java.lang.Thread(new p000.AbstractC0068.RunnableC0070(intent, j)).start();
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public void m239(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        new java.lang.Thread(new p000.AbstractC0068.RunnableC0069(str, str2, bundle, j)).start();
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public boolean m240(android.content.Intent intent, long j) {
        if (intent == null) {
            return false;
        }
        synchronized (this.f195) {
            try {
                if (this.f191) {
                    return true;
                }
                this.f190 = true;
                this.f191 = false;
                this.f192 = false;
                this.f196 = intent;
                this.f189 = new p000.AbstractC0068.ServiceConnectionC0071();
                try {
                    android.util.Log.d(f187, p000.C0074.m256(new byte[]{-88, 11, 61, 39, -66, -91, -118, -40}, new byte[]{-5, 110, 79, 81, -41, -58, -17, -125}) + intent.getAction() + p000.C0074.m256(new byte[]{44, 111, 74, -42, 121, 89, 111, 95, 5, 38, 71, -34, 57, 25, 36}, new byte[]{113, 79, 41, -71, 23, 55, 10, 60}));
                    this.f188.getApplicationContext().bindService(intent, this.f189, 1);
                    if (j > 0) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        while (this.f190) {
                            if (java.lang.System.currentTimeMillis() - currentTimeMillis >= j) {
                                mo76(intent.getComponent());
                                throw new java.util.concurrent.TimeoutException(p000.C0074.m256(new byte[]{-97, -78, -85, -22, -118, -92, -43, 95, -81, -72, -73, -14, -122, -92, -60, 95, -72, -66, -76, -7, -116, -78, -60, 87}, new byte[]{-52, -41, -39, -100, -29, -57, -80, Byte.MAX_VALUE}) + j + p000.C0074.m256(new byte[]{114, -88}, new byte[]{91, -122, 9, 17, 99, -25, 21, 36}));
                            }
                        }
                    } else if (this.f190) {
                        mo76(intent.getComponent());
                        throw new java.util.concurrent.TimeoutException(p000.C0074.m256(new byte[]{60, -83, 40, -125, -107, 90, 122, -63, 12, -89, 52, -101, -103, 90, 107, -63, 27, -95, 55, -112, -109, 76, 107, -55}, new byte[]{111, -56, 90, -11, -4, 57, 31, -31}) + j + p000.C0074.m256(new byte[]{-124, 80}, new byte[]{-83, 126, 106, -11, -73, -17, -30, 46}));
                    }
                    if (this.f191) {
                        android.util.Log.d(f187, p000.C0074.m256(new byte[]{-100, -2, -96, 30, -68, 117, 108, -55}, new byte[]{-49, -101, -46, 104, -43, 22, 9, -110}) + intent.getAction() + p000.C0074.m256(new byte[]{113, 126, -80, -120, -34, 125, -38, -88, 88, 59, -73, -55}, new byte[]{44, 94, -45, -25, -80, 19, -65, -53}));
                        while (!this.f192) {
                        }
                    }
                } catch (java.lang.Throwable unused) {
                    this.f190 = false;
                }
                return this.f191;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public boolean m241(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage(str);
        intent.setComponent(new android.content.ComponentName(str, str2));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return m240(intent, j);
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public void m242() {
        synchronized (this.f195) {
            try {
                if (this.f189 != null) {
                    this.f188.getApplicationContext().unbindService(this.f189);
                    this.f189 = null;
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public T m243() {
        if (this.f191) {
            return this.f193;
        }
        android.util.Log.e(f187, p000.C0074.m256(new byte[]{-88, 65, 73, -10, -80, 104, -30, 31, -114, 74, 88, -17, -73, 101, -30, 92, -113, 65, 95, -82}, new byte[]{-5, 36, 59, Byte.MIN_VALUE, -39, 11, -121, 63}));
        return null;
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public boolean m244() {
        return this.f191;
    }

    /* renamed from: ׯ, reason: contains not printable characters */
    public boolean m245() {
        return this.f190;
    }

    /* renamed from: ށ */
    protected void mo77(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (this.f194 != null) {
            while (!this.f194.isEmpty()) {
                java.lang.Runnable poll = this.f194.poll();
                if (poll != null) {
                    android.util.Log.i(f187, p000.C0074.m256(new byte[]{51, 113, 92, -109, -45, -91, -88, 107, 2, 108, 84, Byte.MIN_VALUE, -122, -80, -82, 63, 31, 102, 87, -34, -120, -1}, new byte[]{118, 9, 57, -16, -90, -47, -51, 75}));
                    poll.run();
                }
            }
        }
    }

    /* renamed from: ރ, reason: contains not printable characters */
    public void m246() {
        m247(300L);
    }

    /* renamed from: ބ, reason: contains not printable characters */
    public void m247(long j) {
        if (this.f191) {
            return;
        }
        m242();
        m238(this.f196, j);
    }

    /* renamed from: ؠ */
    protected void mo75(android.content.ComponentName componentName) {
    }

    /* renamed from: ހ */
    protected void mo76(android.content.ComponentName componentName) {
    }

    /* renamed from: ނ */
    protected void mo78(android.content.ComponentName componentName) {
    }
}
