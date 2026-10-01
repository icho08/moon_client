/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsz_2 {
    private static final int dnd = 560166317;
    private static final int jaa_4 = -1893592991;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m0mj9yc9y1q;

    private tsz_2() {
    }

    public static int ztl_4(int n) {
        int n2 = Integer.rotateRight((n ^ dnd) * 1113382827 - System.identityHashCode(tsz_2.class), 26);
        int n3 = (n2 ^ n2 >>> 15) * 747900515;
        int n4 = (n3 ^ n3 >>> 8) * 347408841;
        return n4 ^ n4 >>> 17;
    }

    public static int thshz(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x13) ^ jaa_4;
        int n4 = (n3 ^ n3 >>> 14) * -1241630609;
        int n5 = (n4 ^ n4 >>> 13) * -1628505099;
        return n5 ^ n5 >>> 23;
    }

    public static boolean hsj_2(int n, int n2) {
        return ((tsz_2.thshz(n, n2) + Thread.currentThread().hashCode()) * -731717521 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

