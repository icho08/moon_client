/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bbth {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int um42webhd1;

    private bbth() {
    }

    private static int btj(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * 1234435911;
        int n4 = (n3 ^ n3 >>> 16) * -248840823;
        return n4 ^ n4 >>> 11;
    }

    public static int sthy_2(int n) {
        return bbth.btj(Integer.rotateRight(n * -508268749 - System.identityHashCode(bbth.class), 15));
    }

    public static int ddkh(int n, int n2) {
        return bbth.btj(Integer.rotateLeft(n ^ n2, 12) * -828897925);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

