/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ly {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vnq89ze76sg;

    private ly() {
    }

    private static int shwk(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -1857147051;
        int n4 = (n3 ^ n3 >>> 20) * 93425797;
        return n4 ^ n4 >>> 17;
    }

    public static int jkht(int n) {
        return ly.shwk(n ^ System.identityHashCode(ly.class) ^ (int)Thread.currentThread().getId() * 215304085);
    }

    public static int khsd_3(int n, int n2) {
        return ly.shwk(n2 ^ Integer.rotateLeft(n, n2 & 0xF));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

