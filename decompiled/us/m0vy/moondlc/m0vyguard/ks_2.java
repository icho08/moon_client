/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ks_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zdmh0i0n0ka1;

    private ks_2() {
    }

    private static int ssdh_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * 1972198109;
        int n4 = (n3 ^ n3 >>> 17) * -89098311;
        return n4 ^ n4 >>> 20;
    }

    public static int dkhd_2(int n) {
        return ks_2.ssdh_3((n ^ ks_2.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zba_2(int n, int n2) {
        return ks_2.ssdh_3(n + n2 ^ Integer.rotateLeft(n, 6));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

