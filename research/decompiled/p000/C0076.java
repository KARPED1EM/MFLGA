package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ޘ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0076 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static boolean f210 = false;

    /* renamed from: Ԩ, reason: contains not printable characters */
    private static java.lang.ClassLoader f211 = null;

    /* renamed from: ԩ, reason: contains not printable characters */
    static int f212 = -1;

    /* renamed from: Ԫ, reason: contains not printable characters */
    static int f213 = -1;

    /* renamed from: ԫ, reason: contains not printable characters */
    static int f214 = -1;

    /* renamed from: Ԭ, reason: contains not printable characters */
    static int f215 = -1;

    /* renamed from: ԭ, reason: contains not printable characters */
    static int f216 = -1;

    /* renamed from: Ԯ, reason: contains not printable characters */
    static int f217 = -1;

    /* renamed from: ԯ, reason: contains not printable characters */
    static int f218 = -1;

    /* renamed from: ՠ, reason: contains not printable characters */
    static int f219 = -1;

    /* renamed from: ֈ, reason: contains not printable characters */
    static int f220 = -1;

    /* renamed from: ֏, reason: contains not printable characters */
    static int f221 = -1;

    /* renamed from: ׯ, reason: contains not printable characters */
    static int f222 = -1;

    /* renamed from: ؠ, reason: contains not printable characters */
    private static int f223 = -1;

    /* renamed from: ހ, reason: contains not printable characters */
    private static int f224 = -1;

    /* renamed from: ށ, reason: contains not printable characters */
    private static int f225 = -1;

    /* renamed from: ނ, reason: contains not printable characters */
    private static int f226 = -1;

    static int checkNull(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        return ((java.lang.Integer) obj).intValue();
    }

    public static java.lang.Class forName(java.lang.ClassLoader classLoader, java.lang.String str) {
        return p000.C0010.m64(str, true, classLoader);
    }

    public static int getActivePhoneType(java.lang.Object obj) {
        log("getActivePhoneType: ", obj);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            return 2;
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 1;
        }
    }

    public static int getActivePhoneTypeForSlot(java.lang.Object obj, int i) {
        log("getActivePhoneTypeForSlot: ", obj, java.lang.Integer.valueOf(i));
        if (isHook()) {
            return 2;
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i))).intValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 1;
        }
    }

    public static int getActivePhoneTypeForSlot_bak(java.lang.Object obj, int i) {
        try {
            log("getActivePhoneTypeForSlot_bak: ", obj);
            java.lang.System.currentTimeMillis();
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
        return getActivePhoneTypeForSlot_copy(obj, i);
    }

    public static int getActivePhoneTypeForSlot_copy(java.lang.Object obj, int i) {
        try {
            log("getActivePhoneTypeForSlot_copy: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getActivePhoneType_bak(java.lang.Object obj) {
        try {
            log("getActivePhoneType_bak: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return getActivePhoneType_copy(obj);
    }

    public static int getActivePhoneType_copy(java.lang.Object obj) {
        try {
            log("getActivePhoneType_copy: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.Object obj, java.lang.String str) {
        log("getAllCellInfo: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        if (!isHook()) {
            try {
                java.util.List<android.telephony.CellInfo> list = (java.util.List) com.lerist.lib.lhooker.LHooker.m3(obj, str);
                return list == null ? new java.util.ArrayList() : list;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return new java.util.ArrayList();
            }
        }
        try {
            if (isHookCells()) {
                java.lang.System.currentTimeMillis();
                java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
                p000.C0008.m52(p000.C0051.m174().m177());
                java.util.List<android.telephony.CellInfo> m58 = p000.C0008.m58(m176);
                if (m58 != null && !m58.isEmpty()) {
                    log("mockAllCellInfo: ", m58);
                    return m58;
                }
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
        return new java.util.ArrayList();
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_M(java.lang.Object obj) {
        log("getAllCellInfo_M: ", obj, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        if (!isHook()) {
            try {
                java.util.List<android.telephony.CellInfo> list = (java.util.List) com.lerist.lib.lhooker.LHooker.m3(obj, new java.lang.Object[0]);
                return list == null ? new java.util.ArrayList() : list;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return new java.util.ArrayList();
            }
        }
        try {
            if (isHookCells()) {
                java.lang.System.currentTimeMillis();
                java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
                p000.C0008.m52(p000.C0051.m174().m177());
                java.util.List<android.telephony.CellInfo> m58 = p000.C0008.m58(m176);
                if (m58 != null && !m58.isEmpty()) {
                    log("mockAllCellInfo: ", m58);
                    return m58;
                }
            }
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
        return new java.util.ArrayList();
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_M_bak(java.lang.Object obj) {
        try {
            log("getAllCellInfo_M_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getAllCellInfo_M_copy(obj);
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_M_copy(java.lang.Object obj) {
        try {
            log("getAllCellInfo_M_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_R(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        log("getAllCellInfo_R: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            try {
                if (isHookCells()) {
                    java.lang.System.currentTimeMillis();
                    java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
                    p000.C0008.m52(p000.C0051.m174().m177());
                    java.util.List<android.telephony.CellInfo> m58 = p000.C0008.m58(m176);
                    if (m58 != null && !m58.isEmpty()) {
                        log("mockAllCellInfo: ", m58);
                        return m58;
                    }
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            return new java.util.ArrayList();
        }
        try {
            java.util.List<android.telephony.CellInfo> list = (java.util.List) com.lerist.lib.lhooker.LHooker.m3(obj, str, str2);
            return list == null ? new java.util.ArrayList() : list;
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            try {
                new java.lang.StringBuffer().append("#" + obj);
                for (int i2 = 0; i2 < 100; i2 += 2) {
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            return new java.util.ArrayList();
        }
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_R_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getAllCellInfo_R_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getAllCellInfo_R_copy(obj, str, str2);
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_R_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getAllCellInfo_R_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_bak(java.lang.Object obj, java.lang.String str) {
        try {
            log("getAllCellInfo_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getAllCellInfo_copy(obj, str);
    }

    public static java.util.List<android.telephony.CellInfo> getAllCellInfo_copy(java.lang.Object obj, java.lang.String str) {
        try {
            log("getAllCellInfo_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static android.os.Bundle getCellLocation(java.lang.Object obj, java.lang.String str) {
        log("getCellLocation: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (!isHook()) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) com.lerist.lib.lhooker.LHooker.m3(obj, str);
                log("srcCellLocation: " + bundle);
                return bundle;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (!isHookCells() || m176 == null || m176.isEmpty()) {
                bundle2.putInt("cid", Integer.MAX_VALUE);
                bundle2.putInt("lac", Integer.MAX_VALUE);
                bundle2.putInt("psc", Integer.MAX_VALUE);
                bundle2.putInt("baseStationId", Integer.MAX_VALUE);
                bundle2.putInt("systemId", Integer.MAX_VALUE);
                bundle2.putInt("networkId", Integer.MAX_VALUE);
            } else {
                p000.C0005 c0005 = m176.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, m176.size())));
                bundle2.putInt("cid", (int) c0005.m35());
                bundle2.putInt("lac", c0005.m36());
                bundle2.putInt("psc", c0005.m43());
                bundle2.putInt("baseStationId", (int) c0005.m35());
                bundle2.putInt("systemId", c0005.m40());
                bundle2.putInt("networkId", c0005.m36());
            }
            android.location.Location m177 = p000.C0051.m174().m177();
            if (m177 != null) {
                bundle2.putInt("baseStationLatitude", (int) (m177.getLatitude() * 14400.0d));
                bundle2.putInt("baseStationLongitude", (int) (m177.getLongitude() * 14400.0d));
            }
            bundle2.putBoolean("empty", false);
            bundle2.putBoolean("emptyParcel", false);
            bundle2.putInt("mFlags", 1536);
            bundle2.putBoolean("parcelled", false);
            bundle2.putInt("size", 0);
            log("mockCellLocation: " + bundle2);
            return bundle2;
        } catch (java.lang.Throwable th2) {
            log("getCellLocation.err: " + th2.getMessage());
            th2.printStackTrace();
            return null;
        }
    }

    public static android.os.Bundle getCellLocation_M(java.lang.Object obj) {
        log("getCellLocation_M: ", obj, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (!isHook()) {
            try {
                android.os.Bundle bundle = (android.os.Bundle) com.lerist.lib.lhooker.LHooker.m3(obj, new java.lang.Object[0]);
                log("srcCellLocation: " + bundle);
                return bundle;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        try {
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (!isHookCells() || m176 == null || m176.isEmpty()) {
                bundle2.putInt("cid", Integer.MAX_VALUE);
                bundle2.putInt("lac", Integer.MAX_VALUE);
                bundle2.putInt("psc", Integer.MAX_VALUE);
                bundle2.putInt("baseStationId", Integer.MAX_VALUE);
                bundle2.putInt("systemId", Integer.MAX_VALUE);
                bundle2.putInt("networkId", Integer.MAX_VALUE);
            } else {
                p000.C0005 c0005 = m176.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, m176.size())));
                bundle2.putInt("cid", (int) c0005.m35());
                bundle2.putInt("lac", c0005.m36());
                bundle2.putInt("psc", c0005.m43());
                bundle2.putInt("baseStationId", (int) c0005.m35());
                bundle2.putInt("systemId", c0005.m40());
                bundle2.putInt("networkId", c0005.m36());
            }
            android.location.Location m177 = p000.C0051.m174().m177();
            if (m177 != null) {
                bundle2.putInt("baseStationLatitude", (int) (m177.getLatitude() * 14400.0d));
                bundle2.putInt("baseStationLongitude", (int) (m177.getLongitude() * 14400.0d));
            }
            bundle2.putBoolean("empty", false);
            bundle2.putBoolean("emptyParcel", false);
            bundle2.putInt("mFlags", 1536);
            bundle2.putBoolean("parcelled", false);
            bundle2.putInt("size", 0);
            log("mockCellLocation: " + bundle2);
            return bundle2;
        } catch (java.lang.Throwable th2) {
            log("getCellLocation.err: " + th2.getMessage());
            th2.printStackTrace();
            return null;
        }
    }

    public static android.os.Bundle getCellLocation_M_bak(java.lang.Object obj) {
        try {
            log("getCellLocation_M_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getCellLocation_M_copy(obj);
    }

    public static android.os.Bundle getCellLocation_M_copy(java.lang.Object obj) {
        try {
            log("getCellLocation_M_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static android.telephony.CellIdentity getCellLocation_R(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        log("getCellLocation_R: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        if (!isHook()) {
            try {
                android.telephony.CellIdentity cellIdentity = (android.telephony.CellIdentity) com.lerist.lib.lhooker.LHooker.m3(obj, str, str2);
                log("srcCellLocation: " + cellIdentity);
                return cellIdentity;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        try {
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (isHookCells() && m176 != null && !m176.isEmpty()) {
                android.telephony.CellIdentity m50 = p000.C0008.m50(p000.C0008.m53(m176.get(new java.security.SecureRandom().nextInt(java.lang.Math.min(3, m176.size())))));
                if (m50 != null) {
                    return m50;
                }
                java.util.Iterator<p000.C0005> it = m176.iterator();
                while (it.hasNext()) {
                    android.telephony.CellIdentity m502 = p000.C0008.m50(p000.C0008.m53(it.next()));
                    if (m502 != null) {
                        return m502;
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th2) {
            log("getCellLocation_R.err: " + th2.getMessage());
            th2.printStackTrace();
            return null;
        }
    }

    public static android.telephony.CellIdentity getCellLocation_R_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getCellLocation_R_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getCellLocation_R_copy(obj, str, str2);
    }

    public static android.telephony.CellIdentity getCellLocation_R_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getCellLocation_R_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static android.os.Bundle getCellLocation_bak(java.lang.Object obj, java.lang.String str) {
        try {
            log("getCellLocation_bak", obj);
            try {
                new java.lang.StringBuffer().append("#" + obj);
                for (int i = 0; i < 100; i += 2) {
                }
                for (int i2 = 0; i2 < 100; i2 += 2) {
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getCellLocation_copy(obj, str);
    }

    public static android.os.Bundle getCellLocation_copy(java.lang.Object obj, java.lang.String str) {
        try {
            log("getCellLocation_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int getDataNetworkType(java.lang.Object obj) {
        log("getDataNetworkType: ", obj);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            return 4;
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int getDataNetworkTypeForSubscriber(java.lang.Object obj, int i, java.lang.String str) {
        log("getDataNetworkTypeForSubscriber: ", obj, str);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            return 4;
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str)).intValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int getDataNetworkTypeForSubscriber_R(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2) {
        log("getDataNetworkTypeForSubscriber_R: ", obj, str);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            return 4;
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str, str2)).intValue();
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    public static int getDataNetworkTypeForSubscriber_R_bak(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2) {
        try {
            log("getDataNetworkTypeForSubscriber_R_bak: ", obj);
            java.lang.System.currentTimeMillis();
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
        return getDataNetworkTypeForSubscriber_R_copy(obj, i, str, str2);
    }

    public static int getDataNetworkTypeForSubscriber_R_copy(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2) {
        try {
            log("getDataNetworkTypeForSubscriber_R_copy: ", obj);
            java.lang.System.currentTimeMillis();
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
        return 0;
    }

    public static int getDataNetworkTypeForSubscriber_bak(java.lang.Object obj, int i, java.lang.String str) {
        try {
            log("getDataNetworkTypeForSubscriber_bak: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return getDataNetworkTypeForSubscriber_copy(obj, i, str);
    }

    public static int getDataNetworkTypeForSubscriber_copy(java.lang.Object obj, int i, java.lang.String str) {
        try {
            log("getDataNetworkTypeForSubscriber_copy: ", obj);
            java.lang.System.currentTimeMillis();
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
        return 0;
    }

    public static int getDataNetworkType_bak(java.lang.Object obj) {
        try {
            log("getDataNetworkType_bak: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getDataNetworkType_copy(obj);
    }

    public static int getDataNetworkType_copy(java.lang.Object obj) {
        try {
            log("getDataNetworkType_copy: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.Object obj, java.lang.String str) {
        java.util.List<android.telephony.NeighboringCellInfo> m60;
        log("getNeighboringCellInfo: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            try {
                if (isHookCells() && (m60 = p000.C0008.m60(p000.C0051.m174().m176())) != null) {
                    if (!m60.isEmpty()) {
                        return m60;
                    }
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            return new java.util.ArrayList();
        }
        try {
            java.util.List<android.telephony.NeighboringCellInfo> list = (java.util.List) com.lerist.lib.lhooker.LHooker.m3(obj, str);
            log("srcNeighboringCellInfo: ", list);
            return list;
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            try {
                new java.lang.StringBuffer().append("#" + obj);
                for (int i2 = 0; i2 < 100; i2 += 2) {
                }
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
            return new java.util.ArrayList();
        }
    }

    public static java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo_R(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        java.util.List<android.telephony.NeighboringCellInfo> m60;
        log("getNeighboringCellInfo_R: ", obj, str, android.os.Binder.getCallingPid() + ":" + android.os.Binder.getCallingUid());
        if (isHook()) {
            try {
                if (isHookCells() && (m60 = p000.C0008.m60(p000.C0051.m174().m176())) != null && !m60.isEmpty()) {
                    log("mockNeighboringCellInfo: ", m60);
                    return m60;
                }
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
            return new java.util.ArrayList();
        }
        try {
            java.util.List<android.telephony.NeighboringCellInfo> list = (java.util.List) com.lerist.lib.lhooker.LHooker.m3(obj, str, str2);
            log("srcNeighboringCellInfo: ", list);
            return list;
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
            try {
                new java.lang.StringBuffer().append("#" + obj);
                for (int i = 0; i < 100; i += 2) {
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return new java.util.ArrayList();
        }
    }

    public static java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo_R_bak(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getNeighboringCellInfo_R_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return getNeighboringCellInfo_R_copy(obj, str, str2);
    }

    public static java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo_R_copy(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        try {
            log("getNeighboringCellInfo_R_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo_bak(java.lang.Object obj, java.lang.String str) {
        try {
            log("getNeighboringCellInfo_bak", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return getNeighboringCellInfo_copy(obj, str);
    }

    public static java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo_copy(java.lang.Object obj, java.lang.String str) {
        try {
            log("getNeighboringCellInfo_copy", obj);
            java.util.List<p000.C0005> m176 = p000.C0051.m174().m176();
            if (m176 != null) {
                m176.size();
            }
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
            return null;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int getNetworkType(java.lang.Object obj) {
        log("getNetworkType: ", obj);
        if (isHook()) {
            return 4;
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int getNetworkTypeForSubscriber(java.lang.Object obj, int i, java.lang.String str) {
        log("getNetworkTypeForSubscriber: ", obj, str);
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (isHook()) {
            return 4;
        }
        try {
            return ((java.lang.Integer) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), str)).intValue();
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[LOOP:0: B:12:0x004d->B:14:0x0051, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getNetworkTypeForSubscriber_R(java.lang.Object r5, int r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "getNetworkTypeForSubscriber_R: "
            r1[r2] = r3
            r3 = 1
            r1[r3] = r5
            r4 = 2
            r1[r4] = r7
            log(r1)
            boolean r1 = isHook()
            if (r1 == 0) goto L19
            r5 = 4
            return r5
        L19:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            r0[r2] = r6     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            r0[r3] = r7     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            r0[r4] = r8     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            java.lang.Object r6 = com.lerist.lib.lhooker.LHooker.m3(r5, r0)     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            int r5 = r6.intValue()     // Catch: java.lang.Throwable -> L30 java.lang.NullPointerException -> L34
            return r5
        L30:
            r6 = move-exception
            r6.printStackTrace()
        L34:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L54
            r6.<init>()     // Catch: java.lang.Exception -> L54
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L54
            r7.<init>()     // Catch: java.lang.Exception -> L54
            java.lang.String r8 = "#"
            r7.append(r8)     // Catch: java.lang.Exception -> L54
            r7.append(r5)     // Catch: java.lang.Exception -> L54
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Exception -> L54
            r6.append(r5)     // Catch: java.lang.Exception -> L54
        L4d:
            r5 = 100
            if (r2 >= r5) goto L58
            int r2 = r2 + 2
            goto L4d
        L54:
            r5 = move-exception
            r5.printStackTrace()
        L58:
            r5 = 16
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0076.getNetworkTypeForSubscriber_R(java.lang.Object, int, java.lang.String, java.lang.String):int");
    }

    public static int getNetworkTypeForSubscriber_R_bak(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2) {
        try {
            log("getNetworkTypeForSubscriber_R_bak: ", obj);
            java.lang.System.currentTimeMillis();
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
        return getNetworkTypeForSubscriber_R_copy(obj, i, str, str2);
    }

    public static int getNetworkTypeForSubscriber_R_copy(java.lang.Object obj, int i, java.lang.String str, java.lang.String str2) {
        try {
            log("getNetworkTypeForSubscriber_R_copy: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getNetworkTypeForSubscriber_bak(java.lang.Object obj, int i, java.lang.String str) {
        try {
            log("getNetworkTypeForSubscriber_bak: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return getNetworkTypeForSubscriber_copy(obj, i, str);
    }

    public static int getNetworkTypeForSubscriber_copy(java.lang.Object obj, int i, java.lang.String str) {
        try {
            log("getNetworkTypeForSubscriber_copy: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i2 = 0; i2 < 100; i2 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getNetworkType_bak(java.lang.Object obj) {
        try {
            log("getNetworkType_bak: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return getNetworkType_copy(obj);
    }

    public static int getNetworkType_copy(java.lang.Object obj) {
        try {
            log("getNetworkType_copy: ", obj);
            java.lang.System.currentTimeMillis();
            for (int i = 0; i < 100; i += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static void getTransactionCode(java.lang.Class cls) {
        f212 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getActiveSubInfoCount"));
        f213 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getActiveSubInfoCountMax"));
        f214 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getAllSubInfoList"));
        f215 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getActiveSubscriptionInfoList"));
        f225 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getAvailableSubscriptionInfoList"));
        f226 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getAccessibleSubscriptionInfoList"));
        f216 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getActiveSubscriptionInfo"));
        f224 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getActiveSubscriptionInfoForIccId"));
        f223 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getActiveSubscriptionInfoForSimSlotIndex"));
        f217 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getPhoneId"));
        f218 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getSimStateForSlotIndex"));
        f221 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_isActiveSubId"));
        f222 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getNetworkCountryIsoForPhone"));
        f219 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getSimStateForSubscriber"));
        f220 = checkNull(p000.C0010.m65(null, cls, "TRANSACTION_getSimStateForSlotIdx"));
    }

    public static void hook(java.lang.ClassLoader classLoader) {
        f211 = classLoader;
        try {
            p000.C0072.m248(p000.C0033.m151(), "com.lerist.fakelocation", "com.android.phone.PhoneInterfaceManager");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getAllCellInfo", java.util.List.class, null, p000.C0076.class, "getAllCellInfo_M", "getAllCellInfo_M_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getCellLocation", android.os.Bundle.class, null, p000.C0076.class, "getCellLocation_M", "getCellLocation_M_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getAllCellInfo", java.util.List.class, new java.lang.Class[]{java.lang.String.class}, p000.C0076.class, "getAllCellInfo", "getAllCellInfo_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getCellLocation", android.os.Bundle.class, new java.lang.Class[]{java.lang.String.class}, p000.C0076.class, "getCellLocation", "getCellLocation_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getNeighboringCellInfo", java.util.List.class, new java.lang.Class[]{java.lang.String.class}, p000.C0076.class, "getNeighboringCellInfo", "getNeighboringCellInfo_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getAllCellInfo", java.util.List.class, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0076.class, "getAllCellInfo_R", "getAllCellInfo_R_bak");
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getCellLocation", android.telephony.CellIdentity.class, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0076.class, "getCellLocation_R", "getCellLocation_R_bak");
            }
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getNeighboringCellInfo", java.util.List.class, new java.lang.Class[]{java.lang.String.class, java.lang.String.class}, p000.C0076.class, "getNeighboringCellInfo_R", "getNeighboringCellInfo_R_bak");
            java.lang.Class forName = forName(classLoader, "com.android.phone.PhoneInterfaceManager");
            java.lang.Class cls = java.lang.Integer.TYPE;
            com.lerist.lib.lhooker.LHooker.m7(forName, "getActivePhoneTypeForSlot", cls, new java.lang.Class[]{cls}, p000.C0076.class, "getActivePhoneTypeForSlot", "getActivePhoneTypeForSlot_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getActivePhoneType", cls, new java.lang.Class[0], p000.C0076.class, "getActivePhoneType", "getActivePhoneType_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getNetworkType", cls, new java.lang.Class[0], p000.C0076.class, "getNetworkType", "getNetworkType_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getDataNetworkType", cls, new java.lang.Class[0], p000.C0076.class, "getDataNetworkType", "getDataNetworkType_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getNetworkTypeForSubscriber", cls, new java.lang.Class[]{cls, java.lang.String.class}, p000.C0076.class, "getNetworkTypeForSubscriber", "getNetworkTypeForSubscriber_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getDataNetworkTypeForSubscriber", cls, new java.lang.Class[]{cls, java.lang.String.class}, p000.C0076.class, "getDataNetworkTypeForSubscriber", "getDataNetworkTypeForSubscriber_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getNetworkTypeForSubscriber", cls, new java.lang.Class[]{cls, java.lang.String.class, java.lang.String.class}, p000.C0076.class, "getNetworkTypeForSubscriber_R", "getNetworkTypeForSubscriber_R_bak");
            com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.phone.PhoneInterfaceManager"), "getDataNetworkTypeForSubscriber", cls, new java.lang.Class[]{cls, java.lang.String.class, java.lang.String.class}, p000.C0076.class, "getDataNetworkTypeForSubscriber_R", "getDataNetworkTypeForSubscriber_R_bak");
        } catch (java.lang.RuntimeException unused) {
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        if (isHookSIMInfo()) {
            hookSIMInfo(classLoader);
        }
    }

    public static void hookSIMInfo(java.lang.ClassLoader classLoader) {
        if (f210) {
            return;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.Class cls = java.lang.Integer.TYPE;
        if (i >= 30) {
            try {
                getTransactionCode(forName(classLoader, "com.android.internal.telephony.ISub$Stub"));
                com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.internal.telephony.ISub$Stub"), "onTransact", java.lang.Boolean.TYPE, new java.lang.Class[]{cls, android.os.Parcel.class, android.os.Parcel.class, cls}, p000.C0076.class, "onTransact", "onTransact_bak");
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        } else {
            try {
                getTransactionCode(forName(classLoader, "com.android.internal.telephony.ISub$Stub"));
                com.lerist.lib.lhooker.LHooker.m7(forName(classLoader, "com.android.internal.telephony.ISub$Stub"), "onTransact", java.lang.Boolean.TYPE, new java.lang.Class[]{cls, android.os.Parcel.class, android.os.Parcel.class, cls}, p000.C0076.class, "onTransact", "onTransact_bak");
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
            }
        }
        f210 = true;
    }

    public static boolean isAllowMockPackage(java.lang.String str, java.lang.String str2) {
        java.util.List<java.lang.String> m179 = p000.C0051.m174().m179();
        if (m179 != null && !m179.isEmpty() && !p000.C0003.m27(m179, str, str2)) {
            return false;
        }
        java.util.List<java.lang.String> m175 = p000.C0051.m174().m175();
        if (m175 == null || m175.isEmpty()) {
            return true;
        }
        return m175.contains(str);
    }

    private static boolean isHook() {
        boolean z = !p000.C0004.m33() && p000.C0051.m174().m181() && (isAllowMockPackage(p000.C0004.m29(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()), "a") || isAllowMockPackage(p000.C0004.m29(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()), "e"));
        log("isHook: " + z, "uid: " + android.os.Binder.getCallingUid(), "pid: " + android.os.Binder.getCallingPid());
        if (z) {
            if (!f210 && p000.C0051.m174().m178() != null) {
                hookSIMInfo(f211);
            }
            p000.C0008.m52(p000.C0051.m174().m177());
        }
        return z;
    }

    private static boolean isHookCells() {
        return isAllowMockPackage(p000.C0004.m29(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()), "e");
    }

    private static boolean isHookSIMInfo() {
        return isHook() && p000.C0051.m174().m178() != null && isAllowMockPackage(p000.C0004.m29(android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid()), "g");
    }

    public static boolean onTransact(java.lang.Object obj, int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        java.util.List<android.telephony.SubscriptionInfo> m178;
        java.util.List<android.telephony.SubscriptionInfo> m1782;
        android.telephony.SubscriptionInfo subscriptionInfo;
        java.util.List<android.telephony.SubscriptionInfo> m1783;
        java.util.List<android.telephony.SubscriptionInfo> m1784;
        log("onTransact", obj, java.lang.Integer.valueOf(i), parcel, parcel2, java.lang.Integer.valueOf(i2));
        if (obj != null && parcel != null && parcel2 != null) {
            try {
                if (i == f221 && isHookSIMInfo()) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                }
                if (i == f218 && isHookSIMInfo()) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(5);
                    return true;
                }
                if (i == f219 && isHookSIMInfo()) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(5);
                    return true;
                }
                if (i == f220 && isHookSIMInfo()) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(5);
                    return true;
                }
                if (i == f212 && isHookSIMInfo() && (m1784 = p000.C0051.m174().m178()) != null) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readString();
                    int size = m1784.size();
                    parcel2.writeNoException();
                    parcel2.writeInt(size);
                    return true;
                }
                if ((i == f216 || i == f224 || i == f223) && android.os.Build.VERSION.SDK_INT >= 22 && isHookSIMInfo() && (m178 = p000.C0051.m174().m178()) != null) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readLong();
                    android.telephony.SubscriptionInfo subscriptionInfo2 = m178.isEmpty() ? null : m178.get(0);
                    parcel2.writeNoException();
                    parcel2.writeParcelable(subscriptionInfo2, 1);
                    return true;
                }
                if ((i == f215 || i == f214 || i == f225 || i == f226) && android.os.Build.VERSION.SDK_INT >= 22 && isHookSIMInfo() && (m1782 = p000.C0051.m174().m178()) != null) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readString();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(m1782);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                if (i == f213 && isHookSIMInfo() && (m1783 = p000.C0051.m174().m178()) != null) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    int size2 = m1783.size();
                    parcel2.writeNoException();
                    parcel2.writeInt(size2);
                    return true;
                }
                if (i == f217 && isHookSIMInfo()) {
                    parcel.enforceInterface("com.android.internal.telephony.ISub");
                    parcel.readInt();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                }
                if (i != f222 || !isHookSIMInfo()) {
                    return ((java.lang.Boolean) com.lerist.lib.lhooker.LHooker.m3(obj, java.lang.Integer.valueOf(i), parcel, parcel2, java.lang.Integer.valueOf(i2))).booleanValue();
                }
                java.lang.String str = "";
                java.util.List<android.telephony.SubscriptionInfo> m1785 = p000.C0051.m174().m178();
                if (m1785.size() > 0 && (subscriptionInfo = m1785.get(0)) != null && android.os.Build.VERSION.SDK_INT >= 22) {
                    str = subscriptionInfo.getCountryIso();
                }
                parcel.enforceInterface("com.android.internal.telephony.ISub");
                parcel.readInt();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
                try {
                    new java.lang.StringBuffer().append("#" + obj);
                    for (int i3 = 0; i3 < 100; i3 += 2) {
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public static boolean onTransact_bak(java.lang.Object obj, int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (obj == null) {
            return false;
        }
        log("onTransact_bak", obj);
        new java.util.Random().nextBoolean();
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return onTransact_copy(obj, i, parcel, parcel2, i2);
    }

    public static boolean onTransact_copy(java.lang.Object obj, int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        try {
            log("onTransact_copy", obj);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("#");
            stringBuffer.append("#");
            for (int i3 = 0; i3 < 100; i3 += 2) {
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        try {
            new java.lang.StringBuffer().append("#" + obj);
            for (int i4 = 0; i4 < 100; i4 += 2) {
            }
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    private static void log(java.lang.Object... objArr) {
    }
}
