/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khd_2 {
    private static final int thty = 490026437;
    private static final int rsa_3 = 773186941;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vmet80zqgw8;

    private khd_2() {
    }

    public static int taa_7(int n) {
        int n2 = Integer.rotateLeft(n ^ thty ^ (int)System.nanoTime(), 7) * -1825422221;
        int n3 = (n2 ^ n2 >>> 13) * -434852357;
        int n4 = (n3 ^ n3 >>> 14) * 2080572251;
        return n4 ^ n4 >>> 14;
    }

    public static int khht_4(int n, int n2) {
        int n3 = n2 - n ^ 0x932AD144 ^ rsa_3;
        int n4 = (n3 ^ n3 >>> 16) * -507529737;
        int n5 = (n4 ^ n4 >>> 17) * -1292867679;
        return n5 ^ n5 >>> 22;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

