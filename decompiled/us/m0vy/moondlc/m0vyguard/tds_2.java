/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tds_2 {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int d3h24yfrc;

    private tds_2() {
    }

    private static int sah_8(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * 176344151;
        int n4 = (n3 ^ n3 >>> 18) * 846988399;
        return n4 ^ n4 >>> 16;
    }

    public static int zts_5(int n) {
        return tds_2.sah_8(n ^ System.identityHashCode(tds_2.class) ^ (int)Thread.currentThread().getId() * 450125997);
    }

    public static int rjf(int n, int n2) {
        return tds_2.sah_8(n2 ^ Integer.rotateLeft(n, n2 & 0x11));
    }

    public static boolean thy(int n, int n2) {
        return ((tds_2.rjf(n, n2) ^ (int)System.nanoTime()) * 674634687 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

