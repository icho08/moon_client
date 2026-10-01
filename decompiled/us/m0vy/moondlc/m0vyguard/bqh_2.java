/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bqh_2 {
    private static final int dhsf_2 = 277220532;
    private static final int dhagh = -545985116;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m13ymd36h;

    private bqh_2() {
    }

    private static int ghths_2(int n) {
        int n2 = n ^ dhsf_2;
        int n3 = (n2 ^ n2 >>> 10) * -1630913623;
        int n4 = (n3 ^ n3 >>> 20) * 265095109;
        return (n4 ^ n4 >>> 17) + dhagh;
    }

    public static int skht_3(int n) {
        return bqh_2.ghths_2(Integer.rotateRight((n ^ dhsf_2) * -482223499 - System.identityHashCode(bqh_2.class), 19));
    }

    public static int ghrf(int n, int n2) {
        return bqh_2.ghths_2(Integer.rotateRight(n * -476656065 ^ n2, 15) ^ dhagh);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

