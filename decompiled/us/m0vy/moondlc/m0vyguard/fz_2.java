/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class fz_2 {
    private static final int sfb = 428678210;
    private static final int dak_2 = 318105305;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q60n5l4zyswj;

    private fz_2() {
    }

    public static int shy_2(int n) {
        int n2 = n ^ sfb ^ System.identityHashCode(fz_2.class) ^ (int)Thread.currentThread().getId() * 733965091;
        int n3 = (n2 ^ n2 >>> 18) * 1439950253;
        int n4 = (n3 ^ n3 >>> 8) * -609406063;
        return n4 ^ n4 >>> 21;
    }

    public static int smq(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 16) ^ dak_2;
        int n4 = (n3 ^ n3 >>> 17) * -1646326935;
        int n5 = (n4 ^ n4 >>> 17) * -2029430079;
        return n5 ^ n5 >>> 18;
    }

    public static boolean tzn(int n, int n2) {
        return ((fz_2.smq(n, n2) ^ (int)System.nanoTime()) * 2105323195 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

