/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshth {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int j2ddrjwkc9av1t;

    private bshth() {
    }

    public static int stm(int n) {
        int n2 = n ^ System.identityHashCode(bshth.class) ^ (int)Thread.currentThread().getId() * 1899843567;
        int n3 = (n2 ^ n2 >>> 11) * 873467003;
        int n4 = (n3 ^ n3 >>> 16) * 1312471135;
        return n4 ^ n4 >>> 13;
    }

    public static int shlz_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x13);
        int n4 = (n3 ^ n3 >>> 15) * -2131819785;
        int n5 = (n4 ^ n4 >>> 15) * -1212400351;
        return n5 ^ n5 >>> 13;
    }

    public static boolean akj(int n, int n2) {
        return ((bshth.shlz_2(n, n2) ^ (int)System.nanoTime()) * 1012871639 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

