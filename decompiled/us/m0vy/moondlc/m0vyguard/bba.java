/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bba {
    private static final int tfs_2 = -909399872;
    private static final int sby = 1483530165;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ri7ycnpcfka;

    private bba() {
    }

    public static int ayt(int n) {
        int n2 = Integer.rotateRight(n * 349040859 - System.identityHashCode(bba.class), 26) ^ tfs_2;
        int n3 = (n2 ^ n2 >>> 14) * 1657779969;
        int n4 = (n3 ^ n3 >>> 8) * -463845747;
        return n4 ^ n4 >>> 21 ^ sby;
    }

    public static int thaw_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 12)) + sby ^ tfs_2;
        int n4 = (n3 ^ n3 >>> 8) * 725709293;
        int n5 = (n4 ^ n4 >>> 12) * 883596509;
        return n5 ^ n5 >>> 17 ^ sby;
    }

    public static boolean dfl(int n, int n2) {
        return ((bba.thaw_2(n, n2) + Thread.currentThread().hashCode()) * -36130009 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

