/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsh_2 {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nvapy5c9b;

    private tsh_2() {
    }

    public static int ajkh(int n) {
        int n2 = (n ^ tsh_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 14) * -1756773387;
        int n4 = (n3 ^ n3 >>> 12) * -1904448959;
        return n4 ^ n4 >>> 18;
    }

    public static int thzr_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x11);
        int n4 = (n3 ^ n3 >>> 13) * 0x70000607;
        int n5 = (n4 ^ n4 >>> 18) * 1125193619;
        return n5 ^ n5 >>> 13;
    }

    public static boolean bbm(int n, int n2) {
        return ((tsh_2.thzr_2(n, n2) ^ (int)System.nanoTime()) * 1989685523 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

