/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kht_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vbc8jaif9uah;

    private kht_2() {
    }

    public static int znn_2(int n) {
        int n2 = n ^ System.identityHashCode(kht_2.class) ^ (int)Thread.currentThread().getId() * 138878841;
        int n3 = (n2 ^ n2 >>> 16) * -1748540835;
        int n4 = (n3 ^ n3 >>> 12) * -141458127;
        return n4 ^ n4 >>> 13;
    }

    public static int bz_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 12) * -2064182213;
        int n4 = (n3 ^ n3 >>> 8) * -392298349;
        int n5 = (n4 ^ n4 >>> 18) * -1236974947;
        return n5 ^ n5 >>> 15;
    }

    public static boolean jzs_3(int n, int n2) {
        return ((kht_2.bz_2(n, n2) ^ (int)System.nanoTime()) * -325034549 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

