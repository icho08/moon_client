/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dz {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int w6ydysjih;

    private dz() {
    }

    public static int dhtgh_2(int n) {
        int n2 = n ^ System.identityHashCode(dz.class) ^ (int)Thread.currentThread().getId() * 1727520495;
        int n3 = (n2 ^ n2 >>> 13) * 417506693;
        int n4 = (n3 ^ n3 >>> 8) * -861803463;
        return n4 ^ n4 >>> 19;
    }

    public static int akr(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 7);
        int n4 = (n3 ^ n3 >>> 12) * -936393561;
        int n5 = (n4 ^ n4 >>> 14) * 298696609;
        return n5 ^ n5 >>> 16;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

