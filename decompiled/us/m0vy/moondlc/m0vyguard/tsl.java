/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsl {
    private static final int sdz_5 = -292144505;
    private static final int bwb = -597247883;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vw9k5fuyb04j;

    private tsl() {
    }

    public static int dla_3(int n) {
        int n2 = Integer.rotateRight((n ^ sdz_5) * -1649496593 - System.identityHashCode(tsl.class), 16);
        int n3 = (n2 ^ n2 >>> 18) * -1359717057;
        int n4 = (n3 ^ n3 >>> 9) * 1277140341;
        return n4 ^ n4 >>> 14;
    }

    public static int khlt(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x13) ^ bwb;
        int n4 = (n3 ^ n3 >>> 16) * 831112055;
        int n5 = (n4 ^ n4 >>> 10) * 1735880825;
        return n5 ^ n5 >>> 13;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

