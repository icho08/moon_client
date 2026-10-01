/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjth {
    private static final int tghkh = 1428860597;
    private static final int sdk_3 = -1005973016;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zmbf03a3;

    private bjth() {
    }

    private static int khbdh(int n) {
        int n2 = n ^ tghkh;
        int n3 = (n2 ^ n2 >>> 8) * -207901215;
        int n4 = (n3 ^ n3 >>> 12) * 1016247895;
        return (n4 ^ n4 >>> 23) + sdk_3;
    }

    public static int zby_2(int n) {
        return bjth.khbdh(Integer.rotateLeft(n ^ tghkh ^ (int)System.nanoTime(), 13) * -1302764775);
    }

    public static int zsm_4(int n, int n2) {
        return bjth.khbdh(Integer.rotateLeft(n ^ n2, 16) * 996090669 ^ sdk_3);
    }

    public static boolean rza(int n, int n2) {
        return ((bjth.zsm_4(n, n2) + Thread.currentThread().hashCode()) * 609940805 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

