/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class blf {
    private static final int jby = 928852218;
    private static final int sdb = 797683275;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rlgyzfkeud7kji;

    private blf() {
    }

    public static int dya(int n) {
        int n2 = (n ^ jby ^ blf.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 14) * -1627349225;
        int n4 = (n3 ^ n3 >>> 14) * 977004285;
        return n4 ^ n4 >>> 14;
    }

    public static int hsh_3(int n, int n2) {
        int n3 = n2 - n ^ 0x947D23BD ^ sdb;
        int n4 = (n3 ^ n3 >>> 13) * -1279826867;
        int n5 = (n4 ^ n4 >>> 13) * 1987838309;
        return n5 ^ n5 >>> 21;
    }

    public static boolean zthz_4(int n, int n2) {
        return ((blf.hsh_3(n, n2) ^ (int)System.nanoTime()) * -737365075 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

