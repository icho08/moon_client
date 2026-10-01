/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghz_2 {
    private static final int jt = -2042130245;
    private static final int skh_3 = 369089196;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nuoiabcqi;

    private bghz_2() {
    }

    private static int ghzh_2(int n) {
        int n2 = n ^ jt;
        int n3 = (n2 ^ n2 >>> 11) * 518504991;
        int n4 = (n3 ^ n3 >>> 9) * -1758850643;
        return (n4 ^ n4 >>> 12) + skh_3;
    }

    public static int ddha_3(int n) {
        return bghz_2.ghzh_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * 1829445547 ^ jt);
    }

    public static int jzz_3(int n, int n2) {
        return bghz_2.ghzh_2(Integer.rotateRight(n * -129783973 ^ n2, 19) + skh_3 ^ jt);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

