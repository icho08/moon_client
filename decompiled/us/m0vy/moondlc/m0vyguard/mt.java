/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class mt {
    private static final int shshn = -781301404;
    private static final int zshz_2 = 1782014574;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gw6n0k6svh63v;

    private mt() {
    }

    public static int jash_2(int n) {
        int n2 = n ^ shshn ^ System.identityHashCode(mt.class) ^ (int)Thread.currentThread().getId() * -140404387;
        int n3 = (n2 ^ n2 >>> 12) * 1989991259;
        int n4 = (n3 ^ n3 >>> 10) * -1040885721;
        return n4 ^ n4 >>> 18;
    }

    public static int dsq_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1749579991 ^ n2, 7) ^ zshz_2;
        int n4 = (n3 ^ n3 >>> 17) * -293685313;
        int n5 = (n4 ^ n4 >>> 14) * -783307667;
        return n5 ^ n5 >>> 18;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

