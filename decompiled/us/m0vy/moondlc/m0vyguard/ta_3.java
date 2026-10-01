/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ta_3 {
    private static final int dshb = 1456013113;
    private static final int bsd_4 = 1063434346;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gpeck7nzimp;

    private ta_3() {
    }

    public static int ahj(int n) {
        int n2 = Integer.rotateLeft(n ^ dshb ^ (int)System.nanoTime(), 18) * -586497489;
        int n3 = (n2 ^ n2 >>> 16) * -940302363;
        int n4 = (n3 ^ n3 >>> 11) * -2022012715;
        return n4 ^ n4 >>> 20;
    }

    public static int ghhf(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 6) ^ bsd_4;
        int n4 = (n3 ^ n3 >>> 10) * -1965831499;
        int n5 = (n4 ^ n4 >>> 11) * -611799933;
        return n5 ^ n5 >>> 13;
    }

    public static boolean bkr(int n, int n2) {
        return ((ta_3.ghhf(n, n2) + Thread.currentThread().hashCode()) * 1800322785 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

