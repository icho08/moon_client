/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btq_2 {
    private static final int khjz = 1898393265;
    private static final int dhty = -1881990110;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rnwf9g98y20h;

    private btq_2() {
    }

    private static int zhh(int n) {
        int n2 = n ^ khjz;
        int n3 = (n2 ^ n2 >>> 14) * -530596071;
        int n4 = (n3 ^ n3 >>> 14) * -758552579;
        return (n4 ^ n4 >>> 11) + dhty;
    }

    public static int zshb_2(int n) {
        return btq_2.zhh(n ^ System.identityHashCode(btq_2.class) ^ (int)Thread.currentThread().getId() * -1344511693 ^ khjz);
    }

    public static int khghj(int n, int n2) {
        return btq_2.zhh(Integer.rotateRight(n * -1510985715 ^ n2, 14) + dhty ^ khjz);
    }

    public static boolean hrw(int n, int n2) {
        return ((btq_2.khghj(n, n2) ^ (int)System.nanoTime()) * 2062682817 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

