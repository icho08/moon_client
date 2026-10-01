/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkk {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int adsrn4xe;

    private bkk() {
    }

    public static int dghk_2(int n) {
        int n2 = (n ^ bkk.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * 832998269;
        int n4 = (n3 ^ n3 >>> 15) * -986377863;
        return n4 ^ n4 >>> 20;
    }

    public static int sqw(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xF);
        int n4 = (n3 ^ n3 >>> 14) * 76834915;
        int n5 = (n4 ^ n4 >>> 15) * 1558851493;
        return n5 ^ n5 >>> 21;
    }

    public static boolean dzz_4(int n, int n2) {
        return ((bkk.sqw(n, n2) ^ (int)System.nanoTime()) * -1644263203 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

