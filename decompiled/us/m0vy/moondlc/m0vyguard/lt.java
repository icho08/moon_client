/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class lt {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int c5i9e62e;

    private lt() {
    }

    public static int sthh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 16) * -1719206357;
        int n3 = (n2 ^ n2 >>> 12) * 940903483;
        int n4 = (n3 ^ n3 >>> 14) * -891593587;
        return n4 ^ n4 >>> 14;
    }

    public static int tyr_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 11) * 1140021403;
        int n4 = (n3 ^ n3 >>> 17) * 2144664193;
        int n5 = (n4 ^ n4 >>> 16) * -45376307;
        return n5 ^ n5 >>> 15;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

