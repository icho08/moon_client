/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kr {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lm8di1tcvor;

    private kr() {
    }

    private static int khwf(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * 353377451;
        int n4 = (n3 ^ n3 >>> 12) * -681521431;
        return n4 ^ n4 >>> 20;
    }

    public static int rst_2(int n) {
        return kr.khwf((n ^ kr.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int abt(int n, int n2) {
        return kr.khwf(n + n2 ^ Integer.rotateLeft(n, 12));
    }

    public static boolean hkd_2(int n, int n2) {
        return ((kr.abt(n, n2) ^ (int)System.nanoTime()) * -1447608611 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

