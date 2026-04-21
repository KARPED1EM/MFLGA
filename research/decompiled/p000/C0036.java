package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.މ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0036 {

    /* renamed from: ֏, reason: contains not printable characters */
    private static final java.lang.String f61 = p000.C0074.m256(new byte[]{-4, 1, 51, 40, -29, 57, 104, -39, -36, 59, 57, 37, -4}, new byte[]{-80, 82, 92, 75, -120, 92, 28, -102});

    /* renamed from: Ϳ, reason: contains not printable characters */
    private final android.os.Handler f62;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private java.net.Socket f63;

    /* renamed from: ԩ, reason: contains not printable characters */
    private java.lang.String f64;

    /* renamed from: Ԫ, reason: contains not printable characters */
    private int f65;

    /* renamed from: ԫ, reason: contains not printable characters */
    private p000.C0036.InterfaceC0040 f66;

    /* renamed from: ԭ, reason: contains not printable characters */
    private boolean f68;

    /* renamed from: Ԯ, reason: contains not printable characters */
    private java.io.BufferedReader f69;

    /* renamed from: ԯ, reason: contains not printable characters */
    private java.io.DataOutputStream f70;

    /* renamed from: Ԭ, reason: contains not printable characters */
    private java.util.List<p000.C0036.InterfaceC0040> f67 = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: ՠ, reason: contains not printable characters */
    private int f71 = 0;

    /* renamed from: ֈ, reason: contains not printable characters */
    java.lang.Object f72 = new java.lang.Object();

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.މ$Ϳ, reason: contains not printable characters */
    class RunnableC0037 implements java.lang.Runnable {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f73;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ int f74;

        RunnableC0037(java.lang.String str, int i) {
            this.f73 = str;
            this.f74 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            p000.C0036.this.m163(this.f73, this.f74);
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.މ$Ԩ, reason: contains not printable characters */
    class RunnableC0038 implements java.lang.Runnable {
        RunnableC0038() {
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #1 {Exception -> 0x008c, blocks: (B:39:0x007a, B:41:0x0082), top: B:2:0x0001 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                r0 = 0
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                r2 = 1
                p000.C0036.m158(r1, r2)     // Catch: java.lang.Exception -> L7a
            L7:
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                boolean r1 = p000.C0036.m157(r1)     // Catch: java.lang.Exception -> L7a
                if (r1 == 0) goto Lb3
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                boolean r1 = r1.m164()     // Catch: java.lang.Exception -> L7a
                if (r1 == 0) goto L5d
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                java.io.BufferedReader r1 = p000.C0036.m159(r1)     // Catch: java.lang.Exception -> L7a
                java.lang.String r1 = r1.readLine()     // Catch: java.lang.Exception -> L7a
                if (r1 == 0) goto L7
                ࢡ.މ r2 = p000.C0036.this     // Catch: java.lang.Exception -> L35
                ࢡ.މ$Ԭ r2 = p000.C0036.m160(r2)     // Catch: java.lang.Exception -> L35
                if (r2 == 0) goto L39
                ࢡ.މ r2 = p000.C0036.this     // Catch: java.lang.Exception -> L35
                ࢡ.މ$Ԭ r2 = p000.C0036.m160(r2)     // Catch: java.lang.Exception -> L35
                r2.mo172(r1)     // Catch: java.lang.Exception -> L35
                goto L39
            L35:
                r2 = move-exception
                r2.printStackTrace()     // Catch: java.lang.Exception -> L7a
            L39:
                r2 = 0
            L3a:
                ࢡ.މ r3 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                java.util.List r3 = p000.C0036.m161(r3)     // Catch: java.lang.Exception -> L7a
                int r3 = r3.size()     // Catch: java.lang.Exception -> L7a
                if (r2 >= r3) goto L7
                ࢡ.މ r3 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                java.util.List r3 = p000.C0036.m161(r3)     // Catch: java.lang.Exception -> L7a
                java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Exception -> L7a
                ࢡ.މ$Ԭ r3 = (p000.C0036.InterfaceC0040) r3     // Catch: java.lang.Exception -> L7a
                r3.mo172(r1)     // Catch: java.lang.Exception -> L56
                goto L5a
            L56:
                r3 = move-exception
                r3.printStackTrace()     // Catch: java.lang.Exception -> L7a
            L5a:
                int r2 = r2 + 1
                goto L3a
            L5d:
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L7a
                p000.C0036.m158(r1, r0)     // Catch: java.lang.Exception -> L7a
                java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L7a
                r2 = 11
                byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L7a
                r2 = {x00b4: FILL_ARRAY_DATA , data: [59, 58, -47, -88, -87, -21, 12, 20, 60, 39, -116} // fill-array     // Catch: java.lang.Exception -> L7a
                r3 = 8
                byte[] r3 = new byte[r3]     // Catch: java.lang.Exception -> L7a
                r3 = {x00be: FILL_ARRAY_DATA , data: [95, 83, -94, -53, -58, -123, 98, 113} // fill-array     // Catch: java.lang.Exception -> L7a
                java.lang.String r2 = p000.C0074.m256(r2, r3)     // Catch: java.lang.Exception -> L7a
                r1.<init>(r2)     // Catch: java.lang.Exception -> L7a
                throw r1     // Catch: java.lang.Exception -> L7a
            L7a:
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L8c
                ࢡ.މ$Ԭ r1 = p000.C0036.m160(r1)     // Catch: java.lang.Exception -> L8c
                if (r1 == 0) goto L90
                ࢡ.މ r1 = p000.C0036.this     // Catch: java.lang.Exception -> L8c
                ࢡ.މ$Ԭ r1 = p000.C0036.m160(r1)     // Catch: java.lang.Exception -> L8c
                r1.mo170()     // Catch: java.lang.Exception -> L8c
                goto L90
            L8c:
                r1 = move-exception
                r1.printStackTrace()
            L90:
                ࢡ.މ r1 = p000.C0036.this
                java.util.List r1 = p000.C0036.m161(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto Lb3
                ࢡ.މ r1 = p000.C0036.this
                java.util.List r1 = p000.C0036.m161(r1)
                java.lang.Object r1 = r1.get(r0)
                ࢡ.މ$Ԭ r1 = (p000.C0036.InterfaceC0040) r1
                r1.mo170()     // Catch: java.lang.Exception -> Lac
                goto Lb0
            Lac:
                r1 = move-exception
                r1.printStackTrace()
            Lb0:
                int r0 = r0 + 1
                goto L90
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0036.RunnableC0038.run():void");
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.މ$Ԫ, reason: contains not printable characters */
    class RunnableC0039 implements java.lang.Runnable {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f77;

        RunnableC0039(java.lang.String str) {
            this.f77 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p000.C0036.this.m169(this.f77);
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.މ$Ԭ, reason: contains not printable characters */
    public interface InterfaceC0040 {
        /* renamed from: Ϳ, reason: contains not printable characters */
        void mo170();

        /* renamed from: Ԩ, reason: contains not printable characters */
        void mo171();

        /* renamed from: ԩ, reason: contains not printable characters */
        void mo172(java.lang.String str);

        /* renamed from: Ԫ, reason: contains not printable characters */
        void mo173(java.lang.String str);
    }

    public C0036() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(p000.C0074.m256(new byte[]{-30, -80, -51, -41, -36, 90, 5, 125, -62, -118, -57, -38, -61}, new byte[]{-82, -29, -94, -76, -73, 63, 113, 62}));
        handlerThread.start();
        this.f62 = new android.os.Handler(handlerThread.getLooper());
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    public void m162(java.lang.String str, int i) {
        new java.lang.Thread(new p000.C0036.RunnableC0037(str, i)).start();
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    public void m163(java.lang.String str, int i) {
        long j;
        this.f64 = str;
        this.f65 = i;
        java.net.Socket socket = this.f63;
        if (socket != null && !socket.isClosed()) {
            try {
                this.f63.close();
                this.f63 = null;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        int i2 = 0;
        try {
            java.net.Socket socket2 = new java.net.Socket();
            this.f63 = socket2;
            socket2.setReuseAddress(true);
            j = java.lang.System.currentTimeMillis();
        } catch (java.lang.Exception e2) {
            e = e2;
            j = -1;
        }
        try {
            this.f63.connect(new java.net.InetSocketAddress(str, i), this.f71);
            try {
                this.f69 = new java.io.BufferedReader(new java.io.InputStreamReader(this.f63.getInputStream()));
            } catch (java.lang.Exception e3) {
                e3.printStackTrace();
            }
            try {
                this.f70 = new java.io.DataOutputStream(this.f63.getOutputStream());
            } catch (java.lang.Exception e4) {
                e4.printStackTrace();
            }
            new java.lang.Thread(new p000.C0036.RunnableC0038()).start();
            try {
                p000.C0036.InterfaceC0040 interfaceC0040 = this.f66;
                if (interfaceC0040 != null) {
                    interfaceC0040.mo171();
                }
            } catch (java.lang.Exception e5) {
                e5.printStackTrace();
            }
            while (i2 < this.f67.size()) {
                try {
                    this.f67.get(i2).mo171();
                } catch (java.lang.Exception e6) {
                    e6.printStackTrace();
                }
                i2++;
            }
        } catch (java.lang.Exception e7) {
            e = e7;
            java.lang.String message = e.getMessage();
            if (j != -1 && this.f71 != 0 && java.lang.System.currentTimeMillis() - j >= this.f71) {
                message = p000.C0074.m256(new byte[]{-35, -28, 56, -112, 89, -86, 116, 57, -54, -30, 59, -101, 83, -68, 116, 55}, new byte[]{-98, -117, 86, -2, 60, -55, 0, 25});
            }
            try {
                p000.C0036.InterfaceC0040 interfaceC00402 = this.f66;
                if (interfaceC00402 != null) {
                    interfaceC00402.mo173(message);
                }
            } catch (java.lang.Exception e8) {
                e8.printStackTrace();
            }
            while (i2 < this.f67.size()) {
                try {
                    this.f67.get(i2).mo173(message);
                } catch (java.lang.Exception e9) {
                    e9.printStackTrace();
                }
                i2++;
            }
        }
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    public boolean m164() {
        try {
            java.net.Socket socket = this.f63;
            if (socket == null || !socket.isConnected() || this.f63.isClosed() || this.f63.isInputShutdown() || this.f63.isOutputShutdown()) {
                return false;
            }
            this.f63.sendUrgentData(255);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    public void m165() {
        m162(this.f64, this.f65);
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public void m166(java.lang.String str) {
        this.f62.post(new p000.C0036.RunnableC0039(str));
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public void m167(p000.C0036.InterfaceC0040 interfaceC0040) {
        this.f66 = interfaceC0040;
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public boolean m168(byte[] bArr) {
        java.net.Socket socket;
        if (bArr == null || (socket = this.f63) == null || socket.isClosed() || !this.f63.isConnected() || this.f63.isOutputShutdown()) {
            return false;
        }
        try {
            this.f70.write(bArr);
            this.f70.flush();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: ׯ, reason: contains not printable characters */
    public boolean m169(java.lang.String str) {
        return m168((str + "\n").getBytes());
    }
}
