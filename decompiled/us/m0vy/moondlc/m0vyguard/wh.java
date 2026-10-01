/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wh {
    private static final int rda = -1738968095;
    private static final int zdd_3 = 1172564519;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int afkguyczeoh;

    private wh() {
    }

    public static int dkhr(int n) {
        int n2 = Integer.rotateRight(n * -956029993 - System.identityHashCode(wh.class), 10) ^ rda;
        int n3 = (n2 ^ n2 >>> 17) * -637921483;
        int n4 = (n3 ^ n3 >>> 14) * -1609281277;
        return n4 ^ n4 >>> 18 ^ zdd_3;
    }

    public static int shf_5(int n, int n2) {
        int n3 = (n2 - n ^ 0x7B651A79) + zdd_3 ^ rda;
        int n4 = (n3 ^ n3 >>> 17) * 245453157;
        int n5 = (n4 ^ n4 >>> 14) * -1480325227;
        return n5 ^ n5 >>> 18 ^ zdd_3;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

