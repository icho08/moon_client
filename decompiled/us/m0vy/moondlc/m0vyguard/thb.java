/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thb {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g9akxho9ynhd;

    private thb() {
    }

    private static int dhwdh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * -376107293;
        int n4 = (n3 ^ n3 >>> 17) * -1561683621;
        return n4 ^ n4 >>> 16;
    }

    public static int afq(int n) {
        return thb.dhwdh(Integer.rotateLeft(n ^ (int)System.nanoTime(), 20) * 576447877);
    }

    public static int hlz_2(int n, int n2) {
        return thb.dhwdh(n + n2 ^ Integer.rotateLeft(n, 13));
    }

    public static boolean zwgh_2(int n, int n2) {
        return ((thb.hlz_2(n, n2) + Thread.currentThread().hashCode()) * -1622431475 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

