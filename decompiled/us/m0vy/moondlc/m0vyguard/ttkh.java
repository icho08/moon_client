/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ttkh {
    private static final int rhy = -366567804;
    private static final int khas = 1422178436;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int tpfw6qgw;

    private ttkh() {
    }

    public static int bqh_2(int n) {
        int n2 = Integer.rotateRight((n ^ rhy) * 995921589 - System.identityHashCode(ttkh.class), 11);
        int n3 = (n2 ^ n2 >>> 17) * -1048264427;
        int n4 = (n3 ^ n3 >>> 13) * 936785155;
        return n4 ^ n4 >>> 19;
    }

    public static int smr_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x11) ^ khas;
        int n4 = (n3 ^ n3 >>> 8) * -1692005051;
        int n5 = (n4 ^ n4 >>> 18) * -79919355;
        return n5 ^ n5 >>> 21;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

