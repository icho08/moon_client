/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfr {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int j7lwjwdy;

    private bfr() {
    }

    public static int tkhz_4(int n) {
        int n2 = (n ^ bfr.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * 1853083709;
        int n4 = (n3 ^ n3 >>> 13) * 1521892675;
        return n4 ^ n4 >>> 18;
    }

    public static int shfk(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x10);
        int n4 = (n3 ^ n3 >>> 11) * 2102130961;
        int n5 = (n4 ^ n4 >>> 16) * -1777844879;
        return n5 ^ n5 >>> 17;
    }

    public static boolean sqd_3(int n, int n2) {
        return ((bfr.shfk(n, n2) ^ (int)System.nanoTime()) * 1006031079 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

