/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bst_3 {
    private static final int hrh_2 = 1373216398;
    private static final int hna_2 = 1504808598;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o6mghmwrn;

    private bst_3() {
    }

    public static int hdhd_2(int n) {
        int n2 = Integer.rotateRight(n * -1770599183 - System.identityHashCode(bst_3.class), 8) ^ hrh_2;
        int n3 = (n2 ^ n2 >>> 18) * -2015881929;
        int n4 = (n3 ^ n3 >>> 11) * -836399823;
        return n4 ^ n4 >>> 17 ^ hna_2;
    }

    public static int add_5(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xC)) + hna_2 ^ hrh_2;
        int n4 = (n3 ^ n3 >>> 12) * -867574085;
        int n5 = (n4 ^ n4 >>> 18) * 1773118291;
        return n5 ^ n5 >>> 18 ^ hna_2;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

