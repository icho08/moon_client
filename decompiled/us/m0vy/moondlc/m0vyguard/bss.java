/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bss {
    private static final int shdha = 2143538856;
    private static final int dhr = 1257197772;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int uz19bg8obr;

    private bss() {
    }

    public static int zmn(int n) {
        int n2 = Integer.rotateRight((n ^ shdha) * 382271497 - System.identityHashCode(bss.class), 14);
        int n3 = (n2 ^ n2 >>> 11) * 1591277079;
        int n4 = (n3 ^ n3 >>> 13) * 2008578451;
        return n4 ^ n4 >>> 15;
    }

    public static int ztgh(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -1289546149 ^ dhr;
        int n4 = (n3 ^ n3 >>> 10) * 1412663793;
        int n5 = (n4 ^ n4 >>> 9) * -1789280361;
        return n5 ^ n5 >>> 18;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

