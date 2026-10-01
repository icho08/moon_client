/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hd_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rvkqol4ope;

    private hd_3() {
    }

    private static int szy(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * 162232021;
        int n4 = (n3 ^ n3 >>> 17) * 1869133403;
        return n4 ^ n4 >>> 16;
    }

    public static int tdsh_2(int n) {
        return hd_3.szy(n ^ System.identityHashCode(hd_3.class) ^ (int)Thread.currentThread().getId() * 133602993);
    }

    public static int dat_4(int n, int n2) {
        return hd_3.szy(Integer.rotateRight(n * 2050202221 ^ n2, 15));
    }

    public static boolean ddhd_4(int n, int n2) {
        return ((hd_3.dat_4(n, n2) ^ (int)System.nanoTime()) * 1284214927 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

