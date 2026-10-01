/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sha_5 {
    private static final int sjr = 1361372381;
    private static final int thkhy = 1444464607;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v5ianwep;

    private sha_5() {
    }

    public static int jjn(int n) {
        int n2 = (n ^ sha_5.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ sjr;
        int n3 = (n2 ^ n2 >>> 16) * -2048054253;
        int n4 = (n3 ^ n3 >>> 10) * 1612478009;
        return n4 ^ n4 >>> 17 ^ thkhy;
    }

    public static int thddh(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 12)) + thkhy ^ sjr;
        int n4 = (n3 ^ n3 >>> 11) * 1138799369;
        int n5 = (n4 ^ n4 >>> 12) * -302896359;
        return n5 ^ n5 >>> 14 ^ thkhy;
    }

    public static boolean dws_2(int n, int n2) {
        return ((sha_5.thddh(n, n2) ^ (int)System.nanoTime()) * -1500822529 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

