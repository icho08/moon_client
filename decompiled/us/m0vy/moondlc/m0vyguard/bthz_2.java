/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bthz_2 {
    private static final int td_4 = -530175097;
    private static final int hsh_5 = 433751287;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eiomwvv6o;

    private bthz_2() {
    }

    private static int bthh_2(int n) {
        int n2 = n ^ td_4;
        int n3 = (n2 ^ n2 >>> 7) * 1394856819;
        int n4 = (n3 ^ n3 >>> 19) * 220061095;
        return (n4 ^ n4 >>> 22) + hsh_5;
    }

    public static int khhf(int n) {
        return bthz_2.bthh_2(Integer.rotateRight(n * -639765625 - System.identityHashCode(bthz_2.class), 21) ^ td_4);
    }

    public static int ddhh(int n, int n2) {
        return bthz_2.bthh_2(Integer.rotateLeft(n ^ n2, 9) * 622430381 + hsh_5 ^ td_4);
    }

    public static boolean bthw(int n, int n2) {
        return ((bthz_2.ddhh(n, n2) + Thread.currentThread().hashCode()) * -466650275 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

