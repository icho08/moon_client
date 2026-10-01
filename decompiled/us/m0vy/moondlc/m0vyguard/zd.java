/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zd {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int zmtfamejk;

    private zd() {
    }

    public static int syd(int n) {
        int n2 = Integer.rotateRight(n * -49992053 - System.identityHashCode(zd.class), 25);
        int n3 = (n2 ^ n2 >>> 13) * 1274228599;
        int n4 = (n3 ^ n3 >>> 13) * -1172132609;
        return n4 ^ n4 >>> 15;
    }

    public static int snh_3(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 9);
        int n4 = (n3 ^ n3 >>> 17) * -1975970205;
        int n5 = (n4 ^ n4 >>> 13) * -2061264931;
        return n5 ^ n5 >>> 21;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

