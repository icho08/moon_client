/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zy {
    private static final int ha = 1143377732;
    private static final int raa_4 = -290378369;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ddtfjszk;

    private zy() {
    }

    private static int dzh_4(int n) {
        int n2 = n ^ ha;
        int n3 = (n2 ^ n2 >>> 15) * 1257130395;
        int n4 = (n3 ^ n3 >>> 14) * -1199598405;
        return (n4 ^ n4 >>> 13) + raa_4;
    }

    public static int shtgh(int n) {
        return zy.dzh_4(Integer.rotateLeft(n ^ (int)System.nanoTime(), 20) * 1788998493 ^ ha);
    }

    public static int rr(int n, int n2) {
        return zy.dzh_4(Integer.rotateRight(n * 600942611 ^ n2, 8) + raa_4 ^ ha);
    }

    public static boolean khkb(int n, int n2) {
        return ((zy.rr(n, n2) + Thread.currentThread().hashCode()) * -1936207469 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

