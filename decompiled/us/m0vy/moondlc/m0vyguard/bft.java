/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bft {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yqed9cdqastbhn;

    private bft() {
    }

    public static int saf_3(int n) {
        int n2 = n ^ System.identityHashCode(bft.class) ^ (int)Thread.currentThread().getId() * 251075073;
        int n3 = (n2 ^ n2 >>> 13) * -74912479;
        int n4 = (n3 ^ n3 >>> 9) * -35468227;
        return n4 ^ n4 >>> 22;
    }

    public static int sdm(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 19) * 1235319641;
        int n4 = (n3 ^ n3 >>> 12) * -448070553;
        int n5 = (n4 ^ n4 >>> 15) * -1299316811;
        return n5 ^ n5 >>> 22;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

