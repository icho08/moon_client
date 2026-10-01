/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnf {
    private static final int hha_3 = -962749732;
    private static final int zrq = 1884759259;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hkpglp4h5ogfs;

    private bnf() {
    }

    public static int thj_3(int n) {
        int n2 = Integer.rotateRight(n * 468911475 - System.identityHashCode(bnf.class), 11) ^ hha_3;
        int n3 = (n2 ^ n2 >>> 17) * 1104613957;
        int n4 = (n3 ^ n3 >>> 10) * 577349311;
        return n4 ^ n4 >>> 17 ^ zrq;
    }

    public static int zah_4(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 4) * -557412589 + zrq ^ hha_3;
        int n4 = (n3 ^ n3 >>> 11) * 494561767;
        int n5 = (n4 ^ n4 >>> 17) * -622729599;
        return n5 ^ n5 >>> 16 ^ zrq;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

