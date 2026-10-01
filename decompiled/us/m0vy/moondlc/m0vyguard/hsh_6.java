/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hsh_6 {
    private static final int dkhn = -727590264;
    private static final int ttm = -232437451;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gjvto1jjrd;

    private hsh_6() {
    }

    public static int aws(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 10) * -1220396565 ^ dkhn;
        int n3 = (n2 ^ n2 >>> 15) * 1756520123;
        int n4 = (n3 ^ n3 >>> 10) * -803888907;
        return n4 ^ n4 >>> 13 ^ ttm;
    }

    public static int tsd_5(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 9)) + ttm ^ dkhn;
        int n4 = (n3 ^ n3 >>> 13) * -202722825;
        int n5 = (n4 ^ n4 >>> 11) * 1224726931;
        return n5 ^ n5 >>> 13 ^ ttm;
    }

    public static boolean jbgh(int n, int n2) {
        return ((hsh_6.tsd_5(n, n2) + Thread.currentThread().hashCode()) * 41539983 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

