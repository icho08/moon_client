/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class baz {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m4yqmooale;

    private baz() {
    }

    public static int yz_2(int n) {
        int n2 = n ^ System.identityHashCode(baz.class) ^ (int)Thread.currentThread().getId() * -1677408319;
        int n3 = (n2 ^ n2 >>> 12) * 414079523;
        int n4 = (n3 ^ n3 >>> 8) * 1410812157;
        return n4 ^ n4 >>> 13;
    }

    public static int zds_6(int n, int n2) {
        int n3 = n2 - n ^ 0x37E4F394;
        int n4 = (n3 ^ n3 >>> 16) * 2118272561;
        int n5 = (n4 ^ n4 >>> 13) * -1504983607;
        return n5 ^ n5 >>> 22;
    }

    public static boolean zam_2(int n, int n2) {
        return ((baz.zds_6(n, n2) ^ (int)System.nanoTime()) * -569183069 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

