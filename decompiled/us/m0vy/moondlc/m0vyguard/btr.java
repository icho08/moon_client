/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btr {
    private static final int dzm_2 = 1975711319;
    private static final int th_2 = -386735431;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wodoqit16koyv3;

    private btr() {
    }

    public static int bwth(int n) {
        int n2 = n ^ System.identityHashCode(btr.class) ^ (int)Thread.currentThread().getId() * 1278253535 ^ dzm_2;
        int n3 = (n2 ^ n2 >>> 18) * -793449683;
        int n4 = (n3 ^ n3 >>> 14) * 730029427;
        return n4 ^ n4 >>> 13 ^ th_2;
    }

    public static int rakh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 10)) + th_2 ^ dzm_2;
        int n4 = (n3 ^ n3 >>> 8) * 977720663;
        int n5 = (n4 ^ n4 >>> 9) * 1554994063;
        return n5 ^ n5 >>> 16 ^ th_2;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

