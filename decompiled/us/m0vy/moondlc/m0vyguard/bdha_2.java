/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdha_2 {
    private static final int tja = 1599238987;
    private static final int tnw = 938932588;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pssacp3zdsb5;

    private bdha_2() {
    }

    public static int szth_4(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 9) * 108747337 ^ tja;
        int n3 = (n2 ^ n2 >>> 14) * -851833655;
        int n4 = (n3 ^ n3 >>> 7) * 2055245963;
        return n4 ^ n4 >>> 15 ^ tnw;
    }

    public static int dhja_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xF)) + tnw ^ tja;
        int n4 = (n3 ^ n3 >>> 16) * -191609225;
        int n5 = (n4 ^ n4 >>> 11) * 110655175;
        return n5 ^ n5 >>> 23 ^ tnw;
    }

    public static boolean hthw(int n, int n2) {
        return ((bdha_2.dhja_2(n, n2) + Thread.currentThread().hashCode()) * 87970851 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

