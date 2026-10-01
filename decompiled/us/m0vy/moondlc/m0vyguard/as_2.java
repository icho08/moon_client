/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class as_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int olr4jwwp;

    private as_2() {
    }

    public static int akhh_2(int n) {
        int n2 = (n ^ as_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 16) * 214986641;
        int n4 = (n3 ^ n3 >>> 8) * -1220520223;
        return n4 ^ n4 >>> 17;
    }

    public static int ms(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 7);
        int n4 = (n3 ^ n3 >>> 15) * 436402733;
        int n5 = (n4 ^ n4 >>> 9) * -237520945;
        return n5 ^ n5 >>> 16;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

