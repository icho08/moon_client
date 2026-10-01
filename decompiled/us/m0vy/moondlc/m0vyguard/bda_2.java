/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bda_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int knqahvtng5;

    private bda_2() {
    }

    public static int jsht_2(int n) {
        int n2 = (n ^ bda_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 15) * -64735895;
        int n4 = (n3 ^ n3 >>> 9) * 1532054533;
        return n4 ^ n4 >>> 22;
    }

    public static int khma(int n, int n2) {
        int n3 = Integer.rotateRight(n * -2049920747 ^ n2, 11);
        int n4 = (n3 ^ n3 >>> 12) * 474391191;
        int n5 = (n4 ^ n4 >>> 9) * 35264069;
        return n5 ^ n5 >>> 14;
    }

    public static boolean thqdh(int n, int n2) {
        return ((bda_2.khma(n, n2) ^ (int)System.nanoTime()) * -592982279 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

