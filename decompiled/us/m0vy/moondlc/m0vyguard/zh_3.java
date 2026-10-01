/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zh_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wro1j7ah6jd8j;

    private zh_3() {
    }

    public static int dghm_2(int n) {
        int n2 = n ^ System.identityHashCode(zh_3.class) ^ (int)Thread.currentThread().getId() * -1854963355;
        int n3 = (n2 ^ n2 >>> 13) * -2071033085;
        int n4 = (n3 ^ n3 >>> 9) * 242152169;
        return n4 ^ n4 >>> 18;
    }

    public static int zkf(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * -651648723;
        int n4 = (n3 ^ n3 >>> 15) * -15049703;
        int n5 = (n4 ^ n4 >>> 17) * 2040101443;
        return n5 ^ n5 >>> 14;
    }

    public static boolean ghbd_2(int n, int n2) {
        return ((zh_3.zkf(n, n2) ^ (int)System.nanoTime()) * -1478361025 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

