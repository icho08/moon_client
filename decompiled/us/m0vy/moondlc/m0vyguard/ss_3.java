/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ss_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xjbo16zq;

    private ss_3() {
    }

    private static int sqf(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * -392007761;
        int n4 = (n3 ^ n3 >>> 14) * -236560333;
        return n4 ^ n4 >>> 24;
    }

    public static int ths_10(int n) {
        return ss_3.sqf(n ^ System.identityHashCode(ss_3.class) ^ (int)Thread.currentThread().getId() * 474810277);
    }

    public static int dthf(int n, int n2) {
        return ss_3.sqf(n2 ^ Integer.rotateLeft(n, n2 & 0x12));
    }

    public static boolean shtw_2(int n, int n2) {
        return ((ss_3.dthf(n, n2) ^ (int)System.nanoTime()) * 46089251 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

