/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class taq {
    private static final int hzth_2 = -667463101;
    private static final int hhm = 2125002570;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int odv3b1dz;

    private taq() {
    }

    private static int rzy(int n) {
        int n2 = n ^ hzth_2;
        int n3 = (n2 ^ n2 >>> 11) * -1762841721;
        int n4 = (n3 ^ n3 >>> 10) * 1967064529;
        return (n4 ^ n4 >>> 16) + hhm;
    }

    public static int thwr(int n) {
        return taq.rzy(n ^ hzth_2 ^ System.identityHashCode(taq.class) ^ (int)Thread.currentThread().getId() * -1595825927);
    }

    public static int htth(int n, int n2) {
        return taq.rzy(n2 - n ^ 0xD05F314F ^ hhm);
    }

    public static boolean zdz_6(int n, int n2) {
        return ((taq.htth(n, n2) ^ (int)System.nanoTime()) * -1507854223 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

