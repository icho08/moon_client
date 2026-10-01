/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dk {
    private static final int rths = 1599277344;
    private static final int zsk_2 = -1969307590;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int y6qr4rmy;

    private dk() {
    }

    public static int adhf(int n) {
        int n2 = Integer.rotateRight((n ^ rths) * 237219151 - System.identityHashCode(dk.class), 8);
        int n3 = (n2 ^ n2 >>> 12) * -77533377;
        int n4 = (n3 ^ n3 >>> 16) * 1436349753;
        return n4 ^ n4 >>> 13;
    }

    public static int bls(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 15) * 190194667 ^ zsk_2;
        int n4 = (n3 ^ n3 >>> 9) * -192360497;
        int n5 = (n4 ^ n4 >>> 9) * -602690997;
        return n5 ^ n5 >>> 16;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

