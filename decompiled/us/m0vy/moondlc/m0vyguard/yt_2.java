/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class yt_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int feo2zd4xxdd;

    private yt_2() {
    }

    private static int zaj_4(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 1058161829;
        int n4 = (n3 ^ n3 >>> 15) * 1090799073;
        return n4 ^ n4 >>> 11;
    }

    public static int smth_2(int n) {
        return yt_2.zaj_4((n ^ yt_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int ghtd_3(int n, int n2) {
        return yt_2.zaj_4(n2 - n ^ 0x96B505D3);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

