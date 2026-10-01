/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btk {
    private static final int dzn = -1074181947;
    private static final int dt_2 = -625223760;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qxzcicxxrp0vpw;

    private btk() {
    }

    public static int rht_4(int n) {
        int n2 = Integer.rotateLeft(n ^ dzn ^ (int)System.nanoTime(), 9) * 924167989;
        int n3 = (n2 ^ n2 >>> 12) * -45159145;
        int n4 = (n3 ^ n3 >>> 7) * 35113073;
        return n4 ^ n4 >>> 16;
    }

    public static int thta_3(int n, int n2) {
        int n3 = n2 - n ^ 0xD0989CD1 ^ dt_2;
        int n4 = (n3 ^ n3 >>> 8) * 977985051;
        int n5 = (n4 ^ n4 >>> 12) * 1273099731;
        return n5 ^ n5 >>> 13;
    }

    public static boolean zfn_2(int n, int n2) {
        return ((btk.thta_3(n, n2) + Thread.currentThread().hashCode()) * 461111941 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

