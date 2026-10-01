/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tja_2 {
    private static final int qt_2 = 94825937;
    private static final int nl = -1144130574;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vwkeflmomf4;

    private tja_2() {
    }

    public static int shghb(int n) {
        int n2 = Integer.rotateRight(n * 1191197911 - System.identityHashCode(tja_2.class), 13) ^ qt_2;
        int n3 = (n2 ^ n2 >>> 13) * 504862019;
        int n4 = (n3 ^ n3 >>> 11) * 1145290535;
        return n4 ^ n4 >>> 17 ^ nl;
    }

    public static int bsb_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 15) * 700590807 + nl ^ qt_2;
        int n4 = (n3 ^ n3 >>> 12) * -55885773;
        int n5 = (n4 ^ n4 >>> 14) * 99757977;
        return n5 ^ n5 >>> 15 ^ nl;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

