/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmh {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xefky99g;

    private bmh() {
    }

    public static int sma(int n) {
        int n2 = Integer.rotateRight(n * 416642499 - System.identityHashCode(bmh.class), 5);
        int n3 = (n2 ^ n2 >>> 18) * 2006022469;
        int n4 = (n3 ^ n3 >>> 9) * 1284305313;
        return n4 ^ n4 >>> 19;
    }

    public static int ny(int n, int n2) {
        int n3 = n2 - n ^ 0x77965C23;
        int n4 = (n3 ^ n3 >>> 9) * -1360887183;
        int n5 = (n4 ^ n4 >>> 18) * 1341935169;
        return n5 ^ n5 >>> 18;
    }

    public static boolean brq(int n, int n2) {
        return ((bmh.ny(n, n2) + Thread.currentThread().hashCode()) * -1328728897 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

