/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjb {
    private static final int bdr_2 = -2076914319;
    private static final int ks = 1795777738;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bpsb78566q4ad;

    private bjb() {
    }

    public static int ttb_3(int n) {
        int n2 = Integer.rotateRight((n ^ bdr_2) * 16175439 - System.identityHashCode(bjb.class), 24);
        int n3 = (n2 ^ n2 >>> 13) * -245649539;
        int n4 = (n3 ^ n3 >>> 10) * 160094057;
        return n4 ^ n4 >>> 14;
    }

    public static int srsh(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xD) ^ ks;
        int n4 = (n3 ^ n3 >>> 16) * -1636196101;
        int n5 = (n4 ^ n4 >>> 18) * 1693078463;
        return n5 ^ n5 >>> 22;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

