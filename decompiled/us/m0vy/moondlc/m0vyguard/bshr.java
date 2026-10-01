/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshr {
    private static final int zay = -1894089416;
    private static final int dhthgh = -344803890;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hktsxntxgt;

    private bshr() {
    }

    public static int akhth(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 16) * -731376451 ^ zay;
        int n3 = (n2 ^ n2 >>> 14) * -1660885283;
        int n4 = (n3 ^ n3 >>> 16) * -869229771;
        return n4 ^ n4 >>> 14 ^ dhthgh;
    }

    public static int dhfsh(int n, int n2) {
        int n3 = Integer.rotateRight(n * -699986465 ^ n2, 18) + dhthgh ^ zay;
        int n4 = (n3 ^ n3 >>> 12) * -1994149519;
        int n5 = (n4 ^ n4 >>> 11) * 1937646987;
        return n5 ^ n5 >>> 23 ^ dhthgh;
    }

    public static boolean dkgh(int n, int n2) {
        return ((bshr.dhfsh(n, n2) + Thread.currentThread().hashCode()) * -1668105235 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

