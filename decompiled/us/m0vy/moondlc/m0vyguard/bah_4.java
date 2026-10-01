/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bah_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tawd2xszqpv;

    private bah_4() {
    }

    public static int thth_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 13) * 1675439489;
        int n3 = (n2 ^ n2 >>> 12) * 837778253;
        int n4 = (n3 ^ n3 >>> 12) * -1056678873;
        return n4 ^ n4 >>> 22;
    }

    public static int ghbd(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1840601881 ^ n2, 18);
        int n4 = (n3 ^ n3 >>> 8) * -662930935;
        int n5 = (n4 ^ n4 >>> 17) * 173982243;
        return n5 ^ n5 >>> 13;
    }

    public static boolean jhd_2(int n, int n2) {
        return ((bah_4.ghbd(n, n2) + Thread.currentThread().hashCode()) * 2043702919 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

