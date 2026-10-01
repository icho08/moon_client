/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btht {
    private static final int bhk_2 = -358156622;
    private static final int dghb = -2894569;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int h252qa891fw6yo;

    private btht() {
    }

    public static int ghha(int n) {
        int n2 = Integer.rotateRight(n * -1983415177 - System.identityHashCode(btht.class), 6) ^ bhk_2;
        int n3 = (n2 ^ n2 >>> 14) * -418015463;
        int n4 = (n3 ^ n3 >>> 10) * 927905341;
        return n4 ^ n4 >>> 16 ^ dghb;
    }

    public static int jtm(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 4)) + dghb ^ bhk_2;
        int n4 = (n3 ^ n3 >>> 16) * 1903413083;
        int n5 = (n4 ^ n4 >>> 11) * 1232575763;
        return n5 ^ n5 >>> 21 ^ dghb;
    }

    public static boolean dddh_2(int n, int n2) {
        return ((btht.jtm(n, n2) + Thread.currentThread().hashCode()) * 470962929 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

