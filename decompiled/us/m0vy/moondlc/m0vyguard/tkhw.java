/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhw {
    private static final int bfz_2 = -1058260928;
    private static final int ttk = 65625284;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int f0zz1vq7hfpdl;

    private tkhw() {
    }

    private static int tsh_9(int n) {
        int n2 = n ^ bfz_2;
        int n3 = (n2 ^ n2 >>> 10) * -1899304655;
        int n4 = (n3 ^ n3 >>> 13) * 2088552069;
        return (n4 ^ n4 >>> 24) + ttk;
    }

    public static int dhm_3(int n) {
        return tkhw.tsh_9(Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * 1514667443 ^ bfz_2);
    }

    public static int dtr_2(int n, int n2) {
        return tkhw.tsh_9(Integer.rotateRight(n * 1094000309 ^ n2, 13) + ttk ^ bfz_2);
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

