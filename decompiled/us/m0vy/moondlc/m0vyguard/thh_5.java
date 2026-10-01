/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thh_5 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ee00r9vx;

    private thh_5() {
    }

    private static int dshdh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 7) * 1881217357;
        int n4 = (n3 ^ n3 >>> 17) * 2010002307;
        return n4 ^ n4 >>> 24;
    }

    public static int bth_4(int n) {
        return thh_5.dshdh((n ^ thh_5.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zdd_5(int n, int n2) {
        return thh_5.dshdh(n + n2 ^ Integer.rotateLeft(n, 10));
    }

    public static boolean ssh_7(int n, int n2) {
        return ((thh_5.zdd_5(n, n2) ^ (int)System.nanoTime()) * 1586459493 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

