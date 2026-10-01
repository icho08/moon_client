/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zd_3 {
    private static final int rhz = 971688140;
    private static final int smt_2 = -223417490;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int v2qh1fr9d;

    private zd_3() {
    }

    public static int sdhk_2(int n) {
        int n2 = n ^ System.identityHashCode(zd_3.class) ^ (int)Thread.currentThread().getId() * -313894191 ^ rhz;
        int n3 = (n2 ^ n2 >>> 12) * 1949326937;
        int n4 = (n3 ^ n3 >>> 7) * 1388532121;
        return n4 ^ n4 >>> 13 ^ smt_2;
    }

    public static int dlt_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 11)) + smt_2 ^ rhz;
        int n4 = (n3 ^ n3 >>> 8) * -871912497;
        int n5 = (n4 ^ n4 >>> 11) * 544517225;
        return n5 ^ n5 >>> 18 ^ smt_2;
    }

    public static boolean tskh(int n, int n2) {
        return ((zd_3.dlt_2(n, n2) ^ (int)System.nanoTime()) * -734522877 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

