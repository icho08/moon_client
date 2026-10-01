/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhsh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int w8fac2y77p13;

    private bhsh() {
    }

    public static int rwa_2(int n) {
        int n2 = (n ^ bhsh.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * 731435325;
        int n4 = (n3 ^ n3 >>> 8) * 174857913;
        return n4 ^ n4 >>> 20;
    }

    public static int jsj(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 10);
        int n4 = (n3 ^ n3 >>> 14) * 2039284191;
        int n5 = (n4 ^ n4 >>> 12) * 1396035739;
        return n5 ^ n5 >>> 12;
    }

    public static boolean dsh_7(int n, int n2) {
        return ((bhsh.jsj(n, n2) ^ (int)System.nanoTime()) * -1931092081 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

