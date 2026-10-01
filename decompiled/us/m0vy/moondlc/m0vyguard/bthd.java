/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthd {
    private static final int jah = 227444858;
    private static final int dshdh = 1409461329;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vh2b6htzxsvjr4;

    private bthd() {
    }

    private static int khsz_2(int n) {
        int n2 = n ^ jah;
        int n3 = (n2 ^ n2 >>> 9) * 1589354063;
        int n4 = (n3 ^ n3 >>> 20) * 233988271;
        return (n4 ^ n4 >>> 16) + dshdh;
    }

    public static int tts_5(int n) {
        return bthd.khsz_2(Integer.rotateLeft(n ^ jah ^ (int)System.nanoTime(), 13) * -1854749337);
    }

    public static int ald(int n, int n2) {
        return bthd.khsz_2(n2 ^ Integer.rotateLeft(n, n2 & 0x15) ^ dshdh);
    }

    public static boolean thsr(int n, int n2) {
        return ((bthd.ald(n, n2) + Thread.currentThread().hashCode()) * 636819999 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

