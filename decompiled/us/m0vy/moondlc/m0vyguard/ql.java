/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ql {
    private static final int khbb = -1281015889;
    private static final int dth = 1583361139;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int o26k41029sa;

    private ql() {
    }

    private static int khmz(int n) {
        int n2 = n ^ khbb;
        int n3 = (n2 ^ n2 >>> 7) * -1202166039;
        int n4 = (n3 ^ n3 >>> 9) * 1436551669;
        return (n4 ^ n4 >>> 19) + dth;
    }

    public static int tsw_2(int n) {
        return ql.khmz(Integer.rotateRight((n ^ khbb) * -974992911 - System.identityHashCode(ql.class), 25));
    }

    public static int dhfa_2(int n, int n2) {
        return ql.khmz(Integer.rotateRight(n * -192939277 ^ n2, 19) ^ dth);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

