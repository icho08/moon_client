/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkb {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m13ymd36h;

    private bkb() {
    }

    private static int dfm(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -1650485389;
        int n4 = (n3 ^ n3 >>> 12) * -1665161165;
        return n4 ^ n4 >>> 14;
    }

    public static int tshsh(int n) {
        return bkb.dfm((n ^ bkb.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zths(int n, int n2) {
        return bkb.dfm(n2 - n ^ 0xCE73EAFE);
    }

    public static boolean sshgh_2(int n, int n2) {
        return ((bkb.zths(n, n2) ^ (int)System.nanoTime()) * 601373559 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

