/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btk_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ivz3x01d6;

    private btk_2() {
    }

    public static int haw_2(int n) {
        int n2 = n ^ System.identityHashCode(btk_2.class) ^ (int)Thread.currentThread().getId() * 378423285;
        int n3 = (n2 ^ n2 >>> 12) * 758075261;
        int n4 = (n3 ^ n3 >>> 10) * -695796745;
        return n4 ^ n4 >>> 21;
    }

    public static int bqn(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * 194383223;
        int n4 = (n3 ^ n3 >>> 8) * 1958496971;
        int n5 = (n4 ^ n4 >>> 18) * -1733742935;
        return n5 ^ n5 >>> 12;
    }

    public static boolean rzb(int n, int n2) {
        return ((btk_2.bqn(n, n2) ^ (int)System.nanoTime()) * 710180709 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

