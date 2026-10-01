/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzn {
    private static final int thst_2 = 1727644237;
    private static final int ssth = 1457317495;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int w8d71zi20t6q;

    private bzn() {
    }

    private static int dst_4(int n) {
        int n2 = n ^ thst_2;
        int n3 = (n2 ^ n2 >>> 15) * -942701715;
        int n4 = (n3 ^ n3 >>> 14) * -752954651;
        return (n4 ^ n4 >>> 17) + ssth;
    }

    public static int tdth_4(int n) {
        return bzn.dst_4(n ^ thst_2 ^ System.identityHashCode(bzn.class) ^ (int)Thread.currentThread().getId() * -997021663);
    }

    public static int aft_2(int n, int n2) {
        return bzn.dst_4(n2 - n ^ 0xAFB8A833 ^ ssth);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

