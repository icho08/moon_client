/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghm {
    private static final int stth_3 = -1389355134;
    private static final int sbf_2 = -1943902612;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p0jpwaq7;

    private bghm() {
    }

    public static int stkh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 4) * -1499228579 ^ stth_3;
        int n3 = (n2 ^ n2 >>> 17) * -323887031;
        int n4 = (n3 ^ n3 >>> 11) * -190501553;
        return n4 ^ n4 >>> 19 ^ sbf_2;
    }

    public static int smm_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x14)) + sbf_2 ^ stth_3;
        int n4 = (n3 ^ n3 >>> 9) * 968160423;
        int n5 = (n4 ^ n4 >>> 11) * -1261726289;
        return n5 ^ n5 >>> 23 ^ sbf_2;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

