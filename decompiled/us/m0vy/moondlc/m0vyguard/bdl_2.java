/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdl_2 {
    private static final int rdn = 1213812765;
    private static final int hdf_2 = -1770374165;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int j4ew8lcv9;

    private bdl_2() {
    }

    public static int dtq(int n) {
        int n2 = n ^ rdn ^ System.identityHashCode(bdl_2.class) ^ (int)Thread.currentThread().getId() * -1936107517;
        int n3 = (n2 ^ n2 >>> 15) * -890434453;
        int n4 = (n3 ^ n3 >>> 12) * 557965475;
        return n4 ^ n4 >>> 19;
    }

    public static int sdz_5(int n, int n2) {
        int n3 = Integer.rotateRight(n * -33775131 ^ n2, 10) ^ hdf_2;
        int n4 = (n3 ^ n3 >>> 11) * 3482719;
        int n5 = (n4 ^ n4 >>> 14) * 564430381;
        return n5 ^ n5 >>> 16;
    }

    public static boolean dnd(int n, int n2) {
        return ((bdl_2.sdz_5(n, n2) ^ (int)System.nanoTime()) * 1487862585 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

