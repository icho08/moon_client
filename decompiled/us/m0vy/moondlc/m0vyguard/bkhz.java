/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhz {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fkhgagc407twsc;

    private bkhz() {
    }

    public static int hta_3(int n) {
        int n2 = n ^ System.identityHashCode(bkhz.class) ^ (int)Thread.currentThread().getId() * 2014013129;
        int n3 = (n2 ^ n2 >>> 17) * -999546553;
        int n4 = (n3 ^ n3 >>> 7) * -1028461793;
        return n4 ^ n4 >>> 18;
    }

    public static int tnt(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 16);
        int n4 = (n3 ^ n3 >>> 17) * -529961187;
        int n5 = (n4 ^ n4 >>> 13) * 828144417;
        return n5 ^ n5 >>> 22;
    }

    public static boolean dhghkh(int n, int n2) {
        return ((bkhz.tnt(n, n2) ^ (int)System.nanoTime()) * -525781987 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

