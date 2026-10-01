/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class baz_3 {
    private static final int hthkh = 587699277;
    private static final int dhtth_2 = -1884552439;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int f5pj6gx8jky;

    private baz_3() {
    }

    public static int srk(int n) {
        int n2 = (n ^ baz_3.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ hthkh;
        int n3 = (n2 ^ n2 >>> 17) * 293656035;
        int n4 = (n3 ^ n3 >>> 15) * -1051978891;
        return n4 ^ n4 >>> 17 ^ dhtth_2;
    }

    public static int ghthz_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * 1695002183 + dhtth_2 ^ hthkh;
        int n4 = (n3 ^ n3 >>> 14) * 583011349;
        int n5 = (n4 ^ n4 >>> 13) * -1067795883;
        return n5 ^ n5 >>> 18 ^ dhtth_2;
    }

    public static boolean tjsh_2(int n, int n2) {
        return ((baz_3.ghthz_2(n, n2) ^ (int)System.nanoTime()) * 463822719 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

