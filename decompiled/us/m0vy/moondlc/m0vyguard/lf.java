/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class lf {
    private static final int dhkha = 1115951494;
    private static final int shad_2 = 1069416345;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int kcfxdy022v;

    private lf() {
    }

    public static int dhddh(int n) {
        int n2 = Integer.rotateRight(n * 1900767321 - System.identityHashCode(lf.class), 12) ^ dhkha;
        int n3 = (n2 ^ n2 >>> 17) * 1919487883;
        int n4 = (n3 ^ n3 >>> 9) * 473780403;
        return n4 ^ n4 >>> 15 ^ shad_2;
    }

    public static int ttw_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * -1643719175 + shad_2 ^ dhkha;
        int n4 = (n3 ^ n3 >>> 16) * 643130029;
        int n5 = (n4 ^ n4 >>> 10) * -304859767;
        return n5 ^ n5 >>> 12 ^ shad_2;
    }

    public static boolean zjr(int n, int n2) {
        return ((lf.ttw_2(n, n2) + Thread.currentThread().hashCode()) * -1393425593 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

