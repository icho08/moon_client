/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sn_2 {
    private static final int sbz_2 = -830733418;
    private static final int sagh = -60635455;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int i2s8b9r0;

    private sn_2() {
    }

    public static int tan_3(int n) {
        int n2 = (n ^ sbz_2 ^ sn_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * 1232586005;
        int n4 = (n3 ^ n3 >>> 10) * 1040388521;
        return n4 ^ n4 >>> 13;
    }

    public static int dhms(int n, int n2) {
        int n3 = n2 - n ^ 0x3086271F ^ sagh;
        int n4 = (n3 ^ n3 >>> 14) * -1806744225;
        int n5 = (n4 ^ n4 >>> 10) * 451945975;
        return n5 ^ n5 >>> 22;
    }

    public static boolean stgh(int n, int n2) {
        return ((sn_2.dhms(n, n2) ^ (int)System.nanoTime()) * -1706541955 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

