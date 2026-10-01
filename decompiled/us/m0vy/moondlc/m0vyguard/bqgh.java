/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqgh {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int u03o1phqc3;

    private bqgh() {
    }

    public static int shk_2(int n) {
        int n2 = Integer.rotateRight(n * -917202113 - System.identityHashCode(bqgh.class), 26);
        int n3 = (n2 ^ n2 >>> 14) * -1324647323;
        int n4 = (n3 ^ n3 >>> 16) * -488516473;
        return n4 ^ n4 >>> 15;
    }

    public static int tghsh(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 10);
        int n4 = (n3 ^ n3 >>> 11) * -1793981899;
        int n5 = (n4 ^ n4 >>> 14) * 1790599587;
        return n5 ^ n5 >>> 17;
    }

    public static boolean dtw_4(int n, int n2) {
        return ((bqgh.tghsh(n, n2) + Thread.currentThread().hashCode()) * 504648043 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

