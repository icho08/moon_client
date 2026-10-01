/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wj {
    private static final int hhd_2 = -1849285897;
    private static final int shyth = 1944060978;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int v6u3y95kkzrc;

    private wj() {
    }

    private static int rbth(int n) {
        int n2 = n ^ hhd_2;
        int n3 = (n2 ^ n2 >>> 15) * -1910919679;
        int n4 = (n3 ^ n3 >>> 10) * -1142772753;
        return (n4 ^ n4 >>> 13) + shyth;
    }

    public static int zzy_2(int n) {
        return wj.rbth(Integer.rotateRight((n ^ hhd_2) * 1433342469 - System.identityHashCode(wj.class), 19));
    }

    public static int jam(int n, int n2) {
        return wj.rbth(n + n2 ^ Integer.rotateLeft(n, 4) ^ shyth);
    }

    public static boolean aqa_2(int n, int n2) {
        return ((wj.jam(n, n2) + Thread.currentThread().hashCode()) * -594866025 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

