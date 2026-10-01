/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class aa {
    private static final int dhfz_2 = 343864691;
    private static final int tsa_2 = -1093036234;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int otks28xx5ev;

    private aa() {
    }

    public static int bjb(int n) {
        int n2 = Integer.rotateRight((n ^ dhfz_2) * 1340220307 - System.identityHashCode(aa.class), 18);
        int n3 = (n2 ^ n2 >>> 13) * -2127987349;
        int n4 = (n3 ^ n3 >>> 10) * -534364093;
        return n4 ^ n4 >>> 19;
    }

    public static int dhlr(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * 1237550699 ^ tsa_2;
        int n4 = (n3 ^ n3 >>> 13) * -1842303877;
        int n5 = (n4 ^ n4 >>> 14) * 1064682271;
        return n5 ^ n5 >>> 16;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

