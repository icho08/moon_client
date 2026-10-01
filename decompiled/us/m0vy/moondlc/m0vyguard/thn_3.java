/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thn_3 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kneoyxick07t;

    private thn_3() {
    }

    public static int sy_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 9) * 484411845;
        int n3 = (n2 ^ n2 >>> 15) * 964833769;
        int n4 = (n3 ^ n3 >>> 15) * 864539821;
        return n4 ^ n4 >>> 13;
    }

    public static int sj_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xF);
        int n4 = (n3 ^ n3 >>> 10) * -1060573853;
        int n5 = (n4 ^ n4 >>> 11) * 2086914953;
        return n5 ^ n5 >>> 15;
    }

    public static boolean zkgh_2(int n, int n2) {
        return ((thn_3.sj_2(n, n2) + Thread.currentThread().hashCode()) * 734969415 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

