/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hth_6 {
    private static final int tsd_4 = 1246543542;
    private static final int hyn = -1204892987;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zwl5wjn8m;

    private hth_6() {
    }

    private static int ghtf(int n) {
        int n2 = n ^ tsd_4;
        int n3 = (n2 ^ n2 >>> 15) * 1067905957;
        int n4 = (n3 ^ n3 >>> 17) * -1790100337;
        return (n4 ^ n4 >>> 12) + hyn;
    }

    public static int dhqa_2(int n) {
        return hth_6.ghtf((n ^ tsd_4 ^ hth_6.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int khfh(int n, int n2) {
        return hth_6.ghtf(n2 ^ Integer.rotateLeft(n, n2 & 0xB) ^ hyn);
    }

    public static boolean rw(int n, int n2) {
        return ((hth_6.khfh(n, n2) ^ (int)System.nanoTime()) * -1852823609 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

