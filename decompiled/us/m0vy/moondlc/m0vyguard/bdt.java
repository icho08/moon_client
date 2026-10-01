/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdt {
    private static final int hsz_4 = -314152210;
    private static final int hls = -1079614017;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int sm4tdjxr3wbww9;

    private bdt() {
    }

    public static int saf_4(int n) {
        int n2 = n ^ hsz_4 ^ System.identityHashCode(bdt.class) ^ (int)Thread.currentThread().getId() * -917044035;
        int n3 = (n2 ^ n2 >>> 18) * -1047949483;
        int n4 = (n3 ^ n3 >>> 11) * 1609317995;
        return n4 ^ n4 >>> 21;
    }

    public static int thsh_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1277100273 ^ n2, 12) ^ hls;
        int n4 = (n3 ^ n3 >>> 16) * 496639197;
        int n5 = (n4 ^ n4 >>> 9) * -848518267;
        return n5 ^ n5 >>> 16;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

