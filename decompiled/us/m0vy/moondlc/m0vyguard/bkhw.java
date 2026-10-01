/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhw {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int o9c5x41jbidm;

    private bkhw() {
    }

    private static int jbr(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * -1195487183;
        int n4 = (n3 ^ n3 >>> 9) * -1215031417;
        return n4 ^ n4 >>> 23;
    }

    public static int khqn(int n) {
        return bkhw.jbr(n ^ System.identityHashCode(bkhw.class) ^ (int)Thread.currentThread().getId() * 1774291785);
    }

    public static int shmm(int n, int n2) {
        return bkhw.jbr(Integer.rotateRight(n * -420011245 ^ n2, 6));
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

