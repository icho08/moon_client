/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmkh {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ajtmi60mw3eg7b;

    private bmkh() {
    }

    public static int sds_7(int n) {
        int n2 = Integer.rotateRight(n * 2056986101 - System.identityHashCode(bmkh.class), 12);
        int n3 = (n2 ^ n2 >>> 11) * -1841163325;
        int n4 = (n3 ^ n3 >>> 13) * -1678841543;
        return n4 ^ n4 >>> 14;
    }

    public static int hfdh(int n, int n2) {
        int n3 = n2 - n ^ 0xB0C8409B;
        int n4 = (n3 ^ n3 >>> 13) * -450793923;
        int n5 = (n4 ^ n4 >>> 15) * -1360253345;
        return n5 ^ n5 >>> 16;
    }

    public static boolean aqq(int n, int n2) {
        return ((bmkh.hfdh(n, n2) + Thread.currentThread().hashCode()) * 1603153447 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

