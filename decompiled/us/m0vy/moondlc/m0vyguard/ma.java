/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ma {
    private static final int bhd_4 = 712005686;
    private static final int dhyw = 946761071;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xwsaqvdx;

    private ma() {
    }

    public static int zfm(int n) {
        int n2 = Integer.rotateRight((n ^ bhd_4) * -166717571 - System.identityHashCode(ma.class), 22);
        int n3 = (n2 ^ n2 >>> 15) * -1038770871;
        int n4 = (n3 ^ n3 >>> 8) * -2008491655;
        return n4 ^ n4 >>> 18;
    }

    public static int khhgh_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 13) * -424738941 ^ dhyw;
        int n4 = (n3 ^ n3 >>> 17) * 465308661;
        int n5 = (n4 ^ n4 >>> 16) * -523774729;
        return n5 ^ n5 >>> 13;
    }

    public static boolean thks(int n, int n2) {
        return ((ma.khhgh_2(n, n2) + Thread.currentThread().hashCode()) * 707279665 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

