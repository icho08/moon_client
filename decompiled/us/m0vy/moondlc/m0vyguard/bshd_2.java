/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshd_2 {
    private static final int zkhd_2 = -417080211;
    private static final int zrs_2 = -845882560;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ff5dspvv26g8;

    private bshd_2() {
    }

    private static int as(int n) {
        int n2 = n ^ zkhd_2;
        int n3 = (n2 ^ n2 >>> 13) * -745613423;
        int n4 = (n3 ^ n3 >>> 16) * 615939623;
        return (n4 ^ n4 >>> 16) + zrs_2;
    }

    public static int hbsh(int n) {
        return bshd_2.as(Integer.rotateRight((n ^ zkhd_2) * -593620459 - System.identityHashCode(bshd_2.class), 6));
    }

    public static int dhdsh(int n, int n2) {
        return bshd_2.as(n + n2 ^ Integer.rotateLeft(n, 13) ^ zrs_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

