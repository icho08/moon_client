/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjs_2 {
    private static final int tts_2 = 642547862;
    private static final int dhdy_2 = -839769946;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k0zs4mtl4;

    private bjs_2() {
    }

    public static int blt_2(int n) {
        int n2 = Integer.rotateRight(n * 1168558787 - System.identityHashCode(bjs_2.class), 16) ^ tts_2;
        int n3 = (n2 ^ n2 >>> 17) * 1280494599;
        int n4 = (n3 ^ n3 >>> 12) * -1818945589;
        return n4 ^ n4 >>> 20 ^ dhdy_2;
    }

    public static int hns(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * -1323521123 + dhdy_2 ^ tts_2;
        int n4 = (n3 ^ n3 >>> 11) * -2006914209;
        int n5 = (n4 ^ n4 >>> 14) * -736172959;
        return n5 ^ n5 >>> 22 ^ dhdy_2;
    }

    public static boolean sksh_2(int n, int n2) {
        return ((bjs_2.hns(n, n2) + Thread.currentThread().hashCode()) * -1346627147 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

