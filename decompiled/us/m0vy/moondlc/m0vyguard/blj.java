/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class blj {
    private static final int smf = 527043184;
    private static final int shthd_2 = 1126989471;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int tkcrxjnrmmx9;

    private blj() {
    }

    private static int hr(int n) {
        int n2 = n ^ smf;
        int n3 = (n2 ^ n2 >>> 9) * -935988629;
        int n4 = (n3 ^ n3 >>> 13) * -1631544331;
        return (n4 ^ n4 >>> 21) + shthd_2;
    }

    public static int sbdh_2(int n) {
        return blj.hr(Integer.rotateLeft(n ^ (int)System.nanoTime(), 22) * 1186884259 ^ smf);
    }

    public static int szk_2(int n, int n2) {
        return blj.hr(Integer.rotateRight(n * 1710813001 ^ n2, 14) + shthd_2 ^ smf);
    }

    public static boolean shmy(int n, int n2) {
        return ((blj.szk_2(n, n2) + Thread.currentThread().hashCode()) * -1776489033 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

