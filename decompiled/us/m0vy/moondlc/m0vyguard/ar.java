/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ar {
    private static final int khdq = -1925872547;
    private static final int brkh = 1474861576;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dc270pjtbnw2;

    private ar() {
    }

    private static int dhth_4(int n) {
        int n2 = n ^ khdq;
        int n3 = (n2 ^ n2 >>> 7) * 1761969153;
        int n4 = (n3 ^ n3 >>> 15) * -263397865;
        return (n4 ^ n4 >>> 12) + brkh;
    }

    public static int rka_2(int n) {
        return ar.dhth_4(Integer.rotateLeft(n ^ khdq ^ (int)System.nanoTime(), 22) * -1554078693);
    }

    public static int hkr(int n, int n2) {
        return ar.dhth_4(Integer.rotateLeft(n ^ n2, 18) * -2115802019 ^ brkh);
    }

    public static boolean sghq(int n, int n2) {
        return ((ar.hkr(n, n2) + Thread.currentThread().hashCode()) * 1056418993 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

