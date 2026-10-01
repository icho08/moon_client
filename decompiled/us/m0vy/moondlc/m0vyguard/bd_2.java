/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bd_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mgnmtomylg2;

    private bd_2() {
    }

    private static int zds_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * -1276961645;
        int n4 = (n3 ^ n3 >>> 14) * 1210660289;
        return n4 ^ n4 >>> 11;
    }

    public static int sbw_2(int n) {
        return bd_2.zds_3(n ^ System.identityHashCode(bd_2.class) ^ (int)Thread.currentThread().getId() * 652265);
    }

    public static int shagh_2(int n, int n2) {
        return bd_2.zds_3(Integer.rotateRight(n * 674352393 ^ n2, 8));
    }

    public static boolean ahdh_2(int n, int n2) {
        return ((bd_2.shagh_2(n, n2) ^ (int)System.nanoTime()) * -1287779761 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

