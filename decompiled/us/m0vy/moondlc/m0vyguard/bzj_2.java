/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzj_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o39cmwv68enpba;

    private bzj_2() {
    }

    public static int shs_5(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 20) * -730144595;
        int n3 = (n2 ^ n2 >>> 13) * -1323583605;
        int n4 = (n3 ^ n3 >>> 10) * 2019619217;
        return n4 ^ n4 >>> 22;
    }

    public static int zql_2(int n, int n2) {
        int n3 = n2 - n ^ 0xC33C02C9;
        int n4 = (n3 ^ n3 >>> 13) * 787947615;
        int n5 = (n4 ^ n4 >>> 9) * 149639281;
        return n5 ^ n5 >>> 22;
    }

    public static boolean zaf_2(int n, int n2) {
        return ((bzj_2.zql_2(n, n2) + Thread.currentThread().hashCode()) * 1117462229 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

