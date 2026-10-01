/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shm_3 {
    private static final int hhm_2 = -157366313;
    private static final int shhs_4 = -17716499;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wu76v3gd;

    private shm_3() {
    }

    public static int sad_4(int n) {
        int n2 = Integer.rotateRight(n * 10063025 - System.identityHashCode(shm_3.class), 16) ^ hhm_2;
        int n3 = (n2 ^ n2 >>> 15) * 1527119635;
        int n4 = (n3 ^ n3 >>> 10) * -1840838191;
        return n4 ^ n4 >>> 15 ^ shhs_4;
    }

    public static int dhrn(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * 1276797563 + shhs_4 ^ hhm_2;
        int n4 = (n3 ^ n3 >>> 14) * -163708629;
        int n5 = (n4 ^ n4 >>> 15) * 498701647;
        return n5 ^ n5 >>> 22 ^ shhs_4;
    }

    public static boolean jqa(int n, int n2) {
        return ((shm_3.dhrn(n, n2) + Thread.currentThread().hashCode()) * 1114754551 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

