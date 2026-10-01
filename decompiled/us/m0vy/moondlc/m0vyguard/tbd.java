/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbd {
    private static final int ra_2 = 1022685081;
    private static final int dkn = 253319181;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tc6qwk538;

    private tbd() {
    }

    public static int hkhs(int n) {
        int n2 = Integer.rotateLeft(n ^ ra_2 ^ (int)System.nanoTime(), 6) * 1329049655;
        int n3 = (n2 ^ n2 >>> 15) * 1362961347;
        int n4 = (n3 ^ n3 >>> 15) * -221106487;
        return n4 ^ n4 >>> 21;
    }

    public static int dta_3(int n, int n2) {
        int n3 = n2 - n ^ 0xD5405405 ^ dkn;
        int n4 = (n3 ^ n3 >>> 9) * 543792259;
        int n5 = (n4 ^ n4 >>> 17) * -1023943335;
        return n5 ^ n5 >>> 16;
    }

    public static boolean tjr(int n, int n2) {
        return ((tbd.dta_3(n, n2) + Thread.currentThread().hashCode()) * -1708572391 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

