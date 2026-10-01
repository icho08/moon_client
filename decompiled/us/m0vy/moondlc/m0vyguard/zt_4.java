/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zt_4 {
    private static final int tst_3 = 2109609850;
    private static final int bsa_2 = 1667439138;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int d693luso0;

    private zt_4() {
    }

    private static int abz(int n) {
        int n2 = n ^ tst_3;
        int n3 = (n2 ^ n2 >>> 7) * -621018649;
        int n4 = (n3 ^ n3 >>> 15) * -2072624511;
        return (n4 ^ n4 >>> 23) + bsa_2;
    }

    public static int ashb(int n) {
        return zt_4.abz(Integer.rotateLeft(n ^ (int)System.nanoTime(), 18) * 1616180863 ^ tst_3);
    }

    public static int tmj_2(int n, int n2) {
        return zt_4.abz((n + n2 ^ Integer.rotateLeft(n, 15)) + bsa_2 ^ tst_3);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

