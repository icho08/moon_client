/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bds_2 {
    private static final int rkt_2 = -1037350848;
    private static final int ns_2 = 769892364;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s8euyu5y;

    private bds_2() {
    }

    public static int shfdh(int n) {
        int n2 = Integer.rotateRight(n * -2060249913 - System.identityHashCode(bds_2.class), 16) ^ rkt_2;
        int n3 = (n2 ^ n2 >>> 18) * 1334577097;
        int n4 = (n3 ^ n3 >>> 12) * -1932236149;
        return n4 ^ n4 >>> 18 ^ ns_2;
    }

    public static int adth(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -1591846667 + ns_2 ^ rkt_2;
        int n4 = (n3 ^ n3 >>> 13) * -1144283775;
        int n5 = (n4 ^ n4 >>> 13) * -573068789;
        return n5 ^ n5 >>> 18 ^ ns_2;
    }

    public static boolean shba(int n, int n2) {
        return ((bds_2.adth(n, n2) + Thread.currentThread().hashCode()) * -1583680501 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

