/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhq {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s89qnwo0tjx;

    private tkhq() {
    }

    private static int rlz_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 14) * 504664567;
        int n4 = (n3 ^ n3 >>> 9) * 1713235921;
        return n4 ^ n4 >>> 17;
    }

    public static int jas_2(int n) {
        return tkhq.rlz_2(n ^ System.identityHashCode(tkhq.class) ^ (int)Thread.currentThread().getId() * 429744029);
    }

    public static int zhl(int n, int n2) {
        return tkhq.rlz_2(n2 ^ Integer.rotateLeft(n, n2 & 0xA));
    }

    public static boolean afh_2(int n, int n2) {
        return ((tkhq.zhl(n, n2) ^ (int)System.nanoTime()) * 1998345629 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

