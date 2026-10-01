/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnk {
    private static final int rnf = -729601396;
    private static final int dhqs_2 = 71812755;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int zx7xn389sxa;

    private bnk() {
    }

    public static int hyd_2(int n) {
        int n2 = n ^ rnf ^ System.identityHashCode(bnk.class) ^ (int)Thread.currentThread().getId() * 770483935;
        int n3 = (n2 ^ n2 >>> 16) * -392389371;
        int n4 = (n3 ^ n3 >>> 11) * -1756600045;
        return n4 ^ n4 >>> 21;
    }

    public static int ztz_4(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 7) ^ dhqs_2;
        int n4 = (n3 ^ n3 >>> 10) * 1200959747;
        int n5 = (n4 ^ n4 >>> 16) * 467655623;
        return n5 ^ n5 >>> 19;
    }

    public static boolean skhh(int n, int n2) {
        return ((bnk.ztz_4(n, n2) ^ (int)System.nanoTime()) * -131217871 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

