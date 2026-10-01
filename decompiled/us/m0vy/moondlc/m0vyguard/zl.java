/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zl {
    private static final int hzy_2 = 1615287934;
    private static final int zfm = 406786400;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int v00esi6z3qoax;

    private zl() {
    }

    public static int tkhs_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * -140782603 ^ hzy_2;
        int n3 = (n2 ^ n2 >>> 14) * 1553485939;
        int n4 = (n3 ^ n3 >>> 14) * -1853000099;
        return n4 ^ n4 >>> 13 ^ zfm;
    }

    public static int jyf(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x11)) + zfm ^ hzy_2;
        int n4 = (n3 ^ n3 >>> 13) * 1039698233;
        int n5 = (n4 ^ n4 >>> 9) * 1723916559;
        return n5 ^ n5 >>> 14 ^ zfm;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

