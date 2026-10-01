/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfdh {
    private static final int hfz = -856542148;
    private static final int shby = -1296826921;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eowb0qm23;

    private bfdh() {
    }

    private static int tghs_2(int n) {
        int n2 = n ^ hfz;
        int n3 = (n2 ^ n2 >>> 12) * 1650061725;
        int n4 = (n3 ^ n3 >>> 17) * -928174403;
        return (n4 ^ n4 >>> 11) + shby;
    }

    public static int shsd(int n) {
        return bfdh.tghs_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 3) * -1453779621 ^ hfz);
    }

    public static int jdht_2(int n, int n2) {
        return bfdh.tghs_2((n + n2 ^ Integer.rotateLeft(n, 3)) + shby ^ hfz);
    }

    public static boolean dhthm(int n, int n2) {
        return ((bfdh.jdht_2(n, n2) + Thread.currentThread().hashCode()) * 1959225555 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

