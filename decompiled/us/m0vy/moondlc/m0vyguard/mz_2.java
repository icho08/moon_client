/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class mz_2 {
    private static final int rya = -159745402;
    private static final int jya = -483644554;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vtlnzp8m48;

    private mz_2() {
    }

    public static int thzt_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 12) * 1253714609 ^ rya;
        int n3 = (n2 ^ n2 >>> 18) * -896901309;
        int n4 = (n3 ^ n3 >>> 8) * 1990991895;
        return n4 ^ n4 >>> 21 ^ jya;
    }

    public static int tzsh_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -93556427 ^ n2, 20) + jya ^ rya;
        int n4 = (n3 ^ n3 >>> 14) * -1450904763;
        int n5 = (n4 ^ n4 >>> 10) * -797811793;
        return n5 ^ n5 >>> 18 ^ jya;
    }

    public static boolean ddhm(int n, int n2) {
        return ((mz_2.tzsh_3(n, n2) + Thread.currentThread().hashCode()) * 889628879 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

