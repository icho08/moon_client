/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bad_3 {
    private static final int szm = 2039162779;
    private static final int jdhdh = -126497571;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int by0giit0ipb;

    private bad_3() {
    }

    private static int sghth(int n) {
        int n2 = n ^ szm;
        int n3 = (n2 ^ n2 >>> 11) * -935932259;
        int n4 = (n3 ^ n3 >>> 9) * -216159289;
        return (n4 ^ n4 >>> 14) + jdhdh;
    }

    public static int tsa_6(int n) {
        return bad_3.sghth(n ^ System.identityHashCode(bad_3.class) ^ (int)Thread.currentThread().getId() * -670547937 ^ szm);
    }

    public static int rysh(int n, int n2) {
        return bad_3.sghth((n2 ^ Integer.rotateLeft(n, n2 & 0x14)) + jdhdh ^ szm);
    }

    public static boolean zkhth(int n, int n2) {
        return ((bad_3.rysh(n, n2) ^ (int)System.nanoTime()) * -1361817455 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

