/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ha_3 {
    private static final int tqr = 1743821886;
    private static final int zna_2 = -151949708;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dsgvshzncw4n;

    private ha_3() {
    }

    public static int shshz_2(int n) {
        int n2 = n ^ System.identityHashCode(ha_3.class) ^ (int)Thread.currentThread().getId() * -923340969 ^ tqr;
        int n3 = (n2 ^ n2 >>> 16) * 628672363;
        int n4 = (n3 ^ n3 >>> 9) * 1711542617;
        return n4 ^ n4 >>> 14 ^ zna_2;
    }

    public static int dsd_3(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xA)) + zna_2 ^ tqr;
        int n4 = (n3 ^ n3 >>> 17) * 222627683;
        int n5 = (n4 ^ n4 >>> 16) * 1990631969;
        return n5 ^ n5 >>> 23 ^ zna_2;
    }

    public static boolean bhh_2(int n, int n2) {
        return ((ha_3.dsd_3(n, n2) ^ (int)System.nanoTime()) * -176983319 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

