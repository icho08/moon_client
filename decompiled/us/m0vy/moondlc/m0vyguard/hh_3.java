/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hh_3 {
    private static final int dfj = 319603150;
    private static final int dbt_2 = -1476574322;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rt3kx77e7wtu9;

    private hh_3() {
    }

    private static int s_2(int n) {
        int n2 = n ^ dfj;
        int n3 = (n2 ^ n2 >>> 7) * 1899636565;
        int n4 = (n3 ^ n3 >>> 13) * 796558479;
        return (n4 ^ n4 >>> 15) + dbt_2;
    }

    public static int dzsh_4(int n) {
        return hh_3.s_2(Integer.rotateRight(n * 1032683223 - System.identityHashCode(hh_3.class), 20) ^ dfj);
    }

    public static int dkhd_4(int n, int n2) {
        return hh_3.s_2(Integer.rotateLeft(n ^ n2, 12) * 1701922235 + dbt_2 ^ dfj);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

