/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btz_2 {
    private static final int jsh = 1318378559;
    private static final int thmd = -1323602515;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nnedtepx;

    private btz_2() {
    }

    public static int jzq_2(int n) {
        int n2 = n ^ System.identityHashCode(btz_2.class) ^ (int)Thread.currentThread().getId() * 418253733 ^ jsh;
        int n3 = (n2 ^ n2 >>> 16) * -1986477031;
        int n4 = (n3 ^ n3 >>> 7) * -959184329;
        return n4 ^ n4 >>> 16 ^ thmd;
    }

    public static int adj(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * -1554961943 + thmd ^ jsh;
        int n4 = (n3 ^ n3 >>> 13) * -1925944147;
        int n5 = (n4 ^ n4 >>> 13) * 2052686065;
        return n5 ^ n5 >>> 20 ^ thmd;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

