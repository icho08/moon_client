/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthf {
    private static final int mr = -779772096;
    private static final int ths = -1522494297;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int f7tgvuszxgr4;

    private tthf() {
    }

    public static int hss_4(int n) {
        int n2 = Integer.rotateRight(n * -1467839517 - System.identityHashCode(tthf.class), 21) ^ mr;
        int n3 = (n2 ^ n2 >>> 12) * 1988342309;
        int n4 = (n3 ^ n3 >>> 8) * -380402277;
        return n4 ^ n4 >>> 15 ^ ths;
    }

    public static int dshr_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * -1065911539 + ths ^ mr;
        int n4 = (n3 ^ n3 >>> 8) * 1278636727;
        int n5 = (n4 ^ n4 >>> 10) * -1129325625;
        return n5 ^ n5 >>> 20 ^ ths;
    }

    public static boolean rrr(int n, int n2) {
        return ((tthf.dshr_2(n, n2) + Thread.currentThread().hashCode()) * -1670787989 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

