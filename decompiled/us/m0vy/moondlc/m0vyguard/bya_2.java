/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bya_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int y9bilc1r5fc;

    private bya_2() {
    }

    public static int tmh_4(int n) {
        int n2 = Integer.rotateRight(n * 264928219 - System.identityHashCode(bya_2.class), 13);
        int n3 = (n2 ^ n2 >>> 13) * 1455384023;
        int n4 = (n3 ^ n3 >>> 16) * -271744505;
        return n4 ^ n4 >>> 22;
    }

    public static int ghkhn(int n, int n2) {
        int n3 = Integer.rotateRight(n * -802130259 ^ n2, 16);
        int n4 = (n3 ^ n3 >>> 11) * -1888166263;
        int n5 = (n4 ^ n4 >>> 14) * -325499759;
        return n5 ^ n5 >>> 22;
    }

    public static boolean dhdha_2(int n, int n2) {
        return ((bya_2.ghkhn(n, n2) + Thread.currentThread().hashCode()) * 1721839635 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

