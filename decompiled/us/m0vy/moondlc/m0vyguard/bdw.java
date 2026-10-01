/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdw {
    private static final int hat_4 = -1705984646;
    private static final int dbw = 1578797874;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dj12dmvgd45;

    private bdw() {
    }

    private static int ghba(int n) {
        int n2 = n ^ hat_4;
        int n3 = (n2 ^ n2 >>> 14) * 2128727983;
        int n4 = (n3 ^ n3 >>> 13) * 1178397765;
        return (n4 ^ n4 >>> 12) + dbw;
    }

    public static int khw(int n) {
        return bdw.ghba(n ^ System.identityHashCode(bdw.class) ^ (int)Thread.currentThread().getId() * -597527451 ^ hat_4);
    }

    public static int khry(int n, int n2) {
        return bdw.ghba(Integer.rotateRight(n * -1586967885 ^ n2, 9) + dbw ^ hat_4);
    }

    public static boolean dhfdh(int n, int n2) {
        return ((bdw.khry(n, n2) ^ (int)System.nanoTime()) * 496191465 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

