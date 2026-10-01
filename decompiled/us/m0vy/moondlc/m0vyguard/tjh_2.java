/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjh_2 {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g9akxho9ynhd;

    private tjh_2() {
    }

    public static int akhdh(int n) {
        int n2 = n ^ System.identityHashCode(tjh_2.class) ^ (int)Thread.currentThread().getId() * 298397917;
        int n3 = (n2 ^ n2 >>> 15) * 2021978553;
        int n4 = (n3 ^ n3 >>> 13) * -1513382025;
        return n4 ^ n4 >>> 18;
    }

    public static int hdz_3(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 6);
        int n4 = (n3 ^ n3 >>> 15) * -711354665;
        int n5 = (n4 ^ n4 >>> 12) * -1718507491;
        return n5 ^ n5 >>> 13;
    }

    public static boolean thakh(int n, int n2) {
        return ((tjh_2.hdz_3(n, n2) ^ (int)System.nanoTime()) * 965104781 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

