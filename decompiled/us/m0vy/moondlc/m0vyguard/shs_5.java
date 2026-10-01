/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shs_5 {
    private static final int dhdhn = -1961604755;
    private static final int thtl = 504796903;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c57wi43jq8;

    private shs_5() {
    }

    public static int khzt_3(int n) {
        int n2 = Integer.rotateLeft(n ^ dhdhn ^ (int)System.nanoTime(), 19) * 1779149123;
        int n3 = (n2 ^ n2 >>> 16) * -2031812543;
        int n4 = (n3 ^ n3 >>> 14) * -1924212527;
        return n4 ^ n4 >>> 18;
    }

    public static int ray(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 9) ^ thtl;
        int n4 = (n3 ^ n3 >>> 13) * 553361083;
        int n5 = (n4 ^ n4 >>> 16) * 1193048965;
        return n5 ^ n5 >>> 15;
    }

    public static boolean jdhy(int n, int n2) {
        return ((shs_5.ray(n, n2) + Thread.currentThread().hashCode()) * -2071914509 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

