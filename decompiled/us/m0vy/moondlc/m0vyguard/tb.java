/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tb {
    private static final int thsl_2 = -1035971186;
    private static final int rwj = -1884141614;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int pqsuaw4cum0yl;

    private tb() {
    }

    public static int zsth_4(int n) {
        int n2 = (n ^ tb.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thsl_2;
        int n3 = (n2 ^ n2 >>> 12) * -1891319147;
        int n4 = (n3 ^ n3 >>> 15) * 460157815;
        return n4 ^ n4 >>> 14 ^ rwj;
    }

    public static int dqz_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 19) * -263682219 + rwj ^ thsl_2;
        int n4 = (n3 ^ n3 >>> 14) * 1621475149;
        int n5 = (n4 ^ n4 >>> 18) * -525702189;
        return n5 ^ n5 >>> 23 ^ rwj;
    }

    public static boolean dhsr(int n, int n2) {
        return ((tb.dqz_2(n, n2) ^ (int)System.nanoTime()) * -498970799 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

