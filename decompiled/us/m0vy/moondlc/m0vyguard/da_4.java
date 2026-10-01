/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class da_4 {
    private static final int sta_4 = -34547279;
    private static final int khsa = -1746704916;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ib7ve0s6;

    private da_4() {
    }

    public static int bzj(int n) {
        int n2 = Integer.rotateLeft(n ^ sta_4 ^ (int)System.nanoTime(), 19) * 1019704063;
        int n3 = (n2 ^ n2 >>> 18) * -1248805271;
        int n4 = (n3 ^ n3 >>> 12) * -391026885;
        return n4 ^ n4 >>> 14;
    }

    public static int bas_4(int n, int n2) {
        int n3 = n2 - n ^ 0x505D895B ^ khsa;
        int n4 = (n3 ^ n3 >>> 12) * -1291788885;
        int n5 = (n4 ^ n4 >>> 10) * -1918290265;
        return n5 ^ n5 >>> 18;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

