/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btm_2 {
    private static final int sakh_3 = 1548491299;
    private static final int shqth = 550014285;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int uhod71j1k;

    private btm_2() {
    }

    public static int ryt_2(int n) {
        int n2 = Integer.rotateRight(n * -358752055 - System.identityHashCode(btm_2.class), 17) ^ sakh_3;
        int n3 = (n2 ^ n2 >>> 12) * 1464914093;
        int n4 = (n3 ^ n3 >>> 16) * 1817667925;
        return n4 ^ n4 >>> 14 ^ shqth;
    }

    public static int wl(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 10)) + shqth ^ sakh_3;
        int n4 = (n3 ^ n3 >>> 17) * -1939832943;
        int n5 = (n4 ^ n4 >>> 18) * 117736827;
        return n5 ^ n5 >>> 19 ^ shqth;
    }

    public static boolean htht_2(int n, int n2) {
        return ((btm_2.wl(n, n2) + Thread.currentThread().hashCode()) * -226767123 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

