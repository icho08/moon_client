/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthkh {
    private static final int thhkh = 1216588486;
    private static final int zrt_2 = 1690382391;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xaha9akitu9c4r;

    private tthkh() {
    }

    private static int zjm(int n) {
        int n2 = n ^ thhkh;
        int n3 = (n2 ^ n2 >>> 14) * -1645976227;
        int n4 = (n3 ^ n3 >>> 13) * -1145035031;
        return (n4 ^ n4 >>> 11) + zrt_2;
    }

    public static int ghdhr(int n) {
        return tthkh.zjm(Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * 2094056507 ^ thhkh);
    }

    public static int dl(int n, int n2) {
        return tthkh.zjm((n + n2 ^ Integer.rotateLeft(n, 3)) + zrt_2 ^ thhkh);
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

