/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsn {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int di58c729zz;

    private tsn() {
    }

    public static int dshsh_2(int n) {
        int n2 = Integer.rotateRight(n * 421891839 - System.identityHashCode(tsn.class), 14);
        int n3 = (n2 ^ n2 >>> 13) * 1048491135;
        int n4 = (n3 ^ n3 >>> 8) * -1218591351;
        return n4 ^ n4 >>> 18;
    }

    public static int tjdh_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -644800791 ^ n2, 10);
        int n4 = (n3 ^ n3 >>> 8) * 1898980297;
        int n5 = (n4 ^ n4 >>> 14) * -93235325;
        return n5 ^ n5 >>> 20;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

