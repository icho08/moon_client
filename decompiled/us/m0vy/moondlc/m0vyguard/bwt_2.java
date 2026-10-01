/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwt_2 {
    private static final int khwh = 662425740;
    private static final int thkh_5 = 627640206;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int b87rfoldp;

    private bwt_2() {
    }

    public static int rbw(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 7) * 1596445421 ^ khwh;
        int n3 = (n2 ^ n2 >>> 13) * -857525757;
        int n4 = (n3 ^ n3 >>> 13) * -113767927;
        return n4 ^ n4 >>> 13 ^ thkh_5;
    }

    public static int jrgh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x15)) + thkh_5 ^ khwh;
        int n4 = (n3 ^ n3 >>> 8) * -891579615;
        int n5 = (n4 ^ n4 >>> 17) * 330390629;
        return n5 ^ n5 >>> 14 ^ thkh_5;
    }

    public static boolean tsw_3(int n, int n2) {
        return ((bwt_2.jrgh(n, n2) + Thread.currentThread().hashCode()) * -1638299573 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

