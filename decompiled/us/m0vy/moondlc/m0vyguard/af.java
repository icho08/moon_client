/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class af {
    private static final int jmd = 1123336170;
    private static final int tfgh = 578711100;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int f40rdfyay;

    private af() {
    }

    public static int kham(int n) {
        int n2 = Integer.rotateRight(n * -865542089 - System.identityHashCode(af.class), 24) ^ jmd;
        int n3 = (n2 ^ n2 >>> 14) * 1318533681;
        int n4 = (n3 ^ n3 >>> 7) * -1019922893;
        return n4 ^ n4 >>> 21 ^ tfgh;
    }

    public static int zmk_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 16) * -1225680955 + tfgh ^ jmd;
        int n4 = (n3 ^ n3 >>> 15) * 1668251751;
        int n5 = (n4 ^ n4 >>> 10) * -847799227;
        return n5 ^ n5 >>> 14 ^ tfgh;
    }

    public static boolean zths_2(int n, int n2) {
        return ((af.zmk_2(n, n2) + Thread.currentThread().hashCode()) * 780945969 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

