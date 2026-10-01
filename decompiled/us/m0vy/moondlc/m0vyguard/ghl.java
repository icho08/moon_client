/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ghl {
    private static final int tay = 1514603590;
    private static final int tsgh = 337233851;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jel13jbxtq8;

    private ghl() {
    }

    public static int zthr(int n) {
        int n2 = Integer.rotateLeft(n ^ tay ^ (int)System.nanoTime(), 18) * 1778058197;
        int n3 = (n2 ^ n2 >>> 15) * 1178105759;
        int n4 = (n3 ^ n3 >>> 7) * 501871653;
        return n4 ^ n4 >>> 22;
    }

    public static int zda(int n, int n2) {
        int n3 = n2 - n ^ 0x61875FC ^ tsgh;
        int n4 = (n3 ^ n3 >>> 9) * 441262589;
        int n5 = (n4 ^ n4 >>> 9) * 65865361;
        return n5 ^ n5 >>> 19;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

