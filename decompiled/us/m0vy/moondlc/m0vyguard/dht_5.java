/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dht_5 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ov8jglkfi9;

    private dht_5() {
    }

    private static int dhdhy(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * -2017209867;
        int n4 = (n3 ^ n3 >>> 19) * 951361321;
        return n4 ^ n4 >>> 12;
    }

    public static int dghs_2(int n) {
        return dht_5.dhdhy(Integer.rotateRight(n * -1843701179 - System.identityHashCode(dht_5.class), 5));
    }

    public static int syz_3(int n, int n2) {
        return dht_5.dhdhy(Integer.rotateLeft(n ^ n2, 6) * 1013560977);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

