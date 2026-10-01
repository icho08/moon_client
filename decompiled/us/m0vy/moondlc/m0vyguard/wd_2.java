/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wd_2 {
    private static final int thsw_2 = -460579855;
    private static final int sst_2 = -1626914049;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int b6xut3b4bkq;

    private wd_2() {
    }

    public static int jqz_2(int n) {
        int n2 = Integer.rotateRight((n ^ thsw_2) * -1653952485 - System.identityHashCode(wd_2.class), 6);
        int n3 = (n2 ^ n2 >>> 18) * -1865830039;
        int n4 = (n3 ^ n3 >>> 8) * 1371307015;
        return n4 ^ n4 >>> 21;
    }

    public static int zlt_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x14) ^ sst_2;
        int n4 = (n3 ^ n3 >>> 14) * 154693801;
        int n5 = (n4 ^ n4 >>> 17) * 295794199;
        return n5 ^ n5 >>> 22;
    }

    public static boolean khdth(int n, int n2) {
        return ((wd_2.zlt_2(n, n2) + Thread.currentThread().hashCode()) * -1945408051 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

