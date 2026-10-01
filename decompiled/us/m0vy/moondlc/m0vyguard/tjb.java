/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjb {
    private static final int hqm = -861733268;
    private static final int khjq = 607197450;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int or8ej1bz09m;

    private tjb() {
    }

    public static int khdt_4(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * 2113113913 ^ hqm;
        int n3 = (n2 ^ n2 >>> 16) * -1484888939;
        int n4 = (n3 ^ n3 >>> 14) * 1480737469;
        return n4 ^ n4 >>> 22 ^ khjq;
    }

    public static int dhtj_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1177640875 ^ n2, 7) + khjq ^ hqm;
        int n4 = (n3 ^ n3 >>> 16) * -1232145495;
        int n5 = (n4 ^ n4 >>> 18) * 1438003475;
        return n5 ^ n5 >>> 22 ^ khjq;
    }

    public static boolean zath_3(int n, int n2) {
        return ((tjb.dhtj_2(n, n2) + Thread.currentThread().hashCode()) * 607264145 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

