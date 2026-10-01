/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthsh {
    private static final int shq_3 = 1859185311;
    private static final int thrh_2 = 1623216936;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qwjcv9835ax;

    private bthsh() {
    }

    public static int shhl(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * -259087459 ^ shq_3;
        int n3 = (n2 ^ n2 >>> 12) * 868410235;
        int n4 = (n3 ^ n3 >>> 13) * -1782311399;
        return n4 ^ n4 >>> 17 ^ thrh_2;
    }

    public static int htz_4(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 13)) + thrh_2 ^ shq_3;
        int n4 = (n3 ^ n3 >>> 10) * -642267513;
        int n5 = (n4 ^ n4 >>> 15) * 289652871;
        return n5 ^ n5 >>> 23 ^ thrh_2;
    }

    public static boolean zfsh(int n, int n2) {
        return ((bthsh.htz_4(n, n2) + Thread.currentThread().hashCode()) * -179573147 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

