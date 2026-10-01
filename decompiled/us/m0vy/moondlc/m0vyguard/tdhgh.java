/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdhgh {
    private static final int dhkhn = -1756624195;
    private static final int khbz_2 = -1125082895;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eih8zkxr;

    private tdhgh() {
    }

    private static int dhk_3(int n) {
        int n2 = n ^ dhkhn;
        int n3 = (n2 ^ n2 >>> 11) * -1024862455;
        int n4 = (n3 ^ n3 >>> 15) * 1343155317;
        return (n4 ^ n4 >>> 24) + khbz_2;
    }

    public static int rty(int n) {
        return tdhgh.dhk_3(n ^ System.identityHashCode(tdhgh.class) ^ (int)Thread.currentThread().getId() * -1716044501 ^ dhkhn);
    }

    public static int thah_4(int n, int n2) {
        return tdhgh.dhk_3((n2 ^ Integer.rotateLeft(n, n2 & 0xD)) + khbz_2 ^ dhkhn);
    }

    public static boolean dhzkh(int n, int n2) {
        return ((tdhgh.thah_4(n, n2) ^ (int)System.nanoTime()) * 2019444445 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

