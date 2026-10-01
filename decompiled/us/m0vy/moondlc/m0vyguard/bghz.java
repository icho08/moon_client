/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghz {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int r1qmh2o65;

    private bghz() {
    }

    public static int ddm_4(int n) {
        int n2 = Integer.rotateRight(n * -1245288993 - System.identityHashCode(bghz.class), 17);
        int n3 = (n2 ^ n2 >>> 14) * 558888143;
        int n4 = (n3 ^ n3 >>> 7) * 1789435049;
        return n4 ^ n4 >>> 18;
    }

    public static int shwt_2(int n, int n2) {
        int n3 = n2 - n ^ 0x57834BA6;
        int n4 = (n3 ^ n3 >>> 16) * -198669379;
        int n5 = (n4 ^ n4 >>> 9) * -986975993;
        return n5 ^ n5 >>> 13;
    }

    public static boolean dhzth(int n, int n2) {
        return ((bghz.shwt_2(n, n2) + Thread.currentThread().hashCode()) * 553414605 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

