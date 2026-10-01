/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ds {
    private static final int rth_3 = 1555706987;
    private static final int zyth = -2002570046;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lxpfyaoq6at;

    private ds() {
    }

    private static int afth(int n) {
        int n2 = n ^ rth_3;
        int n3 = (n2 ^ n2 >>> 14) * -1601266605;
        int n4 = (n3 ^ n3 >>> 18) * -970295129;
        return (n4 ^ n4 >>> 13) + zyth;
    }

    public static int dhghf(int n) {
        return ds.afth(n ^ System.identityHashCode(ds.class) ^ (int)Thread.currentThread().getId() * -769751287 ^ rth_3);
    }

    public static int hll(int n, int n2) {
        return ds.afth((n2 ^ Integer.rotateLeft(n, n2 & 0x15)) + zyth ^ rth_3);
    }

    public static boolean hmw(int n, int n2) {
        return ((ds.hll(n, n2) ^ (int)System.nanoTime()) * -1205188627 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

