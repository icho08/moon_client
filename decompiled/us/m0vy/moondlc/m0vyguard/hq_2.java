/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hq_2 {
    private static final int ththq = -1021856559;
    private static final int zsa_4 = -2042244951;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s9c5a6odg;

    private hq_2() {
    }

    public static int dzz_3(int n) {
        int n2 = (n ^ hq_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ ththq;
        int n3 = (n2 ^ n2 >>> 15) * -695865949;
        int n4 = (n3 ^ n3 >>> 8) * 707293087;
        return n4 ^ n4 >>> 18 ^ zsa_4;
    }

    public static int dhthl(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1208969685 ^ n2, 5) + zsa_4 ^ ththq;
        int n4 = (n3 ^ n3 >>> 15) * 131927755;
        int n5 = (n4 ^ n4 >>> 10) * 1937645677;
        return n5 ^ n5 >>> 20 ^ zsa_4;
    }

    public static boolean ghsa(int n, int n2) {
        return ((hq_2.dhthl(n, n2) ^ (int)System.nanoTime()) * -2080071129 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

