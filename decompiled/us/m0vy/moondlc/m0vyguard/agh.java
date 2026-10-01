/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class agh {
    private static final int thha_4 = 559274377;
    private static final int khas_2 = -913960133;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vh1hd80sj4ig;

    private agh() {
    }

    public static int jsa_3(int n) {
        int n2 = n ^ thha_4 ^ System.identityHashCode(agh.class) ^ (int)Thread.currentThread().getId() * 349560567;
        int n3 = (n2 ^ n2 >>> 13) * -2081103999;
        int n4 = (n3 ^ n3 >>> 16) * -1434664255;
        return n4 ^ n4 >>> 21;
    }

    public static int bshm(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 4) ^ khas_2;
        int n4 = (n3 ^ n3 >>> 17) * 834217953;
        int n5 = (n4 ^ n4 >>> 18) * -1337108205;
        return n5 ^ n5 >>> 20;
    }

    public static boolean dsl_4(int n, int n2) {
        return ((agh.bshm(n, n2) ^ (int)System.nanoTime()) * -625510763 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

