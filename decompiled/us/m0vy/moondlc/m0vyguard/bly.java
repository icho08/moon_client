/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bly {
    private static final int dhqz = 1443965148;
    private static final int dhhr_2 = -567346144;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fpqlobr312lq;

    private bly() {
    }

    public static int dhwq(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * -1903543567 ^ dhqz;
        int n3 = (n2 ^ n2 >>> 13) * -1864121213;
        int n4 = (n3 ^ n3 >>> 8) * 101927917;
        return n4 ^ n4 >>> 15 ^ dhhr_2;
    }

    public static int shhr_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xF)) + dhhr_2 ^ dhqz;
        int n4 = (n3 ^ n3 >>> 15) * -905060007;
        int n5 = (n4 ^ n4 >>> 9) * -923293583;
        return n5 ^ n5 >>> 21 ^ dhhr_2;
    }

    public static boolean htz(int n, int n2) {
        return ((bly.shhr_2(n, n2) + Thread.currentThread().hashCode()) * -1510926833 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

