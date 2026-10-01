/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwl {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jys13fmsxq0qv8;

    private bwl() {
    }

    public static int dzq(int n) {
        int n2 = (n ^ bwl.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 18) * -1103345513;
        int n4 = (n3 ^ n3 >>> 16) * 1309896731;
        return n4 ^ n4 >>> 20;
    }

    public static int sqq_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 6) * -909989437;
        int n4 = (n3 ^ n3 >>> 8) * -695543983;
        int n5 = (n4 ^ n4 >>> 16) * -1845935587;
        return n5 ^ n5 >>> 15;
    }

    public static boolean byq(int n, int n2) {
        return ((bwl.sqq_2(n, n2) ^ (int)System.nanoTime()) * -553533631 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

