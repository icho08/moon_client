/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhgh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nfgep1ibzllnn;

    private tkhgh() {
    }

    private static int brz(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * -725622841;
        int n4 = (n3 ^ n3 >>> 10) * 881948621;
        return n4 ^ n4 >>> 15;
    }

    public static int khz(int n) {
        return tkhgh.brz(Integer.rotateLeft(n ^ (int)System.nanoTime(), 12) * 1593009605);
    }

    public static int zthf_2(int n, int n2) {
        return tkhgh.brz(Integer.rotateRight(n * 1506389935 ^ n2, 18));
    }

    public static boolean akhs_2(int n, int n2) {
        return ((tkhgh.zthf_2(n, n2) + Thread.currentThread().hashCode()) * -37589185 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

