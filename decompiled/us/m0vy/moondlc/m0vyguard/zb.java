/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zb {
    private static final int zzd_2 = -575943460;
    private static final int zyy = 1823765057;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jjvugx70fj;

    private zb() {
    }

    public static int dhshf(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 12) * -497784925 ^ zzd_2;
        int n3 = (n2 ^ n2 >>> 17) * -1790683353;
        int n4 = (n3 ^ n3 >>> 7) * -678654737;
        return n4 ^ n4 >>> 22 ^ zyy;
    }

    public static int saw(int n, int n2) {
        int n3 = (n2 - n ^ 0xFEFA973A) + zyy ^ zzd_2;
        int n4 = (n3 ^ n3 >>> 13) * 1891855657;
        int n5 = (n4 ^ n4 >>> 11) * -99091763;
        return n5 ^ n5 >>> 23 ^ zyy;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

