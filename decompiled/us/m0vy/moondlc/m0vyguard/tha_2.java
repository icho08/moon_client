/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tha_2 {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pawkx5j0e1;

    private tha_2() {
    }

    public static int drn_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 22) * -1316052231;
        int n3 = (n2 ^ n2 >>> 15) * -566858633;
        int n4 = (n3 ^ n3 >>> 15) * -712100187;
        return n4 ^ n4 >>> 14;
    }

    public static int hz_4(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 12) * 986530857;
        int n4 = (n3 ^ n3 >>> 12) * -450376233;
        int n5 = (n4 ^ n4 >>> 16) * 135853877;
        return n5 ^ n5 >>> 16;
    }

    public static boolean ddh(int n, int n2) {
        return ((tha_2.hz_4(n, n2) + Thread.currentThread().hashCode()) * 349878219 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

