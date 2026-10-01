/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zdh_8 {
    private static final int dbz_2 = -1744656675;
    private static final int khmgh = -1034566180;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fqq1hw8u88;

    private zdh_8() {
    }

    public static int khww(int n) {
        int n2 = Integer.rotateRight(n * -1897772545 - System.identityHashCode(zdh_8.class), 20) ^ dbz_2;
        int n3 = (n2 ^ n2 >>> 11) * 1260086691;
        int n4 = (n3 ^ n3 >>> 12) * 556317383;
        return n4 ^ n4 >>> 22 ^ khmgh;
    }

    public static int azgh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x11)) + khmgh ^ dbz_2;
        int n4 = (n3 ^ n3 >>> 15) * 603925833;
        int n5 = (n4 ^ n4 >>> 17) * -414320735;
        return n5 ^ n5 >>> 13 ^ khmgh;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

