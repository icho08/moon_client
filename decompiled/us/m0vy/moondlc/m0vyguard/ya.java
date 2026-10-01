/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ya {
    private static final int rzd_4 = -1616611809;
    private static final int bra_2 = -1547496489;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xal2us5n;

    private ya() {
    }

    private static int thnsh(int n) {
        int n2 = n ^ rzd_4;
        int n3 = (n2 ^ n2 >>> 9) * 909866989;
        int n4 = (n3 ^ n3 >>> 14) * -712655201;
        return (n4 ^ n4 >>> 23) + bra_2;
    }

    public static int zthdh_2(int n) {
        return ya.thnsh(n ^ System.identityHashCode(ya.class) ^ (int)Thread.currentThread().getId() * -341417943 ^ rzd_4);
    }

    public static int tnd_3(int n, int n2) {
        return ya.thnsh((n2 ^ Integer.rotateLeft(n, n2 & 0xD)) + bra_2 ^ rzd_4);
    }

    public static boolean tr(int n, int n2) {
        return ((ya.tnd_3(n, n2) ^ (int)System.nanoTime()) * 124414735 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

