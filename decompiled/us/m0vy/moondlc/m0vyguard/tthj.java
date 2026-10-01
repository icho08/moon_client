/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthj {
    private static final int tshn = -1793450586;
    private static final int zssh = -1268287888;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int het8f5iggq0lv;

    private tthj() {
    }

    private static int rld(int n) {
        int n2 = n ^ tshn;
        int n3 = (n2 ^ n2 >>> 13) * -722595425;
        int n4 = (n3 ^ n3 >>> 15) * -193383721;
        return (n4 ^ n4 >>> 11) + zssh;
    }

    public static int rah(int n) {
        return tthj.rld((n ^ tshn ^ tthj.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int rds_4(int n, int n2) {
        return tthj.rld(Integer.rotateRight(n * -692139603 ^ n2, 14) ^ zssh);
    }

    public static boolean ssj(int n, int n2) {
        return ((tthj.rds_4(n, n2) ^ (int)System.nanoTime()) * -1156070333 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

