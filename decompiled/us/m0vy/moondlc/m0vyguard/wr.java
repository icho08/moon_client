/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wr {
    private static final int rwb = 1481462763;
    private static final int dhdhk = -764546217;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int stng0kfb;

    private wr() {
    }

    private static int tlj(int n) {
        int n2 = n ^ rwb;
        int n3 = (n2 ^ n2 >>> 16) * -1019521271;
        int n4 = (n3 ^ n3 >>> 14) * 1137454055;
        return (n4 ^ n4 >>> 22) + dhdhk;
    }

    public static int aat_2(int n) {
        return wr.tlj(Integer.rotateRight((n ^ rwb) * 197524467 - System.identityHashCode(wr.class), 25));
    }

    public static int dagh(int n, int n2) {
        return wr.tlj(n + n2 ^ Integer.rotateLeft(n, 3) ^ dhdhk);
    }

    public static boolean atha_2(int n, int n2) {
        return ((wr.dagh(n, n2) + Thread.currentThread().hashCode()) * 739195563 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

