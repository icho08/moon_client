/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bht_2 {
    private static final int shnh = 1692133162;
    private static final int shzw = 1757983670;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int p7celkla;

    private bht_2() {
    }

    public static int rthgh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * 283387795 ^ shnh;
        int n3 = (n2 ^ n2 >>> 14) * 1476872289;
        int n4 = (n3 ^ n3 >>> 8) * 1115950565;
        return n4 ^ n4 >>> 14 ^ shzw;
    }

    public static int zds_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x11)) + shzw ^ shnh;
        int n4 = (n3 ^ n3 >>> 11) * 1889100883;
        int n5 = (n4 ^ n4 >>> 12) * -765032275;
        return n5 ^ n5 >>> 14 ^ shzw;
    }

    public static boolean thym(int n, int n2) {
        return ((bht_2.zds_2(n, n2) + Thread.currentThread().hashCode()) * 381713021 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

