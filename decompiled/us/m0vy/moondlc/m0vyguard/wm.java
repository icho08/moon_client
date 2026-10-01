/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wm {
    private static final int thfm = 1756966866;
    private static final int thsm = 1575752720;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int reayqneo21fmla;

    private wm() {
    }

    private static int ghbt_2(int n) {
        int n2 = n ^ thfm;
        int n3 = (n2 ^ n2 >>> 11) * -1093324993;
        int n4 = (n3 ^ n3 >>> 12) * -1621526903;
        return (n4 ^ n4 >>> 20) + thsm;
    }

    public static int daq(int n) {
        return wm.ghbt_2(n ^ System.identityHashCode(wm.class) ^ (int)Thread.currentThread().getId() * -258606561 ^ thfm);
    }

    public static int dhdhs_2(int n, int n2) {
        return wm.ghbt_2(Integer.rotateRight(n * 1742583403 ^ n2, 15) + thsm ^ thfm);
    }

    public static boolean hl(int n, int n2) {
        return ((wm.dhdhs_2(n, n2) ^ (int)System.nanoTime()) * 425417947 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

