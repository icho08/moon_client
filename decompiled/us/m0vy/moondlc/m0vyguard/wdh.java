/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wdh {
    private static final int dhjh = -952501342;
    private static final int shsm = 749198671;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k7yry4uu;

    private wdh() {
    }

    private static int zdz_5(int n) {
        int n2 = n ^ dhjh;
        int n3 = (n2 ^ n2 >>> 10) * 384085373;
        int n4 = (n3 ^ n3 >>> 20) * -2886165;
        return (n4 ^ n4 >>> 18) + shsm;
    }

    public static int dzk_3(int n) {
        return wdh.zdz_5((n ^ wdh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhjh);
    }

    public static int zzs_3(int n, int n2) {
        return wdh.zdz_5((n2 - n ^ 0x32AB4D54) + shsm ^ dhjh);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

