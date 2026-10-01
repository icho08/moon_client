/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghd {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vuzl4scu175hxd;

    private bghd() {
    }

    private static int jkhr(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * 12857539;
        int n4 = (n3 ^ n3 >>> 19) * -848162487;
        return n4 ^ n4 >>> 23;
    }

    public static int thdsh(int n) {
        return bghd.jkhr(Integer.rotateLeft(n ^ (int)System.nanoTime(), 22) * -1830362161);
    }

    public static int ashd_2(int n, int n2) {
        return bghd.jkhr(n + n2 ^ Integer.rotateLeft(n, 5));
    }

    public static boolean jmd(int n, int n2) {
        return ((bghd.ashd_2(n, n2) + Thread.currentThread().hashCode()) * 1458093777 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

