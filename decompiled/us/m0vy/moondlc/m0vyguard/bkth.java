/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkth {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int jkindf7nbzms4l;

    private bkth() {
    }

    public static int tt_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * 68764025;
        int n3 = (n2 ^ n2 >>> 18) * -1635926117;
        int n4 = (n3 ^ n3 >>> 12) * 557394983;
        return n4 ^ n4 >>> 19;
    }

    public static int bngh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 7);
        int n4 = (n3 ^ n3 >>> 8) * -1976377401;
        int n5 = (n4 ^ n4 >>> 12) * -579776381;
        return n5 ^ n5 >>> 22;
    }

    public static boolean tdh_10(int n, int n2) {
        return ((bkth.bngh(n, n2) + Thread.currentThread().hashCode()) * 1399667509 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

