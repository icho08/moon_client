/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bk {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wioours4uoeoh;

    private bk() {
    }

    public static int bsq(int n) {
        int n2 = n ^ System.identityHashCode(bk.class) ^ (int)Thread.currentThread().getId() * -971303835;
        int n3 = (n2 ^ n2 >>> 14) * -1645126711;
        int n4 = (n3 ^ n3 >>> 12) * -1236503607;
        return n4 ^ n4 >>> 20;
    }

    public static int ghja(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 5);
        int n4 = (n3 ^ n3 >>> 12) * 46712119;
        int n5 = (n4 ^ n4 >>> 16) * 1856599219;
        return n5 ^ n5 >>> 23;
    }

    public static boolean asm_2(int n, int n2) {
        return ((bk.ghja(n, n2) ^ (int)System.nanoTime()) * 1697901255 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

