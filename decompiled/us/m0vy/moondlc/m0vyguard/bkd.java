/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkd {
    private static final int rzb_2 = -1180973615;
    private static final int rkhh = -290630460;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int feitsckf;

    private bkd() {
    }

    public static int hwf(int n) {
        int n2 = Integer.rotateRight(n * -1299211545 - System.identityHashCode(bkd.class), 5) ^ rzb_2;
        int n3 = (n2 ^ n2 >>> 13) * 1372656845;
        int n4 = (n3 ^ n3 >>> 10) * 1005200457;
        return n4 ^ n4 >>> 16 ^ rkhh;
    }

    public static int dhnd(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 14)) + rkhh ^ rzb_2;
        int n4 = (n3 ^ n3 >>> 11) * 236132493;
        int n5 = (n4 ^ n4 >>> 18) * 1613714875;
        return n5 ^ n5 >>> 15 ^ rkhh;
    }

    public static boolean hkhh_2(int n, int n2) {
        return ((bkd.dhnd(n, n2) + Thread.currentThread().hashCode()) * 1621297323 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

