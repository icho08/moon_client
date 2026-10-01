/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdha_2 {
    private static final int tthq = -1166149649;
    private static final int dhan = 687463257;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mhx33bzl;

    private tdha_2() {
    }

    public static int dhds_2(int n) {
        int n2 = Integer.rotateLeft(n ^ tthq ^ (int)System.nanoTime(), 16) * -1195572325;
        int n3 = (n2 ^ n2 >>> 18) * -1421225713;
        int n4 = (n3 ^ n3 >>> 11) * -151576705;
        return n4 ^ n4 >>> 17;
    }

    public static int tkhdh(int n, int n2) {
        int n3 = n2 - n ^ 0x7BAF54A6 ^ dhan;
        int n4 = (n3 ^ n3 >>> 14) * 596616941;
        int n5 = (n4 ^ n4 >>> 17) * 813485705;
        return n5 ^ n5 >>> 17;
    }

    public static boolean dsj(int n, int n2) {
        return ((tdha_2.tkhdh(n, n2) + Thread.currentThread().hashCode()) * 1618308037 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

