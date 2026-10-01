/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jgh {
    private static final int dqt = -626418963;
    private static final int dhthz_2 = -1577391009;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int kk3x2yq4z702k;

    private jgh() {
    }

    private static int sdhz_4(int n) {
        int n2 = n ^ dqt;
        int n3 = (n2 ^ n2 >>> 12) * -821733329;
        int n4 = (n3 ^ n3 >>> 15) * -839713963;
        return (n4 ^ n4 >>> 13) + dhthz_2;
    }

    public static int tyj(int n) {
        return jgh.sdhz_4(Integer.rotateRight(n * -232818735 - System.identityHashCode(jgh.class), 9) ^ dqt);
    }

    public static int zaf_3(int n, int n2) {
        return jgh.sdhz_4((n2 - n ^ 0xBE210DF5) + dhthz_2 ^ dqt);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

