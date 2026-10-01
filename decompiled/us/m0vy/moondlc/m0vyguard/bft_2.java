/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bft_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kv3oj6yf;

    private bft_2() {
    }

    public static int ahsh_2(int n) {
        int n2 = Integer.rotateRight(n * 1959532619 - System.identityHashCode(bft_2.class), 11);
        int n3 = (n2 ^ n2 >>> 17) * -533295521;
        int n4 = (n3 ^ n3 >>> 10) * -1028531981;
        return n4 ^ n4 >>> 16;
    }

    public static int rdhz_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 2087315013 ^ n2, 14);
        int n4 = (n3 ^ n3 >>> 15) * 1360113607;
        int n5 = (n4 ^ n4 >>> 14) * -64590533;
        return n5 ^ n5 >>> 14;
    }

    public static boolean ghrt_2(int n, int n2) {
        return ((bft_2.rdhz_2(n, n2) + Thread.currentThread().hashCode()) * 1224480231 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

