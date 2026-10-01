/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hz_3 {
    private static final int dhss_3 = -219080136;
    private static final int swa_2 = 17621179;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fxe54tsp;

    private hz_3() {
    }

    public static int shdz_4(int n) {
        int n2 = n ^ System.identityHashCode(hz_3.class) ^ (int)Thread.currentThread().getId() * 1919501677 ^ dhss_3;
        int n3 = (n2 ^ n2 >>> 14) * 499091927;
        int n4 = (n3 ^ n3 >>> 7) * -1285862649;
        return n4 ^ n4 >>> 20 ^ swa_2;
    }

    public static int shda_3(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 11)) + swa_2 ^ dhss_3;
        int n4 = (n3 ^ n3 >>> 8) * -1347995293;
        int n5 = (n4 ^ n4 >>> 13) * -1740339197;
        return n5 ^ n5 >>> 15 ^ swa_2;
    }

    public static boolean bbj(int n, int n2) {
        return ((hz_3.shda_3(n, n2) ^ (int)System.nanoTime()) * -763671619 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

