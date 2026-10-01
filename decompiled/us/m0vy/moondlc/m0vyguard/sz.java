/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sz {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vxfss76goepm;

    private sz() {
    }

    public static int rqs(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 10) * -1006178643;
        int n3 = (n2 ^ n2 >>> 15) * 943210473;
        int n4 = (n3 ^ n3 >>> 14) * -702109819;
        return n4 ^ n4 >>> 16;
    }

    public static int rrs_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xC);
        int n4 = (n3 ^ n3 >>> 10) * 2119707489;
        int n5 = (n4 ^ n4 >>> 18) * -1881745893;
        return n5 ^ n5 >>> 12;
    }

    public static boolean sjd_2(int n, int n2) {
        return ((sz.rrs_2(n, n2) + Thread.currentThread().hashCode()) * 2034176253 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

