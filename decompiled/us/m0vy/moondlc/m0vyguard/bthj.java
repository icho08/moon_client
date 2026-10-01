/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthj {
    private static final int thshz = 1670867559;
    private static final int hshf = -44319417;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hrtezvmofjyxv;

    private bthj() {
    }

    private static int sdm_2(int n) {
        int n2 = n ^ thshz;
        int n3 = (n2 ^ n2 >>> 15) * 189237629;
        int n4 = (n3 ^ n3 >>> 9) * 611933099;
        return (n4 ^ n4 >>> 16) + hshf;
    }

    public static int zta_7(int n) {
        return bthj.sdm_2(Integer.rotateRight((n ^ thshz) * 414469847 - System.identityHashCode(bthj.class), 15));
    }

    public static int hz(int n, int n2) {
        return bthj.sdm_2(n + n2 ^ Integer.rotateLeft(n, 3) ^ hshf);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

