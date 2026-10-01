/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsdh {
    private static final int sww = -1013747877;
    private static final int bbw = 1328739669;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dqmfm63dc;

    private bsdh() {
    }

    public static int dtdh(int n) {
        int n2 = n ^ sww ^ System.identityHashCode(bsdh.class) ^ (int)Thread.currentThread().getId() * 1251031709;
        int n3 = (n2 ^ n2 >>> 14) * -966259919;
        int n4 = (n3 ^ n3 >>> 12) * -249440499;
        return n4 ^ n4 >>> 16;
    }

    public static int aln(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 9) ^ bbw;
        int n4 = (n3 ^ n3 >>> 13) * -1928057319;
        int n5 = (n4 ^ n4 >>> 10) * 235029455;
        return n5 ^ n5 >>> 18;
    }

    public static boolean jts(int n, int n2) {
        return ((bsdh.aln(n, n2) ^ (int)System.nanoTime()) * 1678349581 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

