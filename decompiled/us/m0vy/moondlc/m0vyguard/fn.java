/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class fn {
    private static final int bhm = -2055634729;
    private static final int shqq = -1832787066;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dz4n84kzpvpcju;

    private fn() {
    }

    public static int shdha(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 16) * -1960104147 ^ bhm;
        int n3 = (n2 ^ n2 >>> 18) * -1380646261;
        int n4 = (n3 ^ n3 >>> 10) * -798979599;
        return n4 ^ n4 >>> 22 ^ shqq;
    }

    public static int thtn(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 14)) + shqq ^ bhm;
        int n4 = (n3 ^ n3 >>> 11) * 476504759;
        int n5 = (n4 ^ n4 >>> 15) * 890484765;
        return n5 ^ n5 >>> 18 ^ shqq;
    }

    public static boolean khshb(int n, int n2) {
        return ((fn.thtn(n, n2) + Thread.currentThread().hashCode()) * -1060616657 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

