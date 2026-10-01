/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhj {
    private static final int rjt_2 = -2108200672;
    private static final int zmw = 666644413;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vulm0jlr;

    private bkhj() {
    }

    private static int ajm(int n) {
        int n2 = n ^ rjt_2;
        int n3 = (n2 ^ n2 >>> 14) * -2072827815;
        int n4 = (n3 ^ n3 >>> 16) * 1362862935;
        return (n4 ^ n4 >>> 24) + zmw;
    }

    public static int hkf(int n) {
        return bkhj.ajm((n ^ bkhj.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ rjt_2);
    }

    public static int bzy_2(int n, int n2) {
        return bkhj.ajm((n2 - n ^ 0xC7028129) + zmw ^ rjt_2);
    }

    public static boolean hlkh(int n, int n2) {
        return ((bkhj.bzy_2(n, n2) ^ (int)System.nanoTime()) * 1081368221 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

