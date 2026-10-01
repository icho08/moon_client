/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class td_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int doy0xcmzi;

    private td_4() {
    }

    public static int saj_2(int n) {
        int n2 = (n ^ td_4.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * 1320749029;
        int n4 = (n3 ^ n3 >>> 12) * -866258845;
        return n4 ^ n4 >>> 17;
    }

    public static int thkhw(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 9) * -1399217781;
        int n4 = (n3 ^ n3 >>> 14) * 418466239;
        int n5 = (n4 ^ n4 >>> 10) * 1849766919;
        return n5 ^ n5 >>> 19;
    }

    public static boolean dhnm(int n, int n2) {
        return ((td_4.thkhw(n, n2) ^ (int)System.nanoTime()) * 1304178167 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

