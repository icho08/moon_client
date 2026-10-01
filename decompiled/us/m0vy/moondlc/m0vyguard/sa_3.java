/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sa_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mv209fefrk;

    private sa_3() {
    }

    public static int ztl_2(int n) {
        int n2 = n ^ System.identityHashCode(sa_3.class) ^ (int)Thread.currentThread().getId() * 756403559;
        int n3 = (n2 ^ n2 >>> 15) * 550151199;
        int n4 = (n3 ^ n3 >>> 13) * -2033612287;
        return n4 ^ n4 >>> 19;
    }

    public static int ghdz_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -644869341;
        int n4 = (n3 ^ n3 >>> 14) * -160202815;
        int n5 = (n4 ^ n4 >>> 13) * 1570906971;
        return n5 ^ n5 >>> 21;
    }

    public static boolean ghshf(int n, int n2) {
        return ((sa_3.ghdz_2(n, n2) ^ (int)System.nanoTime()) * 527586243 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

