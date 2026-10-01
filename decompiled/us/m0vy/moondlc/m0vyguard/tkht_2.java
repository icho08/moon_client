/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkht_2 {
    private static final int rzf_2 = -560817679;
    private static final int stb = 1084972586;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yzg2766tzxt;

    private tkht_2() {
    }

    private static int zshd(int n) {
        int n2 = n ^ rzf_2;
        int n3 = (n2 ^ n2 >>> 7) * -1419975741;
        int n4 = (n3 ^ n3 >>> 13) * 1915358807;
        return (n4 ^ n4 >>> 14) + stb;
    }

    public static int stdh_2(int n) {
        return tkht_2.zshd(n ^ System.identityHashCode(tkht_2.class) ^ (int)Thread.currentThread().getId() * 1212189081 ^ rzf_2);
    }

    public static int dqsh(int n, int n2) {
        return tkht_2.zshd(Integer.rotateRight(n * 1571604141 ^ n2, 18) + stb ^ rzf_2);
    }

    public static boolean azl_2(int n, int n2) {
        return ((tkht_2.dqsh(n, n2) ^ (int)System.nanoTime()) * -1834136687 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

