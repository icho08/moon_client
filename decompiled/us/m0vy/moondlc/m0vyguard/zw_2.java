/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zw_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zv3wx31ar00rb;

    private zw_2() {
    }

    private static int zhf_4(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * -225543383;
        int n4 = (n3 ^ n3 >>> 10) * 2110910675;
        return n4 ^ n4 >>> 14;
    }

    public static int sha_3(int n) {
        return zw_2.zhf_4(n ^ System.identityHashCode(zw_2.class) ^ (int)Thread.currentThread().getId() * 1867748225);
    }

    public static int hmgh(int n, int n2) {
        return zw_2.zhf_4(Integer.rotateRight(n * -2119476655 ^ n2, 10));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

