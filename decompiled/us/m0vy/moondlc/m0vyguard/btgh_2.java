/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btgh_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int u7zxw65k4md8;

    private btgh_2() {
    }

    public static int dhz_2(int n) {
        int n2 = (n ^ btgh_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 18) * 926423955;
        int n4 = (n3 ^ n3 >>> 9) * 256434847;
        return n4 ^ n4 >>> 13;
    }

    public static int htt_4(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * 1346977025;
        int n4 = (n3 ^ n3 >>> 15) * -1658104685;
        int n5 = (n4 ^ n4 >>> 10) * 1907490573;
        return n5 ^ n5 >>> 15;
    }

    public static boolean dhd_7(int n, int n2) {
        return ((btgh_2.htt_4(n, n2) ^ (int)System.nanoTime()) * 86963771 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

