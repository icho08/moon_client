/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjn {
    private static final int rmd_2 = 478781240;
    private static final int dhnf = -1366702680;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int etx9d8jp8l8;

    private bjn() {
    }

    public static int snkh(int n) {
        int n2 = n ^ System.identityHashCode(bjn.class) ^ (int)Thread.currentThread().getId() * 840758941 ^ rmd_2;
        int n3 = (n2 ^ n2 >>> 16) * 1759109895;
        int n4 = (n3 ^ n3 >>> 16) * -1926684193;
        return n4 ^ n4 >>> 15 ^ dhnf;
    }

    public static int sshsh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 16)) + dhnf ^ rmd_2;
        int n4 = (n3 ^ n3 >>> 14) * 954872663;
        int n5 = (n4 ^ n4 >>> 14) * -1815339907;
        return n5 ^ n5 >>> 16 ^ dhnf;
    }

    public static boolean ddb(int n, int n2) {
        return ((bjn.sshsh_2(n, n2) ^ (int)System.nanoTime()) * 1449775397 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

