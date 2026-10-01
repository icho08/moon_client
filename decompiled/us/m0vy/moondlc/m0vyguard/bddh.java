/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bddh {
    private static final int zht_2 = -506400578;
    private static final int rkhs = 608478367;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dgqfp765yj1;

    private bddh() {
    }

    public static int khkhl(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 12) * -143207505 ^ zht_2;
        int n3 = (n2 ^ n2 >>> 13) * 1399153699;
        int n4 = (n3 ^ n3 >>> 15) * -669170567;
        return n4 ^ n4 >>> 22 ^ rkhs;
    }

    public static int djb(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x15)) + rkhs ^ zht_2;
        int n4 = (n3 ^ n3 >>> 16) * -536441897;
        int n5 = (n4 ^ n4 >>> 11) * 359904493;
        return n5 ^ n5 >>> 15 ^ rkhs;
    }

    public static boolean zbth(int n, int n2) {
        return ((bddh.djb(n, n2) + Thread.currentThread().hashCode()) * 1750603663 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

