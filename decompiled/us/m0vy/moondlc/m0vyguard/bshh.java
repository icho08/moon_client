/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshh {
    private static final int dhlh_2 = -1331779045;
    private static final int sdm = -1584180561;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o8hj8ecja5ap09;

    private bshh() {
    }

    private static int rmb(int n) {
        int n2 = n ^ dhlh_2;
        int n3 = (n2 ^ n2 >>> 9) * -119861219;
        int n4 = (n3 ^ n3 >>> 20) * 1279780935;
        return (n4 ^ n4 >>> 12) + sdm;
    }

    public static int shhj(int n) {
        return bshh.rmb(n ^ dhlh_2 ^ System.identityHashCode(bshh.class) ^ (int)Thread.currentThread().getId() * 1487150249);
    }

    public static int ztl_3(int n, int n2) {
        return bshh.rmb(n2 - n ^ 0x921129DA ^ sdm);
    }

    public static boolean ddt_3(int n, int n2) {
        return ((bshh.ztl_3(n, n2) ^ (int)System.nanoTime()) * 51387405 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

