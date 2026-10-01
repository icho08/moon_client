/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jl_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int m0phv3eg37b;

    private jl_2() {
    }

    public static int hwt_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 4) * -1337900861;
        int n3 = (n2 ^ n2 >>> 17) * -911640301;
        int n4 = (n3 ^ n3 >>> 8) * -669469533;
        return n4 ^ n4 >>> 20;
    }

    public static int khwm(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1996779193 ^ n2, 6);
        int n4 = (n3 ^ n3 >>> 13) * 363157663;
        int n5 = (n4 ^ n4 >>> 16) * -120765087;
        return n5 ^ n5 >>> 19;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

