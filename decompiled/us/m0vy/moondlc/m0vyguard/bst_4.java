/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bst_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vvikzabm540;

    private bst_4() {
    }

    public static int bam_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * 549240799;
        int n3 = (n2 ^ n2 >>> 14) * 953094255;
        int n4 = (n3 ^ n3 >>> 9) * 1534285511;
        return n4 ^ n4 >>> 19;
    }

    public static int znm(int n, int n2) {
        int n3 = Integer.rotateRight(n * 583423917 ^ n2, 5);
        int n4 = (n3 ^ n3 >>> 11) * 37645615;
        int n5 = (n4 ^ n4 >>> 16) * -1724359503;
        return n5 ^ n5 >>> 13;
    }

    public static boolean dyb(int n, int n2) {
        return ((bst_4.znm(n, n2) + Thread.currentThread().hashCode()) * 735729443 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

