/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khh_2 {
    private static final int dsf_2 = 1739693463;
    private static final int dhqd_2 = -897421272;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ujir1fxp6wm0d4;

    private khh_2() {
    }

    public static int thbh(int n) {
        int n2 = n ^ dsf_2 ^ System.identityHashCode(khh_2.class) ^ (int)Thread.currentThread().getId() * -1025669109;
        int n3 = (n2 ^ n2 >>> 11) * 1591007979;
        int n4 = (n3 ^ n3 >>> 11) * -1909646079;
        return n4 ^ n4 >>> 17;
    }

    public static int thdht_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1463071289 ^ n2, 17) ^ dhqd_2;
        int n4 = (n3 ^ n3 >>> 12) * -1101114645;
        int n5 = (n4 ^ n4 >>> 13) * -96566649;
        return n5 ^ n5 >>> 19;
    }

    public static boolean thmd_2(int n, int n2) {
        return ((khh_2.thdht_2(n, n2) ^ (int)System.nanoTime()) * 1910812247 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

