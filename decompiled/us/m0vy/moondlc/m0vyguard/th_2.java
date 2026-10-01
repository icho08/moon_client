/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class th_2 {
    private static final int dhwt = -2080788362;
    private static final int skf = 535146929;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int brzpo2b1if;

    private th_2() {
    }

    public static int ddt_4(int n) {
        int n2 = n ^ dhwt ^ System.identityHashCode(th_2.class) ^ (int)Thread.currentThread().getId() * -1900220867;
        int n3 = (n2 ^ n2 >>> 11) * 1055461715;
        int n4 = (n3 ^ n3 >>> 12) * -1587975255;
        return n4 ^ n4 >>> 13;
    }

    public static int has_3(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 6) ^ skf;
        int n4 = (n3 ^ n3 >>> 16) * -1847373081;
        int n5 = (n4 ^ n4 >>> 17) * 1396250291;
        return n5 ^ n5 >>> 21;
    }

    public static boolean tth_7(int n, int n2) {
        return ((th_2.has_3(n, n2) ^ (int)System.nanoTime()) * -176667095 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

