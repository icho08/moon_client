/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bbl {
    private static final int khqj = -1057361951;
    private static final int taz_4 = -1102529251;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vpt5zxy29s70;

    private bbl() {
    }

    public static int khat_2(int n) {
        int n2 = n ^ System.identityHashCode(bbl.class) ^ (int)Thread.currentThread().getId() * 1911682233 ^ khqj;
        int n3 = (n2 ^ n2 >>> 14) * 855321969;
        int n4 = (n3 ^ n3 >>> 11) * -568881715;
        return n4 ^ n4 >>> 22 ^ taz_4;
    }

    public static int ha_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -3613909 ^ n2, 13) + taz_4 ^ khqj;
        int n4 = (n3 ^ n3 >>> 16) * 86344103;
        int n5 = (n4 ^ n4 >>> 16) * 815046749;
        return n5 ^ n5 >>> 18 ^ taz_4;
    }

    public static boolean tdb_2(int n, int n2) {
        return ((bbl.ha_3(n, n2) ^ (int)System.nanoTime()) * -8691131 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

