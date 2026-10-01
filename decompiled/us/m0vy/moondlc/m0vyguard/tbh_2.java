/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbh_2 {
    private static final int shssh = -857911112;
    private static final int thrt_2 = -1686519298;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lkm3t7uax867;

    private tbh_2() {
    }

    public static int hab_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 21) * -1683902229 ^ shssh;
        int n3 = (n2 ^ n2 >>> 15) * -1135382329;
        int n4 = (n3 ^ n3 >>> 10) * 1963342833;
        return n4 ^ n4 >>> 16 ^ thrt_2;
    }

    public static int bhw_2(int n, int n2) {
        int n3 = (n2 - n ^ 0x71629DBE) + thrt_2 ^ shssh;
        int n4 = (n3 ^ n3 >>> 13) * 1182845093;
        int n5 = (n4 ^ n4 >>> 16) * 6172497;
        return n5 ^ n5 >>> 22 ^ thrt_2;
    }

    public static boolean ghds_3(int n, int n2) {
        return ((tbh_2.bhw_2(n, n2) + Thread.currentThread().hashCode()) * -2019020681 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

