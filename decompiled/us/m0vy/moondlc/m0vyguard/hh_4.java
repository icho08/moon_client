/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hh_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cb3ds5pgxalbuf;

    private hh_4() {
    }

    public static int hh_3(int n) {
        int n2 = n ^ System.identityHashCode(hh_4.class) ^ (int)Thread.currentThread().getId() * 1633622849;
        int n3 = (n2 ^ n2 >>> 15) * -953995345;
        int n4 = (n3 ^ n3 >>> 8) * -813019823;
        return n4 ^ n4 >>> 22;
    }

    public static int zndh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xD);
        int n4 = (n3 ^ n3 >>> 13) * 1542008705;
        int n5 = (n4 ^ n4 >>> 17) * -274701593;
        return n5 ^ n5 >>> 15;
    }

    public static boolean thty(int n, int n2) {
        return ((hh_4.zndh(n, n2) ^ (int)System.nanoTime()) * -1756910699 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

