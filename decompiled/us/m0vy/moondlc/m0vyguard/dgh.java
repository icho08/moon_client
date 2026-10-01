/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dgh {
    private static final int tab = 868104351;
    private static final int sad_4 = 992378082;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int l0u09x758jevw;

    private dgh() {
    }

    public static int hbr(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 14) * -1516426307 ^ tab;
        int n3 = (n2 ^ n2 >>> 15) * -1947253735;
        int n4 = (n3 ^ n3 >>> 11) * -1916054383;
        return n4 ^ n4 >>> 18 ^ sad_4;
    }

    public static int khzm_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x13)) + sad_4 ^ tab;
        int n4 = (n3 ^ n3 >>> 11) * 96081325;
        int n5 = (n4 ^ n4 >>> 13) * -1017799313;
        return n5 ^ n5 >>> 15 ^ sad_4;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

