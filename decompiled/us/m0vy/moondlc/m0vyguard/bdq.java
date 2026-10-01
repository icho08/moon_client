/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdq {
    private static final int saf = -1728226782;
    private static final int shdhy = 954392581;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nlgq9icrsk2;

    private bdq() {
    }

    public static int jkha_2(int n) {
        int n2 = (n ^ saf ^ bdq.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 11) * 1706098065;
        int n4 = (n3 ^ n3 >>> 11) * -198477989;
        return n4 ^ n4 >>> 20;
    }

    public static int jqf(int n, int n2) {
        int n3 = n2 - n ^ 0x67F7B0D3 ^ shdhy;
        int n4 = (n3 ^ n3 >>> 16) * 1968492475;
        int n5 = (n4 ^ n4 >>> 15) * 1504722889;
        return n5 ^ n5 >>> 22;
    }

    public static boolean swl_2(int n, int n2) {
        return ((bdq.jqf(n, n2) ^ (int)System.nanoTime()) * -1561972239 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

