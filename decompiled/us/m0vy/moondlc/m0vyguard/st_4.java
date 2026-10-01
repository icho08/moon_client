/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class st_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int v7p96545a;

    private st_4() {
    }

    public static int tham(int n) {
        int n2 = n ^ System.identityHashCode(st_4.class) ^ (int)Thread.currentThread().getId() * -36614257;
        int n3 = (n2 ^ n2 >>> 13) * -387252853;
        int n4 = (n3 ^ n3 >>> 8) * 1369636439;
        return n4 ^ n4 >>> 16;
    }

    public static int dhah(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 10);
        int n4 = (n3 ^ n3 >>> 10) * -1692113005;
        int n5 = (n4 ^ n4 >>> 10) * 1586423511;
        return n5 ^ n5 >>> 14;
    }

    public static boolean jgha(int n, int n2) {
        return ((st_4.dhah(n, n2) ^ (int)System.nanoTime()) * -1616183323 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

