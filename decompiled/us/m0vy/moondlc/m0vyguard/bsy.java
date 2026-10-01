/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsy {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int j2ddrjwkc9av1t;

    private bsy() {
    }

    private static int rdhd(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -974414869;
        int n4 = (n3 ^ n3 >>> 12) * 500913331;
        return n4 ^ n4 >>> 20;
    }

    public static int zqd(int n) {
        return bsy.rdhd(n ^ System.identityHashCode(bsy.class) ^ (int)Thread.currentThread().getId() * -74892351);
    }

    public static int dhshs(int n, int n2) {
        return bsy.rdhd(Integer.rotateRight(n * 1531987049 ^ n2, 9));
    }

    public static boolean jthk(int n, int n2) {
        return ((bsy.dhshs(n, n2) ^ (int)System.nanoTime()) * 966902889 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

