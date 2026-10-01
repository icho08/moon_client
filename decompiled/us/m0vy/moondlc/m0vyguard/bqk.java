/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqk {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gbd5ap4abji;

    private bqk() {
    }

    public static int dr(int n) {
        int n2 = n ^ System.identityHashCode(bqk.class) ^ (int)Thread.currentThread().getId() * -337512559;
        int n3 = (n2 ^ n2 >>> 12) * -906764999;
        int n4 = (n3 ^ n3 >>> 9) * -1535507755;
        return n4 ^ n4 >>> 21;
    }

    public static int dhz_4(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 9);
        int n4 = (n3 ^ n3 >>> 10) * -505961101;
        int n5 = (n4 ^ n4 >>> 14) * -1932663811;
        return n5 ^ n5 >>> 20;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

