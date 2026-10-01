/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btgh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int w1l40bt56;

    private btgh() {
    }

    private static int twb_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * 96910237;
        int n4 = (n3 ^ n3 >>> 16) * -1144378897;
        return n4 ^ n4 >>> 11;
    }

    public static int jyd(int n) {
        return btgh.twb_2(n ^ System.identityHashCode(btgh.class) ^ (int)Thread.currentThread().getId() * -2002697767);
    }

    public static int azsh(int n, int n2) {
        return btgh.twb_2(n2 ^ Integer.rotateLeft(n, n2 & 9));
    }

    public static boolean shfs(int n, int n2) {
        return ((btgh.azsh(n, n2) ^ (int)System.nanoTime()) * 2106591223 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

