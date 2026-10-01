/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qs_2 {
    private static final int nz_2 = 323277330;
    private static final int bwa = 1127452968;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yo27768x1m3;

    private qs_2() {
    }

    private static int khthl(int n) {
        int n2 = n ^ nz_2;
        int n3 = (n2 ^ n2 >>> 7) * -668094125;
        int n4 = (n3 ^ n3 >>> 14) * -342551541;
        return (n4 ^ n4 >>> 17) + bwa;
    }

    public static int shd_3(int n) {
        return qs_2.khthl((n ^ nz_2 ^ qs_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int hsq_2(int n, int n2) {
        return qs_2.khthl(n2 ^ Integer.rotateLeft(n, n2 & 0x12) ^ bwa);
    }

    public static boolean zkhl_2(int n, int n2) {
        return ((qs_2.hsq_2(n, n2) ^ (int)System.nanoTime()) * -903614321 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

