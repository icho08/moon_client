/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdkh_2 {
    private static final int jld = 899959523;
    private static final int hsdh_2 = -1295238504;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mh4wq4ih;

    private bdkh_2() {
    }

    public static int shfb(int n) {
        int n2 = n ^ System.identityHashCode(bdkh_2.class) ^ (int)Thread.currentThread().getId() * -1523341853 ^ jld;
        int n3 = (n2 ^ n2 >>> 16) * 1575682021;
        int n4 = (n3 ^ n3 >>> 14) * -1443535829;
        return n4 ^ n4 >>> 17 ^ hsdh_2;
    }

    public static int jmkh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x15)) + hsdh_2 ^ jld;
        int n4 = (n3 ^ n3 >>> 12) * 1839225845;
        int n5 = (n4 ^ n4 >>> 14) * 1349059907;
        return n5 ^ n5 >>> 21 ^ hsdh_2;
    }

    public static boolean rshs_2(int n, int n2) {
        return ((bdkh_2.jmkh(n, n2) ^ (int)System.nanoTime()) * 1125394883 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

