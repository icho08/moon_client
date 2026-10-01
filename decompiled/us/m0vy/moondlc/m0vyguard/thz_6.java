/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thz_6 {
    private static final int thkhz = -316028990;
    private static final int djdh = -1293921533;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gu289ugrkdgo;

    private thz_6() {
    }

    public static int khzd_3(int n) {
        int n2 = (n ^ thz_6.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thkhz;
        int n3 = (n2 ^ n2 >>> 17) * -1166088255;
        int n4 = (n3 ^ n3 >>> 10) * 573541185;
        return n4 ^ n4 >>> 17 ^ djdh;
    }

    public static int zbth_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1282342755 ^ n2, 15) + djdh ^ thkhz;
        int n4 = (n3 ^ n3 >>> 9) * 1553993431;
        int n5 = (n4 ^ n4 >>> 10) * 794346799;
        return n5 ^ n5 >>> 22 ^ djdh;
    }

    public static boolean zash_4(int n, int n2) {
        return ((thz_6.zbth_2(n, n2) ^ (int)System.nanoTime()) * 1400509811 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

