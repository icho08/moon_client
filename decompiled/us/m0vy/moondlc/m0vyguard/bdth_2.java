/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdth_2 {
    private static final int rwth = 1067842345;
    private static final int dhhdh_2 = -1076698474;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c5sxq7cbu8d;

    private bdth_2() {
    }

    private static int sghz_3(int n) {
        int n2 = n ^ rwth;
        int n3 = (n2 ^ n2 >>> 16) * 49635059;
        int n4 = (n3 ^ n3 >>> 14) * -2080670735;
        return (n4 ^ n4 >>> 17) + dhhdh_2;
    }

    public static int sls(int n) {
        return bdth_2.sghz_3(Integer.rotateLeft(n ^ rwth ^ (int)System.nanoTime(), 7) * 823615493);
    }

    public static int jhs_2(int n, int n2) {
        return bdth_2.sghz_3(Integer.rotateLeft(n ^ n2, 15) * -72434035 ^ dhhdh_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

