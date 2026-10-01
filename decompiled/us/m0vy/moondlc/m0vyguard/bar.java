/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bar {
    private static final int szdh = 1975173828;
    private static final int rjk = -780282395;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xqr295uc3prr;

    private bar() {
    }

    public static int dhr_4(int n) {
        int n2 = Integer.rotateRight(n * 980842549 - System.identityHashCode(bar.class), 23) ^ szdh;
        int n3 = (n2 ^ n2 >>> 14) * 169181211;
        int n4 = (n3 ^ n3 >>> 12) * 1389491699;
        return n4 ^ n4 >>> 18 ^ rjk;
    }

    public static int hhd_2(int n, int n2) {
        int n3 = (n2 - n ^ 0x99B1265D) + rjk ^ szdh;
        int n4 = (n3 ^ n3 >>> 8) * 1946659805;
        int n5 = (n4 ^ n4 >>> 13) * -846586057;
        return n5 ^ n5 >>> 17 ^ rjk;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

