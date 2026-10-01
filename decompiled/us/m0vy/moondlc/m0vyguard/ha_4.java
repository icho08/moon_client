/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ha_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yrowb3430m0p2;

    private ha_4() {
    }

    public static int hkhw(int n) {
        int n2 = Integer.rotateRight(n * -205660369 - System.identityHashCode(ha_4.class), 22);
        int n3 = (n2 ^ n2 >>> 16) * 50366431;
        int n4 = (n3 ^ n3 >>> 8) * -173857973;
        return n4 ^ n4 >>> 13;
    }

    public static int zdl_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 3);
        int n4 = (n3 ^ n3 >>> 9) * -599400715;
        int n5 = (n4 ^ n4 >>> 18) * 334646305;
        return n5 ^ n5 >>> 23;
    }

    public static boolean tad_7(int n, int n2) {
        return ((ha_4.zdl_2(n, n2) + Thread.currentThread().hashCode()) * -1914804573 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

