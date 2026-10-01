/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthz {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ty2oo68erpza;

    private bthz() {
    }

    public static int sykh(int n) {
        int n2 = n ^ System.identityHashCode(bthz.class) ^ (int)Thread.currentThread().getId() * -931265789;
        int n3 = (n2 ^ n2 >>> 17) * 264172299;
        int n4 = (n3 ^ n3 >>> 12) * -843130231;
        return n4 ^ n4 >>> 19;
    }

    public static int aghd(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 15) * 1055317935;
        int n4 = (n3 ^ n3 >>> 9) * -254407403;
        int n5 = (n4 ^ n4 >>> 11) * -1704993127;
        return n5 ^ n5 >>> 16;
    }

    public static boolean sqz(int n, int n2) {
        return ((bthz.aghd(n, n2) ^ (int)System.nanoTime()) * 2036869991 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

