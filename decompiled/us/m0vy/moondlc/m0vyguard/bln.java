/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bln {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int a0gvca8z;

    private bln() {
    }

    public static int zsa_5(int n) {
        int n2 = Integer.rotateRight(n * 313331071 - System.identityHashCode(bln.class), 7);
        int n3 = (n2 ^ n2 >>> 17) * 2032159301;
        int n4 = (n3 ^ n3 >>> 13) * 1464827975;
        return n4 ^ n4 >>> 20;
    }

    public static int hkz(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 5);
        int n4 = (n3 ^ n3 >>> 14) * -1187859359;
        int n5 = (n4 ^ n4 >>> 11) * -1122922811;
        return n5 ^ n5 >>> 12;
    }

    public static boolean kha_2(int n, int n2) {
        return ((bln.hkz(n, n2) + Thread.currentThread().hashCode()) * 484814659 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

