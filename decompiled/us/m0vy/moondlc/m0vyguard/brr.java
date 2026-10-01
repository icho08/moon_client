/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brr {
    private static final int mgh = -855807661;
    private static final int tyd = 1629539284;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xnj7wp9d2pegf;

    private brr() {
    }

    private static int dtb_4(int n) {
        int n2 = n ^ mgh;
        int n3 = (n2 ^ n2 >>> 16) * 1071894647;
        int n4 = (n3 ^ n3 >>> 15) * 642420349;
        return (n4 ^ n4 >>> 23) + tyd;
    }

    public static int rshd(int n) {
        return brr.dtb_4(n ^ mgh ^ System.identityHashCode(brr.class) ^ (int)Thread.currentThread().getId() * -333870145);
    }

    public static int zdhk(int n, int n2) {
        return brr.dtb_4(n2 - n ^ 0x3F8A5B80 ^ tyd);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

