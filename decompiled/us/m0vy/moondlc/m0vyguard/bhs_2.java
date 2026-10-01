/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhs_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cw0ll5a6zva7qq;

    private bhs_2() {
    }

    private static int bghm(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * 204227193;
        int n4 = (n3 ^ n3 >>> 15) * 165969223;
        return n4 ^ n4 >>> 14;
    }

    public static int rqth(int n) {
        return bhs_2.bghm(n ^ System.identityHashCode(bhs_2.class) ^ (int)Thread.currentThread().getId() * 562962467);
    }

    public static int tjd(int n, int n2) {
        return bhs_2.bghm(Integer.rotateRight(n * -1746355247 ^ n2, 19));
    }

    public static boolean bsh(int n, int n2) {
        return ((bhs_2.tjd(n, n2) ^ (int)System.nanoTime()) * 714803637 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

