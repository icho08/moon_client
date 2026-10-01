/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ks {
    private static final int rra_2 = -1322392605;
    private static final int jyh_2 = -2024180630;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eor9ib1c3fes2m;

    private ks() {
    }

    public static int tln(int n) {
        int n2 = Integer.rotateRight(n * 387215289 - System.identityHashCode(ks.class), 14) ^ rra_2;
        int n3 = (n2 ^ n2 >>> 15) * -1947052737;
        int n4 = (n3 ^ n3 >>> 15) * 1564080615;
        return n4 ^ n4 >>> 14 ^ jyh_2;
    }

    public static int btz_2(int n, int n2) {
        int n3 = (n2 - n ^ 0xAA4F638E) + jyh_2 ^ rra_2;
        int n4 = (n3 ^ n3 >>> 15) * 327238749;
        int n5 = (n4 ^ n4 >>> 10) * 60671719;
        return n5 ^ n5 >>> 18 ^ jyh_2;
    }

    public static boolean shzz_4(int n, int n2) {
        return ((ks.btz_2(n, n2) + Thread.currentThread().hashCode()) * 1022617913 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

