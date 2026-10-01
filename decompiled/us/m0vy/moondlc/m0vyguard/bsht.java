/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsht {
    private static final int sdhgh = -989286165;
    private static final int rfn = 467276142;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int q231d79qag;

    private bsht() {
    }

    private static int tda_3(int n) {
        int n2 = n ^ sdhgh;
        int n3 = (n2 ^ n2 >>> 12) * -1074959025;
        int n4 = (n3 ^ n3 >>> 11) * 1917244139;
        return (n4 ^ n4 >>> 15) + rfn;
    }

    public static int ada(int n) {
        return bsht.tda_3(Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * -1392975651 ^ sdhgh);
    }

    public static int zts(int n, int n2) {
        return bsht.tda_3(Integer.rotateRight(n * 439883373 ^ n2, 19) + rfn ^ sdhgh);
    }

    public static boolean thmr(int n, int n2) {
        return ((bsht.zts(n, n2) + Thread.currentThread().hashCode()) * -625007997 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

