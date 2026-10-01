/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class yq {
    private static final int dsth_2 = -249615632;
    private static final int shngh = -698936924;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int mh7fbqgk3f3lq;

    private yq() {
    }

    private static int bys(int n) {
        int n2 = n ^ dsth_2;
        int n3 = (n2 ^ n2 >>> 13) * 1699236995;
        int n4 = (n3 ^ n3 >>> 10) * 1635505705;
        return (n4 ^ n4 >>> 17) + shngh;
    }

    public static int khqa(int n) {
        return yq.bys(Integer.rotateLeft(n ^ (int)System.nanoTime(), 13) * 2135096579 ^ dsth_2);
    }

    public static int zln(int n, int n2) {
        return yq.bys(Integer.rotateRight(n * -2143854233 ^ n2, 14) + shngh ^ dsth_2);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

