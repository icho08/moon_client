/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shq_2 {
    private static final int dhza_3 = 7793847;
    private static final int bzgh = -477073851;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int u5r1xxeqp;

    private shq_2() {
    }

    private static int ghtht(int n) {
        int n2 = n ^ dhza_3;
        int n3 = (n2 ^ n2 >>> 12) * -98063657;
        int n4 = (n3 ^ n3 >>> 20) * 1794079;
        return (n4 ^ n4 >>> 20) + bzgh;
    }

    public static int dhfj(int n) {
        return shq_2.ghtht(Integer.rotateRight(n * 1315092525 - System.identityHashCode(shq_2.class), 8) ^ dhza_3);
    }

    public static int dhkhd_2(int n, int n2) {
        return shq_2.ghtht((n2 - n ^ 0xBC6B018A) + bzgh ^ dhza_3);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

