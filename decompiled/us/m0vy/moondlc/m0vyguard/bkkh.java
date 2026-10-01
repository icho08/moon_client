/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkkh {
    private static final int sfa = 1886961481;
    private static final int thzn = 832506344;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nxiv9uslhqyswn;

    private bkkh() {
    }

    private static int shfw(int n) {
        int n2 = n ^ sfa;
        int n3 = (n2 ^ n2 >>> 14) * 1167556977;
        int n4 = (n3 ^ n3 >>> 12) * -84207753;
        return (n4 ^ n4 >>> 24) + thzn;
    }

    public static int zqq(int n) {
        return bkkh.shfw((n ^ bkkh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ sfa);
    }

    public static int hdhb(int n, int n2) {
        return bkkh.shfw((n2 - n ^ 0x67909904) + thzn ^ sfa);
    }

    public static boolean khym(int n, int n2) {
        return ((bkkh.hdhb(n, n2) ^ (int)System.nanoTime()) * 1919771 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

