/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zt_3 {
    private static final int sft_2 = 570299743;
    private static final int rsq = 751973670;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int pad9e5be1viyk;

    private zt_3() {
    }

    public static int bj(int n) {
        int n2 = Integer.rotateRight(n * -943872603 - System.identityHashCode(zt_3.class), 26) ^ sft_2;
        int n3 = (n2 ^ n2 >>> 14) * 48019611;
        int n4 = (n3 ^ n3 >>> 11) * -981198683;
        return n4 ^ n4 >>> 14 ^ rsq;
    }

    public static int aykh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x11)) + rsq ^ sft_2;
        int n4 = (n3 ^ n3 >>> 8) * 76606305;
        int n5 = (n4 ^ n4 >>> 16) * -1641938009;
        return n5 ^ n5 >>> 21 ^ rsq;
    }

    public static boolean jzq(int n, int n2) {
        return ((zt_3.aykh(n, n2) + Thread.currentThread().hashCode()) * 780225653 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

