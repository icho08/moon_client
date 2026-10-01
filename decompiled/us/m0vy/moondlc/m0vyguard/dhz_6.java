/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhz_6 {
    private static final int ssb_2 = 593468129;
    private static final int rnb = 78734070;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xmj0asw4sxck;

    private dhz_6() {
    }

    public static int stz_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 18) * 897502941 ^ ssb_2;
        int n3 = (n2 ^ n2 >>> 11) * 1374301193;
        int n4 = (n3 ^ n3 >>> 16) * -647497149;
        return n4 ^ n4 >>> 20 ^ rnb;
    }

    public static int htkh(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1969376177 ^ n2, 11) + rnb ^ ssb_2;
        int n4 = (n3 ^ n3 >>> 9) * -1221072801;
        int n5 = (n4 ^ n4 >>> 11) * 2034253821;
        return n5 ^ n5 >>> 18 ^ rnb;
    }

    public static boolean hkhj(int n, int n2) {
        return ((dhz_6.htkh(n, n2) + Thread.currentThread().hashCode()) * -1875403415 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

