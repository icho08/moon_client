/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rh_2 {
    private static final int zla = 420626888;
    private static final int shta_4 = 2084624452;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jjvugx70fj;

    private rh_2() {
    }

    private static int dghq(int n) {
        int n2 = n ^ zla;
        int n3 = (n2 ^ n2 >>> 10) * 1752519755;
        int n4 = (n3 ^ n3 >>> 12) * -481936893;
        return (n4 ^ n4 >>> 11) + shta_4;
    }

    public static int tkhh(int n) {
        return rh_2.dghq(n ^ System.identityHashCode(rh_2.class) ^ (int)Thread.currentThread().getId() * -188091989 ^ zla);
    }

    public static int aky(int n, int n2) {
        return rh_2.dghq(Integer.rotateRight(n * 29779517 ^ n2, 19) + shta_4 ^ zla);
    }

    public static boolean dsa(int n, int n2) {
        return ((rh_2.aky(n, n2) ^ (int)System.nanoTime()) * -1320875957 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

