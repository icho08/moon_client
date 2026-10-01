/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzkh {
    private static final int sdhd_3 = 1711079812;
    private static final int hdht_2 = -1315960797;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fcfx38p7co;

    private tzkh() {
    }

    private static int bd(int n) {
        int n2 = n ^ sdhd_3;
        int n3 = (n2 ^ n2 >>> 16) * 280209951;
        int n4 = (n3 ^ n3 >>> 19) * 536715809;
        return (n4 ^ n4 >>> 19) + hdht_2;
    }

    public static int slt_4(int n) {
        return tzkh.bd(Integer.rotateLeft(n ^ (int)System.nanoTime(), 10) * 976611911 ^ sdhd_3);
    }

    public static int tsgh_3(int n, int n2) {
        return tzkh.bd(Integer.rotateRight(n * -226362299 ^ n2, 13) + hdht_2 ^ sdhd_3);
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

