/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bth_5 {
    private static final int dtk_2 = 1946932376;
    private static final int zbd = -528192715;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s17dec7bkqzuo;

    private bth_5() {
    }

    public static int dhtz_2(int n) {
        int n2 = n ^ System.identityHashCode(bth_5.class) ^ (int)Thread.currentThread().getId() * -556544313 ^ dtk_2;
        int n3 = (n2 ^ n2 >>> 18) * -1342165455;
        int n4 = (n3 ^ n3 >>> 14) * 126093107;
        return n4 ^ n4 >>> 21 ^ zbd;
    }

    public static int sths_3(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -1146491 + zbd ^ dtk_2;
        int n4 = (n3 ^ n3 >>> 8) * -1357989133;
        int n5 = (n4 ^ n4 >>> 9) * 1865492013;
        return n5 ^ n5 >>> 22 ^ zbd;
    }

    public static boolean dhdw_2(int n, int n2) {
        return ((bth_5.sths_3(n, n2) ^ (int)System.nanoTime()) * -1927940077 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

