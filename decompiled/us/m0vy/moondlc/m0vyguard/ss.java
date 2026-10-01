/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ss {
    private static final int tshw = 1061184566;
    private static final int bff = 252208512;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lmfxe0pp8;

    private ss() {
    }

    private static int dhnj(int n) {
        int n2 = n ^ tshw;
        int n3 = (n2 ^ n2 >>> 15) * -1703094449;
        int n4 = (n3 ^ n3 >>> 10) * 106595271;
        return (n4 ^ n4 >>> 14) + bff;
    }

    public static int dhdn(int n) {
        return ss.dhnj((n ^ ss.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ tshw);
    }

    public static int shdj(int n, int n2) {
        return ss.dhnj((n + n2 ^ Integer.rotateLeft(n, 11)) + bff ^ tshw);
    }

    public static boolean jk(int n, int n2) {
        return ((ss.shdj(n, n2) ^ (int)System.nanoTime()) * 1495090735 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

