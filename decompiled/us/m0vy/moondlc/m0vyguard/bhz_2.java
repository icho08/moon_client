/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhz_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mdur89ppflbs;

    private bhz_2() {
    }

    private static int dygh_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * -299393679;
        int n4 = (n3 ^ n3 >>> 19) * -2028562701;
        return n4 ^ n4 >>> 19;
    }

    public static int shlgh(int n) {
        return bhz_2.dygh_2(n ^ System.identityHashCode(bhz_2.class) ^ (int)Thread.currentThread().getId() * 497805547);
    }

    public static int ghkht_2(int n, int n2) {
        return bhz_2.dygh_2(n2 ^ Integer.rotateLeft(n, n2 & 0x11));
    }

    public static boolean dhyh_2(int n, int n2) {
        return ((bhz_2.ghkht_2(n, n2) ^ (int)System.nanoTime()) * 1365560969 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

