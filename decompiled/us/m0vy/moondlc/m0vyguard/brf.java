/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brf {
    private static final int thdhkh = -738961294;
    private static final int tdhj = 626174196;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kei23v2fxtu55;

    private brf() {
    }

    public static int abj(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * -327557455 ^ thdhkh;
        int n3 = (n2 ^ n2 >>> 11) * 256555133;
        int n4 = (n3 ^ n3 >>> 9) * -1492514249;
        return n4 ^ n4 >>> 15 ^ tdhj;
    }

    public static int ssq_4(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xA)) + tdhj ^ thdhkh;
        int n4 = (n3 ^ n3 >>> 12) * -236965673;
        int n5 = (n4 ^ n4 >>> 16) * 251706065;
        return n5 ^ n5 >>> 15 ^ tdhj;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

