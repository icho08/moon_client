/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsth {
    private static final int zmf = -1852125472;
    private static final int stkh = -1030707386;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wnyxsn8u;

    private bsth() {
    }

    public static int snn(int n) {
        int n2 = Integer.rotateLeft(n ^ zmf ^ (int)System.nanoTime(), 19) * 1453387785;
        int n3 = (n2 ^ n2 >>> 14) * 1559074379;
        int n4 = (n3 ^ n3 >>> 11) * 1549861135;
        return n4 ^ n4 >>> 15;
    }

    public static int rshz(int n, int n2) {
        int n3 = n2 - n ^ 0x4144E07B ^ stkh;
        int n4 = (n3 ^ n3 >>> 14) * -398227301;
        int n5 = (n4 ^ n4 >>> 10) * -17745463;
        return n5 ^ n5 >>> 20;
    }

    public static boolean dn(int n, int n2) {
        return ((bsth.rshz(n, n2) + Thread.currentThread().hashCode()) * 1028473055 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

