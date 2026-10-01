/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hkh {
    private static final int bkhh_2 = -247595635;
    private static final int thtm_2 = 1777685442;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gfc9z9j8wq;

    private hkh() {
    }

    private static int khzy_2(int n) {
        int n2 = n ^ bkhh_2;
        int n3 = (n2 ^ n2 >>> 15) * 517446913;
        int n4 = (n3 ^ n3 >>> 17) * -702447719;
        return (n4 ^ n4 >>> 13) + thtm_2;
    }

    public static int anf(int n) {
        return hkh.khzy_2(Integer.rotateRight((n ^ bkhh_2) * 750819517 - System.identityHashCode(hkh.class), 17));
    }

    public static int shjy(int n, int n2) {
        return hkh.khzy_2(n + n2 ^ Integer.rotateLeft(n, 11) ^ thtm_2);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

