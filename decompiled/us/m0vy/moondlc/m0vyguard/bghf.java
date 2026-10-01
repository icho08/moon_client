/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghf {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zz4du7177;

    private bghf() {
    }

    public static int bdl_2(int n) {
        int n2 = n ^ System.identityHashCode(bghf.class) ^ (int)Thread.currentThread().getId() * 569752935;
        int n3 = (n2 ^ n2 >>> 16) * 740045467;
        int n4 = (n3 ^ n3 >>> 12) * -133466675;
        return n4 ^ n4 >>> 19;
    }

    public static int ghsm(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 4) * -1232333945;
        int n4 = (n3 ^ n3 >>> 12) * 178346331;
        int n5 = (n4 ^ n4 >>> 12) * 1681523087;
        return n5 ^ n5 >>> 22;
    }

    public static boolean jly(int n, int n2) {
        return ((bghf.ghsm(n, n2) ^ (int)System.nanoTime()) * -1348714709 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

