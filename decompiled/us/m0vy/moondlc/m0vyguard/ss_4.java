/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ss_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int sx9omukw7rn;

    private ss_4() {
    }

    public static int thq_4(int n) {
        int n2 = Integer.rotateRight(n * -1844645587 - System.identityHashCode(ss_4.class), 17);
        int n3 = (n2 ^ n2 >>> 18) * -793297059;
        int n4 = (n3 ^ n3 >>> 12) * 2011699767;
        return n4 ^ n4 >>> 20;
    }

    public static int thz_3(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 12);
        int n4 = (n3 ^ n3 >>> 10) * 1617982431;
        int n5 = (n4 ^ n4 >>> 9) * -1384851943;
        return n5 ^ n5 >>> 12;
    }

    public static boolean shrs_2(int n, int n2) {
        return ((ss_4.thz_3(n, n2) + Thread.currentThread().hashCode()) * 608189847 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

