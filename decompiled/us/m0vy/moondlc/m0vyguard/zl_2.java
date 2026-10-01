/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zl_2 {
    private static final int thshh = -566851012;
    private static final int tzs_3 = 1847587540;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cg6yh4ou7;

    private zl_2() {
    }

    private static int tnz_2(int n) {
        int n2 = n ^ thshh;
        int n3 = (n2 ^ n2 >>> 16) * -348859377;
        int n4 = (n3 ^ n3 >>> 17) * 1943150811;
        return (n4 ^ n4 >>> 13) + tzs_3;
    }

    public static int ghzth(int n) {
        return zl_2.tnz_2(n ^ thshh ^ System.identityHashCode(zl_2.class) ^ (int)Thread.currentThread().getId() * 947759667);
    }

    public static int zrd_3(int n, int n2) {
        return zl_2.tnz_2(n2 - n ^ 0x151BEA20 ^ tzs_3);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

