/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btth_2 {
    private static final int khrl = -1237927864;
    private static final int tshj = 1019778231;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int t33714gm70;

    private btth_2() {
    }

    public static int rzs_3(int n) {
        int n2 = (n ^ btth_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ khrl;
        int n3 = (n2 ^ n2 >>> 16) * -99985547;
        int n4 = (n3 ^ n3 >>> 15) * -1544436205;
        return n4 ^ n4 >>> 18 ^ tshj;
    }

    public static int tsth_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -2302437 ^ n2, 15) + tshj ^ khrl;
        int n4 = (n3 ^ n3 >>> 11) * 1538977397;
        int n5 = (n4 ^ n4 >>> 18) * -248717705;
        return n5 ^ n5 >>> 13 ^ tshj;
    }

    public static boolean dwz_3(int n, int n2) {
        return ((btth_2.tsth_3(n, n2) ^ (int)System.nanoTime()) * -1692526273 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

