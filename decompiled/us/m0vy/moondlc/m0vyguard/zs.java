/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zs {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int amkkq97ps;

    private zs() {
    }

    public static int abl(int n) {
        int n2 = (n ^ zs.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 14) * -620342843;
        int n4 = (n3 ^ n3 >>> 11) * 697959847;
        return n4 ^ n4 >>> 21;
    }

    public static int shnj(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 18) * -94027939;
        int n4 = (n3 ^ n3 >>> 10) * 1769586447;
        int n5 = (n4 ^ n4 >>> 12) * -1330930729;
        return n5 ^ n5 >>> 22;
    }

    public static boolean atgh_2(int n, int n2) {
        return ((zs.shnj(n, n2) ^ (int)System.nanoTime()) * -206234211 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

