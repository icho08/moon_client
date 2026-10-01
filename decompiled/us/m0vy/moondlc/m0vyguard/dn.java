/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dn {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int axxjtsh38a6fos;

    private dn() {
    }

    private static int dyt_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -1736499061;
        int n4 = (n3 ^ n3 >>> 12) * -1079201071;
        return n4 ^ n4 >>> 22;
    }

    public static int tdgh_3(int n) {
        return dn.dyt_3(n ^ System.identityHashCode(dn.class) ^ (int)Thread.currentThread().getId() * -120608581);
    }

    public static int sat(int n, int n2) {
        return dn.dyt_3(n2 ^ Integer.rotateLeft(n, n2 & 0x11));
    }

    public static boolean shdh_7(int n, int n2) {
        return ((dn.sat(n, n2) ^ (int)System.nanoTime()) * -1629495233 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

