/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdq_2 {
    private static final int shft_2 = 1494652698;
    private static final int bkha_2 = -1548949791;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rdg6j1c1u;

    private bdq_2() {
    }

    private static int thl_5(int n) {
        int n2 = n ^ shft_2;
        int n3 = (n2 ^ n2 >>> 14) * 1913937743;
        int n4 = (n3 ^ n3 >>> 12) * 1444231407;
        return (n4 ^ n4 >>> 20) + bkha_2;
    }

    public static int bat(int n) {
        return bdq_2.thl_5(Integer.rotateLeft(n ^ (int)System.nanoTime(), 3) * 915315149 ^ shft_2);
    }

    public static int dry_2(int n, int n2) {
        return bdq_2.thl_5((n + n2 ^ Integer.rotateLeft(n, 7)) + bkha_2 ^ shft_2);
    }

    public static boolean tz_2(int n, int n2) {
        return ((bdq_2.dry_2(n, n2) + Thread.currentThread().hashCode()) * 1031993535 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

