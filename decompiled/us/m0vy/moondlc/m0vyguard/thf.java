/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thf {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int reptm850j2q1;

    private thf() {
    }

    public static int ssm_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * 1324081037;
        int n3 = (n2 ^ n2 >>> 17) * -94660623;
        int n4 = (n3 ^ n3 >>> 8) * 1782782359;
        return n4 ^ n4 >>> 19;
    }

    public static int sdd_8(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 7);
        int n4 = (n3 ^ n3 >>> 15) * -644785339;
        int n5 = (n4 ^ n4 >>> 18) * -379523511;
        return n5 ^ n5 >>> 12;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

