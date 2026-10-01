/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsth_2 {
    private static final int thtn_2 = -1147420359;
    private static final int tbq = -256824338;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int d6n67i0716ahb8;

    private bsth_2() {
    }

    private static int hadh_2(int n) {
        int n2 = n ^ thtn_2;
        int n3 = (n2 ^ n2 >>> 14) * -704482813;
        int n4 = (n3 ^ n3 >>> 10) * 1382821753;
        return (n4 ^ n4 >>> 22) + tbq;
    }

    public static int rshf(int n) {
        return bsth_2.hadh_2(Integer.rotateRight(n * 680997093 - System.identityHashCode(bsth_2.class), 12) ^ thtn_2);
    }

    public static int tkhh_3(int n, int n2) {
        return bsth_2.hadh_2(Integer.rotateLeft(n ^ n2, 12) * 1835548329 + tbq ^ thtn_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

