/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tah {
    private static final int thdh_4 = 1434295208;
    private static final int dhdhh_2 = 1016161069;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ka6mg0dq4l4gs;

    private tah() {
    }

    public static int sthm(int n) {
        int n2 = n ^ thdh_4 ^ System.identityHashCode(tah.class) ^ (int)Thread.currentThread().getId() * -1834617983;
        int n3 = (n2 ^ n2 >>> 16) * -1338441083;
        int n4 = (n3 ^ n3 >>> 15) * -1254339887;
        return n4 ^ n4 >>> 21;
    }

    public static int tyb_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1183594205 ^ n2, 17) ^ dhdhh_2;
        int n4 = (n3 ^ n3 >>> 13) * 1569298685;
        int n5 = (n4 ^ n4 >>> 9) * 77016271;
        return n5 ^ n5 >>> 21;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

