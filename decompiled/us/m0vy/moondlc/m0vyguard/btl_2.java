/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btl_2 {
    private static final int zzh_2 = -1370751601;
    private static final int jtht = -1852590342;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dz32feggycm8;

    private btl_2() {
    }

    private static int dthz_3(int n) {
        int n2 = n ^ zzh_2;
        int n3 = (n2 ^ n2 >>> 11) * 1632477845;
        int n4 = (n3 ^ n3 >>> 18) * 397880591;
        return (n4 ^ n4 >>> 20) + jtht;
    }

    public static int swh(int n) {
        return btl_2.dthz_3((n ^ btl_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ zzh_2);
    }

    public static int khhz_3(int n, int n2) {
        return btl_2.dthz_3((n2 - n ^ 0x58A7D223) + jtht ^ zzh_2);
    }

    public static boolean jrs(int n, int n2) {
        return ((btl_2.khhz_3(n, n2) ^ (int)System.nanoTime()) * 650809321 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

