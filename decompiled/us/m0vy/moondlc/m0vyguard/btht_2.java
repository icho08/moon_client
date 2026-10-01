/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btht_2 {
    private static final int ssk = -890548097;
    private static final int rlh_2 = 340900773;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tw9nr6kc7t2b3;

    private btht_2() {
    }

    public static int tda_7(int n) {
        int n2 = n ^ ssk ^ System.identityHashCode(btht_2.class) ^ (int)Thread.currentThread().getId() * 147034809;
        int n3 = (n2 ^ n2 >>> 14) * -1150498579;
        int n4 = (n3 ^ n3 >>> 8) * 842085859;
        return n4 ^ n4 >>> 16;
    }

    public static int skhkh(int n, int n2) {
        int n3 = Integer.rotateRight(n * 957869083 ^ n2, 7) ^ rlh_2;
        int n4 = (n3 ^ n3 >>> 9) * -1648805535;
        int n5 = (n4 ^ n4 >>> 11) * -63656209;
        return n5 ^ n5 >>> 15;
    }

    public static boolean ym(int n, int n2) {
        return ((btht_2.skhkh(n, n2) ^ (int)System.nanoTime()) * -946189453 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

