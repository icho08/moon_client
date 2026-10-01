/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhr_3 {
    private static final int wn = 2030701880;
    private static final int dyb = -874695598;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int jbqpyx5ub;

    private dhr_3() {
    }

    public static int ghtr_2(int n) {
        int n2 = Integer.rotateRight(n * 784154163 - System.identityHashCode(dhr_3.class), 13) ^ wn;
        int n3 = (n2 ^ n2 >>> 13) * 1946480907;
        int n4 = (n3 ^ n3 >>> 13) * -1945981583;
        return n4 ^ n4 >>> 22 ^ dyb;
    }

    public static int dms_3(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 10) * -1133655797 + dyb ^ wn;
        int n4 = (n3 ^ n3 >>> 12) * 1939088583;
        int n5 = (n4 ^ n4 >>> 17) * -1380192651;
        return n5 ^ n5 >>> 21 ^ dyb;
    }

    public static boolean zlk_2(int n, int n2) {
        return ((dhr_3.dms_3(n, n2) + Thread.currentThread().hashCode()) * 364513443 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

