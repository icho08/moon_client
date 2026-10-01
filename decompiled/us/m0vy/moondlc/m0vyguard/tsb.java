/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsb {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int b1y3shrze;

    private tsb() {
    }

    public static int hbz(int n) {
        int n2 = Integer.rotateRight(n * -1825953235 - System.identityHashCode(tsb.class), 16);
        int n3 = (n2 ^ n2 >>> 18) * -661745811;
        int n4 = (n3 ^ n3 >>> 7) * 1347846047;
        return n4 ^ n4 >>> 19;
    }

    public static int dhfkh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xC);
        int n4 = (n3 ^ n3 >>> 10) * 725355525;
        int n5 = (n4 ^ n4 >>> 12) * -2095429569;
        return n5 ^ n5 >>> 22;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

