/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shr_3 {
    private static final int bdha = -1829792459;
    private static final int smy = -179347651;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int flhlzawamhm1t;

    private shr_3() {
    }

    private static int bdhr(int n) {
        int n2 = n ^ bdha;
        int n3 = (n2 ^ n2 >>> 8) * -252323415;
        int n4 = (n3 ^ n3 >>> 14) * -21144005;
        return (n4 ^ n4 >>> 20) + smy;
    }

    public static int tsb_4(int n) {
        return shr_3.bdhr(Integer.rotateLeft(n ^ bdha ^ (int)System.nanoTime(), 21) * 1628228277);
    }

    public static int khhth(int n, int n2) {
        return shr_3.bdhr(Integer.rotateLeft(n ^ n2, 17) * -1326942087 ^ smy);
    }

    public static boolean swt_2(int n, int n2) {
        return ((shr_3.khhth(n, n2) + Thread.currentThread().hashCode()) * 650047505 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

