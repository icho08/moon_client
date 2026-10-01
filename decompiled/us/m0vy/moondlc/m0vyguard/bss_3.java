/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bss_3 {
    private static final int ddhth = 1104911871;
    private static final int bghz = 993759067;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int swrapcb9p2;

    private bss_3() {
    }

    public static int thma_2(int n) {
        int n2 = (n ^ bss_3.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ ddhth;
        int n3 = (n2 ^ n2 >>> 17) * -2048333595;
        int n4 = (n3 ^ n3 >>> 14) * 431845655;
        return n4 ^ n4 >>> 22 ^ bghz;
    }

    public static int zbr_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 11) * -1155292481 + bghz ^ ddhth;
        int n4 = (n3 ^ n3 >>> 12) * 1803987471;
        int n5 = (n4 ^ n4 >>> 15) * 144277923;
        return n5 ^ n5 >>> 20 ^ bghz;
    }

    public static boolean khbs_2(int n, int n2) {
        return ((bss_3.zbr_2(n, n2) ^ (int)System.nanoTime()) * 1282286697 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

