/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class blz_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ei8vs5pjl;

    private blz_2() {
    }

    public static int khmdh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * 1176978051;
        int n3 = (n2 ^ n2 >>> 18) * 1968311859;
        int n4 = (n3 ^ n3 >>> 15) * -199499621;
        return n4 ^ n4 >>> 20;
    }

    public static int zrz_4(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1621792383 ^ n2, 12);
        int n4 = (n3 ^ n3 >>> 8) * 97467007;
        int n5 = (n4 ^ n4 >>> 16) * -1733247971;
        return n5 ^ n5 >>> 17;
    }

    public static boolean akn(int n, int n2) {
        return ((blz_2.zrz_4(n, n2) + Thread.currentThread().hashCode()) * 2034412741 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

