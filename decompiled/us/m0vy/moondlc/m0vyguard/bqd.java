/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqd {
    private static final int tzkh_2 = 1714352230;
    private static final int bzh_2 = -498298250;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sqz0k2l08ldccc;

    private bqd() {
    }

    public static int zzn_4(int n) {
        int n2 = (n ^ bqd.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ tzkh_2;
        int n3 = (n2 ^ n2 >>> 16) * -2100426385;
        int n4 = (n3 ^ n3 >>> 7) * -51243393;
        return n4 ^ n4 >>> 22 ^ bzh_2;
    }

    public static int swt_3(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 8) * 675105379 + bzh_2 ^ tzkh_2;
        int n4 = (n3 ^ n3 >>> 11) * 1765728821;
        int n5 = (n4 ^ n4 >>> 12) * 236794995;
        return n5 ^ n5 >>> 15 ^ bzh_2;
    }

    public static boolean shdth(int n, int n2) {
        return ((bqd.swt_3(n, n2) ^ (int)System.nanoTime()) * 1980366621 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

