/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ja_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fclul9qf;

    private ja_2() {
    }

    public static int bnm(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 41102119;
        int n3 = (n2 ^ n2 >>> 11) * -167225511;
        int n4 = (n3 ^ n3 >>> 12) * -1436342199;
        return n4 ^ n4 >>> 16;
    }

    public static int snkh_2(int n, int n2) {
        int n3 = n2 - n ^ 0xB40940B6;
        int n4 = (n3 ^ n3 >>> 15) * -1026775663;
        int n5 = (n4 ^ n4 >>> 16) * 717009275;
        return n5 ^ n5 >>> 18;
    }

    public static boolean dhan_2(int n, int n2) {
        return ((ja_2.snkh_2(n, n2) + Thread.currentThread().hashCode()) * 1880029325 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

