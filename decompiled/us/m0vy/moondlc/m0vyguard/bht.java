/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bht {
    private static final int zyh = 1543709765;
    private static final int zds_2 = -1045054225;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int b7enq8avutyk7;

    private bht() {
    }

    private static int ghthf(int n) {
        int n2 = n ^ zyh;
        int n3 = (n2 ^ n2 >>> 16) * -625897985;
        int n4 = (n3 ^ n3 >>> 17) * -835768557;
        return (n4 ^ n4 >>> 12) + zds_2;
    }

    public static int sdhh_2(int n) {
        return bht.ghthf(Integer.rotateLeft(n ^ zyh ^ (int)System.nanoTime(), 8) * -1165667065);
    }

    public static int ddkh_2(int n, int n2) {
        return bht.ghthf(Integer.rotateLeft(n ^ n2, 12) * 1568218379 ^ zds_2);
    }

    public static boolean thkhf(int n, int n2) {
        return ((bht.ddkh_2(n, n2) + Thread.currentThread().hashCode()) * 53539645 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

