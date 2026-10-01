/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dz_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int euifwn3kf;

    private dz_3() {
    }

    private static int jkf(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * 477463455;
        int n4 = (n3 ^ n3 >>> 19) * 444471063;
        return n4 ^ n4 >>> 20;
    }

    public static int shjk(int n) {
        return dz_3.jkf(Integer.rotateRight(n * -538676231 - System.identityHashCode(dz_3.class), 21));
    }

    public static int hght(int n, int n2) {
        return dz_3.jkf(Integer.rotateLeft(n ^ n2, 9) * -1502660781);
    }

    public static boolean dsha_2(int n, int n2) {
        return ((dz_3.hght(n, n2) + Thread.currentThread().hashCode()) * -2135290921 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

