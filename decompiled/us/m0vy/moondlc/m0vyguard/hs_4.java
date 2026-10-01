/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hs_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int yjgi2nec0aaq4;

    private hs_4() {
    }

    public static int ghat(int n) {
        int n2 = (n ^ hs_4.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * 396372739;
        int n4 = (n3 ^ n3 >>> 11) * -1365328555;
        return n4 ^ n4 >>> 16;
    }

    public static int dhghb(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1885785257 ^ n2, 12);
        int n4 = (n3 ^ n3 >>> 8) * 299902427;
        int n5 = (n4 ^ n4 >>> 13) * 2133515227;
        return n5 ^ n5 >>> 15;
    }

    public static boolean rya(int n, int n2) {
        return ((hs_4.dhghb(n, n2) ^ (int)System.nanoTime()) * -1040786341 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

