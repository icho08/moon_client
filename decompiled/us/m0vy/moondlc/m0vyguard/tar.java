/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tar {
    private static final int hyh_2 = 1691317349;
    private static final int hdb = 308959736;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ge53r3gg1h3;

    private tar() {
    }

    public static int jghr(int n) {
        int n2 = Integer.rotateRight((n ^ hyh_2) * 499220303 - System.identityHashCode(tar.class), 5);
        int n3 = (n2 ^ n2 >>> 16) * -691013703;
        int n4 = (n3 ^ n3 >>> 7) * 1546828737;
        return n4 ^ n4 >>> 18;
    }

    public static int thlm(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * 951550263 ^ hdb;
        int n4 = (n3 ^ n3 >>> 12) * 19178689;
        int n5 = (n4 ^ n4 >>> 18) * 880490233;
        return n5 ^ n5 >>> 15;
    }

    public static boolean bzd_4(int n, int n2) {
        return ((tar.thlm(n, n2) + Thread.currentThread().hashCode()) * 1890845225 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

