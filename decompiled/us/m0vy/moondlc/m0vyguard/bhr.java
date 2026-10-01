/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhr {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int onrky49q0q3;

    private bhr() {
    }

    private static int sza_6(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * 1447730125;
        int n4 = (n3 ^ n3 >>> 19) * 799619759;
        return n4 ^ n4 >>> 14;
    }

    public static int tmq_2(int n) {
        return bhr.sza_6(n ^ System.identityHashCode(bhr.class) ^ (int)Thread.currentThread().getId() * -1992145467);
    }

    public static int tkhd_2(int n, int n2) {
        return bhr.sza_6(Integer.rotateRight(n * 216808165 ^ n2, 16));
    }

    public static boolean sth_2(int n, int n2) {
        return ((bhr.tkhd_2(n, n2) ^ (int)System.nanoTime()) * 1459270761 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

