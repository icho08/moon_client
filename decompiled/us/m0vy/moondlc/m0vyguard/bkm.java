/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkm {
    private static final int dqn = -1241220856;
    private static final int zhk = 1395610719;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int r9lwa1p4zg;

    private bkm() {
    }

    public static int sdhs_4(int n) {
        int n2 = Integer.rotateRight(n * 1403516195 - System.identityHashCode(bkm.class), 5) ^ dqn;
        int n3 = (n2 ^ n2 >>> 12) * 687368311;
        int n4 = (n3 ^ n3 >>> 12) * 1892369329;
        return n4 ^ n4 >>> 16 ^ zhk;
    }

    public static int rds(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -442516641 + zhk ^ dqn;
        int n4 = (n3 ^ n3 >>> 9) * 499441795;
        int n5 = (n4 ^ n4 >>> 10) * 1401500041;
        return n5 ^ n5 >>> 19 ^ zhk;
    }

    public static boolean rys_2(int n, int n2) {
        return ((bkm.rds(n, n2) + Thread.currentThread().hashCode()) * -576435227 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

