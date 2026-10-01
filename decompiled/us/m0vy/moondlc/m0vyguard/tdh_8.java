/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdh_8 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sbpihbe7a;

    private tdh_8() {
    }

    public static int khkf(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 10) * 1837395439;
        int n3 = (n2 ^ n2 >>> 13) * -264777363;
        int n4 = (n3 ^ n3 >>> 14) * 1653335335;
        return n4 ^ n4 >>> 18;
    }

    public static int zms_2(int n, int n2) {
        int n3 = n2 - n ^ 0x9C00AF38;
        int n4 = (n3 ^ n3 >>> 15) * 214226083;
        int n5 = (n4 ^ n4 >>> 11) * -2086627343;
        return n5 ^ n5 >>> 19;
    }

    public static boolean thtw_2(int n, int n2) {
        return ((tdh_8.zms_2(n, n2) + Thread.currentThread().hashCode()) * -1298153069 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

