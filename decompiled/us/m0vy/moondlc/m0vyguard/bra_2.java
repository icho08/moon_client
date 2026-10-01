/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bra_2 {
    private static final int dhqh = -1931582183;
    private static final int bdhr = -1844479640;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int n9pwtvih;

    private bra_2() {
    }

    public static int ttd_7(int n) {
        int n2 = n ^ System.identityHashCode(bra_2.class) ^ (int)Thread.currentThread().getId() * 132424437 ^ dhqh;
        int n3 = (n2 ^ n2 >>> 15) * 101604599;
        int n4 = (n3 ^ n3 >>> 9) * 1650804595;
        return n4 ^ n4 >>> 14 ^ bdhr;
    }

    public static int hjq(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 15)) + bdhr ^ dhqh;
        int n4 = (n3 ^ n3 >>> 11) * -1505569903;
        int n5 = (n4 ^ n4 >>> 14) * 576617771;
        return n5 ^ n5 >>> 17 ^ bdhr;
    }

    public static boolean rbs_2(int n, int n2) {
        return ((bra_2.hjq(n, n2) ^ (int)System.nanoTime()) * -1003066475 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

