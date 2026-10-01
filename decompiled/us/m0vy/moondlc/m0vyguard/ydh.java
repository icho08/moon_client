/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ydh {
    private static final int bkdh = 745671093;
    private static final int zdha_2 = 600705043;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zzc08ys2hv8;

    private ydh() {
    }

    private static int znq_2(int n) {
        int n2 = n ^ bkdh;
        int n3 = (n2 ^ n2 >>> 12) * 319099609;
        int n4 = (n3 ^ n3 >>> 17) * -1029822823;
        return (n4 ^ n4 >>> 12) + zdha_2;
    }

    public static int hthd(int n) {
        return ydh.znq_2(n ^ System.identityHashCode(ydh.class) ^ (int)Thread.currentThread().getId() * -785407103 ^ bkdh);
    }

    public static int zzq(int n, int n2) {
        return ydh.znq_2((n2 ^ Integer.rotateLeft(n, n2 & 0xD)) + zdha_2 ^ bkdh);
    }

    public static boolean sfn(int n, int n2) {
        return ((ydh.zzq(n, n2) ^ (int)System.nanoTime()) * 1513738805 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

