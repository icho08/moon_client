/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khj {
    private static final int dzh_3 = 78837603;
    private static final int thwq = 2124398717;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o8qw34v95;

    private khj() {
    }

    public static int haj_2(int n) {
        int n2 = (n ^ khj.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dzh_3;
        int n3 = (n2 ^ n2 >>> 11) * 296200353;
        int n4 = (n3 ^ n3 >>> 11) * -846810797;
        return n4 ^ n4 >>> 19 ^ thwq;
    }

    public static int ghshj(int n, int n2) {
        int n3 = (n2 - n ^ 0x39A8EBC9) + thwq ^ dzh_3;
        int n4 = (n3 ^ n3 >>> 17) * 1069781853;
        int n5 = (n4 ^ n4 >>> 13) * -1643510487;
        return n5 ^ n5 >>> 17 ^ thwq;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

