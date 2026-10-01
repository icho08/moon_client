/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zs_4 {
    private static final int thrf = -1908471339;
    private static final int sghdh = 1451022794;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hokvv3456h18;

    private zs_4() {
    }

    private static int zth_3(int n) {
        int n2 = n ^ thrf;
        int n3 = (n2 ^ n2 >>> 14) * -1433618903;
        int n4 = (n3 ^ n3 >>> 13) * 1643261419;
        return (n4 ^ n4 >>> 13) + sghdh;
    }

    public static int hagh(int n) {
        return zs_4.zth_3(Integer.rotateRight((n ^ thrf) * -1692159333 - System.identityHashCode(zs_4.class), 7));
    }

    public static int rshsh(int n, int n2) {
        return zs_4.zth_3(Integer.rotateRight(n * 565759365 ^ n2, 8) ^ sghdh);
    }

    public static boolean rdh_5(int n, int n2) {
        return ((zs_4.rshsh(n, n2) + Thread.currentThread().hashCode()) * 720308503 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

