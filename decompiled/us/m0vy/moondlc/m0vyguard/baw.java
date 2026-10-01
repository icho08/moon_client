/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class baw {
    private static final int rzy_2 = 402164482;
    private static final int thrs = -699129736;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ims2lrmeyv2;

    private baw() {
    }

    public static int angh(int n) {
        int n2 = n ^ System.identityHashCode(baw.class) ^ (int)Thread.currentThread().getId() * 711102641 ^ rzy_2;
        int n3 = (n2 ^ n2 >>> 11) * -1197551195;
        int n4 = (n3 ^ n3 >>> 12) * 1638714021;
        return n4 ^ n4 >>> 22 ^ thrs;
    }

    public static int zhs_4(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 5)) + thrs ^ rzy_2;
        int n4 = (n3 ^ n3 >>> 11) * -690542963;
        int n5 = (n4 ^ n4 >>> 14) * 1832786423;
        return n5 ^ n5 >>> 14 ^ thrs;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

