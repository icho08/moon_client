/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class la_2 {
    private static final int thhn_2 = 543226906;
    private static final int shdh_3 = -1011770928;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int baccizl1;

    private la_2() {
    }

    private static int bagh(int n) {
        int n2 = n ^ thhn_2;
        int n3 = (n2 ^ n2 >>> 15) * 114021283;
        int n4 = (n3 ^ n3 >>> 12) * -1193188783;
        return (n4 ^ n4 >>> 19) + shdh_3;
    }

    public static int kt(int n) {
        return la_2.bagh(Integer.rotateRight(n * 2056665441 - System.identityHashCode(la_2.class), 15) ^ thhn_2);
    }

    public static int khaa_3(int n, int n2) {
        return la_2.bagh(Integer.rotateLeft(n ^ n2, 9) * -783047367 + shdh_3 ^ thhn_2);
    }

    public static boolean brj(int n, int n2) {
        return ((la_2.khaa_3(n, n2) + Thread.currentThread().hashCode()) * -1326979551 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

