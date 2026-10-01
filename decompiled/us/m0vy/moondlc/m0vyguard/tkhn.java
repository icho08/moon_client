/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhn {
    private static final int sjf = -727632173;
    private static final int dza = 1096814652;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lc0rs6ta;

    private tkhn() {
    }

    public static int khyq(int n) {
        int n2 = Integer.rotateRight(n * 1996519961 - System.identityHashCode(tkhn.class), 23) ^ sjf;
        int n3 = (n2 ^ n2 >>> 12) * 1936102831;
        int n4 = (n3 ^ n3 >>> 12) * -1260294885;
        return n4 ^ n4 >>> 22 ^ dza;
    }

    public static int hsz(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * 579520097 + dza ^ sjf;
        int n4 = (n3 ^ n3 >>> 17) * -2079056553;
        int n5 = (n4 ^ n4 >>> 15) * 556443159;
        return n5 ^ n5 >>> 15 ^ dza;
    }

    public static boolean zdj_3(int n, int n2) {
        return ((tkhn.hsz(n, n2) + Thread.currentThread().hashCode()) * 684978283 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

