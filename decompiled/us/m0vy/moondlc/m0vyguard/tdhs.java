/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdhs {
    private static final int sdhk = -1308739298;
    private static final int hfs_2 = -422341419;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v0tvpu2xfjz;

    private tdhs() {
    }

    public static int dygh(int n) {
        int n2 = (n ^ tdhs.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ sdhk;
        int n3 = (n2 ^ n2 >>> 13) * 840373209;
        int n4 = (n3 ^ n3 >>> 14) * 1063056479;
        return n4 ^ n4 >>> 20 ^ hfs_2;
    }

    public static int shsq_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 16) * -394463919 + hfs_2 ^ sdhk;
        int n4 = (n3 ^ n3 >>> 17) * 2052278957;
        int n5 = (n4 ^ n4 >>> 13) * -710502043;
        return n5 ^ n5 >>> 21 ^ hfs_2;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

