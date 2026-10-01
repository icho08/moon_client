/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmz {
    private static final int dthj = 248974099;
    private static final int bkhth = -503246386;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nq1cs4uezz3;

    private bmz() {
    }

    public static int jshm(int n) {
        int n2 = Integer.rotateRight(n * 1297160549 - System.identityHashCode(bmz.class), 24) ^ dthj;
        int n3 = (n2 ^ n2 >>> 15) * -926871539;
        int n4 = (n3 ^ n3 >>> 16) * 1586163949;
        return n4 ^ n4 >>> 18 ^ bkhth;
    }

    public static int jlh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x13)) + bkhth ^ dthj;
        int n4 = (n3 ^ n3 >>> 15) * -1040477975;
        int n5 = (n4 ^ n4 >>> 9) * -460131163;
        return n5 ^ n5 >>> 15 ^ bkhth;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

