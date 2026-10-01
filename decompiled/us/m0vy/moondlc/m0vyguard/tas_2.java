/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tas_2 {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sdjbl6g3phmrqr;

    private tas_2() {
    }

    private static int thjk(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * 1535322425;
        int n4 = (n3 ^ n3 >>> 15) * -1666940405;
        return n4 ^ n4 >>> 14;
    }

    public static int sdha_3(int n) {
        return tas_2.thjk(Integer.rotateLeft(n ^ (int)System.nanoTime(), 18) * -237349075);
    }

    public static int khyf(int n, int n2) {
        return tas_2.thjk(Integer.rotateRight(n * -1928184475 ^ n2, 6));
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

