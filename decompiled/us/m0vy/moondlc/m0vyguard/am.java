/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class am {
    private static final int tmb = 1091094539;
    private static final int hhh_3 = 1023844141;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oy21ts5xeu0;

    private am() {
    }

    public static int dam(int n) {
        int n2 = Integer.rotateLeft(n ^ tmb ^ (int)System.nanoTime(), 22) * 2048621741;
        int n3 = (n2 ^ n2 >>> 13) * -2079986853;
        int n4 = (n3 ^ n3 >>> 8) * 1180638883;
        return n4 ^ n4 >>> 16;
    }

    public static int rmkh(int n, int n2) {
        int n3 = n2 - n ^ 0x879D7697 ^ hhh_3;
        int n4 = (n3 ^ n3 >>> 11) * -1072447145;
        int n5 = (n4 ^ n4 >>> 17) * 1600366461;
        return n5 ^ n5 >>> 13;
    }

    public static boolean shqs(int n, int n2) {
        return ((am.rmkh(n, n2) + Thread.currentThread().hashCode()) * 2073156873 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

