/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wt {
    private static final int rtkh_2 = -1955799291;
    private static final int sqw = 1533972902;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cpcujri6zz;

    private wt() {
    }

    public static int dzt_4(int n) {
        int n2 = (n ^ rtkh_2 ^ wt.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * -1272625183;
        int n4 = (n3 ^ n3 >>> 8) * -1745714645;
        return n4 ^ n4 >>> 14;
    }

    public static int tthh(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * 1229738927 ^ sqw;
        int n4 = (n3 ^ n3 >>> 17) * 1409108517;
        int n5 = (n4 ^ n4 >>> 9) * 1263197141;
        return n5 ^ n5 >>> 12;
    }

    public static boolean aat_3(int n, int n2) {
        return ((wt.tthh(n, n2) ^ (int)System.nanoTime()) * -629766521 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

