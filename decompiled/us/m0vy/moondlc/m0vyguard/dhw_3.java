/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dhw_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kg9agexpnsm;

    private dhw_3() {
    }

    private static int bwf(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * 992898817;
        int n4 = (n3 ^ n3 >>> 17) * -1927819671;
        return n4 ^ n4 >>> 24;
    }

    public static int tha_10(int n) {
        return dhw_3.bwf(Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * 404154677);
    }

    public static int zqh(int n, int n2) {
        return dhw_3.bwf(Integer.rotateRight(n * -252631887 ^ n2, 18));
    }

    public static boolean shzr_2(int n, int n2) {
        return ((dhw_3.zqh(n, n2) + Thread.currentThread().hashCode()) * -1758525339 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

