/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthh {
    private static final int fa_2 = 1513940312;
    private static final int hdgh = -1870570532;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int f8ath4q4m;

    private bthh() {
    }

    public static int zbj_2(int n) {
        int n2 = n ^ fa_2 ^ System.identityHashCode(bthh.class) ^ (int)Thread.currentThread().getId() * -429339539;
        int n3 = (n2 ^ n2 >>> 11) * 1667078167;
        int n4 = (n3 ^ n3 >>> 15) * 1214448797;
        return n4 ^ n4 >>> 20;
    }

    public static int bwm(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1281410239 ^ n2, 20) ^ hdgh;
        int n4 = (n3 ^ n3 >>> 14) * -190846733;
        int n5 = (n4 ^ n4 >>> 14) * 1770078849;
        return n5 ^ n5 >>> 20;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

