/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdj_2 {
    private static final int tshgh = -434729752;
    private static final int bna_2 = -984235616;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int g7aixqdgym;

    private bdj_2() {
    }

    private static int zqy(int n) {
        int n2 = n ^ tshgh;
        int n3 = (n2 ^ n2 >>> 11) * -1712453307;
        int n4 = (n3 ^ n3 >>> 14) * 1124245857;
        return (n4 ^ n4 >>> 19) + bna_2;
    }

    public static int hhr(int n) {
        return bdj_2.zqy(n ^ System.identityHashCode(bdj_2.class) ^ (int)Thread.currentThread().getId() * -1387704755 ^ tshgh);
    }

    public static int sht_9(int n, int n2) {
        return bdj_2.zqy((n2 ^ Integer.rotateLeft(n, n2 & 0xD)) + bna_2 ^ tshgh);
    }

    public static boolean radh_2(int n, int n2) {
        return ((bdj_2.sht_9(n, n2) ^ (int)System.nanoTime()) * 497635575 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

