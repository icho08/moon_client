/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class h_2 {
    private static final int skhz_3 = 1238934320;
    private static final int dmm = 1419481321;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int h86zfd7o;

    private h_2() {
    }

    private static int dtl_3(int n) {
        int n2 = n ^ skhz_3;
        int n3 = (n2 ^ n2 >>> 7) * 1043868967;
        int n4 = (n3 ^ n3 >>> 17) * -2104724177;
        return (n4 ^ n4 >>> 19) + dmm;
    }

    public static int shjs_2(int n) {
        return h_2.dtl_3((n ^ skhz_3 ^ h_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int arb(int n, int n2) {
        return h_2.dtl_3(Integer.rotateRight(n * -249433697 ^ n2, 16) ^ dmm);
    }

    public static boolean hdq(int n, int n2) {
        return ((h_2.arb(n, n2) ^ (int)System.nanoTime()) * -925580819 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

