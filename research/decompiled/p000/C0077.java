package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޙ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0077 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static java.lang.Class<?> f227 = null;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static boolean f228 = false;

    /* renamed from: ԩ, reason: contains not printable characters */
    static java.util.Map<java.lang.String, java.lang.ref.WeakReference<java.lang.Object>> f229 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޙ$Ϳ, reason: contains not printable characters */
    class C0078 implements java.lang.reflect.InvocationHandler {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f230;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.Object f231;

        C0078(java.lang.String str, java.lang.Object obj) {
            this.f230 = str;
            this.f231 = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.util.List<android.telephony.CellInfo> list;
            try {
                if (p000.C0077.isHook() && p000.C0077.isAllowMockPackage(this.f230)) {
                    java.lang.String str = "";
                    if (objArr != null) {
                        java.lang.String str2 = "";
                        for (int i = 0; i < objArr.length; i++) {
                            str2 = objArr[i] == null ? str2 + p000.C0074.m256(new byte[]{94, 8, 61, 70, 122, -42, 20, 116, 92, 81, 113}, new byte[]{48, 125, 81, 42, 90, -72, 97, 24}) : str2 + "" + objArr[i].getClass().getName() + " " + objArr[i] + p000.C0074.m256(new byte[]{38, 119}, new byte[]{10, 87, -107, -75, 93, -56, -120, -67});
                        }
                        str = str2;
                    }
                    p000.C0077.log(p000.C0074.m256(new byte[]{-73, -13, -53, 8, -38, -46, 118}, new byte[]{-37, -102, -72, 124, -65, -68, 88, 89}) + method.getName() + p000.C0074.m256(new byte[]{50, -2, 90, -10, 40, 45, 98, -89, 119, -36, 1, -92}, new byte[]{18, -82, 59, -124, 73, 64, 7, -45}) + str);
                    if (p000.C0074.m256(new byte[]{-46, -10, -81, 83, 52, -100, -62, 91, -34, -7, -104, 95, 55, -98, -51, 92, -36, -10, -117, 83, 60}, new byte[]{-67, -104, -20, 54, 88, -16, -114, 52}).equals(method.getName())) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                        if (!p000.C0077.isHookCells(this.f230) || mockCells == null || mockCells.isEmpty()) {
                            bundle.putInt(p000.C0074.m256(new byte[]{-93, 77, 28}, new byte[]{-64, 36, 120, 103, -111, 42, 59, -43}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{18, 41, 36}, new byte[]{126, 72, 71, 66, 108, 13, -8, -36}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{32, -18, 41}, new byte[]{80, -99, 74, -96, 36, -119, 31, -53}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-77, 62, 66, -83, -111, -127, -33, -34, -72, 48, 95, -127, -90}, new byte[]{-47, 95, 49, -56, -62, -11, -66, -86}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-110, 3, 0, -89, 82, -83, 110, 108}, new byte[]{-31, 122, 115, -45, 55, -64, 39, 8}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-41, -83, -108, -15, -62, -27, -61, 86, -35}, new byte[]{-71, -56, -32, -122, -83, -105, -88, 31}), Integer.MAX_VALUE);
                        } else {
                            p000.C0005 c0005 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                            bundle.putInt(p000.C0074.m256(new byte[]{1, -22, -127}, new byte[]{98, -125, -27, 39, -57, 46, 86, 77}), (int) c0005.m35());
                            bundle.putInt(p000.C0074.m256(new byte[]{-111, 47, 55}, new byte[]{-3, 78, 84, 56, -91, -25, 47, 49}), c0005.m36());
                            bundle.putInt(p000.C0074.m256(new byte[]{-6, 102, Byte.MIN_VALUE}, new byte[]{-118, 21, -29, -126, -52, 117, 56, -22}), c0005.m43());
                            bundle.putInt(p000.C0074.m256(new byte[]{21, -13, -24, 56, -38, -8, 81, 26, 30, -3, -11, 20, -19}, new byte[]{119, -110, -101, 93, -119, -116, 48, 110}), (int) c0005.m35());
                            bundle.putInt(p000.C0074.m256(new byte[]{97, -32, 84, -22, 38, 74, 66, 117}, new byte[]{18, -103, 39, -98, 67, 39, 11, 17}), c0005.m40());
                            bundle.putInt(p000.C0074.m256(new byte[]{39, -121, 81, 39, -92, 50, 31, -40, 45}, new byte[]{73, -30, 37, 80, -53, 64, 116, -111}), c0005.m36());
                        }
                        android.location.Location mockLocation = p000.C0041.getMockLocation();
                        if (mockLocation != null) {
                            bundle.putInt(p000.C0074.m256(new byte[]{-1, 122, 112, 60, -100, -98, 27, 101, -12, 116, 109, 21, -82, -98, 19, 101, -24, Byte.MAX_VALUE, 102}, new byte[]{-99, 27, 3, 89, -49, -22, 122, 17}), (int) (mockLocation.getLatitude() * 14400.0d));
                            bundle.putInt(p000.C0074.m256(new byte[]{-67, -33, 119, 46, 110, -114, 99, -10, -74, -47, 106, 7, 82, -108, 101, -21, -85, -53, 96, 46}, new byte[]{-33, -66, 4, 75, 61, -6, 2, -126}), (int) (mockLocation.getLongitude() * 14400.0d));
                        }
                        bundle.putBoolean(p000.C0074.m256(new byte[]{51, 102, 49, -79, 18}, new byte[]{86, 11, 65, -59, 107, -6, 37, Byte.MIN_VALUE}), false);
                        bundle.putBoolean(p000.C0074.m256(new byte[]{-30, -91, -100, 71, 93, -18, -41, 76, -28, -83, Byte.MIN_VALUE}, new byte[]{-121, -56, -20, 51, 36, -66, -74, 62}), false);
                        bundle.putInt(p000.C0074.m256(new byte[]{-47, -79, 56, -47, 36, 27}, new byte[]{-68, -9, 84, -80, 67, 104, -106, -74}), 1536);
                        bundle.putBoolean(p000.C0074.m256(new byte[]{-68, 119, -8, -65, -35, 32, 33, -66, -88}, new byte[]{-52, 22, -118, -36, -72, 76, 77, -37}), false);
                        bundle.putInt(p000.C0074.m256(new byte[]{76, 54, -114, 107}, new byte[]{63, 95, -12, 14, -21, 46, 86, 34}), 0);
                        return method.invoke(this.f231, bundle);
                    }
                    if (p000.C0074.m256(new byte[]{23, 48, 87, 31, 32, -111, -79, -72, 30, 49, 87, 18, 45, -109, -97, -77, 28}, new byte[]{120, 94, 20, 122, 76, -3, -8, -42}).equals(method.getName())) {
                        if (p000.C0077.isHookCells(this.f230)) {
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            list = p000.C0008.m58(p000.C0041.getMockCells());
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = new java.util.ArrayList<>();
                        }
                        p000.C0077.log(p000.C0074.m256(new byte[]{80, 77, 16, -111, -113, 15, -102, 13, 82, 103, 6, -119, -122, 40, -38, 4, 83, 103, 11, -124, -124, 6, -47, 6, 6, 4, 0, Byte.MIN_VALUE, -122, 13, -3, 12, 90, 75, 16, -53, -103, 8, -50, 7, 28, 25, 67}, new byte[]{60, 36, 99, -27, -22, 97, -76, 98}) + list.size());
                        return method.invoke(this.f231, list);
                    }
                    if (p000.C0074.m256(new byte[]{63, 110, -119, 18, -64, -29, 20, 117, 3, 116, -88, 30, -55, -22, 1, 113, 35, 67, -78, 26, -55, -22, 16, 125}, new byte[]{80, 0, -38, 123, -89, -115, 117, 25}).equals(method.getName()) || p000.C0074.m256(new byte[]{60, 93, -95, -98, -91, -77, -11, -36, 0, 71, Byte.MIN_VALUE, -110, -84, -70, -32, -40, 16, 91, -109, -103, -91, -72, -16}, new byte[]{83, 51, -14, -9, -62, -35, -108, -80}).equals(method.getName())) {
                        return null;
                    }
                }
                return method.invoke(this.f231, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                e.printStackTrace();
                if (e.getTargetException() == null) {
                    return null;
                }
                throw e.getTargetException();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޙ$Ԩ, reason: contains not printable characters */
    class C0079 implements java.lang.reflect.InvocationHandler {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f232;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.Object f233;

        C0079(java.lang.String str, java.lang.Object obj) {
            this.f232 = str;
            this.f233 = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.util.List<android.telephony.CellInfo> list;
            try {
                if (p000.C0077.isHook() && p000.C0077.isAllowMockPackage(this.f232)) {
                    java.lang.String str = "";
                    if (objArr != null) {
                        java.lang.String str2 = "";
                        for (int i = 0; i < objArr.length; i++) {
                            str2 = objArr[i] == null ? str2 + p000.C0074.m256(new byte[]{-107, -74, 100, 117, -64, -42, -86, -119, -105, -17, 40}, new byte[]{-5, -61, 8, 25, -32, -72, -33, -27}) : str2 + "" + objArr[i].getClass().getName() + " " + objArr[i] + p000.C0074.m256(new byte[]{-61, 17}, new byte[]{-17, 49, 12, 37, -11, -104, 20, -93});
                        }
                        str = str2;
                    }
                    p000.C0077.log(p000.C0074.m256(new byte[]{-9, -119, 23, 122, 26, 120, 59, 51, -23, -77, 17, 108, 12, 117, 15, 53, -7, -123, 22, 32}, new byte[]{-101, -32, 100, 14, Byte.MAX_VALUE, 22, 125, 92}) + method.getName() + p000.C0074.m256(new byte[]{104, -63, 82, -41, 30, -15, -113, -113, 45, -29, 9, -123}, new byte[]{72, -111, 51, -91, Byte.MAX_VALUE, -100, -22, -5}) + str);
                    if (p000.C0074.m256(new byte[]{110, -80, 101, -80, 67, 69, -7, 72, 98, -65, 82, -68, 64, 71, -10, 79, 96, -80, 65, -80, 75}, new byte[]{1, -34, 38, -43, 47, 41, -75, 39}).equals(method.getName())) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                        if (!p000.C0077.isHookCells(this.f232) || mockCells == null || mockCells.isEmpty()) {
                            bundle.putInt(p000.C0074.m256(new byte[]{83, -27, 126}, new byte[]{48, -116, 26, -4, 2, -58, -8, 121}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{78, -40, -9}, new byte[]{34, -71, -108, -120, 58, 103, 14, 75}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-87, 9, -34}, new byte[]{-39, 122, -67, 106, 48, 18, -74, -68}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-53, -20, -48, -121, Byte.MAX_VALUE, -12, -54, 23, -64, -30, -51, -85, 72}, new byte[]{-87, -115, -93, -30, 44, Byte.MIN_VALUE, -85, 99}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-88, -12, -43, 30, 3, 124, -52, -53}, new byte[]{-37, -115, -90, 106, 102, 17, -123, -81}), Integer.MAX_VALUE);
                            bundle.putInt(p000.C0074.m256(new byte[]{-84, -15, -34, 102, -72, 86, 5, 99, -90}, new byte[]{-62, -108, -86, 17, -41, 36, 110, 42}), Integer.MAX_VALUE);
                        } else {
                            p000.C0005 c0005 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                            bundle.putInt(p000.C0074.m256(new byte[]{84, -126, -38}, new byte[]{55, -21, -66, 4, 26, 73, -69, -76}), (int) c0005.m35());
                            bundle.putInt(p000.C0074.m256(new byte[]{-13, 15, -93}, new byte[]{-97, 110, -64, 51, -9, -123, -119, -97}), c0005.m36());
                            bundle.putInt(p000.C0074.m256(new byte[]{108, 2, 56}, new byte[]{28, 113, 91, -57, 104, 32, 3, 27}), c0005.m43());
                            bundle.putInt(p000.C0074.m256(new byte[]{-17, -51, -97, -97, 104, -103, 70, -35, -28, -61, -126, -77, 95}, new byte[]{-115, -84, -20, -6, 59, -19, 39, -87}), (int) c0005.m35());
                            bundle.putInt(p000.C0074.m256(new byte[]{-123, 124, -75, 28, 81, 90, 102, -51}, new byte[]{-10, 5, -58, 104, 52, 55, 47, -87}), c0005.m40());
                            bundle.putInt(p000.C0074.m256(new byte[]{-116, 86, 125, -15, 8, -77, -124, 67, -122}, new byte[]{-30, 51, 9, -122, 103, -63, -17, 10}), c0005.m36());
                        }
                        android.location.Location mockLocation = p000.C0041.getMockLocation();
                        if (mockLocation != null) {
                            bundle.putInt(p000.C0074.m256(new byte[]{-23, -39, -8, 65, -125, 86, -104, -65, -30, -41, -27, 104, -79, 86, -112, -65, -2, -36, -18}, new byte[]{-117, -72, -117, 36, -48, 34, -7, -53}), (int) (mockLocation.getLatitude() * 14400.0d));
                            bundle.putInt(p000.C0074.m256(new byte[]{109, -103, -111, 104, -106, 32, 110, -23, 102, -105, -116, 65, -86, 58, 104, -12, 123, -115, -122, 104}, new byte[]{15, -8, -30, 13, -59, 84, 15, -99}), (int) (mockLocation.getLongitude() * 14400.0d));
                        }
                        bundle.putBoolean(p000.C0074.m256(new byte[]{17, -74, 116, -75, -92}, new byte[]{116, -37, 4, -63, -35, -23, -98, 38}), false);
                        bundle.putBoolean(p000.C0074.m256(new byte[]{-95, 13, 121, 41, -28, 78, -101, -103, -89, 5, 101}, new byte[]{-60, 96, 9, 93, -99, 30, -6, -21}), false);
                        bundle.putInt(p000.C0074.m256(new byte[]{66, 32, -118, -21, -89, 83}, new byte[]{47, 102, -26, -118, -64, 32, -59, -124}), 1536);
                        bundle.putBoolean(p000.C0074.m256(new byte[]{-85, -122, 24, 92, 103, -23, -42, -127, -65}, new byte[]{-37, -25, 106, 63, 2, -123, -70, -28}), false);
                        bundle.putInt(p000.C0074.m256(new byte[]{32, 122, -86, 79}, new byte[]{83, 19, -48, 42, -50, -120, 3, -120}), 0);
                        return method.invoke(this.f233, bundle);
                    }
                    if (p000.C0074.m256(new byte[]{-34, -98, 88, -8, 32, 84, -111, 24, -41, -97, 88, -11, 45, 86, -65, 19, -43}, new byte[]{-79, -16, 27, -99, 76, 56, -40, 118}).equals(method.getName())) {
                        if (p000.C0077.isHookCells(this.f232)) {
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            list = p000.C0008.m58(p000.C0041.getMockCells());
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = new java.util.ArrayList<>();
                        }
                        p000.C0077.log(p000.C0074.m256(new byte[]{125, 117, 86, -4, 84, -27, 97, 23, 99, 79, 80, -22, 66, -24, 85, 17, 115, 121, 87, -90, 94, -27, 100, 29, 125, 112, 108, -26, 87, -28, 100, 16, 112, 114, 66, -19, 85, -79, 7, 27, 116, 112, 73, -63, 95, -19, 72, 11, 63, 111, 76, -14, 84, -85, 26, 88}, new byte[]{17, 28, 37, -120, 49, -117, 39, 120}) + list.size());
                        return method.invoke(this.f233, list);
                    }
                }
                return method.invoke(this.f233, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                e.printStackTrace();
                if (e.getTargetException() == null) {
                    return null;
                }
                throw e.getTargetException();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޙ$Ԫ, reason: contains not printable characters */
    class C0080 implements java.lang.reflect.InvocationHandler {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f234;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.Object f235;

        C0080(java.lang.String str, java.lang.Object obj) {
            this.f234 = str;
            this.f235 = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.util.List<android.telephony.CellInfo> list;
            java.lang.Object m50;
            try {
                if (p000.C0077.isHook() && p000.C0077.isAllowMockPackage(this.f234)) {
                    java.lang.String str = "";
                    if (objArr != null) {
                        java.lang.String str2 = "";
                        for (int i = 0; i < objArr.length; i++) {
                            str2 = objArr[i] == null ? str2 + p000.C0074.m256(new byte[]{101, 36, -2, -40, 87, 112, 126, -77, 103, 125, -78}, new byte[]{11, 81, -110, -76, 119, 30, 11, -33}) : str2 + "" + objArr[i].getClass().getName() + " " + objArr[i] + p000.C0074.m256(new byte[]{-109, 117}, new byte[]{-65, 85, 23, 84, -31, -84, 8, 89});
                        }
                        str = str2;
                    }
                    p000.C0077.log(p000.C0074.m256(new byte[]{26, 59, -27, 90, 37, 49, -120, -79, 2, 58, -45, 88, 37, 49, -85, -108, 31, 33, -30, 113, 20, 113}, new byte[]{118, 82, -106, 46, 64, 95, -33, -40}) + method.getName() + p000.C0074.m256(new byte[]{92, 58, -19, 21, -7, 24, 76, 122, 25, 24, -74, 71}, new byte[]{124, 106, -116, 103, -104, 117, 41, 14}) + str);
                    if (p000.C0074.m256(new byte[]{44, 63, 102, -36, -77, 56, 83, 76, 32, 48, 81, -48, -80, 58, 92, 75, 34, 63, 66, -36, -69}, new byte[]{67, 81, 37, -71, -33, 84, 31, 35}).equals(method.getName())) {
                        java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                        if (!p000.C0077.isHookCells(this.f234) || mockCells == null || mockCells.isEmpty()) {
                            p000.C0005 c0005 = new p000.C0005();
                            android.location.Location mockLocation = p000.C0041.getMockLocation();
                            if (mockLocation != null) {
                                c0005.m44(mockLocation.getLatitude());
                                c0005.m45(mockLocation.getLongitude());
                            }
                            m50 = p000.C0008.m50(p000.C0008.m53(c0005));
                        } else {
                            p000.C0005 c00052 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            m50 = p000.C0008.m50(p000.C0008.m53(c00052));
                        }
                        objArr[0] = m50;
                        return method.invoke(this.f235, m50);
                    }
                    if (p000.C0074.m256(new byte[]{2, -97, -48, 75, -16, -109, -84, -119, 11, -98, -48, 70, -3, -111, -126, -126, 9}, new byte[]{109, -15, -109, 46, -100, -1, -27, -25}).equals(method.getName())) {
                        if (p000.C0077.isHookCells(this.f234)) {
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            list = p000.C0008.m58(p000.C0041.getMockCells());
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = new java.util.ArrayList<>();
                        }
                        p000.C0077.log(p000.C0074.m256(new byte[]{106, 5, -51, -103, -3, -90, Byte.MAX_VALUE, -109, 114, 4, -5, -101, -3, -90, 92, -74, 111, 31, -54, -78, -52, -26, 71, -108, 69, 9, -46, -127, -47, -90, 78, -107, 69, 4, -33, -125, -1, -83, 76, -64, 38, 15, -37, -127, -12, -127, 70, -100, 105, 31, -112, -98, -15, -78, 77, -38, 59, 76}, new byte[]{6, 108, -66, -19, -104, -56, 40, -6}) + list.size());
                        return method.invoke(this.f235, list);
                    }
                }
                return method.invoke(this.f235, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                e.printStackTrace();
                if (e.getTargetException() == null) {
                    return null;
                }
                throw e.getTargetException();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޙ$Ԭ, reason: contains not printable characters */
    class C0081 implements java.lang.reflect.InvocationHandler {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f236;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.Object f237;

        C0081(java.lang.String str, java.lang.Object obj) {
            this.f236 = str;
            this.f237 = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.util.List<android.telephony.CellInfo> list;
            java.lang.Object m50;
            try {
                if (p000.C0077.isHook() && p000.C0077.isAllowMockPackage(this.f236)) {
                    java.lang.String str = "";
                    if (objArr != null) {
                        java.lang.String str2 = "";
                        for (int i = 0; i < objArr.length; i++) {
                            str2 = objArr[i] == null ? str2 + p000.C0074.m256(new byte[]{-73, 6, -2, -75, 86, -9, -49, -20, -75, 95, -78}, new byte[]{-39, 115, -110, -39, 118, -103, -70, Byte.MIN_VALUE}) : str2 + "" + objArr[i].getClass().getName() + " " + objArr[i] + p000.C0074.m256(new byte[]{-127, -110}, new byte[]{-83, -78, -77, 35, -123, -127, 110, 126});
                        }
                        str = str2;
                    }
                    p000.C0077.log(p000.C0074.m256(new byte[]{-46, 10, -4, 6, -90, -109, 60, 26, -54, 11, -54, 4, -90, -109, 31, 63, -41, 16, -5, 45, -112, -45}, new byte[]{-66, 99, -113, 114, -61, -3, 107, 115}) + method.getName() + p000.C0074.m256(new byte[]{99, -1, 11, -15, -120, -82, -8, 75, 38, -35, 80, -93}, new byte[]{67, -81, 106, -125, -23, -61, -99, 63}) + str);
                    if (p000.C0074.m256(new byte[]{37, 0, 93, -39, -117, -2, 103, -110, 41, 15, 106, -43, -120, -4, 104, -107, 43, 0, 121, -39, -125}, new byte[]{74, 110, 30, -68, -25, -110, 43, -3}).equals(method.getName())) {
                        java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                        if (!p000.C0077.isHookCells(this.f236) || mockCells == null || mockCells.isEmpty()) {
                            p000.C0005 c0005 = new p000.C0005();
                            android.location.Location mockLocation = p000.C0041.getMockLocation();
                            if (mockLocation != null) {
                                c0005.m44(mockLocation.getLatitude());
                                c0005.m45(mockLocation.getLongitude());
                            }
                            m50 = p000.C0008.m50(p000.C0008.m53(c0005));
                        } else {
                            p000.C0005 c00052 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            m50 = p000.C0008.m50(p000.C0008.m53(c00052));
                        }
                        objArr[0] = m50;
                        return method.invoke(this.f237, m50);
                    }
                    if (p000.C0074.m256(new byte[]{-71, -115, -9, -12, -109, 117, 122, 31, -80, -116, -9, -7, -98, 119, 84, 20, -78}, new byte[]{-42, -29, -76, -111, -1, 25, 51, 113}).equals(method.getName())) {
                        if (p000.C0077.isHookCells(this.f236)) {
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            list = p000.C0008.m58(p000.C0041.getMockCells());
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = new java.util.ArrayList<>();
                        }
                        p000.C0077.log(p000.C0074.m256(new byte[]{3, -81, 117, -63, -42, 26, 37, 15, 27, -82, 67, -61, -42, 26, 6, 42, 6, -75, 114, -22, -32, 90, 29, 8, 44, -93, 106, -39, -6, 26, 20, 9, 44, -82, 103, -37, -44, 17, 22, 92, 79, -91, 99, -39, -33, 61, 28, 0, 0, -75, 40, -58, -38, 14, 23, 70, 82, -26}, new byte[]{111, -58, 6, -75, -77, 116, 114, 102}) + list.size());
                        return method.invoke(this.f237, list);
                    }
                }
                return method.invoke(this.f237, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                e.printStackTrace();
                if (e.getTargetException() == null) {
                    return null;
                }
                throw e.getTargetException();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
    /* renamed from: ࢡ.ޙ$Ԯ, reason: contains not printable characters */
    class C0082 implements java.lang.reflect.InvocationHandler {

        /* renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ java.lang.String f238;

        /* renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ java.lang.Object f239;

        C0082(java.lang.String str, java.lang.Object obj) {
            this.f238 = str;
            this.f239 = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.util.List<android.telephony.CellInfo> list;
            java.lang.Object m50;
            try {
                if (p000.C0077.isHook() && p000.C0077.isAllowMockPackage(this.f238)) {
                    java.lang.String str = "";
                    if (objArr != null) {
                        java.lang.String str2 = "";
                        for (int i = 0; i < objArr.length; i++) {
                            str2 = objArr[i] == null ? str2 + p000.C0074.m256(new byte[]{106, 11, -115, 62, 30, 56, 64, 116, 104, 82, -63}, new byte[]{4, 126, -31, 82, 62, 86, 53, 24}) : str2 + "" + objArr[i].getClass().getName() + " " + objArr[i] + p000.C0074.m256(new byte[]{49, -40}, new byte[]{29, -8, 37, -27, 119, 65, 67, -73});
                        }
                        str = str2;
                    }
                    p000.C0077.log(p000.C0074.m256(new byte[]{-49, -117, 80, 22, 67, 101, 118, -24, -47, -79, 86, 0, 85, 104, 66, -18, -63, -121, 81, 76}, new byte[]{-93, -30, 35, 98, 38, 11, 48, -121}) + method.getName() + p000.C0074.m256(new byte[]{-97, -94, -49, 32, -73, -108, 88, -106, -38, Byte.MIN_VALUE, -108, 114}, new byte[]{-65, -14, -82, 82, -42, -7, 61, -30}) + str);
                    if (p000.C0074.m256(new byte[]{-54, 75, -43, 126, 0, 62, 108, -127, -58, 68, -30, 114, 3, 60, 99, -122, -60, 75, -15, 126, 8}, new byte[]{-91, 37, -106, 27, 108, 82, 32, -18}).equals(method.getName())) {
                        java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                        if (!p000.C0077.isHookCells(this.f238) || mockCells == null || mockCells.isEmpty()) {
                            p000.C0005 c0005 = new p000.C0005();
                            android.location.Location mockLocation = p000.C0041.getMockLocation();
                            if (mockLocation != null) {
                                c0005.m44(mockLocation.getLatitude());
                                c0005.m45(mockLocation.getLongitude());
                            }
                            m50 = p000.C0008.m50(p000.C0008.m53(c0005));
                        } else {
                            p000.C0005 c00052 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            m50 = p000.C0008.m50(p000.C0008.m53(c00052));
                        }
                        objArr[0] = m50;
                        return method.invoke(this.f239, m50);
                    }
                    if (p000.C0074.m256(new byte[]{Byte.MIN_VALUE, -107, 122, -86, -8, 59, -92, -51, -119, -108, 122, -89, -11, 57, -118, -58, -117}, new byte[]{-17, -5, 57, -49, -108, 87, -19, -93}).equals(method.getName())) {
                        if (p000.C0077.isHookCells(this.f238)) {
                            p000.C0008.m52(p000.C0041.getMockLocation());
                            list = p000.C0008.m58(p000.C0041.getMockCells());
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = new java.util.ArrayList<>();
                        }
                        p000.C0077.log(p000.C0074.m256(new byte[]{36, -89, -8, -81, 6, 125, 64, -43, 58, -99, -2, -71, 16, 112, 116, -45, 42, -85, -7, -11, 12, 125, 69, -33, 36, -94, -62, -75, 5, 124, 69, -46, 41, -96, -20, -66, 7, 41, 38, -39, 45, -94, -25, -110, 13, 117, 105, -55, 102, -67, -30, -95, 6, 51, 59, -102}, new byte[]{72, -50, -117, -37, 99, 19, 6, -70}) + list.size());
                        return method.invoke(this.f239, list);
                    }
                }
                return method.invoke(this.f239, objArr);
            } catch (java.lang.reflect.InvocationTargetException e) {
                e.printStackTrace();
                if (e.getTargetException() == null) {
                    return null;
                }
                throw e.getTargetException();
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    private static void addIPhoneStateListener(java.lang.Object obj, int i) {
        if (obj == null) {
            return;
        }
        try {
            java.lang.String obj2 = obj.toString();
            if (i == 0) {
                f229.remove(obj2);
            } else {
                f229.remove(obj2);
                f229.put(obj2, new java.lang.ref.WeakReference<>(obj));
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void callbackMockCellLocation(android.location.Location location, java.util.List<p000.C0005> list) {
        java.lang.String[] strArr;
        try {
            synchronized (f229) {
                strArr = (java.lang.String[]) f229.keySet().toArray(new java.lang.String[0]);
            }
            for (java.lang.String str : strArr) {
                java.lang.ref.WeakReference<java.lang.Object> weakReference = f229.get(str);
                if (weakReference != null) {
                    java.lang.Object obj = weakReference.get();
                    if (obj == null) {
                        f229.remove(str);
                    } else {
                        try {
                            try {
                                android.os.Bundle bundle = new android.os.Bundle();
                                if (list == null || list.isEmpty()) {
                                    bundle.putInt("cid", Integer.MAX_VALUE);
                                    bundle.putInt("lac", Integer.MAX_VALUE);
                                    bundle.putInt("psc", Integer.MAX_VALUE);
                                    bundle.putInt("baseStationId", Integer.MAX_VALUE);
                                    bundle.putInt("systemId", Integer.MAX_VALUE);
                                    bundle.putInt("networkId", Integer.MAX_VALUE);
                                } else {
                                    p000.C0005 c0005 = list.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, list.size())));
                                    bundle.putInt("cid", (int) c0005.m35());
                                    bundle.putInt("lac", c0005.m36());
                                    bundle.putInt("psc", new java.security.SecureRandom().nextInt(256));
                                    bundle.putInt("baseStationId", (int) c0005.m35());
                                    bundle.putInt("systemId", c0005.m40());
                                    bundle.putInt("networkId", c0005.m36());
                                }
                                if (location != null) {
                                    bundle.putInt("baseStationLatitude", (int) (location.getLatitude() * 14400.0d));
                                    bundle.putInt("baseStationLongitude", (int) (location.getLongitude() * 14400.0d));
                                }
                                bundle.putBoolean("empty", false);
                                bundle.putBoolean("emptyParcel", false);
                                bundle.putInt("mFlags", 1536);
                                bundle.putBoolean("parcelled", false);
                                bundle.putInt("size", 0);
                                p000.C0010.m68(obj, f227, "onCellLocationChanged", new java.lang.Class[]{android.os.Bundle.class}, new java.lang.Object[]{bundle});
                            } catch (java.lang.Throwable th) {
                                th.printStackTrace();
                            }
                            try {
                                p000.C0008.m52(p000.C0041.getMockLocation());
                                java.lang.Object m58 = p000.C0008.m58(list);
                                if (m58 == null) {
                                    m58 = new java.util.ArrayList();
                                }
                                p000.C0010.m68(obj, f227, "onCellInfoChanged", new java.lang.Class[]{java.util.List.class}, new java.lang.Object[]{m58});
                            } catch (java.lang.Throwable th2) {
                                th2.printStackTrace();
                            }
                        } catch (java.lang.reflect.InvocationTargetException e) {
                            e.printStackTrace();
                            f229.remove(str);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th3) {
            th3.printStackTrace();
        }
    }

    public static java.lang.Class forName(java.lang.ClassLoader classLoader, java.lang.String str) {
        return p000.C0010.m64(str, true, classLoader);
    }

    public static void hook(java.lang.ClassLoader classLoader) {
        if (f228) {
            return;
        }
        f227 = p000.C0010.m64("com.android.internal.telephony.IPhoneStateListener", true, classLoader);
        try {
            java.lang.Class forName = forName(classLoader, "com.android.server.TelephonyRegistry");
            java.lang.Class cls = java.lang.Void.TYPE;
            java.lang.Class forName2 = forName(classLoader, "com.android.internal.telephony.IPhoneStateListener");
            java.lang.Class cls2 = java.lang.Integer.TYPE;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            com.lerist.lib.lhooker.LHooker.m7(forName, "listen", cls, new java.lang.Class[]{java.lang.String.class, forName2, cls2, cls3}, p000.C0077.class, "listen", "listen_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.TelephonyRegistry"), "listenForSubscriber", cls, new java.lang.Class[]{cls2, java.lang.String.class, forName(classLoader, "com.android.internal.telephony.IPhoneStateListener"), cls2, cls3}, p000.C0077.class, "listenForSubscriber", "listenForSubscriber_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.TelephonyRegistry"), "listenForSubscriber", cls, new java.lang.Class[]{cls2, java.lang.String.class, java.lang.String.class, forName(classLoader, "com.android.internal.telephony.IPhoneStateListener"), cls2, cls3}, p000.C0077.class, "listenForSubscriber_R", "listenForSubscriber_R_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.TelephonyRegistry"), "listenWithEventList", cls, new java.lang.Class[]{cls2, java.lang.String.class, java.lang.String.class, forName(classLoader, "com.android.internal.telephony.IPhoneStateListener"), int[].class, cls3}, p000.C0077.class, "listenWithEventList_S", "listenWithEventList_S_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.server.TelephonyRegistry"), "listenWithEventList", cls, new java.lang.Class[]{cls3, cls3, cls2, java.lang.String.class, java.lang.String.class, forName(classLoader, "com.android.internal.telephony.IPhoneStateListener"), int[].class, cls3}, p000.C0077.class, "listenWithEventList_T", "listenWithEventList_T_bak");
            f228 = true;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isAllowMockPackage(java.lang.String str) {
        return p000.C0003.m27(p000.C0041.getSafeApps(), str, "a") || p000.C0003.m27(p000.C0041.getSafeApps(), str, "e");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isHook() {
        boolean z = p000.C0041.isMocking() && !p000.C0004.m33();
        log("isHook: " + z, "uid: " + android.os.Binder.getCallingUid(), "pid: " + android.os.Binder.getCallingPid());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isHookCells(java.lang.String str) {
        return p000.C0003.m27(p000.C0041.getSafeApps(), str, "e");
    }

    public static void listen(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, int i, boolean z) {
        log("listen: ", obj, str, obj2, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
        if (!isHook() || !isAllowMockPackage(str)) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, str, obj2, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, str, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), new java.lang.Class[]{f227}, new p000.C0077.C0078(str, obj2)), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void listenForSubscriber(java.lang.Object obj, int i, java.lang.String str, java.lang.Object obj2, int i2, boolean z) {
        log("listenForSubscriber: ", obj, java.lang.Integer.valueOf(i), str, obj2, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
        if (!isHook() || !isAllowMockPackage(str)) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, obj2, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), new java.lang.Class[]{f227}, new p000.C0077.C0079(str, obj2)), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void listenForSubscriber_R(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int i2, boolean z) {
        log("listenForSubscriber_R: ", obj, java.lang.Integer.valueOf(i), str, obj2, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (!isHook() || !isAllowMockPackage(str)) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, str2, obj2, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, str2, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), new java.lang.Class[]{f227}, new p000.C0077.C0082(str, obj2)), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void listenForSubscriber_R_bak(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int i2, boolean z) {
        try {
            log("listenForSubscriber_R_bak", obj);
            listenForSubscriber_R_copy(obj, i, str, str2, obj2, i2, z);
            new java.lang.StringBuffer().append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenForSubscriber_R_copy(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int i2, boolean z) {
        try {
            log("listenForSubscriber_R_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenForSubscriber_bak(java.lang.Object obj, int i, java.lang.String str, java.lang.Object obj2, int i2, boolean z) {
        try {
            log("listenForSubscriber_bak", obj);
            listenForSubscriber_copy(obj, i, str, obj2, i2, z);
            new java.lang.StringBuffer().append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenForSubscriber_copy(java.lang.Object obj, int i, java.lang.String str, java.lang.Object obj2, int i2, boolean z) {
        try {
            log("listenForSubscriber_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenWithEventList_S(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int[] iArr, boolean z) {
        log("listenWithEventList_S: ", obj, java.lang.Integer.valueOf(i), str, obj2, iArr, java.lang.Boolean.valueOf(z));
        if (!isHook() || !isAllowMockPackage(str)) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, str2, obj2, iArr, java.lang.Boolean.valueOf(z));
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, str2, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), new java.lang.Class[]{f227}, new p000.C0077.C0081(str, obj2)), iArr, java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void listenWithEventList_S_bak(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int[] iArr, boolean z) {
        log("listenWithEventList_S_bak: ", obj, java.lang.Integer.valueOf(i), str, obj2, iArr, java.lang.Boolean.valueOf(z));
        listenWithEventList_S_copy(obj, i, str, str2, obj2, iArr, z);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenWithEventList_S_copy(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int[] iArr, boolean z) {
        log("listenWithEventList_S_copy: ", obj, java.lang.Integer.valueOf(i), str, obj2, iArr, java.lang.Boolean.valueOf(z));
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenWithEventList_T(java.lang.Object obj, boolean z, boolean z2, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int[] iArr, boolean z3) {
        log("listenWithEventList_T: ", obj, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Integer.valueOf(i), str, obj2, iArr, java.lang.Boolean.valueOf(z3));
        if (!isHook() || !isAllowMockPackage(str)) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Integer.valueOf(i), str, str2, obj2, iArr, java.lang.Boolean.valueOf(z3));
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Integer.valueOf(i), str, str2, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), new java.lang.Class[]{f227}, new p000.C0077.C0080(str, obj2)), iArr, java.lang.Boolean.valueOf(z3));
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void listenWithEventList_T_bak(java.lang.Object obj, boolean z, boolean z2, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int[] iArr, boolean z3) {
        log("listenWithEventList_T_bak: ", obj, java.lang.Integer.valueOf(i), str, obj2, iArr, java.lang.Boolean.valueOf(z3));
        listenWithEventList_T_copy(obj, z, z2, i, str, str2, obj2, iArr, z3);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listenWithEventList_T_copy(java.lang.Object obj, boolean z, boolean z2, int i, java.lang.String str, java.lang.String str2, java.lang.Object obj2, int[] iArr, boolean z3) {
        log("listenWithEventList_T_copy: ", obj, java.lang.Integer.valueOf(i), str, obj2, iArr, java.lang.Boolean.valueOf(z3));
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listen_bak(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, int i, boolean z) {
        try {
            log("listen_bak", obj);
            listen_copy(obj, str, obj2, i, z);
            new java.lang.StringBuffer().append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void listen_copy(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, int i, boolean z) {
        try {
            log("listen_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellInfo(java.lang.Object obj, java.util.List<android.telephony.CellInfo> list) {
        log("notifyCellInfo: ", obj);
        if (!isHook()) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, list);
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            p000.C0008.m52(p000.C0041.getMockLocation());
            java.util.List<android.telephony.CellInfo> m58 = p000.C0008.m58(p000.C0041.getMockCells());
            if (m58 == null || m58.isEmpty()) {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.util.Collections.EMPTY_LIST);
            } else {
                com.lerist.lib.lhooker.LHooker.m3(obj, m58);
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void notifyCellInfoForSubscriber(java.lang.Object obj, int i, java.util.List<android.telephony.CellInfo> list) {
        log("notifyCellInfoForSubscriber: ", obj, java.lang.Integer.valueOf(i));
        if (!isHook()) {
            try {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), list);
                return;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        try {
            p000.C0008.m52(p000.C0041.getMockLocation());
            java.util.List<android.telephony.CellInfo> m58 = p000.C0008.m58(p000.C0041.getMockCells());
            if (m58 == null || m58.isEmpty()) {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), java.util.Collections.EMPTY_LIST);
            } else {
                com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), m58);
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void notifyCellInfoForSubscriber_bak(java.lang.Object obj, int i, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("notifyCellInfoForSubscriber_bak", obj);
            notifyCellInfoForSubscriber_copy(obj, i, list);
            new java.lang.StringBuffer().append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellInfoForSubscriber_copy(java.lang.Object obj, int i, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("notifyCellInfoForSubscriber_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellInfo_bak(java.lang.Object obj, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("notifyCellInfo_bak", obj, list);
            notifyCellInfo_copy(obj, list);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellInfo_copy(java.lang.Object obj, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("notifyCellInfo_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellLocation(java.lang.Object obj, android.os.Bundle bundle) {
        log("notifyCellLocation: ", obj, bundle);
        try {
            if (isHook()) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                if (mockCells == null || mockCells.isEmpty()) {
                    bundle2.putInt("cid", Integer.MAX_VALUE);
                    bundle2.putInt("lac", Integer.MAX_VALUE);
                    bundle2.putInt("psc", Integer.MAX_VALUE);
                    bundle2.putInt("baseStationId", Integer.MAX_VALUE);
                    bundle2.putInt("systemId", Integer.MAX_VALUE);
                    bundle2.putInt("networkId", Integer.MAX_VALUE);
                } else {
                    p000.C0005 c0005 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                    bundle2.putInt("cid", (int) c0005.m35());
                    bundle2.putInt("lac", c0005.m36());
                    bundle2.putInt("psc", c0005.m43());
                    bundle2.putInt("baseStationId", (int) c0005.m35());
                    bundle2.putInt("systemId", c0005.m40());
                    bundle2.putInt("networkId", c0005.m36());
                }
                android.location.Location mockLocation = p000.C0041.getMockLocation();
                if (mockLocation != null) {
                    bundle2.putInt("baseStationLatitude", (int) (mockLocation.getLatitude() * 14400.0d));
                    bundle2.putInt("baseStationLongitude", (int) (mockLocation.getLongitude() * 14400.0d));
                }
                bundle2.putBoolean("empty", false);
                bundle2.putBoolean("emptyParcel", false);
                bundle2.putInt("mFlags", 1536);
                bundle2.putBoolean("parcelled", false);
                bundle2.putInt("size", 0);
                try {
                    com.lerist.lib.lhooker.LHooker.m3(obj, bundle2);
                    return;
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, bundle);
        } catch (java.lang.Throwable th3) {
            th3.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellLocationForSubscriber(java.lang.Object obj, int i, android.os.Bundle bundle) {
        log("notifyCellLocationForSubscriber: ", obj, java.lang.Integer.valueOf(i), bundle);
        try {
            if (isHook()) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
                if (mockCells == null || mockCells.isEmpty()) {
                    bundle2.putInt("cid", Integer.MAX_VALUE);
                    bundle2.putInt("lac", Integer.MAX_VALUE);
                    bundle2.putInt("psc", Integer.MAX_VALUE);
                    bundle2.putInt("baseStationId", Integer.MAX_VALUE);
                    bundle2.putInt("systemId", Integer.MAX_VALUE);
                    bundle2.putInt("networkId", Integer.MAX_VALUE);
                } else {
                    p000.C0005 c0005 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                    bundle2.putInt("cid", (int) c0005.m35());
                    bundle2.putInt("lac", c0005.m36());
                    bundle2.putInt("psc", c0005.m43());
                    bundle2.putInt("baseStationId", (int) c0005.m35());
                    bundle2.putInt("systemId", c0005.m40());
                    bundle2.putInt("networkId", c0005.m36());
                }
                android.location.Location mockLocation = p000.C0041.getMockLocation();
                if (mockLocation != null) {
                    bundle2.putInt("baseStationLatitude", (int) (mockLocation.getLatitude() * 14400.0d));
                    bundle2.putInt("baseStationLongitude", (int) (mockLocation.getLongitude() * 14400.0d));
                }
                bundle2.putBoolean("empty", false);
                bundle2.putBoolean("emptyParcel", false);
                bundle2.putInt("mFlags", 1536);
                bundle2.putBoolean("parcelled", false);
                bundle2.putInt("size", 0);
                try {
                    com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), bundle2);
                    return;
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
        try {
            com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), bundle);
        } catch (java.lang.Throwable th3) {
            th3.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellLocationForSubscriber_bak(java.lang.Object obj, int i, android.os.Bundle bundle) {
        try {
            log("notifyCellLocationForSubscriber_bak", obj);
            notifyCellLocationForSubscriber_copy(obj, i, bundle);
            new java.lang.StringBuffer().append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellLocationForSubscriber_copy(java.lang.Object obj, int i, android.os.Bundle bundle) {
        try {
            log("notifyCellLocationForSubscriber_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void notifyCellLocation_bak(java.lang.Object obj, android.os.Bundle bundle) {
        try {
            log("notifyCellLocation_bak", obj);
            notifyCellLocation_copy(obj, bundle);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void notifyCellLocation_copy(java.lang.Object obj, android.os.Bundle bundle) {
        try {
            log("notifyCellLocation_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void onCellInfoChanged(java.lang.Object obj, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("onCellInfoChanged", obj);
            try {
                new java.lang.StringBuffer().append("#" + obj);
                for (int i = 0; i < 100; i += 2) {
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (!isHook()) {
                com.lerist.lib.lhooker.LHooker.m3(obj, list);
                return;
            }
            p000.C0008.m52(p000.C0041.getMockLocation());
            java.lang.Object m58 = p000.C0008.m58(p000.C0041.getMockCells());
            if (m58 == null) {
                m58 = new java.util.ArrayList();
            }
            com.lerist.lib.lhooker.LHooker.m3(obj, m58);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onCellInfoChanged_bak(java.lang.Object obj, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("onCellInfoChanged_bak", obj);
            onCellInfoChanged_copy(obj, list);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void onCellInfoChanged_copy(java.lang.Object obj, java.util.List<android.telephony.CellInfo> list) {
        try {
            log("onCellInfoChanged_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void onCellLocationChanged(java.lang.Object obj, android.os.Bundle bundle) {
        try {
            log("onCellLocationChanged", obj);
            if (!isHook()) {
                com.lerist.lib.lhooker.LHooker.m3(obj, bundle);
                return;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.List<p000.C0005> mockCells = p000.C0041.getMockCells();
            if (mockCells == null || mockCells.isEmpty()) {
                bundle2.putInt("cid", Integer.MAX_VALUE);
                bundle2.putInt("lac", Integer.MAX_VALUE);
                bundle2.putInt("psc", Integer.MAX_VALUE);
                bundle2.putInt("baseStationId", Integer.MAX_VALUE);
                bundle2.putInt("systemId", Integer.MAX_VALUE);
                bundle2.putInt("networkId", Integer.MAX_VALUE);
            } else {
                p000.C0005 c0005 = mockCells.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, mockCells.size())));
                bundle2.putInt("cid", (int) c0005.m35());
                bundle2.putInt("lac", c0005.m36());
                bundle2.putInt("psc", c0005.m43());
                bundle2.putInt("baseStationId", (int) c0005.m35());
                bundle2.putInt("systemId", c0005.m40());
                bundle2.putInt("networkId", c0005.m36());
            }
            android.location.Location mockLocation = p000.C0041.getMockLocation();
            if (mockLocation != null) {
                bundle2.putInt("baseStationLatitude", (int) (mockLocation.getLatitude() * 14400.0d));
                bundle2.putInt("baseStationLongitude", (int) (mockLocation.getLongitude() * 14400.0d));
            }
            bundle2.putBoolean("empty", false);
            bundle2.putBoolean("emptyParcel", false);
            bundle2.putInt("mFlags", 1536);
            bundle2.putBoolean("parcelled", false);
            bundle2.putInt("size", 0);
            com.lerist.lib.lhooker.LHooker.m3(obj, bundle2);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onCellLocationChanged_bak(java.lang.Object obj, android.os.Bundle bundle) {
        try {
            log("onCellLocationChanged_bak", obj);
            onCellLocationChanged_copy(obj, bundle);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void onCellLocationChanged_copy(java.lang.Object obj, android.os.Bundle bundle) {
        try {
            log("onCellLocationChanged_copy", obj);
            new java.lang.StringBuffer().append("#");
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(java.lang.Object... objArr) {
    }
}
