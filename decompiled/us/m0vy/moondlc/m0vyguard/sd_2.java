/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sd_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int t2ai1bc26mi8x;

    private sd_2() {
    }

    public static int djq_2(int n) {
        int n2 = Integer.rotateRight(n * 1685517507 - System.identityHashCode(sd_2.class), 12);
        int n3 = (n2 ^ n2 >>> 18) * -133864413;
        int n4 = (n3 ^ n3 >>> 11) * 1770107141;
        return n4 ^ n4 >>> 13;
    }

    public static int bwsh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x16);
        int n4 = (n3 ^ n3 >>> 10) * -1352932413;
        int n5 = (n4 ^ n4 >>> 15) * -20391041;
        return n5 ^ n5 >>> 23;
    }

    public static boolean rht_2(int n, int n2) {
        return ((sd_2.bwsh(n, n2) + Thread.currentThread().hashCode()) * 1692739405 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

