/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tss_2 {
    private static final int dkq = -210002761;
    private static final int rqa_2 = 2091081555;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ozkbnkpyjb0k1v;

    private tss_2() {
    }

    public static int zyy(int n) {
        int n2 = n ^ System.identityHashCode(tss_2.class) ^ (int)Thread.currentThread().getId() * -56385961 ^ dkq;
        int n3 = (n2 ^ n2 >>> 17) * 1937775319;
        int n4 = (n3 ^ n3 >>> 8) * -254390965;
        return n4 ^ n4 >>> 17 ^ rqa_2;
    }

    public static int tha_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 11) * 381679769 + rqa_2 ^ dkq;
        int n4 = (n3 ^ n3 >>> 14) * -1043377021;
        int n5 = (n4 ^ n4 >>> 12) * -1870115847;
        return n5 ^ n5 >>> 12 ^ rqa_2;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

