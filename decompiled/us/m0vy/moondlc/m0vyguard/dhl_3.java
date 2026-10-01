/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhl_3 {
    private static final int bfk = 67618593;
    private static final int thqb = 995082520;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eim0ychg;

    private dhl_3() {
    }

    public static int rda_4(int n) {
        int n2 = n ^ bfk ^ System.identityHashCode(dhl_3.class) ^ (int)Thread.currentThread().getId() * 1495336281;
        int n3 = (n2 ^ n2 >>> 14) * 165539179;
        int n4 = (n3 ^ n3 >>> 15) * 339240443;
        return n4 ^ n4 >>> 21;
    }

    public static int bzt(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 11) ^ thqb;
        int n4 = (n3 ^ n3 >>> 17) * 780891061;
        int n5 = (n4 ^ n4 >>> 14) * 1948623839;
        return n5 ^ n5 >>> 15;
    }

    public static boolean tjt_3(int n, int n2) {
        return ((dhl_3.bzt(n, n2) ^ (int)System.nanoTime()) * -898526161 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

