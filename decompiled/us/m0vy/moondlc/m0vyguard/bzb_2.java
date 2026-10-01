/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzb_2 {
    private static final int shnd = 234795130;
    private static final int jh = -320574199;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s17dec7bkqzuo;

    private bzb_2() {
    }

    private static int dshs_2(int n) {
        int n2 = n ^ shnd;
        int n3 = (n2 ^ n2 >>> 12) * 862779511;
        int n4 = (n3 ^ n3 >>> 14) * -1695907973;
        return (n4 ^ n4 >>> 14) + jh;
    }

    public static int szgh_3(int n) {
        return bzb_2.dshs_2(Integer.rotateRight(n * 624929555 - System.identityHashCode(bzb_2.class), 6) ^ shnd);
    }

    public static int bdk(int n, int n2) {
        return bzb_2.dshs_2((n2 - n ^ 0x2C7D0E31) + jh ^ shnd);
    }

    public static boolean hwgh(int n, int n2) {
        return ((bzb_2.bdk(n, n2) + Thread.currentThread().hashCode()) * 2095284199 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

