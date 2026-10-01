/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class df_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bffdz384q;

    private df_2() {
    }

    public static int hwkh(int n) {
        int n2 = n ^ System.identityHashCode(df_2.class) ^ (int)Thread.currentThread().getId() * -417338043;
        int n3 = (n2 ^ n2 >>> 16) * -1351781969;
        int n4 = (n3 ^ n3 >>> 10) * 1665075749;
        return n4 ^ n4 >>> 18;
    }

    public static int tda_4(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 11) * -1539525223;
        int n4 = (n3 ^ n3 >>> 10) * 1911456413;
        int n5 = (n4 ^ n4 >>> 9) * -1865570625;
        return n5 ^ n5 >>> 16;
    }

    public static boolean shmj(int n, int n2) {
        return ((df_2.tda_4(n, n2) ^ (int)System.nanoTime()) * 1734823117 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

