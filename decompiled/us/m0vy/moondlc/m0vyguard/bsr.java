/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsr {
    private static final int dshl = -824646203;
    private static final int fdh = 1339152190;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mjadobjn9gl;

    private bsr() {
    }

    public static int sfd(int n) {
        int n2 = Integer.rotateRight(n * 486740519 - System.identityHashCode(bsr.class), 6) ^ dshl;
        int n3 = (n2 ^ n2 >>> 13) * 447371241;
        int n4 = (n3 ^ n3 >>> 8) * 771331173;
        return n4 ^ n4 >>> 20 ^ fdh;
    }

    public static int thghy(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 10) * 389134473 + fdh ^ dshl;
        int n4 = (n3 ^ n3 >>> 14) * 1303913315;
        int n5 = (n4 ^ n4 >>> 13) * -1608346491;
        return n5 ^ n5 >>> 12 ^ fdh;
    }

    public static boolean zlh(int n, int n2) {
        return ((bsr.thghy(n, n2) + Thread.currentThread().hashCode()) * -229648839 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

