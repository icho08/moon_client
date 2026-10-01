/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhj {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ncebflaw0c49o;

    private tkhj() {
    }

    private static int anr(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 7) * 1047508697;
        int n4 = (n3 ^ n3 >>> 14) * 402147085;
        return n4 ^ n4 >>> 18;
    }

    public static int tghs_4(int n) {
        return tkhj.anr(Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * -413410445);
    }

    public static int hzd_3(int n, int n2) {
        return tkhj.anr(n + n2 ^ Integer.rotateLeft(n, 11));
    }

    public static boolean tda(int n, int n2) {
        return ((tkhj.hzd_3(n, n2) + Thread.currentThread().hashCode()) * -882734859 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

