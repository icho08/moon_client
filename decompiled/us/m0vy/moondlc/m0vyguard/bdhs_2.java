/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdhs_2 {
    private static final int shldh = -1574021789;
    private static final int mk = 619632125;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dg79de2o0;

    private bdhs_2() {
    }

    public static int fz_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * -973170739 ^ shldh;
        int n3 = (n2 ^ n2 >>> 15) * -1948453389;
        int n4 = (n3 ^ n3 >>> 13) * 69057659;
        return n4 ^ n4 >>> 22 ^ mk;
    }

    public static int shkd(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1189346439 ^ n2, 5) + mk ^ shldh;
        int n4 = (n3 ^ n3 >>> 16) * -1806742177;
        int n5 = (n4 ^ n4 >>> 11) * 867132085;
        return n5 ^ n5 >>> 15 ^ mk;
    }

    public static boolean rzn(int n, int n2) {
        return ((bdhs_2.shkd(n, n2) + Thread.currentThread().hashCode()) * -268828027 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

