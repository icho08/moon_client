/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hk_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vabar06j0d9sfs;

    private hk_2() {
    }

    public static int sssh(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 22) * 1765715385;
        int n3 = (n2 ^ n2 >>> 17) * -1364758973;
        int n4 = (n3 ^ n3 >>> 16) * -1065298535;
        return n4 ^ n4 >>> 15;
    }

    public static int dhshq(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * -344783869;
        int n4 = (n3 ^ n3 >>> 9) * 2008810427;
        int n5 = (n4 ^ n4 >>> 18) * -1012787051;
        return n5 ^ n5 >>> 15;
    }

    public static boolean ddht_2(int n, int n2) {
        return ((hk_2.dhshq(n, n2) + Thread.currentThread().hashCode()) * -637350639 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

