/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tb_2 {
    private static final int shjt = -1751230838;
    private static final int hshd = 1956575610;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int b7r6aj29;

    private tb_2() {
    }

    private static int td_2(int n) {
        int n2 = n ^ shjt;
        int n3 = (n2 ^ n2 >>> 10) * 1451750499;
        int n4 = (n3 ^ n3 >>> 20) * 487811147;
        return (n4 ^ n4 >>> 20) + hshd;
    }

    public static int ams_2(int n) {
        return tb_2.td_2(Integer.rotateLeft(n ^ shjt ^ (int)System.nanoTime(), 8) * 500726471);
    }

    public static int sa_4(int n, int n2) {
        return tb_2.td_2(Integer.rotateLeft(n ^ n2, 19) * -433298659 ^ hshd);
    }

    public static boolean hhd(int n, int n2) {
        return ((tb_2.sa_4(n, n2) + Thread.currentThread().hashCode()) * 2064426965 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

