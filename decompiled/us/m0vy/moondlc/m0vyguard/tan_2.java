/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tan_2 {
    private static final int dly = -829368657;
    private static final int twkh = 2035897706;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kv1h6dgpf;

    private tan_2() {
    }

    public static int saw_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 15) * 2099814813 ^ dly;
        int n3 = (n2 ^ n2 >>> 14) * 859861635;
        int n4 = (n3 ^ n3 >>> 8) * 1671223671;
        return n4 ^ n4 >>> 18 ^ twkh;
    }

    public static int rjz(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x14)) + twkh ^ dly;
        int n4 = (n3 ^ n3 >>> 8) * -69259177;
        int n5 = (n4 ^ n4 >>> 15) * -1578905431;
        return n5 ^ n5 >>> 21 ^ twkh;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

