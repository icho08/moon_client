/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhdh {
    private static final int sz_2 = -910281259;
    private static final int dhf_3 = 459728377;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ldc68b08do;

    private bkhdh() {
    }

    private static int tlth(int n) {
        int n2 = n ^ sz_2;
        int n3 = (n2 ^ n2 >>> 9) * 1708055757;
        int n4 = (n3 ^ n3 >>> 20) * 79702339;
        return (n4 ^ n4 >>> 15) + dhf_3;
    }

    public static int shthth(int n) {
        return bkhdh.tlth(Integer.rotateLeft(n ^ (int)System.nanoTime(), 3) * 1368047363 ^ sz_2);
    }

    public static int sdgh_4(int n, int n2) {
        return bkhdh.tlth(Integer.rotateRight(n * -675531803 ^ n2, 12) + dhf_3 ^ sz_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

