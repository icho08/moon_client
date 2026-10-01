/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bls {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zyhea5vtkb3;

    private bls() {
    }

    public static int zfb(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 18) * -1695559351;
        int n3 = (n2 ^ n2 >>> 14) * -1999602287;
        int n4 = (n3 ^ n3 >>> 16) * 1321644869;
        return n4 ^ n4 >>> 13;
    }

    public static int na_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1785628823 ^ n2, 12);
        int n4 = (n3 ^ n3 >>> 9) * 1870665995;
        int n5 = (n4 ^ n4 >>> 10) * 1509211643;
        return n5 ^ n5 >>> 16;
    }

    public static boolean dkj_2(int n, int n2) {
        return ((bls.na_2(n, n2) + Thread.currentThread().hashCode()) * 1793637481 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

