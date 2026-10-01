/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sd_3 {
    private static final int rjth = 1950667254;
    private static final int bdb_2 = -341008324;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int r0osmfotw076o6;

    private sd_3() {
    }

    public static int aqm(int n) {
        int n2 = (n ^ sd_3.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ rjth;
        int n3 = (n2 ^ n2 >>> 15) * -1781572543;
        int n4 = (n3 ^ n3 >>> 14) * -183791975;
        return n4 ^ n4 >>> 19 ^ bdb_2;
    }

    public static int azgh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 15)) + bdb_2 ^ rjth;
        int n4 = (n3 ^ n3 >>> 15) * -16337311;
        int n5 = (n4 ^ n4 >>> 9) * 1982047941;
        return n5 ^ n5 >>> 22 ^ bdb_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

