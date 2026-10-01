/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bta_4 {
    private static final int tths = 1019184282;
    private static final int dhfh_2 = -1979800864;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yz4n1ab9;

    private bta_4() {
    }

    public static int khkha_2(int n) {
        int n2 = n ^ System.identityHashCode(bta_4.class) ^ (int)Thread.currentThread().getId() * -2094957153 ^ tths;
        int n3 = (n2 ^ n2 >>> 13) * -1078401525;
        int n4 = (n3 ^ n3 >>> 10) * 540965967;
        return n4 ^ n4 >>> 16 ^ dhfh_2;
    }

    public static int rta_3(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 12) * 853310623 + dhfh_2 ^ tths;
        int n4 = (n3 ^ n3 >>> 16) * 80824429;
        int n5 = (n4 ^ n4 >>> 12) * -1876065667;
        return n5 ^ n5 >>> 19 ^ dhfh_2;
    }

    public static boolean hst(int n, int n2) {
        return ((bta_4.rta_3(n, n2) ^ (int)System.nanoTime()) * 77129389 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

