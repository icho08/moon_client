/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbt_2 {
    private static final int ztd_2 = 128976272;
    private static final int rsa_2 = 304464109;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int sudq1i9k64;

    private tbt_2() {
    }

    private static int tdh_5(int n) {
        int n2 = n ^ ztd_2;
        int n3 = (n2 ^ n2 >>> 12) * -1421554449;
        int n4 = (n3 ^ n3 >>> 18) * 2001665087;
        return (n4 ^ n4 >>> 20) + rsa_2;
    }

    public static int ssa_6(int n) {
        return tbt_2.tdh_5(n ^ System.identityHashCode(tbt_2.class) ^ (int)Thread.currentThread().getId() * -405600635 ^ ztd_2);
    }

    public static int khzl(int n, int n2) {
        return tbt_2.tdh_5(Integer.rotateRight(n * 382095803 ^ n2, 8) + rsa_2 ^ ztd_2);
    }

    public static boolean zwz_2(int n, int n2) {
        return ((tbt_2.khzl(n, n2) ^ (int)System.nanoTime()) * -882681197 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

