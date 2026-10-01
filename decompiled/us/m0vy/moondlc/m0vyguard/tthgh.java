/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthgh {
    private static final int tlj = -1517325445;
    private static final int zna = 258689188;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ae7ar8mweygj;

    private tthgh() {
    }

    public static int rzh(int n) {
        int n2 = (n ^ tlj ^ tthgh.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 11) * -1348849893;
        int n4 = (n3 ^ n3 >>> 10) * 91236939;
        return n4 ^ n4 >>> 16;
    }

    public static int dqth_2(int n, int n2) {
        int n3 = n2 - n ^ 0x83247378 ^ zna;
        int n4 = (n3 ^ n3 >>> 16) * -1886086023;
        int n5 = (n4 ^ n4 >>> 15) * 1058804699;
        return n5 ^ n5 >>> 20;
    }

    public static boolean thyz(int n, int n2) {
        return ((tthgh.dqth_2(n, n2) ^ (int)System.nanoTime()) * 1943300129 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

