/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bath {
    private static final int khsd_2 = 473844754;
    private static final int trw = 1574745442;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fvvnxym9n;

    private bath() {
    }

    public static int zlz_2(int n) {
        int n2 = n ^ System.identityHashCode(bath.class) ^ (int)Thread.currentThread().getId() * 161821515 ^ khsd_2;
        int n3 = (n2 ^ n2 >>> 16) * 1580915515;
        int n4 = (n3 ^ n3 >>> 9) * 1982981161;
        return n4 ^ n4 >>> 17 ^ trw;
    }

    public static int hkhd_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 19) * -67872655 + trw ^ khsd_2;
        int n4 = (n3 ^ n3 >>> 16) * 1749496711;
        int n5 = (n4 ^ n4 >>> 14) * -589124427;
        return n5 ^ n5 >>> 18 ^ trw;
    }

    public static boolean bhgh(int n, int n2) {
        return ((bath.hkhd_2(n, n2) ^ (int)System.nanoTime()) * 396822613 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

