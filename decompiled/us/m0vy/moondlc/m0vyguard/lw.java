/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class lw {
    private static final int shqw = -20655071;
    private static final int rthsh = 1044039831;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int drc794qj;

    private lw() {
    }

    public static int jyw(int n) {
        int n2 = (n ^ shqw ^ lw.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 17) * -2067951287;
        int n4 = (n3 ^ n3 >>> 7) * 1398727641;
        return n4 ^ n4 >>> 15;
    }

    public static int dt(int n, int n2) {
        int n3 = n2 - n ^ 0xCA07BCB1 ^ rthsh;
        int n4 = (n3 ^ n3 >>> 11) * -1593878197;
        int n5 = (n4 ^ n4 >>> 17) * -915175125;
        return n5 ^ n5 >>> 18;
    }

    public static boolean dhj_4(int n, int n2) {
        return ((lw.dt(n, n2) ^ (int)System.nanoTime()) * -1547747377 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

