/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bts_3 {
    private static final int tth = -467039324;
    private static final int rfa_2 = 825896540;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v43gixflsxej;

    private bts_3() {
    }

    public static int rhsh_2(int n) {
        int n2 = (n ^ bts_3.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ tth;
        int n3 = (n2 ^ n2 >>> 12) * -823210093;
        int n4 = (n3 ^ n3 >>> 10) * 1690386653;
        return n4 ^ n4 >>> 13 ^ rfa_2;
    }

    public static int thdf_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1938126175 ^ n2, 6) + rfa_2 ^ tth;
        int n4 = (n3 ^ n3 >>> 16) * -182599125;
        int n5 = (n4 ^ n4 >>> 14) * -1850601581;
        return n5 ^ n5 >>> 15 ^ rfa_2;
    }

    public static boolean khas_2(int n, int n2) {
        return ((bts_3.thdf_2(n, n2) ^ (int)System.nanoTime()) * 396002107 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

