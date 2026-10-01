/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsz {
    private static final int shdt_3 = -2047162451;
    private static final int stth = -907595956;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y9r2z6mo5o;

    private tsz() {
    }

    public static int tzt_2(int n) {
        int n2 = Integer.rotateRight(n * -1827422855 - System.identityHashCode(tsz.class), 21) ^ shdt_3;
        int n3 = (n2 ^ n2 >>> 11) * -1282752211;
        int n4 = (n3 ^ n3 >>> 8) * 415693415;
        return n4 ^ n4 >>> 16 ^ stth;
    }

    public static int aaa_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * -1291753889 + stth ^ shdt_3;
        int n4 = (n3 ^ n3 >>> 16) * 853292925;
        int n5 = (n4 ^ n4 >>> 17) * 85252547;
        return n5 ^ n5 >>> 19 ^ stth;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

