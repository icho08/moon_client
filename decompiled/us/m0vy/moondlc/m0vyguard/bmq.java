/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmq {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int x7wfoczkx1j97;

    private bmq() {
    }

    public static int rrf(int n) {
        int n2 = n ^ System.identityHashCode(bmq.class) ^ (int)Thread.currentThread().getId() * 410730597;
        int n3 = (n2 ^ n2 >>> 16) * -141175397;
        int n4 = (n3 ^ n3 >>> 10) * 1072383797;
        return n4 ^ n4 >>> 21;
    }

    public static int tlkh_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 16);
        int n4 = (n3 ^ n3 >>> 16) * 1957058241;
        int n5 = (n4 ^ n4 >>> 11) * 1846109947;
        return n5 ^ n5 >>> 15;
    }

    public static boolean trkh_2(int n, int n2) {
        return ((bmq.tlkh_2(n, n2) ^ (int)System.nanoTime()) * 305020567 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

