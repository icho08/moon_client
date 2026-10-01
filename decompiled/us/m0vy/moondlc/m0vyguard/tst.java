/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tst {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int f9xndpp86s9;

    private tst() {
    }

    private static int bmk(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * 818162823;
        int n4 = (n3 ^ n3 >>> 19) * -105157421;
        return n4 ^ n4 >>> 24;
    }

    public static int khhj_2(int n) {
        return tst.bmk((n ^ tst.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int hqj(int n, int n2) {
        return tst.bmk(n + n2 ^ Integer.rotateLeft(n, 14));
    }

    public static boolean ashh_2(int n, int n2) {
        return ((tst.hqj(n, n2) ^ (int)System.nanoTime()) * -74022441 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

