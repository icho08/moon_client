/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhkh {
    private static final int ths_6 = 2023396939;
    private static final int khkhb = -1911254377;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int h2tjges6f0k;

    private bkhkh() {
    }

    public static int dhkj(int n) {
        int n2 = Integer.rotateRight((n ^ ths_6) * -447696903 - System.identityHashCode(bkhkh.class), 19);
        int n3 = (n2 ^ n2 >>> 16) * -92729767;
        int n4 = (n3 ^ n3 >>> 11) * -337134091;
        return n4 ^ n4 >>> 15;
    }

    public static int zbz_3(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * -745116487 ^ khkhb;
        int n4 = (n3 ^ n3 >>> 11) * -1511483859;
        int n5 = (n4 ^ n4 >>> 10) * 912379269;
        return n5 ^ n5 >>> 16;
    }

    public static boolean zwgh(int n, int n2) {
        return ((bkhkh.zbz_3(n, n2) + Thread.currentThread().hashCode()) * 733899265 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

