/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trkh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int z7xyks8f8p;

    private trkh() {
    }

    public static int thdt_2(int n) {
        int n2 = Integer.rotateRight(n * -1521584341 - System.identityHashCode(trkh.class), 16);
        int n3 = (n2 ^ n2 >>> 14) * -1886986303;
        int n4 = (n3 ^ n3 >>> 13) * 1172105455;
        return n4 ^ n4 >>> 15;
    }

    public static int arh_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x12);
        int n4 = (n3 ^ n3 >>> 15) * 1688113315;
        int n5 = (n4 ^ n4 >>> 10) * -2132015801;
        return n5 ^ n5 >>> 19;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

