/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdh_5 {
    private static final int bls_2 = -447989141;
    private static final int dhghz = -2131199075;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int b6uz2yc7;

    private bdh_5() {
    }

    private static int dhws_2(int n) {
        int n2 = n ^ bls_2;
        int n3 = (n2 ^ n2 >>> 9) * -334499059;
        int n4 = (n3 ^ n3 >>> 15) * 995597053;
        return (n4 ^ n4 >>> 16) + dhghz;
    }

    public static int ssz_6(int n) {
        return bdh_5.dhws_2((n ^ bdh_5.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ bls_2);
    }

    public static int khdf_2(int n, int n2) {
        return bdh_5.dhws_2((n + n2 ^ Integer.rotateLeft(n, 7)) + dhghz ^ bls_2);
    }

    public static boolean bms(int n, int n2) {
        return ((bdh_5.khdf_2(n, n2) ^ (int)System.nanoTime()) * 570342035 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

