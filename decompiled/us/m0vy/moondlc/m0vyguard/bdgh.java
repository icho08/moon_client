/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdgh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ay48u3tgszerm;

    private bdgh() {
    }

    private static int sqw_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * -115103603;
        int n4 = (n3 ^ n3 >>> 14) * -921191367;
        return n4 ^ n4 >>> 14;
    }

    public static int zdhy(int n) {
        return bdgh.sqw_2(n ^ System.identityHashCode(bdgh.class) ^ (int)Thread.currentThread().getId() * 224825793);
    }

    public static int dat_6(int n, int n2) {
        return bdgh.sqw_2(n2 ^ Integer.rotateLeft(n, n2 & 0xA));
    }

    public static boolean zwr_2(int n, int n2) {
        return ((bdgh.dat_6(n, n2) ^ (int)System.nanoTime()) * -1237262313 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

