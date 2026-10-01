/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkl {
    private static final int rthth = 1180607440;
    private static final int swb = -2110329183;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int w2mfz2mu9l7rdi;

    private bkl() {
    }

    private static int zghz_3(int n) {
        int n2 = n ^ rthth;
        int n3 = (n2 ^ n2 >>> 13) * 1349220177;
        int n4 = (n3 ^ n3 >>> 15) * -707503297;
        return (n4 ^ n4 >>> 18) + swb;
    }

    public static int tzh_3(int n) {
        return bkl.zghz_3(Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * -310459257 ^ rthth);
    }

    public static int dqm_2(int n, int n2) {
        return bkl.zghz_3((n + n2 ^ Integer.rotateLeft(n, 15)) + swb ^ rthth);
    }

    public static boolean ttq(int n, int n2) {
        return ((bkl.dqm_2(n, n2) + Thread.currentThread().hashCode()) * 767256645 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

