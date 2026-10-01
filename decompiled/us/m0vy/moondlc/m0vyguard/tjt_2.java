/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjt_2 {
    private static final int skhn_2 = -443184758;
    private static final int skhw = 2065488546;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ys0etxwsjv;

    private tjt_2() {
    }

    public static int tath_3(int n) {
        int n2 = Integer.rotateRight(n * -57382705 - System.identityHashCode(tjt_2.class), 22) ^ skhn_2;
        int n3 = (n2 ^ n2 >>> 15) * -1462624445;
        int n4 = (n3 ^ n3 >>> 13) * -960449681;
        return n4 ^ n4 >>> 20 ^ skhw;
    }

    public static int dhhgh_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x15)) + skhw ^ skhn_2;
        int n4 = (n3 ^ n3 >>> 10) * 10434563;
        int n5 = (n4 ^ n4 >>> 9) * -1704924911;
        return n5 ^ n5 >>> 20 ^ skhw;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

