/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ib6ttuaealqv;

    private tsh() {
    }

    public static int dyw(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * 1887620493;
        int n3 = (n2 ^ n2 >>> 18) * -833196935;
        int n4 = (n3 ^ n3 >>> 16) * -802721579;
        return n4 ^ n4 >>> 15;
    }

    public static int khzm(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xD);
        int n4 = (n3 ^ n3 >>> 13) * -1669088903;
        int n5 = (n4 ^ n4 >>> 11) * -875476627;
        return n5 ^ n5 >>> 21;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

