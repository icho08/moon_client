/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsht {
    private static final int shdd_2 = 2141628234;
    private static final int khqt_2 = -1724324952;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tgrn5g124navv;

    private tsht() {
    }

    private static int dhrgh(int n) {
        int n2 = n ^ shdd_2;
        int n3 = (n2 ^ n2 >>> 14) * -2124621953;
        int n4 = (n3 ^ n3 >>> 16) * -301659173;
        return (n4 ^ n4 >>> 18) + khqt_2;
    }

    public static int hts(int n) {
        return tsht.dhrgh(n ^ System.identityHashCode(tsht.class) ^ (int)Thread.currentThread().getId() * 2104394781 ^ shdd_2);
    }

    public static int rtf(int n, int n2) {
        return tsht.dhrgh(Integer.rotateRight(n * 717902701 ^ n2, 18) + khqt_2 ^ shdd_2);
    }

    public static boolean dthdh_2(int n, int n2) {
        return ((tsht.rtf(n, n2) ^ (int)System.nanoTime()) * 448555019 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

