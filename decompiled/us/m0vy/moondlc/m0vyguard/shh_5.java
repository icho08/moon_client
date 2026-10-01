/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shh_5 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ttqkflazs7rvv2;

    private shh_5() {
    }

    public static int saa(int n) {
        int n2 = (n ^ shh_5.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 11) * -1833283683;
        int n4 = (n3 ^ n3 >>> 7) * -1288597573;
        return n4 ^ n4 >>> 20;
    }

    public static int thna_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 8);
        int n4 = (n3 ^ n3 >>> 16) * -1517609325;
        int n5 = (n4 ^ n4 >>> 18) * 2101702761;
        return n5 ^ n5 >>> 17;
    }

    public static boolean jsha_2(int n, int n2) {
        return ((shh_5.thna_2(n, n2) ^ (int)System.nanoTime()) * 1884799113 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

