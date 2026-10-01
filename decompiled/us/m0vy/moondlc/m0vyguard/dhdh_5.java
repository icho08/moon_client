/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhdh_5 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int d9i94s4cl;

    private dhdh_5() {
    }

    public static int hdd_2(int n) {
        int n2 = (n ^ dhdh_5.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 17) * 1774381633;
        int n4 = (n3 ^ n3 >>> 9) * -603473567;
        return n4 ^ n4 >>> 21;
    }

    public static int kk(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x16);
        int n4 = (n3 ^ n3 >>> 8) * -764154365;
        int n5 = (n4 ^ n4 >>> 13) * -653246505;
        return n5 ^ n5 >>> 21;
    }

    public static boolean zb_2(int n, int n2) {
        return ((dhdh_5.kk(n, n2) ^ (int)System.nanoTime()) * -1366909841 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

