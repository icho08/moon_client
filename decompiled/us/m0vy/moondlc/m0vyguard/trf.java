/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trf {
    private static final int rdh = -1622873446;
    private static final int bzw_2 = -1645357579;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vd1gov84c9;

    private trf() {
    }

    public static int jtd_4(int n) {
        int n2 = Integer.rotateLeft(n ^ rdh ^ (int)System.nanoTime(), 7) * -1787875261;
        int n3 = (n2 ^ n2 >>> 12) * 1648005477;
        int n4 = (n3 ^ n3 >>> 13) * 1241990519;
        return n4 ^ n4 >>> 17;
    }

    public static int akhkh(int n, int n2) {
        int n3 = n2 - n ^ 0x13EF9287 ^ bzw_2;
        int n4 = (n3 ^ n3 >>> 16) * 396451763;
        int n5 = (n4 ^ n4 >>> 15) * -2059530585;
        return n5 ^ n5 >>> 19;
    }

    public static boolean dhtth_2(int n, int n2) {
        return ((trf.akhkh(n, n2) + Thread.currentThread().hashCode()) * -1893677973 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

