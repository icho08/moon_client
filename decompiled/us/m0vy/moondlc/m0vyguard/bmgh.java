/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmgh {
    private static final int hthl = -1480202543;
    private static final int dhghz_2 = 2011395131;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cvze67rcbn8;

    private bmgh() {
    }

    public static int skj(int n) {
        int n2 = Integer.rotateRight(n * 2036470109 - System.identityHashCode(bmgh.class), 20) ^ hthl;
        int n3 = (n2 ^ n2 >>> 18) * 395052095;
        int n4 = (n3 ^ n3 >>> 14) * 1513304187;
        return n4 ^ n4 >>> 21 ^ dhghz_2;
    }

    public static int sla_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 13)) + dhghz_2 ^ hthl;
        int n4 = (n3 ^ n3 >>> 14) * 2130485033;
        int n5 = (n4 ^ n4 >>> 13) * 254314115;
        return n5 ^ n5 >>> 21 ^ dhghz_2;
    }

    public static boolean askh(int n, int n2) {
        return ((bmgh.sla_2(n, n2) + Thread.currentThread().hashCode()) * -1101382091 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

