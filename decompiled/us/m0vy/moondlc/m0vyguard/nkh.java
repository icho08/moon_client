/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class nkh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xydhusgo;

    private nkh() {
    }

    public static int wh(int n) {
        int n2 = n ^ System.identityHashCode(nkh.class) ^ (int)Thread.currentThread().getId() * -1637296585;
        int n3 = (n2 ^ n2 >>> 16) * 1475555251;
        int n4 = (n3 ^ n3 >>> 16) * -1844519027;
        return n4 ^ n4 >>> 13;
    }

    public static int aash_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 12);
        int n4 = (n3 ^ n3 >>> 12) * 1240145981;
        int n5 = (n4 ^ n4 >>> 14) * -1639448697;
        return n5 ^ n5 >>> 12;
    }

    public static boolean tfdh_2(int n, int n2) {
        return ((nkh.aash_2(n, n2) ^ (int)System.nanoTime()) * -118020561 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

