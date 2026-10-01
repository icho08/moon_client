/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bbt {
    private static final int dhhh_2 = 781121073;
    private static final int dhth_5 = 2138659441;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hdlwbf1co3jl3d;

    private bbt() {
    }

    private static int thaa_3(int n) {
        int n2 = n ^ dhhh_2;
        int n3 = (n2 ^ n2 >>> 13) * 533338079;
        int n4 = (n3 ^ n3 >>> 20) * -38168085;
        return (n4 ^ n4 >>> 13) + dhth_5;
    }

    public static int hnr(int n) {
        return bbt.thaa_3((n ^ bbt.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhhh_2);
    }

    public static int dhy_3(int n, int n2) {
        return bbt.thaa_3((n + n2 ^ Integer.rotateLeft(n, 13)) + dhth_5 ^ dhhh_2);
    }

    public static boolean zzz_7(int n, int n2) {
        return ((bbt.dhy_3(n, n2) ^ (int)System.nanoTime()) * -84216829 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

