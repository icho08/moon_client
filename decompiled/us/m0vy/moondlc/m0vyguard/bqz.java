/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqz {
    private static final int ds_4 = -1156907055;
    private static final int jghn = 1684728014;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fgbsm5t4w03371;

    private bqz() {
    }

    public static int jlm(int n) {
        int n2 = n ^ ds_4 ^ System.identityHashCode(bqz.class) ^ (int)Thread.currentThread().getId() * 48520977;
        int n3 = (n2 ^ n2 >>> 11) * 1813976863;
        int n4 = (n3 ^ n3 >>> 10) * 2037034479;
        return n4 ^ n4 >>> 22;
    }

    public static int dzs(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1940671571 ^ n2, 16) ^ jghn;
        int n4 = (n3 ^ n3 >>> 15) * -991570407;
        int n5 = (n4 ^ n4 >>> 13) * -380668965;
        return n5 ^ n5 >>> 18;
    }

    public static boolean bmy(int n, int n2) {
        return ((bqz.dzs(n, n2) ^ (int)System.nanoTime()) * -1400931771 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

