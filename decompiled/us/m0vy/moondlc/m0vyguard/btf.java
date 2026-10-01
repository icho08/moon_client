/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btf {
    private static final int dh = 1219043829;
    private static final int ddd = -80075598;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int l1gpfk1b7sbra;

    private btf() {
    }

    public static int zws_2(int n) {
        int n2 = Integer.rotateLeft(n ^ dh ^ (int)System.nanoTime(), 17) * 1842521591;
        int n3 = (n2 ^ n2 >>> 17) * -1753532347;
        int n4 = (n3 ^ n3 >>> 8) * -1504506451;
        return n4 ^ n4 >>> 20;
    }

    public static int thsq_2(int n, int n2) {
        int n3 = n2 - n ^ 0x3FD1EB75 ^ ddd;
        int n4 = (n3 ^ n3 >>> 14) * -407320475;
        int n5 = (n4 ^ n4 >>> 12) * -1096753351;
        return n5 ^ n5 >>> 18;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

