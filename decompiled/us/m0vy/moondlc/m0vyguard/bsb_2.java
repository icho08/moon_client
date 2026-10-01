/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsb_2 {
    private static final int hzb_2 = 38227147;
    private static final int jkhj = 529456163;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qa30crzlb;

    private bsb_2() {
    }

    public static int bnh(int n) {
        int n2 = Integer.rotateLeft(n ^ hzb_2 ^ (int)System.nanoTime(), 4) * 619451661;
        int n3 = (n2 ^ n2 >>> 13) * 407072023;
        int n4 = (n3 ^ n3 >>> 16) * 734046467;
        return n4 ^ n4 >>> 13;
    }

    public static int tshn_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 10) ^ jkhj;
        int n4 = (n3 ^ n3 >>> 13) * 645567115;
        int n5 = (n4 ^ n4 >>> 12) * -668979821;
        return n5 ^ n5 >>> 14;
    }

    public static boolean raf(int n, int n2) {
        return ((bsb_2.tshn_2(n, n2) + Thread.currentThread().hashCode()) * -88922283 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

