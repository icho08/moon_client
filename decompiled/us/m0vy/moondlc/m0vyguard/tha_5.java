/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tha_5 {
    private static final int smr = -1352543527;
    private static final int khan = -66132159;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jq8dmzxefv1k;

    private tha_5() {
    }

    public static int jdd_2(int n) {
        int n2 = Integer.rotateRight(n * -2121389841 - System.identityHashCode(tha_5.class), 6) ^ smr;
        int n3 = (n2 ^ n2 >>> 13) * 298565147;
        int n4 = (n3 ^ n3 >>> 16) * -24937849;
        return n4 ^ n4 >>> 20 ^ khan;
    }

    public static int khdt_2(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 7)) + khan ^ smr;
        int n4 = (n3 ^ n3 >>> 10) * -1967623005;
        int n5 = (n4 ^ n4 >>> 9) * 994381683;
        return n5 ^ n5 >>> 14 ^ khan;
    }

    public static boolean khdhsh(int n, int n2) {
        return ((tha_5.khdt_2(n, n2) + Thread.currentThread().hashCode()) * -1973376251 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

