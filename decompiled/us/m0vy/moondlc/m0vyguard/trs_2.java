/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trs_2 {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ghh1tqa6;

    private trs_2() {
    }

    public static int shzh(int n) {
        int n2 = n ^ System.identityHashCode(trs_2.class) ^ (int)Thread.currentThread().getId() * 679637539;
        int n3 = (n2 ^ n2 >>> 12) * 1552128863;
        int n4 = (n3 ^ n3 >>> 15) * 232236853;
        return n4 ^ n4 >>> 14;
    }

    public static int drl(int n, int n2) {
        int n3 = n2 - n ^ 0xAD5B0028;
        int n4 = (n3 ^ n3 >>> 17) * 227497577;
        int n5 = (n4 ^ n4 >>> 17) * 1675992309;
        return n5 ^ n5 >>> 18;
    }

    public static boolean rjy(int n, int n2) {
        return ((trs_2.drl(n, n2) ^ (int)System.nanoTime()) * 501647927 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

