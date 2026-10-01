/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qw {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int i2s1bgeqj8;

    private qw() {
    }

    public static int dlh_3(int n) {
        int n2 = (n ^ qw.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 17) * 1648528611;
        int n4 = (n3 ^ n3 >>> 14) * -1385217749;
        return n4 ^ n4 >>> 17;
    }

    public static int dw_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xA);
        int n4 = (n3 ^ n3 >>> 11) * -202796397;
        int n5 = (n4 ^ n4 >>> 16) * 1114423589;
        return n5 ^ n5 >>> 17;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

