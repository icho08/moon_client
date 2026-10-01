/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rq {
    private static final int dhmy = 1950109004;
    private static final int daq_2 = 1642619401;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int un0t21gehajf;

    private rq() {
    }

    public static int ghsk(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 18) * 209623645 ^ dhmy;
        int n3 = (n2 ^ n2 >>> 18) * -347813037;
        int n4 = (n3 ^ n3 >>> 11) * 731678869;
        return n4 ^ n4 >>> 15 ^ daq_2;
    }

    public static int tts_7(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x14)) + daq_2 ^ dhmy;
        int n4 = (n3 ^ n3 >>> 12) * -1448525367;
        int n5 = (n4 ^ n4 >>> 12) * 991355347;
        return n5 ^ n5 >>> 15 ^ daq_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

