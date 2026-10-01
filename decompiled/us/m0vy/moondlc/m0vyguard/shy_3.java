/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shy_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mz9obtvta56dy;

    private shy_3() {
    }

    public static int dhshdh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * -1167741813;
        int n3 = (n2 ^ n2 >>> 12) * -1356973697;
        int n4 = (n3 ^ n3 >>> 7) * -816188173;
        return n4 ^ n4 >>> 13;
    }

    public static int szz_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1895471627 ^ n2, 11);
        int n4 = (n3 ^ n3 >>> 13) * 1412222013;
        int n5 = (n4 ^ n4 >>> 11) * -1856214771;
        return n5 ^ n5 >>> 23;
    }

    public static boolean hdt_4(int n, int n2) {
        return ((shy_3.szz_3(n, n2) + Thread.currentThread().hashCode()) * 2124799763 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

