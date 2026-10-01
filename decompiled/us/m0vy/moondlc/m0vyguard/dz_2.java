/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dz_2 {
    private static final int bmb = 1924631281;
    private static final int hlz = -418035522;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int e1ciubj5;

    private dz_2() {
    }

    private static int ghzj_2(int n) {
        int n2 = n ^ bmb;
        int n3 = (n2 ^ n2 >>> 8) * -1316777321;
        int n4 = (n3 ^ n3 >>> 9) * 89564357;
        return (n4 ^ n4 >>> 22) + hlz;
    }

    public static int tthsh_2(int n) {
        return dz_2.ghzj_2((n ^ dz_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ bmb);
    }

    public static int tnkh(int n, int n2) {
        return dz_2.ghzj_2((n2 - n ^ 0x7E6E6EB9) + hlz ^ bmb);
    }

    public static boolean sha_4(int n, int n2) {
        return ((dz_2.tnkh(n, n2) ^ (int)System.nanoTime()) * 1704998471 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

