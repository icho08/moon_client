/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzt_3 {
    private static final int dhln = 1377065934;
    private static final int tfj = -1827585885;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p9im0t4sncbc;

    private bzt_3() {
    }

    private static int shld(int n) {
        int n2 = n ^ dhln;
        int n3 = (n2 ^ n2 >>> 13) * -1479900861;
        int n4 = (n3 ^ n3 >>> 13) * -2116266281;
        return (n4 ^ n4 >>> 16) + tfj;
    }

    public static int adz_3(int n) {
        return bzt_3.shld((n ^ bzt_3.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhln);
    }

    public static int sty(int n, int n2) {
        return bzt_3.shld((n2 - n ^ 0xAF03D32A) + tfj ^ dhln);
    }

    public static boolean snsh(int n, int n2) {
        return ((bzt_3.sty(n, n2) ^ (int)System.nanoTime()) * 1967148659 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

