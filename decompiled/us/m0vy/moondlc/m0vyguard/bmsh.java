/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmsh {
    private static final int zln = 947368676;
    private static final int jkhs = 670740993;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cyk9e7fpvhopw;

    private bmsh() {
    }

    public static int shdhd(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 7) * 1220137715 ^ zln;
        int n3 = (n2 ^ n2 >>> 11) * 1687625395;
        int n4 = (n3 ^ n3 >>> 7) * 133509727;
        return n4 ^ n4 >>> 13 ^ jkhs;
    }

    public static int shr_5(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x15)) + jkhs ^ zln;
        int n4 = (n3 ^ n3 >>> 15) * 324917097;
        int n5 = (n4 ^ n4 >>> 16) * -842314669;
        return n5 ^ n5 >>> 15 ^ jkhs;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

