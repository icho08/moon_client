/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tat {
    private static final int bds = 1987618165;
    private static final int zdq_2 = 1698436291;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vwoqtf4wjno2vh;

    private tat() {
    }

    public static int ghdd_2(int n) {
        int n2 = Integer.rotateRight((n ^ bds) * -1149861623 - System.identityHashCode(tat.class), 16);
        int n3 = (n2 ^ n2 >>> 18) * 1384029773;
        int n4 = (n3 ^ n3 >>> 12) * 74596209;
        return n4 ^ n4 >>> 18;
    }

    public static int ghshn(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 12) * 1579680495 ^ zdq_2;
        int n4 = (n3 ^ n3 >>> 8) * -1508548441;
        int n5 = (n4 ^ n4 >>> 15) * 416424319;
        return n5 ^ n5 >>> 12;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

