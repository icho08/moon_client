/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhkh {
    private static final int adh_3 = -1598392207;
    private static final int bwt_2 = -1116070114;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ntwytkmg7h166;

    private bhkh() {
    }

    public static int khthj(int n) {
        int n2 = (n ^ bhkh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ adh_3;
        int n3 = (n2 ^ n2 >>> 15) * 350652389;
        int n4 = (n3 ^ n3 >>> 16) * -68941011;
        return n4 ^ n4 >>> 22 ^ bwt_2;
    }

    public static int zjl(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1926377811 ^ n2, 14) + bwt_2 ^ adh_3;
        int n4 = (n3 ^ n3 >>> 11) * -495936751;
        int n5 = (n4 ^ n4 >>> 13) * 786401957;
        return n5 ^ n5 >>> 17 ^ bwt_2;
    }

    public static boolean bbsh(int n, int n2) {
        return ((bhkh.zjl(n, n2) ^ (int)System.nanoTime()) * -1263708061 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

