/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzd {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uv82bxxoav8;

    private bzd() {
    }

    private static int jra_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -1323743303;
        int n4 = (n3 ^ n3 >>> 9) * -610797743;
        return n4 ^ n4 >>> 22;
    }

    public static int bnq(int n) {
        return bzd.jra_2(Integer.rotateRight(n * -502685649 - System.identityHashCode(bzd.class), 8));
    }

    public static int dah_3(int n, int n2) {
        return bzd.jra_2(Integer.rotateLeft(n ^ n2, 13) * -1692030981);
    }

    public static boolean ghts_3(int n, int n2) {
        return ((bzd.dah_3(n, n2) + Thread.currentThread().hashCode()) * -1008554763 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

