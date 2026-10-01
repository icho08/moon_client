/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdb {
    private static final int zzr = -47076369;
    private static final int tnh_2 = 1251485756;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o4bbv3e0tf1;

    private bdb() {
    }

    private static int thhgh_2(int n) {
        int n2 = n ^ zzr;
        int n3 = (n2 ^ n2 >>> 16) * 1924559137;
        int n4 = (n3 ^ n3 >>> 10) * 1639862719;
        return (n4 ^ n4 >>> 16) + tnh_2;
    }

    public static int tz(int n) {
        return bdb.thhgh_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 17) * -534242991 ^ zzr);
    }

    public static int zdy_3(int n, int n2) {
        return bdb.thhgh_2(Integer.rotateRight(n * -967964279 ^ n2, 12) + tnh_2 ^ zzr);
    }

    public static boolean khsgh_2(int n, int n2) {
        return ((bdb.zdy_3(n, n2) + Thread.currentThread().hashCode()) * 45549815 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

