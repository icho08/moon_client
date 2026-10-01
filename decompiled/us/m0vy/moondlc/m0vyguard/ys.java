/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ys {
    private static final int hrr = -1799818825;
    private static final int tn = 46696826;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kgxu6h69z;

    private ys() {
    }

    public static int bghf(int n) {
        int n2 = Integer.rotateRight(n * -245757307 - System.identityHashCode(ys.class), 15) ^ hrr;
        int n3 = (n2 ^ n2 >>> 13) * 1003946685;
        int n4 = (n3 ^ n3 >>> 13) * 235197791;
        return n4 ^ n4 >>> 14 ^ tn;
    }

    public static int dhtw(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 11) * 378545519 + tn ^ hrr;
        int n4 = (n3 ^ n3 >>> 17) * -707507603;
        int n5 = (n4 ^ n4 >>> 12) * -690969809;
        return n5 ^ n5 >>> 22 ^ tn;
    }

    public static boolean jtq_2(int n, int n2) {
        return ((ys.dhtw(n, n2) + Thread.currentThread().hashCode()) * -1221429287 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

