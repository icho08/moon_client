/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ns_2 {
    private static final int khjw = -2071442461;
    private static final int j_2 = 1575552902;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xs8pabzz;

    private ns_2() {
    }

    public static int thmm(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 10) * -979438917 ^ khjw;
        int n3 = (n2 ^ n2 >>> 15) * 710197421;
        int n4 = (n3 ^ n3 >>> 10) * 1051896943;
        return n4 ^ n4 >>> 19 ^ j_2;
    }

    public static int khyw(int n, int n2) {
        int n3 = (n2 - n ^ 0xA226A181) + j_2 ^ khjw;
        int n4 = (n3 ^ n3 >>> 17) * 1565689981;
        int n5 = (n4 ^ n4 >>> 14) * 1331125993;
        return n5 ^ n5 >>> 18 ^ j_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

