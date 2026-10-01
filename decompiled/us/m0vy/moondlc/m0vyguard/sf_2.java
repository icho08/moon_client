/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sf_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int satammd1duxki;

    private sf_2() {
    }

    public static int tjgh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 9) * 627204379;
        int n3 = (n2 ^ n2 >>> 12) * 2027509799;
        int n4 = (n3 ^ n3 >>> 13) * 2022886859;
        return n4 ^ n4 >>> 21;
    }

    public static int fq(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x14);
        int n4 = (n3 ^ n3 >>> 11) * -1040677987;
        int n5 = (n4 ^ n4 >>> 10) * -1835222365;
        return n5 ^ n5 >>> 18;
    }

    public static boolean dhqgh(int n, int n2) {
        return ((sf_2.fq(n, n2) + Thread.currentThread().hashCode()) * 195596741 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

