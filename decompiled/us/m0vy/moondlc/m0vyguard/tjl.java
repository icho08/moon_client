/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjl {
    private static final int dzsh = 1008900889;
    private static final int khzth = -741505789;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int iz0wto7fxjm11o;

    private tjl() {
    }

    public static int rghs_2(int n) {
        int n2 = (n ^ tjl.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dzsh;
        int n3 = (n2 ^ n2 >>> 15) * -665001089;
        int n4 = (n3 ^ n3 >>> 16) * -1510948699;
        return n4 ^ n4 >>> 17 ^ khzth;
    }

    public static int zwb_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 12)) + khzth ^ dzsh;
        int n4 = (n3 ^ n3 >>> 8) * -129703815;
        int n5 = (n4 ^ n4 >>> 11) * 2010707645;
        return n5 ^ n5 >>> 21 ^ khzth;
    }

    public static boolean jsf_2(int n, int n2) {
        return ((tjl.zwb_2(n, n2) ^ (int)System.nanoTime()) * 209252583 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

