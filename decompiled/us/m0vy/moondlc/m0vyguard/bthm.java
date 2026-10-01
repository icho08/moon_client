/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthm {
    private static final int jdth = 1439503266;
    private static final int kw = 1945492462;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int n3vd9g0jae3ra;

    private bthm() {
    }

    private static int zrt(int n) {
        int n2 = n ^ jdth;
        int n3 = (n2 ^ n2 >>> 8) * 162430115;
        int n4 = (n3 ^ n3 >>> 17) * 1561506693;
        return (n4 ^ n4 >>> 15) + kw;
    }

    public static int ghsn_2(int n) {
        return bthm.zrt(Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * -2086929553 ^ jdth);
    }

    public static int dghd_3(int n, int n2) {
        return bthm.zrt(Integer.rotateRight(n * 556530013 ^ n2, 17) + kw ^ jdth);
    }

    public static boolean bha_4(int n, int n2) {
        return ((bthm.dghd_3(n, n2) + Thread.currentThread().hashCode()) * -512617101 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

