/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tad {
    private static final int qf = -2108126520;
    private static final int bks_2 = -1791696699;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ecqftaip;

    private tad() {
    }

    public static int ssth_2(int n) {
        int n2 = (n ^ tad.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ qf;
        int n3 = (n2 ^ n2 >>> 11) * 865330291;
        int n4 = (n3 ^ n3 >>> 14) * -1858895031;
        return n4 ^ n4 >>> 13 ^ bks_2;
    }

    public static int dhsf_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 7)) + bks_2 ^ qf;
        int n4 = (n3 ^ n3 >>> 17) * -1418962063;
        int n5 = (n4 ^ n4 >>> 15) * 1914554765;
        return n5 ^ n5 >>> 16 ^ bks_2;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

