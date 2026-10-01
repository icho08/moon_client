/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhth_5 {
    private static final int rad_2 = 1455212784;
    private static final int jnkh = -758232100;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cmnyw4ewnj;

    private dhth_5() {
    }

    public static int dhhr_2(int n) {
        int n2 = Integer.rotateLeft(n ^ rad_2 ^ (int)System.nanoTime(), 5) * 2102577255;
        int n3 = (n2 ^ n2 >>> 13) * -752991067;
        int n4 = (n3 ^ n3 >>> 16) * 835870081;
        return n4 ^ n4 >>> 15;
    }

    public static int hrdh(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 3) ^ jnkh;
        int n4 = (n3 ^ n3 >>> 11) * -2013905143;
        int n5 = (n4 ^ n4 >>> 13) * 1944485245;
        return n5 ^ n5 >>> 21;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

