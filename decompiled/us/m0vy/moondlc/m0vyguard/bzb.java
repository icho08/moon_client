/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzb {
    private static final int khghd_2 = 929393421;
    private static final int blz = 450688095;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int oxiw24tp;

    private bzb() {
    }

    public static int dwt_4(int n) {
        int n2 = n ^ khghd_2 ^ System.identityHashCode(bzb.class) ^ (int)Thread.currentThread().getId() * 1354702899;
        int n3 = (n2 ^ n2 >>> 11) * -1051209803;
        int n4 = (n3 ^ n3 >>> 10) * 1373900959;
        return n4 ^ n4 >>> 21;
    }

    public static int ztdh_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -575435271 ^ n2, 12) ^ blz;
        int n4 = (n3 ^ n3 >>> 11) * -326130771;
        int n5 = (n4 ^ n4 >>> 10) * 476760127;
        return n5 ^ n5 >>> 13;
    }

    public static boolean ahd_4(int n, int n2) {
        return ((bzb.ztdh_3(n, n2) ^ (int)System.nanoTime()) * 1212588733 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

