/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhz_5 {
    private static final int sdh_7 = -1158104376;
    private static final int ddhd = -1578550532;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int e5cvf8r3eumkd;

    private dhz_5() {
    }

    public static int smz_4(int n) {
        int n2 = n ^ System.identityHashCode(dhz_5.class) ^ (int)Thread.currentThread().getId() * 1990014479 ^ sdh_7;
        int n3 = (n2 ^ n2 >>> 16) * -1028042979;
        int n4 = (n3 ^ n3 >>> 10) * -805719225;
        return n4 ^ n4 >>> 18 ^ ddhd;
    }

    public static int zst_6(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x13)) + ddhd ^ sdh_7;
        int n4 = (n3 ^ n3 >>> 13) * -1203313713;
        int n5 = (n4 ^ n4 >>> 9) * -627261857;
        return n5 ^ n5 >>> 17 ^ ddhd;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

