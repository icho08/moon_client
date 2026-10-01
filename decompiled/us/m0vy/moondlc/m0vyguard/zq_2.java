/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zq_2 {
    private static final int jskh = -854981385;
    private static final int hzkh_2 = 1941917502;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eotwmun4;

    private zq_2() {
    }

    public static int amr(int n) {
        int n2 = Integer.rotateLeft(n ^ jskh ^ (int)System.nanoTime(), 18) * 1505612981;
        int n3 = (n2 ^ n2 >>> 11) * -482351511;
        int n4 = (n3 ^ n3 >>> 9) * 1465277407;
        return n4 ^ n4 >>> 20;
    }

    public static int sjw(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 11) ^ hzkh_2;
        int n4 = (n3 ^ n3 >>> 16) * 281941543;
        int n5 = (n4 ^ n4 >>> 17) * 2065365231;
        return n5 ^ n5 >>> 15;
    }

    public static boolean sghn(int n, int n2) {
        return ((zq_2.sjw(n, n2) + Thread.currentThread().hashCode()) * 859653819 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

