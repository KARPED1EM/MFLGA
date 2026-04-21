package p000;

/* compiled from: r8-map-id-a492ef758048e0794931870fab0e70ac3c92287e1e4273d145c91153ae09fa83 */
/* renamed from: ࢡ.ֈ, reason: contains not printable characters */
/* loaded from: D:\Files\Develop Projects\Andriod\FxxkLocation\device_dump\inject_out\classes.dex */
public class C0008 {

    /* renamed from: Ϳ, reason: contains not printable characters */
    private static android.location.Location f38;

    /* renamed from: Ϳ, reason: contains not printable characters */
    public static int m49(double d, double d2, double d3, double d4, double d5) {
        if (d5 <= 0.0d) {
            return -110;
        }
        if (m51(d, d2, d3, d4) > d5) {
            return -110;
        }
        return (int) ((java.lang.Math.log10(d5 / r4) * 20.0d) - 110.0d);
    }

    /* renamed from: Ԩ, reason: contains not printable characters */
    public static android.telephony.CellIdentity m50(android.telephony.CellInfo cellInfo) {
        if (cellInfo instanceof android.telephony.CellInfoGsm) {
            return ((android.telephony.CellInfoGsm) cellInfo).getCellIdentity();
        }
        if (cellInfo instanceof android.telephony.CellInfoCdma) {
            return ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity();
        }
        if (cellInfo instanceof android.telephony.CellInfoLte) {
            return ((android.telephony.CellInfoLte) cellInfo).getCellIdentity();
        }
        if (cellInfo instanceof android.telephony.CellInfoWcdma) {
            return ((android.telephony.CellInfoWcdma) cellInfo).getCellIdentity();
        }
        return null;
    }

    /* renamed from: ԩ, reason: contains not printable characters */
    private static double m51(double d, double d2, double d3, double d4) {
        double radians = java.lang.Math.toRadians(d);
        double radians2 = java.lang.Math.toRadians(d3);
        double pow = java.lang.Math.pow(java.lang.Math.sin(java.lang.Math.toRadians(d3 - d) / 2.0d), 2.0d) + (java.lang.Math.cos(radians) * java.lang.Math.cos(radians2) * java.lang.Math.pow(java.lang.Math.sin(java.lang.Math.toRadians(d4 - d2) / 2.0d), 2.0d));
        return java.lang.Math.atan2(java.lang.Math.sqrt(pow), java.lang.Math.sqrt(1.0d - pow)) * 2.0d * 6371000.0d;
    }

    /* renamed from: Ԫ, reason: contains not printable characters */
    public static void m52(android.location.Location location) {
        f38 = location;
    }

    /* renamed from: ԫ, reason: contains not printable characters */
    public static android.telephony.CellInfo m53(p000.C0005 c0005) {
        android.location.Location location;
        if (c0005 == null) {
            return null;
        }
        location = f38;
        java.lang.String m41 = c0005.m41();
        m41.getClass();
        switch (m41) {
            case "GSM":
                return m55(c0005, location);
            case "LTE":
                return m56(c0005, location);
            case "CDMA":
                return m54(c0005, location);
            case "UMTS":
            case "WCDM":
                return m57(c0005, location);
            default:
                return m54(c0005, location);
        }
    }

