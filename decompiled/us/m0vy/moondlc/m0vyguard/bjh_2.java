/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjh_2 {
    private static final int hjsh = -1275860746;
    private static final int dash_2 = -1923667600;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int svcp2xr4;

    private bjh_2() {
    }

    private static int ha_2(int n) {
        int n2 = n ^ hjsh;
        int n3 = (n2 ^ n2 >>> 15) * 512708559;
        int n4 = (n3 ^ n3 >>> 16) * 90364967;
        return (n4 ^ n4 >>> 21) + dash_2;
    }

    public static int dlh_2(int n) {
        return bjh_2.ha_2(Integer.rotateLeft(n ^ hjsh ^ (int)System.nanoTime(), 18) * -2114675639);
    }

    public static int shah_3(int n, int n2) {
        return bjh_2.ha_2(Integer.rotateLeft(n ^ n2, 18) * 230885011 ^ dash_2);
    }

    public static boolean ghtk_2(int n, int n2) {
        return ((bjh_2.shah_3(n, n2) + Thread.currentThread().hashCode()) * 819721151 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

