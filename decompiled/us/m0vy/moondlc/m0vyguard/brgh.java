/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brgh {
    private static final int khtd = -81418219;
    private static final int zash_2 = 518788969;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int arqo3x4vi8w;

    private brgh() {
    }

    public static int shb(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * 1614316057 ^ khtd;
        int n3 = (n2 ^ n2 >>> 17) * 213681337;
        int n4 = (n3 ^ n3 >>> 16) * 2021456837;
        return n4 ^ n4 >>> 15 ^ zash_2;
    }

    public static int dhd_4(int n, int n2) {
        int n3 = Integer.rotateRight(n * -283668165 ^ n2, 9) + zash_2 ^ khtd;
        int n4 = (n3 ^ n3 >>> 17) * -534600019;
        int n5 = (n4 ^ n4 >>> 18) * 825305463;
        return n5 ^ n5 >>> 14 ^ zash_2;
    }

    public static boolean dhdl_2(int n, int n2) {
        return ((brgh.dhd_4(n, n2) + Thread.currentThread().hashCode()) * -249076647 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

