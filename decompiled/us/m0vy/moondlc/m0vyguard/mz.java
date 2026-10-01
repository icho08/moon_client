/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class mz {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dlxsbl9ez3mb;

    private mz() {
    }

    private static int thlw(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 1755606675;
        int n4 = (n3 ^ n3 >>> 19) * -973397693;
        return n4 ^ n4 >>> 22;
    }

    public static int thzsh_2(int n) {
        return mz.thlw(Integer.rotateRight(n * 1100549459 - System.identityHashCode(mz.class), 7));
    }

    public static int dbq(int n, int n2) {
        return mz.thlw(Integer.rotateLeft(n ^ n2, 12) * -2107642241);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