    /* renamed from: Ԭ, reason: contains not printable characters */
    private static android.telephony.CellInfoCdma m54(p000.C0005 c0005, android.location.Location location) {
        char c;
        char c2;
        char c3;
        char c4;
        android.telephony.CellIdentityCdma cellIdentityCdma;
        android.telephony.CellSignalStrengthCdma cellSignalStrength;
        try {
            int m38 = (int) (c0005.m38() * 14400.0d);
            int m37 = (int) (c0005.m37() * 14400.0d);
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.Class cls = java.lang.Integer.TYPE;
            if (i >= 29) {
                c = 3;
                c2 = 2;
                cellIdentityCdma = (android.telephony.CellIdentityCdma) p000.C0010.m70(android.telephony.CellIdentityCdma.class, new java.lang.Class[]{cls, cls, cls, cls, cls, java.lang.String.class, java.lang.String.class}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf(c0005.m40()), java.lang.Integer.valueOf((int) c0005.m35()), java.lang.Integer.valueOf(m38), java.lang.Integer.valueOf(m37), null, null});
                c3 = 1;
                c4 = 0;
            } else {
                c = 3;
                c2 = 2;
                c3 = 1;
                c4 = 0;
                cellIdentityCdma = (android.telephony.CellIdentityCdma) p000.C0010.m70(android.telephony.CellIdentityCdma.class, new java.lang.Class[]{cls, cls, cls, cls, cls}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf(c0005.m40()), java.lang.Integer.valueOf((int) c0005.m35()), java.lang.Integer.valueOf(m38), java.lang.Integer.valueOf(m37)});
            }
            java.lang.Class[] clsArr = new java.lang.Class[5];
            clsArr[c4] = cls;
            clsArr[c3] = cls;
            clsArr[c2] = cls;
            clsArr[c] = cls;
            clsArr[4] = cls;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[c4] = -64;
            objArr[c3] = -60;
            objArr[c2] = Integer.MAX_VALUE;
            objArr[c] = Integer.MAX_VALUE;
            objArr[4] = Integer.MAX_VALUE;
            android.telephony.CellSignalStrengthCdma cellSignalStrengthCdma = (android.telephony.CellSignalStrengthCdma) p000.C0010.m70(android.telephony.CellSignalStrengthCdma.class, clsArr, objArr);
            p000.C0010.m71(cellSignalStrengthCdma, android.telephony.CellSignalStrengthCdma.class, "mLevel", 4);
            android.telephony.CellInfoCdma cellInfoCdma = (android.telephony.CellInfoCdma) p000.C0010.m70(android.telephony.CellInfoCdma.class, null, null);
            p000.C0010.m71(cellInfoCdma, android.telephony.CellInfoCdma.class, "mCellIdentityCdma", cellIdentityCdma);
            p000.C0010.m71(cellInfoCdma, android.telephony.CellInfoCdma.class, "mCellSignalStrengthCdma", cellSignalStrengthCdma);
            p000.C0010.m71(cellInfoCdma, android.telephony.CellInfoCdma.class, "mRegistered", java.lang.Boolean.TRUE);
            p000.C0010.m71(cellInfoCdma, android.telephony.CellInfoCdma.class, "mTimeStamp", 171027930794631L);
            if (location != null && cellInfoCdma != null && (cellSignalStrength = cellInfoCdma.getCellSignalStrength()) != null) {
                int m49 = m49(c0005.m37(), c0005.m38(), location.getLatitude(), location.getLongitude(), c0005.m42());
                p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthCdma.class, "mRssi", java.lang.Integer.valueOf(m49));
                p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthCdma.class, "mCdmaDbm", java.lang.Integer.valueOf(m49));
            }
            return cellInfoCdma;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: ԭ, reason: contains not printable characters */
    private static android.telephony.CellInfoGsm m55(p000.C0005 c0005, android.location.Location location) {
        android.telephony.CellInfoGsm cellInfoGsm;
        android.telephony.CellSignalStrengthGsm cellSignalStrength;
        try {
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.Class cls = java.lang.Integer.TYPE;
            if (i >= 30) {
                android.telephony.CellIdentityGsm cellIdentityGsm = (android.telephony.CellIdentityGsm) p000.C0010.m70(android.telephony.CellIdentityGsm.class, new java.lang.Class[]{cls, cls, cls, cls, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.util.Collection.class}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf((int) c0005.m35()), Integer.MAX_VALUE, Integer.MAX_VALUE, java.lang.String.format("%03d", java.lang.Integer.valueOf(c0005.m39())), java.lang.String.format("%02d", java.lang.Integer.valueOf(c0005.m40())), null, null, java.util.Collections.EMPTY_LIST});
                cellInfoGsm = (android.telephony.CellInfoGsm) p000.C0010.m70(android.telephony.CellInfoGsm.class, null, null);
                p000.C0010.m71(cellInfoGsm, android.telephony.CellInfoGsm.class, "mCellIdentityGsm", cellIdentityGsm);
            } else if (i >= 29) {
                android.telephony.CellIdentityGsm cellIdentityGsm2 = (android.telephony.CellIdentityGsm) p000.C0010.m70(android.telephony.CellIdentityGsm.class, new java.lang.Class[]{cls, cls, cls, cls, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf((int) c0005.m35()), Integer.MAX_VALUE, Integer.MAX_VALUE, java.lang.String.format("%03d", java.lang.Integer.valueOf(c0005.m39())), java.lang.String.format("%02d", java.lang.Integer.valueOf(c0005.m40())), null, null});
                cellInfoGsm = (android.telephony.CellInfoGsm) p000.C0010.m70(android.telephony.CellInfoGsm.class, null, null);
                p000.C0010.m71(cellInfoGsm, android.telephony.CellInfoGsm.class, "mCellIdentityGsm", cellIdentityGsm2);
            } else {
                android.telephony.CellIdentityGsm cellIdentityGsm3 = (android.telephony.CellIdentityGsm) p000.C0010.m70(android.telephony.CellIdentityGsm.class, new java.lang.Class[]{cls, cls, cls, cls}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m39()), java.lang.Integer.valueOf(c0005.m40()), java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf((int) c0005.m35())});
                cellInfoGsm = (android.telephony.CellInfoGsm) p000.C0010.m70(android.telephony.CellInfoGsm.class, null, null);
                p000.C0010.m71(cellInfoGsm, android.telephony.CellInfoGsm.class, "mCellIdentityGsm", cellIdentityGsm3);
            }
            if (location != null && cellInfoGsm != null && (cellSignalStrength = cellInfoGsm.getCellSignalStrength()) != null) {
                p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthGsm.class, "mRssi", java.lang.Integer.valueOf(m49(c0005.m37(), c0005.m38(), location.getLatitude(), location.getLongitude(), c0005.m42())));
            }
            return cellInfoGsm;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: Ԯ, reason: contains not printable characters */
    private static android.telephony.CellInfoLte m56(p000.C0005 c0005, android.location.Location location) {
        android.telephony.CellSignalStrengthLte cellSignalStrength;
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            android.telephony.CellIdentityLte cellIdentityLte = (android.telephony.CellIdentityLte) p000.C0010.m70(android.telephony.CellIdentityLte.class, new java.lang.Class[]{cls, cls, cls, cls, cls}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m39()), java.lang.Integer.valueOf(c0005.m40()), java.lang.Integer.valueOf((int) c0005.m35()), java.lang.Integer.valueOf(c0005.m43()), java.lang.Integer.valueOf(c0005.m36())});
            android.telephony.CellInfoLte cellInfoLte = (android.telephony.CellInfoLte) p000.C0010.m70(android.telephony.CellInfoLte.class, null, null);
            p000.C0010.m71(cellInfoLte, android.telephony.CellInfoLte.class, "mCellIdentityLte", cellIdentityLte);
            if (location != null && cellInfoLte != null && (cellSignalStrength = cellInfoLte.getCellSignalStrength()) != null) {
                int m49 = m49(c0005.m37(), c0005.m38(), location.getLatitude(), location.getLongitude(), c0005.m42());
                try {
                    p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthLte.class, "mRssi", java.lang.Integer.valueOf(m49));
                } catch (java.lang.Exception unused) {
                }
                try {
                    p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthLte.class, "mRsrp", java.lang.Integer.valueOf(m49));
                } catch (java.lang.Exception unused2) {
                }
                try {
                    p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthLte.class, "mSignalStrength", java.lang.Integer.valueOf(m49));
                } catch (java.lang.Exception unused3) {
                }
            }
            return cellInfoLte;
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: ԯ, reason: contains not printable characters */
    private static android.telephony.CellInfoWcdma m57(p000.C0005 c0005, android.location.Location location) {
        java.lang.Class[] clsArr;
        android.telephony.CellIdentityWcdma cellIdentityWcdma;
        android.telephony.CellSignalStrengthWcdma cellSignalStrength;
        try {
            int i = android.os.Build.VERSION.SDK_INT;
            java.lang.Class cls = java.lang.Integer.TYPE;
            if (i >= 30) {
                try {
                    clsArr = null;
                    cellIdentityWcdma = (android.telephony.CellIdentityWcdma) p000.C0010.m70(android.telephony.CellIdentityWcdma.class, new java.lang.Class[]{cls, cls, cls, cls, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.util.Collection.class, p000.C0007.m48()}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf((int) c0005.m35()), java.lang.Integer.valueOf(c0005.m43()), Integer.MAX_VALUE, java.lang.String.format("%03d", java.lang.Integer.valueOf(c0005.m39())), java.lang.String.format("%02d", java.lang.Integer.valueOf(c0005.m40())), null, null, java.util.Collections.EMPTY_LIST, null});
                } catch (java.lang.Throwable th) {
                    th = th;
                    th.printStackTrace();
                    return null;
                }
            } else {
                clsArr = null;
                cellIdentityWcdma = i >= 29 ? (android.telephony.CellIdentityWcdma) p000.C0010.m70(android.telephony.CellIdentityWcdma.class, new java.lang.Class[]{cls, cls, cls, cls, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf((int) c0005.m35()), java.lang.Integer.valueOf(c0005.m43()), Integer.MAX_VALUE, java.lang.String.format("%03d", java.lang.Integer.valueOf(c0005.m39())), java.lang.String.format("%02d", java.lang.Integer.valueOf(c0005.m40())), null, null}) : (android.telephony.CellIdentityWcdma) p000.C0010.m70(android.telephony.CellIdentityWcdma.class, new java.lang.Class[]{cls, cls, cls, cls, cls}, new java.lang.Object[]{java.lang.Integer.valueOf(c0005.m39()), java.lang.Integer.valueOf(c0005.m40()), java.lang.Integer.valueOf(c0005.m36()), java.lang.Integer.valueOf((int) c0005.m35()), java.lang.Integer.valueOf(c0005.m43())});
            }
            java.lang.Class[] clsArr2 = clsArr;
            android.telephony.CellInfoWcdma cellInfoWcdma = (android.telephony.CellInfoWcdma) p000.C0010.m70(android.telephony.CellInfoWcdma.class, clsArr2, clsArr2);
            p000.C0010.m71(cellInfoWcdma, android.telephony.CellInfoWcdma.class, "mCellIdentityWcdma", cellIdentityWcdma);
            if (location != null && cellInfoWcdma != null && (cellSignalStrength = cellInfoWcdma.getCellSignalStrength()) != null) {
                int m49 = m49(c0005.m37(), c0005.m38(), location.getLatitude(), location.getLongitude(), c0005.m42());
                p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthWcdma.class, "mRssi", java.lang.Integer.valueOf(m49));
                p000.C0010.m71(cellSignalStrength, android.telephony.CellSignalStrengthWcdma.class, "mRscp", java.lang.Integer.valueOf(m49));
            }
            return cellInfoWcdma;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ՠ, reason: contains not printable characters */
    public static java.util.List<android.telephony.CellInfo> m58(java.util.List<p000.C0005> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p000.C0005> it = list.iterator();
        while (it.hasNext()) {
            android.telephony.CellInfo m53 = m53(it.next());
            if (m53 != null) {
                arrayList.add(m53);
            }
        }
        return arrayList;
    }

    /* renamed from: ֈ, reason: contains not printable characters */
    public static android.telephony.NeighboringCellInfo m59(p000.C0005 c0005) {
        if (c0005 == null) {
            return null;
        }
        try {
            android.telephony.NeighboringCellInfo neighboringCellInfo = (android.telephony.NeighboringCellInfo) p000.C0010.m70(android.telephony.NeighboringCellInfo.class, null, null);
            p000.C0010.m71(neighboringCellInfo, android.telephony.NeighboringCellInfo.class, "mRssi", -46);
            p000.C0010.m71(neighboringCellInfo, android.telephony.NeighboringCellInfo.class, "mCid", java.lang.Integer.valueOf((int) c0005.m35()));
            p000.C0010.m71(neighboringCellInfo, android.telephony.NeighboringCellInfo.class, "mLac", java.lang.Integer.valueOf(c0005.m36()));
            p000.C0010.m71(neighboringCellInfo, android.telephony.NeighboringCellInfo.class, "mPsc", java.lang.Integer.valueOf(c0005.m43()));
            p000.C0010.m71(neighboringCellInfo, android.telephony.NeighboringCellInfo.class, "mNetworkType", 3);
            return neighboringCellInfo;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ֏, reason: contains not printable characters */
    public static java.util.List<android.telephony.NeighboringCellInfo> m60(java.util.List<p000.C0005> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p000.C0005> it = list.iterator();
        while (it.hasNext()) {
            android.telephony.NeighboringCellInfo m59 = m59(it.next());
            if (m59 != null) {
                arrayList.add(m59);
            }
        }
        return arrayList;
    }
}
