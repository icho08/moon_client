/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzsh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qx68fovv;

    private tzsh() {
    }

    private static int hfk(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * 1360008293;
        int n4 = (n3 ^ n3 >>> 9) * 913647129;
        return n4 ^ n4 >>> 14;
    }

    public static int zly(int n) {
        return tzsh.hfk(n ^ System.identityHashCode(tzsh.class) ^ (int)Thread.currentThread().getId() * 829226997);
    }

    public static int ghq(int n, int n2) {
        return tzsh.hfk(Integer.rotateRight(n * 1429724483 ^ n2, 7));
    }

    public static boolean shdt_3(int n, int n2) {
        return ((tzsh.ghq(n, n2) ^ (int)System.nanoTime()) * 1832069759 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

