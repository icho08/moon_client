/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bht_4 {
    private static final int shsm_2 = -287888014;
    private static final int twh = 1679680324;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int m409usb0yui63z;

    private bht_4() {
    }

    public static int bdhs(int n) {
        int n2 = Integer.rotateRight(n * -1321720879 - System.identityHashCode(bht_4.class), 12) ^ shsm_2;
        int n3 = (n2 ^ n2 >>> 11) * -1815782929;
        int n4 = (n3 ^ n3 >>> 16) * 513135415;
        return n4 ^ n4 >>> 13 ^ twh;
    }

    public static int khwh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 3)) + twh ^ shsm_2;
        int n4 = (n3 ^ n3 >>> 11) * 1391015295;
        int n5 = (n4 ^ n4 >>> 10) * 398242815;
        return n5 ^ n5 >>> 23 ^ twh;
    }

    public static boolean dtk(int n, int n2) {
        return ((bht_4.khwh_2(n, n2) + Thread.currentThread().hashCode()) * 1692140115 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

