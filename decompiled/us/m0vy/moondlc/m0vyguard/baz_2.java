/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class baz_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int w620tpbo6em;

    private baz_2() {
    }

    public static int ghrh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * -2145868483;
        int n3 = (n2 ^ n2 >>> 14) * 1891981013;
        int n4 = (n3 ^ n3 >>> 10) * 245059867;
        return n4 ^ n4 >>> 14;
    }

    public static int hfsh(int n, int n2) {
        int n3 = n2 - n ^ 0xDFB2088E;
        int n4 = (n3 ^ n3 >>> 9) * 1499752863;
        int n5 = (n4 ^ n4 >>> 13) * -2044219981;
        return n5 ^ n5 >>> 23;
    }

    public static boolean zla_3(int n, int n2) {
        return ((baz_2.hfsh(n, n2) + Thread.currentThread().hashCode()) * 680058859 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

