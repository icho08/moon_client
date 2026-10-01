/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdth {
    private static final int rwsh = 347827129;
    private static final int dhzth_2 = 336802615;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qa0b6pvnzy6e3;

    private bdth() {
    }

    private static int sda_6(int n) {
        int n2 = n ^ rwsh;
        int n3 = (n2 ^ n2 >>> 14) * -1812716311;
        int n4 = (n3 ^ n3 >>> 9) * 1112399079;
        return (n4 ^ n4 >>> 16) + dhzth_2;
    }

    public static int sash_2(int n) {
        return bdth.sda_6(n ^ System.identityHashCode(bdth.class) ^ (int)Thread.currentThread().getId() * 205076593 ^ rwsh);
    }

    public static int shq_4(int n, int n2) {
        return bdth.sda_6((n2 ^ Integer.rotateLeft(n, n2 & 7)) + dhzth_2 ^ rwsh);
    }

    public static boolean khssh_2(int n, int n2) {
        return ((bdth.shq_4(n, n2) ^ (int)System.nanoTime()) * 1075476771 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

