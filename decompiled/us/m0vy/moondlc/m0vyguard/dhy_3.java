/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhy_3 {
    private static final int bwz = 2135506428;
    private static final int thdb = -400507641;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int uxtvjbgwm8u;

    private dhy_3() {
    }

    private static int hshth(int n) {
        int n2 = n ^ bwz;
        int n3 = (n2 ^ n2 >>> 8) * 41082469;
        int n4 = (n3 ^ n3 >>> 12) * -872818895;
        return (n4 ^ n4 >>> 24) + thdb;
    }

    public static int zfl_2(int n) {
        return dhy_3.hshth(Integer.rotateLeft(n ^ bwz ^ (int)System.nanoTime(), 15) * 1203976497);
    }

    public static int dra_3(int n, int n2) {
        return dhy_3.hshth(Integer.rotateLeft(n ^ n2, 9) * -1507579049 ^ thdb);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

