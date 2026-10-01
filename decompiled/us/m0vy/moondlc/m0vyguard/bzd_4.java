/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzd_4 {
    private static final int hld_2 = 1972809756;
    private static final int hka = 1406255254;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int i1y9k5fsr;

    private bzd_4() {
    }

    public static int ghzq_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * 177368251 ^ hld_2;
        int n3 = (n2 ^ n2 >>> 18) * -1425571463;
        int n4 = (n3 ^ n3 >>> 13) * -211212937;
        return n4 ^ n4 >>> 20 ^ hka;
    }

    public static int ghjth(int n, int n2) {
        int n3 = Integer.rotateRight(n * -958165637 ^ n2, 6) + hka ^ hld_2;
        int n4 = (n3 ^ n3 >>> 14) * 1098529725;
        int n5 = (n4 ^ n4 >>> 15) * 2077002669;
        return n5 ^ n5 >>> 23 ^ hka;
    }

    public static boolean tdt_6(int n, int n2) {
        return ((bzd_4.ghjth(n, n2) + Thread.currentThread().hashCode()) * 1206241535 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

