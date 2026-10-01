/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdh_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int z7bxwpsit7;

    private bdh_4() {
    }

    private static int bth_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -2121933393;
        int n4 = (n3 ^ n3 >>> 11) * -1653409111;
        return n4 ^ n4 >>> 12;
    }

    public static int khghl(int n) {
        return bdh_4.bth_3(Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 1192355015);
    }

    public static int zjq_2(int n, int n2) {
        return bdh_4.bth_3(n + n2 ^ Integer.rotateLeft(n, 10));
    }

    public static boolean dfh_3(int n, int n2) {
        return ((bdh_4.zjq_2(n, n2) + Thread.currentThread().hashCode()) * 505782689 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

