/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdz {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int h4zqwkwsda6r;

    private tdz() {
    }

    public static int tjh(int n) {
        int n2 = (n ^ tdz.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 11) * -1683953411;
        int n4 = (n3 ^ n3 >>> 12) * 1790338177;
        return n4 ^ n4 >>> 18;
    }

    public static int shqz(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x11);
        int n4 = (n3 ^ n3 >>> 8) * 2065023085;
        int n5 = (n4 ^ n4 >>> 11) * 1847580455;
        return n5 ^ n5 >>> 16;
    }

    public static boolean dns(int n, int n2) {
        return ((tdz.shqz(n, n2) ^ (int)System.nanoTime()) * -1377871591 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

