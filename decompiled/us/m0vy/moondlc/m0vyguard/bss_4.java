/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bss_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int f04kpcu5lu;

    private bss_4() {
    }

    private static int zthh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 8) * -1631817281;
        int n4 = (n3 ^ n3 >>> 19) * -308890939;
        return n4 ^ n4 >>> 14;
    }

    public static int hdhgh(int n) {
        return bss_4.zthh((n ^ bss_4.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int ddhd(int n, int n2) {
        return bss_4.zthh(n + n2 ^ Integer.rotateLeft(n, 11));
    }

    public static boolean hygh(int n, int n2) {
        return ((bss_4.ddhd(n, n2) ^ (int)System.nanoTime()) * 1053064343 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

