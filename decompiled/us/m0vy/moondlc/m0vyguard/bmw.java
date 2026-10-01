/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmw {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int sihs0o0fxh4;

    private bmw() {
    }

    public static int hda_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 22) * 2084094863;
        int n3 = (n2 ^ n2 >>> 16) * 1518660613;
        int n4 = (n3 ^ n3 >>> 8) * -2083263943;
        return n4 ^ n4 >>> 13;
    }

    public static int dzt(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x14);
        int n4 = (n3 ^ n3 >>> 17) * -181018109;
        int n5 = (n4 ^ n4 >>> 11) * -186846733;
        return n5 ^ n5 >>> 15;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

