/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnt {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ofcvc2lr5nv;

    private bnt() {
    }

    public static int dhhb(int n) {
        int n2 = n ^ System.identityHashCode(bnt.class) ^ (int)Thread.currentThread().getId() * 1111035187;
        int n3 = (n2 ^ n2 >>> 18) * 1797000329;
        int n4 = (n3 ^ n3 >>> 9) * -1065063603;
        return n4 ^ n4 >>> 18;
    }

    public static int shkhb(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 8);
        int n4 = (n3 ^ n3 >>> 15) * 173067413;
        int n5 = (n4 ^ n4 >>> 16) * -324399579;
        return n5 ^ n5 >>> 14;
    }

    public static boolean sjd_3(int n, int n2) {
        return ((bnt.shkhb(n, n2) ^ (int)System.nanoTime()) * -289619045 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

