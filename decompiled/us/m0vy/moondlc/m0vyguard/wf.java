/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wf {
    private static final int dhh_2 = 1888713362;
    private static final int rkhgh = 382392475;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g9xq3tu2f0gthy;

    private wf() {
    }

    public static int nz(int n) {
        int n2 = (n ^ wf.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhh_2;
        int n3 = (n2 ^ n2 >>> 17) * 275463571;
        int n4 = (n3 ^ n3 >>> 13) * 1234860665;
        return n4 ^ n4 >>> 19 ^ rkhgh;
    }

    public static int arkh(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * -1293457123 + rkhgh ^ dhh_2;
        int n4 = (n3 ^ n3 >>> 17) * -112878819;
        int n5 = (n4 ^ n4 >>> 11) * -883920635;
        return n5 ^ n5 >>> 17 ^ rkhgh;
    }

    public static boolean dshh_3(int n, int n2) {
        return ((wf.arkh(n, n2) ^ (int)System.nanoTime()) * 1094420459 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

