/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzdh {
    private static final int rmj = 1846618174;
    private static final int hghd = -1789079208;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int txn9evv5;

    private bzdh() {
    }

    private static int dnh_2(int n) {
        int n2 = n ^ rmj;
        int n3 = (n2 ^ n2 >>> 10) * -1500400919;
        int n4 = (n3 ^ n3 >>> 10) * -936396193;
        return (n4 ^ n4 >>> 20) + hghd;
    }

    public static int shlt_2(int n) {
        return bzdh.dnh_2(Integer.rotateLeft(n ^ rmj ^ (int)System.nanoTime(), 7) * -1619861651);
    }

    public static int szq_4(int n, int n2) {
        return bzdh.dnh_2(n2 ^ Integer.rotateLeft(n, n2 & 0xF) ^ hghd);
    }

    public static boolean sqd_2(int n, int n2) {
        return ((bzdh.szq_4(n, n2) + Thread.currentThread().hashCode()) * -1157311223 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

