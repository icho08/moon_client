/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzh_2 {
    private static final int zdl_2 = 1696584711;
    private static final int shnd_2 = -239918004;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int upj0a99s4id;

    private bzh_2() {
    }

    private static int haw(int n) {
        int n2 = n ^ zdl_2;
        int n3 = (n2 ^ n2 >>> 9) * 61582155;
        int n4 = (n3 ^ n3 >>> 16) * -2035515551;
        return (n4 ^ n4 >>> 16) + shnd_2;
    }

    public static int dsd_2(int n) {
        return bzh_2.haw((n ^ zdl_2 ^ bzh_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zsht(int n, int n2) {
        return bzh_2.haw(n2 ^ Integer.rotateLeft(n, n2 & 0xB) ^ shnd_2);
    }

    public static boolean jrd_2(int n, int n2) {
        return ((bzh_2.zsht(n, n2) ^ (int)System.nanoTime()) * -120366457 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

