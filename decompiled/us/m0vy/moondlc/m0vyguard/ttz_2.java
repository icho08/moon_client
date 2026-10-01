/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ttz_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int srfy1frq59g;

    private ttz_2() {
    }

    public static int dhmf(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 16) * 407374879;
        int n3 = (n2 ^ n2 >>> 13) * 360562909;
        int n4 = (n3 ^ n3 >>> 14) * -1056766151;
        return n4 ^ n4 >>> 20;
    }

    public static int jar(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xC);
        int n4 = (n3 ^ n3 >>> 13) * 313190961;
        int n5 = (n4 ^ n4 >>> 15) * 858223847;
        return n5 ^ n5 >>> 15;
    }

    public static boolean shha(int n, int n2) {
        return ((ttz_2.jar(n, n2) + Thread.currentThread().hashCode()) * -1751452233 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

