/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwy {
    private static final int bthq = -762180582;
    private static final int hqy = 775984462;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bq91o13ubf02;

    private bwy() {
    }

    private static int dbkh_2(int n) {
        int n2 = n ^ bthq;
        int n3 = (n2 ^ n2 >>> 15) * -662157223;
        int n4 = (n3 ^ n3 >>> 15) * -841214953;
        return (n4 ^ n4 >>> 22) + hqy;
    }

    public static int tsgh(int n) {
        return bwy.dbkh_2((n ^ bthq ^ bwy.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int ztm_3(int n, int n2) {
        return bwy.dbkh_2(Integer.rotateRight(n * -701900867 ^ n2, 10) ^ hqy);
    }

    public static boolean yn(int n, int n2) {
        return ((bwy.ztm_3(n, n2) ^ (int)System.nanoTime()) * -1991136547 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

