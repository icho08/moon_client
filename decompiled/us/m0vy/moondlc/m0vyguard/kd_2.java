/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kd_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ku17ezxj1j2omo;

    private kd_2() {
    }

    private static int dwd_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * 330095389;
        int n4 = (n3 ^ n3 >>> 20) * 402107077;
        return n4 ^ n4 >>> 20;
    }

    public static int dkha_4(int n) {
        return kd_2.dwd_3(Integer.rotateLeft(n ^ (int)System.nanoTime(), 9) * 1029488741);
    }

    public static int smd_4(int n, int n2) {
        return kd_2.dwd_3(Integer.rotateRight(n * -500017075 ^ n2, 9));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

