/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ttf {
    private static final int khwk = 1603653669;
    private static final int bty = -298763615;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int w37c6r3o36n;

    private ttf() {
    }

    public static int khkhz(int n) {
        int n2 = Integer.rotateLeft(n ^ khwk ^ (int)System.nanoTime(), 20) * 19820943;
        int n3 = (n2 ^ n2 >>> 11) * 612423285;
        int n4 = (n3 ^ n3 >>> 16) * -557126579;
        return n4 ^ n4 >>> 20;
    }

    public static int ghda_3(int n, int n2) {
        int n3 = n2 - n ^ 0xB9FFD7FC ^ bty;
        int n4 = (n3 ^ n3 >>> 15) * 921281623;
        int n5 = (n4 ^ n4 >>> 12) * 553642685;
        return n5 ^ n5 >>> 22;
    }

    public static boolean shdk(int n, int n2) {
        return ((ttf.ghda_3(n, n2) + Thread.currentThread().hashCode()) * 407326129 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

