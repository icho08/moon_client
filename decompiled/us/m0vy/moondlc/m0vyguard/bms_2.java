/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bms_2 {
    private static final int that_4 = 5212444;
    private static final int mt_2 = 1002165987;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int toii91e9sjmlv;

    private bms_2() {
    }

    public static int azdh_2(int n) {
        int n2 = (n ^ bms_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ that_4;
        int n3 = (n2 ^ n2 >>> 11) * -1624471491;
        int n4 = (n3 ^ n3 >>> 16) * -1914188041;
        return n4 ^ n4 >>> 22 ^ mt_2;
    }

    public static int dln(int n, int n2) {
        int n3 = Integer.rotateRight(n * 148349129 ^ n2, 15) + mt_2 ^ that_4;
        int n4 = (n3 ^ n3 >>> 16) * 375190921;
        int n5 = (n4 ^ n4 >>> 13) * 1975543391;
        return n5 ^ n5 >>> 19 ^ mt_2;
    }

    public static boolean dakh(int n, int n2) {
        return ((bms_2.dln(n, n2) ^ (int)System.nanoTime()) * -46381469 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

