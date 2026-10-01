/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthb {
    private static final int trn = 99019191;
    private static final int dhhs_4 = 1190509606;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qj20yxhg;

    private bthb() {
    }

    private static int shat_2(int n) {
        int n2 = n ^ trn;
        int n3 = (n2 ^ n2 >>> 12) * -1819143961;
        int n4 = (n3 ^ n3 >>> 19) * 1970566423;
        return (n4 ^ n4 >>> 23) + dhhs_4;
    }

    public static int hnz(int n) {
        return bthb.shat_2(n ^ trn ^ System.identityHashCode(bthb.class) ^ (int)Thread.currentThread().getId() * 1625824481);
    }

    public static int sfk(int n, int n2) {
        return bthb.shat_2(n2 - n ^ 0x2C19A04A ^ dhhs_4);
    }

    public static boolean dhk_2(int n, int n2) {
        return ((bthb.sfk(n, n2) ^ (int)System.nanoTime()) * 177660779 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

