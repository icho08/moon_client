/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shz_5 {
    private static final int dhdhs_2 = -690406271;
    private static final int shnk = 1546517186;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rrtizwc3c4k;

    private shz_5() {
    }

    public static int hmt(int n) {
        int n2 = n ^ dhdhs_2 ^ System.identityHashCode(shz_5.class) ^ (int)Thread.currentThread().getId() * -1946909499;
        int n3 = (n2 ^ n2 >>> 15) * 1195295615;
        int n4 = (n3 ^ n3 >>> 9) * -1764914161;
        return n4 ^ n4 >>> 16;
    }

    public static int jmt_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 16) ^ shnk;
        int n4 = (n3 ^ n3 >>> 16) * 1484956187;
        int n5 = (n4 ^ n4 >>> 9) * 1314697727;
        return n5 ^ n5 >>> 22;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

