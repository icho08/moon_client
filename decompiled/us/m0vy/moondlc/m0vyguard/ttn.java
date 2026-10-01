/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ttn {
    private static final int shshd_2 = -1737644737;
    private static final int ttd_2 = 428992861;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wnpjv1vlszgtg;

    private ttn() {
    }

    private static int thqy(int n) {
        int n2 = n ^ shshd_2;
        int n3 = (n2 ^ n2 >>> 11) * 465823689;
        int n4 = (n3 ^ n3 >>> 19) * -577833155;
        return (n4 ^ n4 >>> 14) + ttd_2;
    }

    public static int syb_2(int n) {
        return ttn.thqy((n ^ shshd_2 ^ ttn.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int hkhn(int n, int n2) {
        return ttn.thqy(Integer.rotateRight(n * 2108642697 ^ n2, 11) ^ ttd_2);
    }

    public static boolean dtz_3(int n, int n2) {
        return ((ttn.hkhn(n, n2) ^ (int)System.nanoTime()) * -683979801 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

