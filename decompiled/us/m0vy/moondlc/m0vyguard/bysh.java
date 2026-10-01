/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bysh {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int b44wavxa;

    private bysh() {
    }

    public static int khsj(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 318120299;
        int n3 = (n2 ^ n2 >>> 13) * -797608749;
        int n4 = (n3 ^ n3 >>> 13) * 1032742021;
        return n4 ^ n4 >>> 15;
    }

    public static int tra_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1306635495 ^ n2, 8);
        int n4 = (n3 ^ n3 >>> 11) * 731594355;
        int n5 = (n4 ^ n4 >>> 11) * 123702121;
        return n5 ^ n5 >>> 16;
    }

    public static boolean bqt(int n, int n2) {
        return ((bysh.tra_2(n, n2) + Thread.currentThread().hashCode()) * -2035705511 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

