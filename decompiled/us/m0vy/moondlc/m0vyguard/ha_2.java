/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ha_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q3haw0p492fns8;

    private ha_2() {
    }

    public static int dhwh(int n) {
        int n2 = n ^ System.identityHashCode(ha_2.class) ^ (int)Thread.currentThread().getId() * 812921615;
        int n3 = (n2 ^ n2 >>> 18) * 1590362697;
        int n4 = (n3 ^ n3 >>> 14) * 326239309;
        return n4 ^ n4 >>> 16;
    }

    public static int jtn_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 7);
        int n4 = (n3 ^ n3 >>> 13) * -1798809619;
        int n5 = (n4 ^ n4 >>> 13) * 71120023;
        return n5 ^ n5 >>> 17;
    }

    public static boolean rkr(int n, int n2) {
        return ((ha_2.jtn_2(n, n2) ^ (int)System.nanoTime()) * 29030031 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

