/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sth_8 {
    private static final int jshy = 764912064;
    private static final int zrl = 643026563;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mz9obtvta56dy;

    private sth_8() {
    }

    private static int dtb(int n) {
        int n2 = n ^ jshy;
        int n3 = (n2 ^ n2 >>> 16) * 233637355;
        int n4 = (n3 ^ n3 >>> 14) * 1022812873;
        return (n4 ^ n4 >>> 16) + zrl;
    }

    public static int thad_2(int n) {
        return sth_8.dtb(n ^ System.identityHashCode(sth_8.class) ^ (int)Thread.currentThread().getId() * -1898633275 ^ jshy);
    }

    public static int tky_2(int n, int n2) {
        return sth_8.dtb((n2 ^ Integer.rotateLeft(n, n2 & 0xD)) + zrl ^ jshy);
    }

    public static boolean htd(int n, int n2) {
        return ((sth_8.tky_2(n, n2) ^ (int)System.nanoTime()) * 1189177699 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

