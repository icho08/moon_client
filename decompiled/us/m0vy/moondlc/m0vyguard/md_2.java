/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class md_2 {
    private static final int rth_2 = 1417871236;
    private static final int shqa = 272476073;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int o8ij38tk4uah;

    private md_2() {
    }

    public static int takh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 20) * 1737280825 ^ rth_2;
        int n3 = (n2 ^ n2 >>> 16) * -523618357;
        int n4 = (n3 ^ n3 >>> 13) * -237573647;
        return n4 ^ n4 >>> 16 ^ shqa;
    }

    public static int zjt_3(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xF)) + shqa ^ rth_2;
        int n4 = (n3 ^ n3 >>> 15) * -1621071921;
        int n5 = (n4 ^ n4 >>> 12) * 1439112593;
        return n5 ^ n5 >>> 21 ^ shqa;
    }

    public static boolean qw(int n, int n2) {
        return ((md_2.zjt_3(n, n2) + Thread.currentThread().hashCode()) * -1480498507 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

