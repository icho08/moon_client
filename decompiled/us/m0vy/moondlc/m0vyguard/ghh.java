/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ghh {
    private static final int dhgha_2 = -203083383;
    private static final int dkhf = -542338755;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bblnm949w37g2;

    private ghh() {
    }

    private static int stth(int n) {
        int n2 = n ^ dhgha_2;
        int n3 = (n2 ^ n2 >>> 13) * -1195135261;
        int n4 = (n3 ^ n3 >>> 19) * 656847931;
        return (n4 ^ n4 >>> 24) + dkhf;
    }

    public static int shrw(int n) {
        return ghh.stth((n ^ ghh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhgha_2);
    }

    public static int bah(int n, int n2) {
        return ghh.stth((n2 - n ^ 0x2F95DF25) + dkhf ^ dhgha_2);
    }

    public static boolean srt_2(int n, int n2) {
        return ((ghh.bah(n, n2) ^ (int)System.nanoTime()) * 587106065 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

