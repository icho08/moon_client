/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hkh_4 {
    private static final int rys_2 = -374552177;
    private static final int stth_2 = -1912016671;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wjgn2ymfpl;

    private hkh_4() {
    }

    public static int sthkh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 21) * 544169073 ^ rys_2;
        int n3 = (n2 ^ n2 >>> 14) * 828695503;
        int n4 = (n3 ^ n3 >>> 8) * 1696792241;
        return n4 ^ n4 >>> 16 ^ stth_2;
    }

    public static int khzl_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1962351065 ^ n2, 18) + stth_2 ^ rys_2;
        int n4 = (n3 ^ n3 >>> 13) * 77206145;
        int n5 = (n4 ^ n4 >>> 17) * -671965467;
        return n5 ^ n5 >>> 23 ^ stth_2;
    }

    public static boolean dsf(int n, int n2) {
        return ((hkh_4.khzl_2(n, n2) + Thread.currentThread().hashCode()) * 1822814345 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

