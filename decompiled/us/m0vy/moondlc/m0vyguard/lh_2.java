/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class lh_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uogct6n5lzbs;

    private lh_2() {
    }

    public static int khsz(int n) {
        int n2 = n ^ System.identityHashCode(lh_2.class) ^ (int)Thread.currentThread().getId() * 628553433;
        int n3 = (n2 ^ n2 >>> 17) * -465800579;
        int n4 = (n3 ^ n3 >>> 8) * 331640963;
        return n4 ^ n4 >>> 16;
    }

    public static int thba_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 10) * -275409725;
        int n4 = (n3 ^ n3 >>> 16) * 2649899;
        int n5 = (n4 ^ n4 >>> 15) * -1745971669;
        return n5 ^ n5 >>> 12;
    }

    public static boolean rsh(int n, int n2) {
        return ((lh_2.thba_2(n, n2) ^ (int)System.nanoTime()) * -1793977199 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

