/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsj_2 {
    private static final int bqt = 2136073135;
    private static final int dhzq = 1931979045;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int scr9dnkp23;

    private bsj_2() {
    }

    public static int khwk(int n) {
        int n2 = Integer.rotateRight((n ^ bqt) * 1534051207 - System.identityHashCode(bsj_2.class), 26);
        int n3 = (n2 ^ n2 >>> 15) * -1890868753;
        int n4 = (n3 ^ n3 >>> 10) * -1523679859;
        return n4 ^ n4 >>> 21;
    }

    public static int dhqy(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 9) ^ dhzq;
        int n4 = (n3 ^ n3 >>> 13) * -1744969863;
        int n5 = (n4 ^ n4 >>> 18) * -51350235;
        return n5 ^ n5 >>> 17;
    }

    public static boolean zhz_2(int n, int n2) {
        return ((bsj_2.dhqy(n, n2) + Thread.currentThread().hashCode()) * 90022561 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

