/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfz_2 {
    private static final int hlgh = -884146650;
    private static final int zat = 197182904;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int affdlghh7r;

    private bfz_2() {
    }

    public static int haf_2(int n) {
        int n2 = (n ^ bfz_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ hlgh;
        int n3 = (n2 ^ n2 >>> 18) * -1065855077;
        int n4 = (n3 ^ n3 >>> 11) * -824675877;
        return n4 ^ n4 >>> 16 ^ zat;
    }

    public static int tat_5(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 12)) + zat ^ hlgh;
        int n4 = (n3 ^ n3 >>> 9) * -741269105;
        int n5 = (n4 ^ n4 >>> 11) * 423329973;
        return n5 ^ n5 >>> 13 ^ zat;
    }

    public static boolean tah_2(int n, int n2) {
        return ((bfz_2.tat_5(n, n2) ^ (int)System.nanoTime()) * 282149909 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

