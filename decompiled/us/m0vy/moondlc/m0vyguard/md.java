/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class md {
    private static final int taa = 568985772;
    private static final int sjs_3 = -1549217232;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nbfha1pemyr2;

    private md() {
    }

    private static int nl(int n) {
        int n2 = n ^ taa;
        int n3 = (n2 ^ n2 >>> 11) * -1946367199;
        int n4 = (n3 ^ n3 >>> 12) * 741999321;
        return (n4 ^ n4 >>> 14) + sjs_3;
    }

    public static int hgha(int n) {
        return md.nl((n ^ md.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ taa);
    }

    public static int ghjz_2(int n, int n2) {
        return md.nl((n + n2 ^ Integer.rotateLeft(n, 15)) + sjs_3 ^ taa);
    }

    public static boolean ghdhs_2(int n, int n2) {
        return ((md.ghjz_2(n, n2) ^ (int)System.nanoTime()) * -474497363 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

