/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dk_2 {
    private static final int rfsh = 285498566;
    private static final int shthl = -990204920;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int aactrmom5;

    private dk_2() {
    }

    private static int asq_2(int n) {
        int n2 = n ^ rfsh;
        int n3 = (n2 ^ n2 >>> 8) * 2018346019;
        int n4 = (n3 ^ n3 >>> 19) * 632328535;
        return (n4 ^ n4 >>> 14) + shthl;
    }

    public static int shadh(int n) {
        return dk_2.asq_2(Integer.rotateRight((n ^ rfsh) * -374170085 - System.identityHashCode(dk_2.class), 12));
    }

    public static int hmf(int n, int n2) {
        return dk_2.asq_2(n + n2 ^ Integer.rotateLeft(n, 4) ^ shthl);
    }

    public static boolean bshdh(int n, int n2) {
        return ((dk_2.hmf(n, n2) + Thread.currentThread().hashCode()) * 2040187189 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

