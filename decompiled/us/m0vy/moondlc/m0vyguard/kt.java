/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kt {
    private static final int dhtht_2 = -2102877777;
    private static final int tmh = 2050123106;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int t8u21tc79gq;

    private kt() {
    }

    public static int khjn(int n) {
        int n2 = Integer.rotateLeft(n ^ dhtht_2 ^ (int)System.nanoTime(), 15) * 1841719789;
        int n3 = (n2 ^ n2 >>> 17) * 643407537;
        int n4 = (n3 ^ n3 >>> 14) * -1074181693;
        return n4 ^ n4 >>> 16;
    }

    public static int rhz_3(int n, int n2) {
        int n3 = n2 - n ^ 0x772A3BF2 ^ tmh;
        int n4 = (n3 ^ n3 >>> 12) * -1558164083;
        int n5 = (n4 ^ n4 >>> 12) * 2106354385;
        return n5 ^ n5 >>> 15;
    }

    public static boolean bqs(int n, int n2) {
        return ((kt.rhz_3(n, n2) + Thread.currentThread().hashCode()) * -1299774737 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

