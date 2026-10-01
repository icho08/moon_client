/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zs_3 {
    private static final int khrdh = -775785291;
    private static final int jan = -1687586829;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tj2k6tllxh;

    private zs_3() {
    }

    public static int shkhh(int n) {
        int n2 = Integer.rotateRight((n ^ khrdh) * 1279195803 - System.identityHashCode(zs_3.class), 24);
        int n3 = (n2 ^ n2 >>> 13) * -114569595;
        int n4 = (n3 ^ n3 >>> 15) * -1890758711;
        return n4 ^ n4 >>> 19;
    }

    public static int rzr(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 8) ^ jan;
        int n4 = (n3 ^ n3 >>> 16) * -328494643;
        int n5 = (n4 ^ n4 >>> 16) * 526941569;
        return n5 ^ n5 >>> 14;
    }

    public static boolean zdhw_2(int n, int n2) {
        return ((zs_3.rzr(n, n2) + Thread.currentThread().hashCode()) * 200438511 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

