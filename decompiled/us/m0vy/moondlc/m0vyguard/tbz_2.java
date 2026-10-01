/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbz_2 {
    private static final int bsha = 956398251;
    private static final int dhdhr = 272658185;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rh6y7ogifui;

    private tbz_2() {
    }

    public static int tna_2(int n) {
        int n2 = n ^ System.identityHashCode(tbz_2.class) ^ (int)Thread.currentThread().getId() * -1323231473 ^ bsha;
        int n3 = (n2 ^ n2 >>> 16) * -1482591455;
        int n4 = (n3 ^ n3 >>> 7) * 2101623359;
        return n4 ^ n4 >>> 16 ^ dhdhr;
    }

    public static int tkd_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -600527255 ^ n2, 9) + dhdhr ^ bsha;
        int n4 = (n3 ^ n3 >>> 9) * 436962097;
        int n5 = (n4 ^ n4 >>> 11) * 940770561;
        return n5 ^ n5 >>> 16 ^ dhdhr;
    }

    public static boolean rdhr(int n, int n2) {
        return ((tbz_2.tkd_2(n, n2) ^ (int)System.nanoTime()) * 924794387 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

