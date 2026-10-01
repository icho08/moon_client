/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bda_3 {
    private static final int dhsh_5 = -774053013;
    private static final int bydh = 1883470456;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int rvtm8nx66te;

    private bda_3() {
    }

    private static int asy(int n) {
        int n2 = n ^ dhsh_5;
        int n3 = (n2 ^ n2 >>> 14) * -450550557;
        int n4 = (n3 ^ n3 >>> 19) * -1459939293;
        return (n4 ^ n4 >>> 21) + bydh;
    }

    public static int dzsh(int n) {
        return bda_3.asy(Integer.rotateRight((n ^ dhsh_5) * -1225961867 - System.identityHashCode(bda_3.class), 11));
    }

    public static int zss_3(int n, int n2) {
        return bda_3.asy(Integer.rotateRight(n * 950589915 ^ n2, 6) ^ bydh);
    }

    public static boolean bzd(int n, int n2) {
        return ((bda_3.zss_3(n, n2) + Thread.currentThread().hashCode()) * 1143025719 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

