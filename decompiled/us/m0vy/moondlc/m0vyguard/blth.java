/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class blth {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int z2ua1fa20f;

    private blth() {
    }

    private static int dhjq(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -710279863;
        int n4 = (n3 ^ n3 >>> 20) * 2062423665;
        return n4 ^ n4 >>> 13;
    }

    public static int jks(int n) {
        return blth.dhjq(Integer.rotateLeft(n ^ (int)System.nanoTime(), 13) * 4784297);
    }

    public static int khat(int n, int n2) {
        return blth.dhjq(Integer.rotateRight(n * -280700523 ^ n2, 16));
    }

    public static boolean aldh(int n, int n2) {
        return ((blth.khat(n, n2) + Thread.currentThread().hashCode()) * -335044475 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

