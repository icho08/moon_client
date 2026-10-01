/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkht {
    private static final int shd_7 = 814069239;
    private static final int rn = 2015762584;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zcwu2g80sm0;

    private tkht() {
    }

    public static int ghdb(int n) {
        int n2 = Integer.rotateRight(n * 1617165119 - System.identityHashCode(tkht.class), 8) ^ shd_7;
        int n3 = (n2 ^ n2 >>> 17) * 983918383;
        int n4 = (n3 ^ n3 >>> 7) * 177343877;
        return n4 ^ n4 >>> 18 ^ rn;
    }

    public static int ddhd_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 9)) + rn ^ shd_7;
        int n4 = (n3 ^ n3 >>> 17) * -1613999785;
        int n5 = (n4 ^ n4 >>> 15) * 308526159;
        return n5 ^ n5 >>> 18 ^ rn;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

