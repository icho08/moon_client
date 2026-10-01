/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwa {
    private static final int hthb = -31968280;
    private static final int khyd = 1930332642;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kuh47dq6dwz;

    private bwa() {
    }

    public static int atj(int n) {
        int n2 = Integer.rotateRight(n * 2071783601 - System.identityHashCode(bwa.class), 7) ^ hthb;
        int n3 = (n2 ^ n2 >>> 12) * -1804030633;
        int n4 = (n3 ^ n3 >>> 16) * 1443298829;
        return n4 ^ n4 >>> 14 ^ khyd;
    }

    public static int ghda_4(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 9) * -388563161 + khyd ^ hthb;
        int n4 = (n3 ^ n3 >>> 15) * -430151899;
        int n5 = (n4 ^ n4 >>> 14) * -344398353;
        return n5 ^ n5 >>> 12 ^ khyd;
    }

    public static boolean dhya_2(int n, int n2) {
        return ((bwa.ghda_4(n, n2) + Thread.currentThread().hashCode()) * -182471389 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

