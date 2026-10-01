/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdz_2 {
    private static final int hf = 872083975;
    private static final int hfd_2 = 1568751612;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s0thjvts4uyq2;

    private tdz_2() {
    }

    public static int at_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 11) * 2142268865 ^ hf;
        int n3 = (n2 ^ n2 >>> 13) * -806970007;
        int n4 = (n3 ^ n3 >>> 9) * -1828272993;
        return n4 ^ n4 >>> 17 ^ hfd_2;
    }

    public static int jaz(int n, int n2) {
        int n3 = Integer.rotateRight(n * -163740099 ^ n2, 16) + hfd_2 ^ hf;
        int n4 = (n3 ^ n3 >>> 14) * -788134983;
        int n5 = (n4 ^ n4 >>> 12) * 1233154611;
        return n5 ^ n5 >>> 14 ^ hfd_2;
    }

    public static boolean zwl_2(int n, int n2) {
        return ((tdz_2.jaz(n, n2) + Thread.currentThread().hashCode()) * 389646345 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

