/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btt_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int izs0852o54su;

    private btt_2() {
    }

    private static int stj_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * 581948567;
        int n4 = (n3 ^ n3 >>> 9) * -895555347;
        return n4 ^ n4 >>> 20;
    }

    public static int sad_6(int n) {
        return btt_2.stj_2((n ^ btt_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zzt_7(int n, int n2) {
        return btt_2.stj_2(n + n2 ^ Integer.rotateLeft(n, 3));
    }

    public static boolean jshw(int n, int n2) {
        return ((btt_2.zzt_7(n, n2) ^ (int)System.nanoTime()) * 1470973161 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

