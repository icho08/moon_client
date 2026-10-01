/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class nh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k7tsd7eki;

    private nh() {
    }

    public static int dlw_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 2113506749;
        int n3 = (n2 ^ n2 >>> 17) * -1913191741;
        int n4 = (n3 ^ n3 >>> 8) * -1630477857;
        return n4 ^ n4 >>> 17;
    }

    public static int jjz(int n, int n2) {
        int n3 = Integer.rotateRight(n * -826659205 ^ n2, 20);
        int n4 = (n3 ^ n3 >>> 12) * -1476257311;
        int n5 = (n4 ^ n4 >>> 16) * 922860363;
        return n5 ^ n5 >>> 14;
    }

    public static boolean sdhr(int n, int n2) {
        return ((nh.jjz(n, n2) + Thread.currentThread().hashCode()) * 2132038493 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

