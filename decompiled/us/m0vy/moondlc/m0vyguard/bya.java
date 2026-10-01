/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bya {
    private static final int jyb = -52533687;
    private static final int khhz = -1602092796;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vnaepbajy507;

    private bya() {
    }

    private static int sthh_4(int n) {
        int n2 = n ^ jyb;
        int n3 = (n2 ^ n2 >>> 13) * -1070835481;
        int n4 = (n3 ^ n3 >>> 13) * 2065439275;
        return (n4 ^ n4 >>> 18) + khhz;
    }

    public static int ashh(int n) {
        return bya.sthh_4(n ^ System.identityHashCode(bya.class) ^ (int)Thread.currentThread().getId() * 2005547631 ^ jyb);
    }

    public static int rth_5(int n, int n2) {
        return bya.sthh_4(Integer.rotateRight(n * 787092283 ^ n2, 7) + khhz ^ jyb);
    }

    public static boolean zthd_4(int n, int n2) {
        return ((bya.rth_5(n, n2) ^ (int)System.nanoTime()) * 564159425 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

