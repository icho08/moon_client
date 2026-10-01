/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqs_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qt5mdgxuby3f;

    private bqs_2() {
    }

    public static int sbz_4(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 4) * -135426521;
        int n3 = (n2 ^ n2 >>> 14) * 779017535;
        int n4 = (n3 ^ n3 >>> 8) * 1859834287;
        return n4 ^ n4 >>> 15;
    }

    public static int saa_7(int n, int n2) {
        int n3 = Integer.rotateRight(n * 474314339 ^ n2, 17);
        int n4 = (n3 ^ n3 >>> 17) * -558744335;
        int n5 = (n4 ^ n4 >>> 11) * 2094679023;
        return n5 ^ n5 >>> 13;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

