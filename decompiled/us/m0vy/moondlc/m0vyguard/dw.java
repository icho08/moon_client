/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dw {
    private static final int khqn = 636989845;
    private static final int dhdhdh = -1505988737;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mu4x2079ho30v;

    private dw() {
    }

    private static int ztn_2(int n) {
        int n2 = n ^ khqn;
        int n3 = (n2 ^ n2 >>> 9) * 439238201;
        int n4 = (n3 ^ n3 >>> 13) * -708232985;
        return (n4 ^ n4 >>> 12) + dhdhdh;
    }

    public static int sjm_2(int n) {
        return dw.ztn_2(Integer.rotateLeft(n ^ khqn ^ (int)System.nanoTime(), 9) * -1564898891);
    }

    public static int ttm(int n, int n2) {
        return dw.ztn_2(Integer.rotateLeft(n ^ n2, 15) * 602341437 ^ dhdhdh);
    }

    public static boolean thnkh(int n, int n2) {
        return ((dw.ttm(n, n2) + Thread.currentThread().hashCode()) * -41463081 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

