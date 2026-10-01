/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btdh {
    private static final int dzth_2 = 433829871;
    private static final int ztt_4 = -1096999035;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wkc4s5p4r03ry;

    private btdh() {
    }

    public static int anb(int n) {
        int n2 = Integer.rotateLeft(n ^ dzth_2 ^ (int)System.nanoTime(), 13) * -1714989067;
        int n3 = (n2 ^ n2 >>> 11) * 533750787;
        int n4 = (n3 ^ n3 >>> 8) * 1072178659;
        return n4 ^ n4 >>> 20;
    }

    public static int khsk_2(int n, int n2) {
        int n3 = n2 - n ^ 0x808A56A3 ^ ztt_4;
        int n4 = (n3 ^ n3 >>> 16) * -1031299541;
        int n5 = (n4 ^ n4 >>> 17) * 926415271;
        return n5 ^ n5 >>> 18;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

