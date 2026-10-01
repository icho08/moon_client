/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdt_3 {
    private static final int tba_2 = 67309730;
    private static final int rthk = -1729723172;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int tk3zil5kn023kd;

    private bdt_3() {
    }

    public static int hdj(int n) {
        int n2 = Integer.rotateRight(n * -1875596945 - System.identityHashCode(bdt_3.class), 14) ^ tba_2;
        int n3 = (n2 ^ n2 >>> 16) * 1939857197;
        int n4 = (n3 ^ n3 >>> 10) * 989990625;
        return n4 ^ n4 >>> 22 ^ rthk;
    }

    public static int khwb(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 4)) + rthk ^ tba_2;
        int n4 = (n3 ^ n3 >>> 17) * -430027219;
        int n5 = (n4 ^ n4 >>> 12) * -338352549;
        return n5 ^ n5 >>> 21 ^ rthk;
    }

    public static boolean sdy_3(int n, int n2) {
        return ((bdt_3.khwb(n, n2) + Thread.currentThread().hashCode()) * -2052489069 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

