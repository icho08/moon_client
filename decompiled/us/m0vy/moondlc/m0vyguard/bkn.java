/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkn {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int idtoyws8ndj;

    private bkn() {
    }

    public static int srj_2(int n) {
        int n2 = (n ^ bkn.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * 1293812741;
        int n4 = (n3 ^ n3 >>> 16) * 1102564271;
        return n4 ^ n4 >>> 20;
    }

    public static int zdhd_4(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x13);
        int n4 = (n3 ^ n3 >>> 10) * 762513855;
        int n5 = (n4 ^ n4 >>> 14) * -72204511;
        return n5 ^ n5 >>> 18;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

