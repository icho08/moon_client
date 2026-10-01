/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ht_3 {
    private static final int syd = -1241874553;
    private static final int khbz = 745431344;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int yo2vlypxbl4;

    private ht_3() {
    }

    private static int thzl(int n) {
        int n2 = n ^ syd;
        int n3 = (n2 ^ n2 >>> 7) * 2042068367;
        int n4 = (n3 ^ n3 >>> 14) * 980380861;
        return (n4 ^ n4 >>> 13) + khbz;
    }

    public static int ghaj(int n) {
        return ht_3.thzl(Integer.rotateRight(n * 540210509 - System.identityHashCode(ht_3.class), 7) ^ syd);
    }

    public static int hq_2(int n, int n2) {
        return ht_3.thzl((n2 - n ^ 0x49F7D76C) + khbz ^ syd);
    }

    public static boolean thghgh(int n, int n2) {
        return ((ht_3.hq_2(n, n2) + Thread.currentThread().hashCode()) * 660552419 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

