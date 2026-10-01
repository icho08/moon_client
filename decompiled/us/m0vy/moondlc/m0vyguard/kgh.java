/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kgh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rosew4mwy;

    private kgh() {
    }

    private static int rhf_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * -55162943;
        int n4 = (n3 ^ n3 >>> 20) * -600400779;
        return n4 ^ n4 >>> 20;
    }

    public static int wj(int n) {
        return kgh.rhf_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 9) * -647936837);
    }

    public static int twz_3(int n, int n2) {
        return kgh.rhf_2(Integer.rotateRight(n * -1727747817 ^ n2, 7));
    }

    public static boolean thskh_2(int n, int n2) {
        return ((kgh.twz_3(n, n2) + Thread.currentThread().hashCode()) * 288368389 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

