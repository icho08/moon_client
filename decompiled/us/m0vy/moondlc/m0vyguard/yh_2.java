/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class yh_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wdjjjh9eir;

    private yh_2() {
    }

    public static int tsh_5(int n) {
        int n2 = (n ^ yh_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * 199696509;
        int n4 = (n3 ^ n3 >>> 7) * -349258913;
        return n4 ^ n4 >>> 16;
    }

    public static int jghb(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 9) * 855035303;
        int n4 = (n3 ^ n3 >>> 11) * 1707322111;
        int n5 = (n4 ^ n4 >>> 14) * 1103409649;
        return n5 ^ n5 >>> 20;
    }

    public static boolean zdr_2(int n, int n2) {
        return ((yh_2.jghb(n, n2) ^ (int)System.nanoTime()) * 1140154953 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

