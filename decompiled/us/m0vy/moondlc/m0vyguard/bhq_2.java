/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhq_2 {
    private static final int dkh_3 = 900870967;
    private static final int rthz = -341412893;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int pdkkph5yr06;

    private bhq_2() {
    }

    private static int sbs(int n) {
        int n2 = n ^ dkh_3;
        int n3 = (n2 ^ n2 >>> 14) * 396604469;
        int n4 = (n3 ^ n3 >>> 12) * -1535349653;
        return (n4 ^ n4 >>> 16) + rthz;
    }

    public static int na(int n) {
        return bhq_2.sbs(n ^ dkh_3 ^ System.identityHashCode(bhq_2.class) ^ (int)Thread.currentThread().getId() * 794379283);
    }

    public static int thth(int n, int n2) {
        return bhq_2.sbs(Integer.rotateLeft(n ^ n2, 19) * 1668501953 ^ rthz);
    }

    public static boolean zsh_6(int n, int n2) {
        return ((bhq_2.thth(n, n2) ^ (int)System.nanoTime()) * -774358935 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

