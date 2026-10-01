/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hl_2 {
    private static final int zssh_2 = 850705964;
    private static final int dhshm = 95485915;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int c69wvv8i3l5xh;

    private hl_2() {
    }

    private static int tkh_5(int n) {
        int n2 = n ^ zssh_2;
        int n3 = (n2 ^ n2 >>> 15) * -2037188789;
        int n4 = (n3 ^ n3 >>> 12) * 2131880041;
        return (n4 ^ n4 >>> 23) + dhshm;
    }

    public static int jat_4(int n) {
        return hl_2.tkh_5(n ^ System.identityHashCode(hl_2.class) ^ (int)Thread.currentThread().getId() * 948416137 ^ zssh_2);
    }

    public static int khaf_2(int n, int n2) {
        return hl_2.tkh_5(Integer.rotateRight(n * 1114144069 ^ n2, 7) + dhshm ^ zssh_2);
    }

    public static boolean sthq(int n, int n2) {
        return ((hl_2.khaf_2(n, n2) ^ (int)System.nanoTime()) * -1840073893 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

