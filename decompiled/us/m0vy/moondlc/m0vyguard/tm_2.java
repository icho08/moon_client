/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tm_2 {
    private static final int dhthth = 1060819863;
    private static final int blf = 1336768285;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kajs8d2s4s;

    private tm_2() {
    }

    public static int dhzs_3(int n) {
        int n2 = n ^ System.identityHashCode(tm_2.class) ^ (int)Thread.currentThread().getId() * 1344562117 ^ dhthth;
        int n3 = (n2 ^ n2 >>> 13) * 1882951005;
        int n4 = (n3 ^ n3 >>> 14) * 337365713;
        return n4 ^ n4 >>> 14 ^ blf;
    }

    public static int dhfth(int n, int n2) {
        int n3 = Integer.rotateRight(n * -641846275 ^ n2, 19) + blf ^ dhthth;
        int n4 = (n3 ^ n3 >>> 13) * 655023915;
        int n5 = (n4 ^ n4 >>> 16) * -1880862381;
        return n5 ^ n5 >>> 23 ^ blf;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

