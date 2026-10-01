/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zr {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int d8r1tszrq;

    private zr() {
    }

    private static int rzf_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 7) * 1917536773;
        int n4 = (n3 ^ n3 >>> 9) * 1919775075;
        return n4 ^ n4 >>> 12;
    }

    public static int zdhb_2(int n) {
        return zr.rzf_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * 1235657949);
    }

    public static int atht(int n, int n2) {
        return zr.rzf_2(n + n2 ^ Integer.rotateLeft(n, 16));
    }

    public static boolean djf_2(int n, int n2) {
        return ((zr.atht(n, n2) + Thread.currentThread().hashCode()) * 1921711947 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

