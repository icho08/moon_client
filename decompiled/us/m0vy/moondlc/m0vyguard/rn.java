/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rn {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yu28o2veja;

    private rn() {
    }

    public static int jak(int n) {
        int n2 = n ^ System.identityHashCode(rn.class) ^ (int)Thread.currentThread().getId() * 652337455;
        int n3 = (n2 ^ n2 >>> 12) * -777048791;
        int n4 = (n3 ^ n3 >>> 7) * 704513323;
        return n4 ^ n4 >>> 21;
    }

    public static int shmth(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x14);
        int n4 = (n3 ^ n3 >>> 8) * -888220549;
        int n5 = (n4 ^ n4 >>> 18) * -2099132609;
        return n5 ^ n5 >>> 13;
    }

    public static boolean dhjj(int n, int n2) {
        return ((rn.shmth(n, n2) ^ (int)System.nanoTime()) * -1189543177 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

