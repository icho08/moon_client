/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqm {
    private static final int dhqy = 1808165963;
    private static final int rfz_2 = 822822521;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dpmrw88f50vq;

    private bqm() {
    }

    public static int zdr(int n) {
        int n2 = Integer.rotateRight(n * 965806165 - System.identityHashCode(bqm.class), 8) ^ dhqy;
        int n3 = (n2 ^ n2 >>> 15) * 628913423;
        int n4 = (n3 ^ n3 >>> 10) * -636017429;
        return n4 ^ n4 >>> 22 ^ rfz_2;
    }

    public static int dhnkh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xF)) + rfz_2 ^ dhqy;
        int n4 = (n3 ^ n3 >>> 16) * 1258482975;
        int n5 = (n4 ^ n4 >>> 15) * -531022127;
        return n5 ^ n5 >>> 18 ^ rfz_2;
    }

    public static boolean shkn(int n, int n2) {
        return ((bqm.dhnkh(n, n2) + Thread.currentThread().hashCode()) * -1758994079 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

