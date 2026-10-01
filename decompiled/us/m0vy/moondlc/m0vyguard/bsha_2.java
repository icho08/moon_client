/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsha_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xojm9zs8u3;

    private bsha_2() {
    }

    public static int shws_2(int n) {
        int n2 = Integer.rotateRight(n * 658621821 - System.identityHashCode(bsha_2.class), 25);
        int n3 = (n2 ^ n2 >>> 13) * -613407153;
        int n4 = (n3 ^ n3 >>> 10) * 346727065;
        return n4 ^ n4 >>> 22;
    }

    public static int sdha_4(int n, int n2) {
        int n3 = n2 - n ^ 0xFAB7E545;
        int n4 = (n3 ^ n3 >>> 16) * -1104750311;
        int n5 = (n4 ^ n4 >>> 16) * 1962859601;
        return n5 ^ n5 >>> 17;
    }

    public static boolean hs(int n, int n2) {
        return ((bsha_2.sdha_4(n, n2) + Thread.currentThread().hashCode()) * 1018215213 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

