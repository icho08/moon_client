/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sgh_2 {
    private static final int dhthk = -128098320;
    private static final int dhb_2 = 1833404866;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k7gtqg63ask2;

    private sgh_2() {
    }

    private static int jyj(int n) {
        int n2 = n ^ dhthk;
        int n3 = (n2 ^ n2 >>> 16) * -1193550825;
        int n4 = (n3 ^ n3 >>> 18) * 509432695;
        return (n4 ^ n4 >>> 24) + dhb_2;
    }

    public static int dnz_4(int n) {
        return sgh_2.jyj(Integer.rotateLeft(n ^ dhthk ^ (int)System.nanoTime(), 22) * -1739112337);
    }

    public static int stn_4(int n, int n2) {
        return sgh_2.jyj(n2 ^ Integer.rotateLeft(n, n2 & 0x10) ^ dhb_2);
    }

    public static boolean saa_4(int n, int n2) {
        return ((sgh_2.stn_4(n, n2) + Thread.currentThread().hashCode()) * -1514502251 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

