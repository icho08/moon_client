/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tz_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dbm49zmqz3rl3z;

    private tz_3() {
    }

    public static int stl_3(int n) {
        int n2 = Integer.rotateRight(n * 1248596909 - System.identityHashCode(tz_3.class), 6);
        int n3 = (n2 ^ n2 >>> 13) * -136928311;
        int n4 = (n3 ^ n3 >>> 10) * -2031457429;
        return n4 ^ n4 >>> 22;
    }

    public static int dhdht_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x11);
        int n4 = (n3 ^ n3 >>> 11) * 1362521883;
        int n5 = (n4 ^ n4 >>> 18) * 959537443;
        return n5 ^ n5 >>> 19;
    }

    public static boolean shshdh(int n, int n2) {
        return ((tz_3.dhdht_2(n, n2) + Thread.currentThread().hashCode()) * 33507241 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

