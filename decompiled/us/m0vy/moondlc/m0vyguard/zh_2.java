/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zh_2 {
    private static final int bqd_2 = -1454279410;
    private static final int khshd = -12483481;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a9fauh6h14;

    private zh_2() {
    }

    public static int khqdh(int n) {
        int n2 = n ^ System.identityHashCode(zh_2.class) ^ (int)Thread.currentThread().getId() * 399673301 ^ bqd_2;
        int n3 = (n2 ^ n2 >>> 17) * 1323932853;
        int n4 = (n3 ^ n3 >>> 16) * -1573118809;
        return n4 ^ n4 >>> 22 ^ khshd;
    }

    public static int ttd_4(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 3)) + khshd ^ bqd_2;
        int n4 = (n3 ^ n3 >>> 9) * -315820031;
        int n5 = (n4 ^ n4 >>> 13) * -1010961981;
        return n5 ^ n5 >>> 19 ^ khshd;
    }

    public static boolean yt(int n, int n2) {
        return ((zh_2.ttd_4(n, n2) ^ (int)System.nanoTime()) * -1304029627 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

