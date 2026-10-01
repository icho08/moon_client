/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhgh_2 {
    private static final int zhdh = 862975200;
    private static final int dfy = -1851151929;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gf5p599hzc8p7q;

    private bhgh_2() {
    }

    public static int saq_4(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 21) * -1255439087 ^ zhdh;
        int n3 = (n2 ^ n2 >>> 18) * -1263263855;
        int n4 = (n3 ^ n3 >>> 14) * -1004789217;
        return n4 ^ n4 >>> 22 ^ dfy;
    }

    public static int tsdh_3(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x14)) + dfy ^ zhdh;
        int n4 = (n3 ^ n3 >>> 9) * -1589331135;
        int n5 = (n4 ^ n4 >>> 17) * -1811287449;
        return n5 ^ n5 >>> 23 ^ dfy;
    }

    public static boolean dhkhdh(int n, int n2) {
        return ((bhgh_2.tsdh_3(n, n2) + Thread.currentThread().hashCode()) * 672658143 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

