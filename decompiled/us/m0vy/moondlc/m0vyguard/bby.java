/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bby {
    private static final int shdhsh = 918526219;
    private static final int jths_2 = -132595333;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int epyxlt12t9c72;

    private bby() {
    }

    public static int ghzw_2(int n) {
        int n2 = n ^ shdhsh ^ System.identityHashCode(bby.class) ^ (int)Thread.currentThread().getId() * -2090644749;
        int n3 = (n2 ^ n2 >>> 13) * 915510229;
        int n4 = (n3 ^ n3 >>> 13) * -132537981;
        return n4 ^ n4 >>> 21;
    }

    public static int dhjm(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 12) ^ jths_2;
        int n4 = (n3 ^ n3 >>> 12) * -785405883;
        int n5 = (n4 ^ n4 >>> 13) * 850582949;
        return n5 ^ n5 >>> 15;
    }

    public static boolean sah(int n, int n2) {
        return ((bby.dhjm(n, n2) ^ (int)System.nanoTime()) * 849926553 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

