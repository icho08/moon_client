/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzt_2 {
    private static final int tyz = 1953868771;
    private static final int sthdh_2 = 578329032;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c1k5w7p0;

    private bzt_2() {
    }

    public static int dath_2(int n) {
        int n2 = n ^ System.identityHashCode(bzt_2.class) ^ (int)Thread.currentThread().getId() * -94502581 ^ tyz;
        int n3 = (n2 ^ n2 >>> 15) * 1402278159;
        int n4 = (n3 ^ n3 >>> 11) * 1856024721;
        return n4 ^ n4 >>> 21 ^ sthdh_2;
    }

    public static int shthj(int n, int n2) {
        int n3 = Integer.rotateRight(n * 601353507 ^ n2, 8) + sthdh_2 ^ tyz;
        int n4 = (n3 ^ n3 >>> 12) * 1675099573;
        int n5 = (n4 ^ n4 >>> 10) * 1368694999;
        return n5 ^ n5 >>> 18 ^ sthdh_2;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

