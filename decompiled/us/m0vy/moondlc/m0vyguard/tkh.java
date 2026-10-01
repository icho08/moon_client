/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkh {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y9zfr4uf9;

    private tkh() {
    }

    public static int zmkh(int n) {
        int n2 = Integer.rotateRight(n * 166851213 - System.identityHashCode(tkh.class), 24);
        int n3 = (n2 ^ n2 >>> 11) * -1379313203;
        int n4 = (n3 ^ n3 >>> 10) * -1250246027;
        return n4 ^ n4 >>> 14;
    }

    public static int bghs(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 9);
        int n4 = (n3 ^ n3 >>> 11) * -1038322473;
        int n5 = (n4 ^ n4 >>> 10) * -2050957985;
        return n5 ^ n5 >>> 18;
    }

    public static boolean shhs_3(int n, int n2) {
        return ((tkh.bghs(n, n2) + Thread.currentThread().hashCode()) * 586754639 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

