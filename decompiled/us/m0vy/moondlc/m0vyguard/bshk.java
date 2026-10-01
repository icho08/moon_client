/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshk {
    private static final int khja = 1426513342;
    private static final int bath = -1982921151;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int z2avi5wd6o;

    private bshk() {
    }

    private static int rd_2(int n) {
        int n2 = n ^ khja;
        int n3 = (n2 ^ n2 >>> 8) * -1766602007;
        int n4 = (n3 ^ n3 >>> 17) * -91699971;
        return (n4 ^ n4 >>> 17) + bath;
    }

    public static int rthr(int n) {
        return bshk.rd_2(Integer.rotateRight(n * 58993707 - System.identityHashCode(bshk.class), 23) ^ khja);
    }

    public static int abz_2(int n, int n2) {
        return bshk.rd_2(Integer.rotateLeft(n ^ n2, 7) * 1798150841 + bath ^ khja);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

