/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bns_2 {
    private static final int rdb_2 = -24621731;
    private static final int sthq_2 = -349775227;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int sdod7ob72rt;

    private bns_2() {
    }

    public static int tfl(int n) {
        int n2 = Integer.rotateRight(n * 1840717371 - System.identityHashCode(bns_2.class), 23) ^ rdb_2;
        int n3 = (n2 ^ n2 >>> 16) * 1253924971;
        int n4 = (n3 ^ n3 >>> 16) * -1392910921;
        return n4 ^ n4 >>> 21 ^ sthq_2;
    }

    public static int thdn_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 5)) + sthq_2 ^ rdb_2;
        int n4 = (n3 ^ n3 >>> 10) * 491021739;
        int n5 = (n4 ^ n4 >>> 11) * 2037672165;
        return n5 ^ n5 >>> 15 ^ sthq_2;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

