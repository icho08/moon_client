/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzz_4 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ltu2h4ehqbw9;

    private bzz_4() {
    }

    private static int dan_4(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * -223649705;
        int n4 = (n3 ^ n3 >>> 13) * 1052551523;
        return n4 ^ n4 >>> 21;
    }

    public static int tmdh_2(int n) {
        return bzz_4.dan_4(Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 600547269);
    }

    public static int shlb(int n, int n2) {
        return bzz_4.dan_4(Integer.rotateRight(n * -376884217 ^ n2, 8));
    }

    public static boolean bds(int n, int n2) {
        return ((bzz_4.shlb(n, n2) + Thread.currentThread().hashCode()) * -126788331 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

