/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwsh {
    private static final int dts_4 = -1251464899;
    private static final int bzr_2 = 1579359300;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oufo5oq2d;

    private bwsh() {
    }

    public static int jdhq(int n) {
        int n2 = Integer.rotateRight(n * 1706237595 - System.identityHashCode(bwsh.class), 6) ^ dts_4;
        int n3 = (n2 ^ n2 >>> 14) * -737368051;
        int n4 = (n3 ^ n3 >>> 14) * -1218651719;
        return n4 ^ n4 >>> 18 ^ bzr_2;
    }

    public static int tyy_2(int n, int n2) {
        int n3 = (n2 - n ^ 0xB4B09BD0) + bzr_2 ^ dts_4;
        int n4 = (n3 ^ n3 >>> 16) * 1143106641;
        int n5 = (n4 ^ n4 >>> 16) * -448237237;
        return n5 ^ n5 >>> 21 ^ bzr_2;
    }

    public static boolean khkht_2(int n, int n2) {
        return ((bwsh.tyy_2(n, n2) + Thread.currentThread().hashCode()) * -569722461 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

