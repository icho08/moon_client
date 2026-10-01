/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ba {
    private static final int shnsh = -2078281302;
    private static final int shqf = 2040284972;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int myj98q3d;

    private ba() {
    }

    public static int szt_5(int n) {
        int n2 = Integer.rotateRight(n * 116386435 - System.identityHashCode(ba.class), 6) ^ shnsh;
        int n3 = (n2 ^ n2 >>> 13) * -1124855351;
        int n4 = (n3 ^ n3 >>> 13) * -51463047;
        return n4 ^ n4 >>> 13 ^ shqf;
    }

    public static int hbkh(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 16) * 1144933153 + shqf ^ shnsh;
        int n4 = (n3 ^ n3 >>> 13) * 1920541087;
        int n5 = (n4 ^ n4 >>> 14) * 825187193;
        return n5 ^ n5 >>> 17 ^ shqf;
    }

    public static boolean jbd_2(int n, int n2) {
        return ((ba.hbkh(n, n2) + Thread.currentThread().hashCode()) * -1643150119 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

