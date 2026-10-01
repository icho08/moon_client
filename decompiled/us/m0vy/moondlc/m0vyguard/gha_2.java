/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class gha_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vgssm4tsck4qk;

    private gha_2() {
    }

    private static int dzk(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 14) * -658538981;
        int n4 = (n3 ^ n3 >>> 15) * -81457445;
        return n4 ^ n4 >>> 11;
    }

    public static int rdhgh(int n) {
        return gha_2.dzk(n ^ System.identityHashCode(gha_2.class) ^ (int)Thread.currentThread().getId() * 2035049923);
    }

    public static int khkr(int n, int n2) {
        return gha_2.dzk(n2 ^ Integer.rotateLeft(n, n2 & 0xD));
    }

    public static boolean khrdh(int n, int n2) {
        return ((gha_2.khkr(n, n2) ^ (int)System.nanoTime()) * 1596217751 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

