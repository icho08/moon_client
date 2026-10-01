/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bff {
    private static final int djz_2 = -1077900881;
    private static final int khdhh = 1144224492;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int y792z6o1;

    private bff() {
    }

    private static int rzd(int n) {
        int n2 = n ^ djz_2;
        int n3 = (n2 ^ n2 >>> 12) * -1346612591;
        int n4 = (n3 ^ n3 >>> 16) * 1646350727;
        return (n4 ^ n4 >>> 14) + khdhh;
    }

    public static int tay_2(int n) {
        return bff.rzd(Integer.rotateLeft(n ^ djz_2 ^ (int)System.nanoTime(), 9) * 389672533);
    }

    public static int dhshz_2(int n, int n2) {
        return bff.rzd(Integer.rotateLeft(n ^ n2, 6) * -1558870433 ^ khdhh);
    }

    public static boolean hskh_2(int n, int n2) {
        return ((bff.dhshz_2(n, n2) + Thread.currentThread().hashCode()) * 1163314479 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

