/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbw {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fak5yd9es9;

    private tbw() {
    }

    public static int dfb(int n) {
        int n2 = n ^ System.identityHashCode(tbw.class) ^ (int)Thread.currentThread().getId() * -923819751;
        int n3 = (n2 ^ n2 >>> 14) * 559473563;
        int n4 = (n3 ^ n3 >>> 9) * -1987146737;
        return n4 ^ n4 >>> 22;
    }

    public static int hqs_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 15) * 362454079;
        int n4 = (n3 ^ n3 >>> 9) * -793787189;
        int n5 = (n4 ^ n4 >>> 16) * 1320855887;
        return n5 ^ n5 >>> 21;
    }

    public static boolean hhk(int n, int n2) {
        return ((tbw.hqs_2(n, n2) ^ (int)System.nanoTime()) * -818366831 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

