/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthdh {
    private static final int tyt_2 = -1744357309;
    private static final int rash_2 = 929002525;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o74y6qgk7kpqs7;

    private bthdh() {
    }

    private static int ghhy(int n) {
        int n2 = n ^ tyt_2;
        int n3 = (n2 ^ n2 >>> 9) * -79854255;
        int n4 = (n3 ^ n3 >>> 14) * -50592847;
        return (n4 ^ n4 >>> 18) + rash_2;
    }

    public static int tbh_4(int n) {
        return bthdh.ghhy(n ^ System.identityHashCode(bthdh.class) ^ (int)Thread.currentThread().getId() * -1152447071 ^ tyt_2);
    }

    public static int shbk(int n, int n2) {
        return bthdh.ghhy(Integer.rotateRight(n * 327026649 ^ n2, 16) + rash_2 ^ tyt_2);
    }

    public static boolean thaj_2(int n, int n2) {
        return ((bthdh.shbk(n, n2) ^ (int)System.nanoTime()) * -208534387 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

