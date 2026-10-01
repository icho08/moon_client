/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bka {
    private static final int zrr = -2004670638;
    private static final int rdj_2 = 2139052310;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gbqp6q4h;

    private bka() {
    }

    public static int hnh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 18) * -890289289 ^ zrr;
        int n3 = (n2 ^ n2 >>> 18) * 1312787169;
        int n4 = (n3 ^ n3 >>> 8) * -624313707;
        return n4 ^ n4 >>> 19 ^ rdj_2;
    }

    public static int tab(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1420062633 ^ n2, 10) + rdj_2 ^ zrr;
        int n4 = (n3 ^ n3 >>> 14) * 620162173;
        int n5 = (n4 ^ n4 >>> 12) * 719823887;
        return n5 ^ n5 >>> 21 ^ rdj_2;
    }

    public static boolean zra_4(int n, int n2) {
        return ((bka.tab(n, n2) + Thread.currentThread().hashCode()) * 666782709 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

