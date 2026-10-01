/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bnh {
    private static final int thkhz_2 = -388773726;
    private static final int dhzl_2 = -941057879;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int al42gce11s1r;

    private bnh() {
    }

    private static int znz_2(int n) {
        int n2 = n ^ thkhz_2;
        int n3 = (n2 ^ n2 >>> 8) * 19979345;
        int n4 = (n3 ^ n3 >>> 10) * -709818285;
        return (n4 ^ n4 >>> 14) + dhzl_2;
    }

    public static int shsb_2(int n) {
        return bnh.znz_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 9) * 1777280069 ^ thkhz_2);
    }

    public static int dhkd_2(int n, int n2) {
        return bnh.znz_2(Integer.rotateRight(n * -1157999631 ^ n2, 11) + dhzl_2 ^ thkhz_2);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

