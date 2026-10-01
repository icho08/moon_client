/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qt_2 {
    private static final int bld = 1515408693;
    private static final int tss_4 = -395777343;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int unagbgsqxju3t;

    private qt_2() {
    }

    public static int jbs(int n) {
        int n2 = n ^ bld ^ System.identityHashCode(qt_2.class) ^ (int)Thread.currentThread().getId() * 1955635417;
        int n3 = (n2 ^ n2 >>> 15) * -779733177;
        int n4 = (n3 ^ n3 >>> 8) * 1626205737;
        return n4 ^ n4 >>> 20;
    }

    public static int shzd(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 10) ^ tss_4;
        int n4 = (n3 ^ n3 >>> 15) * -239113275;
        int n5 = (n4 ^ n4 >>> 16) * -964723225;
        return n5 ^ n5 >>> 20;
    }

    public static boolean dhld(int n, int n2) {
        return ((qt_2.shzd(n, n2) ^ (int)System.nanoTime()) * 142558975 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

