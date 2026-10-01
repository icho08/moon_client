/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkha {
    private static final int khrn = -293828049;
    private static final int hdh_2 = 986017178;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ulvp987on0sz;

    private bkha() {
    }

    public static int jtd(int n) {
        int n2 = n ^ khrn ^ System.identityHashCode(bkha.class) ^ (int)Thread.currentThread().getId() * -957136595;
        int n3 = (n2 ^ n2 >>> 15) * 1342590015;
        int n4 = (n3 ^ n3 >>> 7) * -1042161515;
        return n4 ^ n4 >>> 15;
    }

    public static int rhz_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1120686001 ^ n2, 12) ^ hdh_2;
        int n4 = (n3 ^ n3 >>> 16) * 1764386157;
        int n5 = (n4 ^ n4 >>> 9) * 1556411309;
        return n5 ^ n5 >>> 22;
    }

    public static boolean khash(int n, int n2) {
        return ((bkha.rhz_2(n, n2) ^ (int)System.nanoTime()) * 1976909961 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

