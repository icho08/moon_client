/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bngh {
    private static final int rthw = 1594671678;
    private static final int hshn = -1283136838;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k9yadjb0aws;

    private bngh() {
    }

    private static int hhn(int n) {
        int n2 = n ^ rthw;
        int n3 = (n2 ^ n2 >>> 10) * -133352997;
        int n4 = (n3 ^ n3 >>> 17) * -529562047;
        return (n4 ^ n4 >>> 21) + hshn;
    }

    public static int sts_5(int n) {
        return bngh.hhn(Integer.rotateRight((n ^ rthw) * 454572355 - System.identityHashCode(bngh.class), 13));
    }

    public static int zqt_3(int n, int n2) {
        return bngh.hhn(n + n2 ^ Integer.rotateLeft(n, 3) ^ hshn);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

