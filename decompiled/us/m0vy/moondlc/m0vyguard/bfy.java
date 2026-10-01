/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfy {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v54ajzb4gqq;

    private bfy() {
    }

    private static int ttt_8(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * 609242547;
        int n4 = (n3 ^ n3 >>> 17) * -689879789;
        return n4 ^ n4 >>> 17;
    }

    public static int sja_3(int n) {
        return bfy.ttt_8(n ^ System.identityHashCode(bfy.class) ^ (int)Thread.currentThread().getId() * 98515665);
    }

    public static int khra_2(int n, int n2) {
        return bfy.ttt_8(n2 ^ Integer.rotateLeft(n, n2 & 0x10));
    }

    public static boolean rwt(int n, int n2) {
        return ((bfy.khra_2(n, n2) ^ (int)System.nanoTime()) * 1149779845 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

