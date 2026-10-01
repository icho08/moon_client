/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zkh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eo1rvkmsxd7yw0;

    private zkh() {
    }

    public static int thh_5(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 3) * 1978335057;
        int n3 = (n2 ^ n2 >>> 14) * -1226102627;
        int n4 = (n3 ^ n3 >>> 12) * -1562286059;
        return n4 ^ n4 >>> 19;
    }

    public static int aghth(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 8);
        int n4 = (n3 ^ n3 >>> 9) * -594116587;
        int n5 = (n4 ^ n4 >>> 11) * -356028263;
        return n5 ^ n5 >>> 12;
    }

    public static boolean hsgh(int n, int n2) {
        return ((zkh.aghth(n, n2) + Thread.currentThread().hashCode()) * -1694744209 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

