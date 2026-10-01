/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shj_3 {
    private static final int thjz_2 = -450942594;
    private static final int rghm = -1820312549;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xkvtvj0e59izzy;

    private shj_3() {
    }

    private static int aqf(int n) {
        int n2 = n ^ thjz_2;
        int n3 = (n2 ^ n2 >>> 9) * -242929841;
        int n4 = (n3 ^ n3 >>> 9) * 1979394771;
        return (n4 ^ n4 >>> 22) + rghm;
    }

    public static int hz_2(int n) {
        return shj_3.aqf(n ^ thjz_2 ^ System.identityHashCode(shj_3.class) ^ (int)Thread.currentThread().getId() * 78831269);
    }

    public static int ghtw_2(int n, int n2) {
        return shj_3.aqf(Integer.rotateLeft(n ^ n2, 19) * -1311028123 ^ rghm);
    }

    public static boolean zft_4(int n, int n2) {
        return ((shj_3.ghtw_2(n, n2) ^ (int)System.nanoTime()) * -1147839251 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

