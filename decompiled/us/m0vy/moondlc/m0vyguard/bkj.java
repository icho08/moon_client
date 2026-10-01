/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkj {
    private static final int swkh = 1017233409;
    private static final int shst_4 = 1641044865;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ybskjsj13b;

    private bkj() {
    }

    private static int ghdt_2(int n) {
        int n2 = n ^ swkh;
        int n3 = (n2 ^ n2 >>> 8) * 692238437;
        int n4 = (n3 ^ n3 >>> 19) * -649465811;
        return (n4 ^ n4 >>> 11) + shst_4;
    }

    public static int khdhy(int n) {
        return bkj.ghdt_2(Integer.rotateRight((n ^ swkh) * -1498209259 - System.identityHashCode(bkj.class), 9));
    }

    public static int ghdb_2(int n, int n2) {
        return bkj.ghdt_2(Integer.rotateRight(n * 1141691015 ^ n2, 20) ^ shst_4);
    }

    public static boolean dma_2(int n, int n2) {
        return ((bkj.ghdb_2(n, n2) + Thread.currentThread().hashCode()) * 395725199 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

