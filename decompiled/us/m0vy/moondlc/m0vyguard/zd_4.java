/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zd_4 {
    private static final int dths_2 = -413683998;
    private static final int jshl = -1514168757;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ij7nc93tc39;

    private zd_4() {
    }

    public static int rdq(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 21) * 464774979 ^ dths_2;
        int n3 = (n2 ^ n2 >>> 11) * -1966120213;
        int n4 = (n3 ^ n3 >>> 12) * 20448283;
        return n4 ^ n4 >>> 21 ^ jshl;
    }

    public static int skw_2(int n, int n2) {
        int n3 = (n2 - n ^ 0xBE29429F) + jshl ^ dths_2;
        int n4 = (n3 ^ n3 >>> 13) * -1995535005;
        int n5 = (n4 ^ n4 >>> 18) * -1900490223;
        return n5 ^ n5 >>> 19 ^ jshl;
    }

    public static boolean sfj(int n, int n2) {
        return ((zd_4.skw_2(n, n2) + Thread.currentThread().hashCode()) * 1901330451 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

