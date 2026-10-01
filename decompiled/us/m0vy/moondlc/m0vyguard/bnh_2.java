/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnh_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int a760oul1;

    private bnh_2() {
    }

    public static int tba_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 4) * -1802064647;
        int n3 = (n2 ^ n2 >>> 15) * 1342389551;
        int n4 = (n3 ^ n3 >>> 8) * -602376091;
        return n4 ^ n4 >>> 22;
    }

    public static int hqz(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xB);
        int n4 = (n3 ^ n3 >>> 14) * 86059983;
        int n5 = (n4 ^ n4 >>> 10) * 1735135363;
        return n5 ^ n5 >>> 20;
    }

    public static boolean bws(int n, int n2) {
        return ((bnh_2.hqz(n, n2) + Thread.currentThread().hashCode()) * 1736331665 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

