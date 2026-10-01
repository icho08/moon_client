/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thkh {
    private static final int dd_2 = -1337164270;
    private static final int rzz_2 = 1061795130;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int pfsk4vwr;

    private thkh() {
    }

    private static int ddy_4(int n) {
        int n2 = n ^ dd_2;
        int n3 = (n2 ^ n2 >>> 12) * 1999788945;
        int n4 = (n3 ^ n3 >>> 9) * -269878755;
        return (n4 ^ n4 >>> 22) + rzz_2;
    }

    public static int adh_2(int n) {
        return thkh.ddy_4(n ^ System.identityHashCode(thkh.class) ^ (int)Thread.currentThread().getId() * 1734756593 ^ dd_2);
    }

    public static int sts_3(int n, int n2) {
        return thkh.ddy_4(Integer.rotateRight(n * -1754556429 ^ n2, 19) + rzz_2 ^ dd_2);
    }

    public static boolean rthkh(int n, int n2) {
        return ((thkh.sts_3(n, n2) ^ (int)System.nanoTime()) * -242916645 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

