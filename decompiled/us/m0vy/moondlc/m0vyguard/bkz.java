/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkz {
    private static final int bkh_3 = -1522259854;
    private static final int hzq = 57625247;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l7nniveixmae78;

    private bkz() {
    }

    private static int rgha(int n) {
        int n2 = n ^ bkh_3;
        int n3 = (n2 ^ n2 >>> 13) * -324666409;
        int n4 = (n3 ^ n3 >>> 19) * -376710137;
        return (n4 ^ n4 >>> 11) + hzq;
    }

    public static int tkha_3(int n) {
        return bkz.rgha(n ^ bkh_3 ^ System.identityHashCode(bkz.class) ^ (int)Thread.currentThread().getId() * 1141652345);
    }

    public static int dam_3(int n, int n2) {
        return bkz.rgha(Integer.rotateLeft(n ^ n2, 14) * -471826329 ^ hzq);
    }

    public static boolean jbd(int n, int n2) {
        return ((bkz.dam_3(n, n2) ^ (int)System.nanoTime()) * -1201794615 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

