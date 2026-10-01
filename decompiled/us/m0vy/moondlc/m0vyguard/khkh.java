/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khkh {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int v8nttcgl;

    private khkh() {
    }

    public static int shsl(int n) {
        int n2 = n ^ System.identityHashCode(khkh.class) ^ (int)Thread.currentThread().getId() * 1008978293;
        int n3 = (n2 ^ n2 >>> 18) * -140163551;
        int n4 = (n3 ^ n3 >>> 15) * 1972632757;
        return n4 ^ n4 >>> 14;
    }

    public static int rngh(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 12) * 1010190029;
        int n4 = (n3 ^ n3 >>> 15) * 1860978033;
        int n5 = (n4 ^ n4 >>> 17) * -681407141;
        return n5 ^ n5 >>> 12;
    }

    public static boolean twd_3(int n, int n2) {
        return ((khkh.rngh(n, n2) ^ (int)System.nanoTime()) * -864876095 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

