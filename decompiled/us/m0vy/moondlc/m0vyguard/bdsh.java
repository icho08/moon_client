/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdsh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dmdwwfxochpo76;

    private bdsh() {
    }

    private static int thsy(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -2072462333;
        int n4 = (n3 ^ n3 >>> 15) * -2034013241;
        return n4 ^ n4 >>> 13;
    }

    public static int hta_2(int n) {
        return bdsh.thsy(n ^ System.identityHashCode(bdsh.class) ^ (int)Thread.currentThread().getId() * -416334635);
    }

    public static int hjs_2(int n, int n2) {
        return bdsh.thsy(Integer.rotateRight(n * -228167675 ^ n2, 6));
    }

    public static boolean sdw_2(int n, int n2) {
        return ((bdsh.hjs_2(n, n2) ^ (int)System.nanoTime()) * -843521337 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

