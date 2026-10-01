/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bbj {
    private static final int zwy = 1088731367;
    private static final int thns = -217150426;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int v5nsts4cfk;

    private bbj() {
    }

    public static int tt_4(int n) {
        int n2 = n ^ System.identityHashCode(bbj.class) ^ (int)Thread.currentThread().getId() * -764930677 ^ zwy;
        int n3 = (n2 ^ n2 >>> 16) * -350859717;
        int n4 = (n3 ^ n3 >>> 8) * -1540959943;
        return n4 ^ n4 >>> 21 ^ thns;
    }

    public static int rzh_3(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xE)) + thns ^ zwy;
        int n4 = (n3 ^ n3 >>> 13) * 298804571;
        int n5 = (n4 ^ n4 >>> 16) * -523214485;
        return n5 ^ n5 >>> 20 ^ thns;
    }

    public static boolean thmth(int n, int n2) {
        return ((bbj.rzh_3(n, n2) ^ (int)System.nanoTime()) * -158195165 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

