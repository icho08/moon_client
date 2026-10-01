/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class mw {
    private static final int khrth = 2051280852;
    private static final int tdm = 696788899;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int c9rxuacbbs2;

    private mw() {
    }

    private static int thghk(int n) {
        int n2 = n ^ khrth;
        int n3 = (n2 ^ n2 >>> 13) * 1354658285;
        int n4 = (n3 ^ n3 >>> 20) * 1143343753;
        return (n4 ^ n4 >>> 20) + tdm;
    }

    public static int dts_8(int n) {
        return mw.thghk(n ^ System.identityHashCode(mw.class) ^ (int)Thread.currentThread().getId() * -327618603 ^ khrth);
    }

    public static int tqz_3(int n, int n2) {
        return mw.thghk((n2 ^ Integer.rotateLeft(n, n2 & 0xD)) + tdm ^ khrth);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

