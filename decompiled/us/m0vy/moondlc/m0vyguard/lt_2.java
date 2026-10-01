/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class lt_2 {
    private static final int khthn = -1700174882;
    private static final int zkhr = 1245916187;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lgzzlr84akhir;

    private lt_2() {
    }

    public static int zhn_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 22) * -1229065153 ^ khthn;
        int n3 = (n2 ^ n2 >>> 16) * -406104151;
        int n4 = (n3 ^ n3 >>> 13) * -1340121953;
        return n4 ^ n4 >>> 22 ^ zkhr;
    }

    public static int dhdhsh(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1613470843 ^ n2, 20) + zkhr ^ khthn;
        int n4 = (n3 ^ n3 >>> 15) * 1401779855;
        int n5 = (n4 ^ n4 >>> 13) * 1405807;
        return n5 ^ n5 >>> 21 ^ zkhr;
    }

    public static boolean thr_2(int n, int n2) {
        return ((lt_2.dhdhsh(n, n2) + Thread.currentThread().hashCode()) * 1865049253 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

