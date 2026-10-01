/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshf {
    private static final int jwt_2 = 885450020;
    private static final int jth_2 = -918558690;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pg0m5qm2q0;

    private bshf() {
    }

    private static int dhzh_2(int n) {
        int n2 = n ^ jwt_2;
        int n3 = (n2 ^ n2 >>> 15) * -1912424909;
        int n4 = (n3 ^ n3 >>> 10) * -535446019;
        return (n4 ^ n4 >>> 24) + jth_2;
    }

    public static int szn(int n) {
        return bshf.dhzh_2((n ^ jwt_2 ^ bshf.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zkhh_4(int n, int n2) {
        return bshf.dhzh_2(n2 ^ Integer.rotateLeft(n, n2 & 0xF) ^ jth_2);
    }

    public static boolean zagh_4(int n, int n2) {
        return ((bshf.zkhh_4(n, n2) ^ (int)System.nanoTime()) * -1202440117 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

