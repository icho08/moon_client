/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfd_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int er8zb3zo2sh1;

    private bfd_2() {
    }

    public static int sns_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 20) * 1660502463;
        int n3 = (n2 ^ n2 >>> 18) * -746032259;
        int n4 = (n3 ^ n3 >>> 12) * -1227036695;
        return n4 ^ n4 >>> 18;
    }

    public static int thk_5(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 13) * -197712081;
        int n4 = (n3 ^ n3 >>> 17) * -1030148419;
        int n5 = (n4 ^ n4 >>> 11) * -484745171;
        return n5 ^ n5 >>> 18;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

