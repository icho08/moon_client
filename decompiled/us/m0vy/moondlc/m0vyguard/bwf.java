/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwf {
    private static final int shlt = -1470032442;
    private static final int ddr_2 = 1701988300;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fkan4wt9;

    private bwf() {
    }

    public static int tkhw_2(int n) {
        int n2 = (n ^ bwf.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ shlt;
        int n3 = (n2 ^ n2 >>> 13) * -1784154557;
        int n4 = (n3 ^ n3 >>> 14) * 307086817;
        return n4 ^ n4 >>> 16 ^ ddr_2;
    }

    public static int jtsh(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * 1544974547 + ddr_2 ^ shlt;
        int n4 = (n3 ^ n3 >>> 8) * -357982069;
        int n5 = (n4 ^ n4 >>> 16) * -1490012985;
        return n5 ^ n5 >>> 21 ^ ddr_2;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

