/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzs_4 {
    private static final int dhwn = 1128736365;
    private static final int khkr = -1041608759;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int srjmp5or3f3rb;

    private bzs_4() {
    }

    private static int bkht(int n) {
        int n2 = n ^ dhwn;
        int n3 = (n2 ^ n2 >>> 13) * 1699139405;
        int n4 = (n3 ^ n3 >>> 13) * 1383205621;
        return (n4 ^ n4 >>> 24) + khkr;
    }

    public static int zqth_2(int n) {
        return bzs_4.bkht(Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * 508369609 ^ dhwn);
    }

    public static int jghd(int n, int n2) {
        return bzs_4.bkht((n + n2 ^ Integer.rotateLeft(n, 9)) + khkr ^ dhwn);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

