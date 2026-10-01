/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkw {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vpzckzdu;

    private bkw() {
    }

    public static int hst_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 21) * -2115666149;
        int n3 = (n2 ^ n2 >>> 13) * 1628258147;
        int n4 = (n3 ^ n3 >>> 10) * -359393707;
        return n4 ^ n4 >>> 21;
    }

    public static int jsha(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 17) * -1344662337;
        int n4 = (n3 ^ n3 >>> 14) * 2106093789;
        int n5 = (n4 ^ n4 >>> 9) * 404751105;
        return n5 ^ n5 >>> 12;
    }

    public static boolean ghja_2(int n, int n2) {
        return ((bkw.jsha(n, n2) + Thread.currentThread().hashCode()) * -399544961 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

