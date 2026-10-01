/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class nz_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p6h64vk8o;

    private nz_2() {
    }

    public static int thjf(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 13) * -1813883965;
        int n3 = (n2 ^ n2 >>> 13) * -975764037;
        int n4 = (n3 ^ n3 >>> 10) * -1663779105;
        return n4 ^ n4 >>> 17;
    }

    public static int rthz(int n, int n2) {
        int n3 = Integer.rotateRight(n * 90098357 ^ n2, 10);
        int n4 = (n3 ^ n3 >>> 9) * -331427531;
        int n5 = (n4 ^ n4 >>> 10) * 1906225793;
        return n5 ^ n5 >>> 13;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

