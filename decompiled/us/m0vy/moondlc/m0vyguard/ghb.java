/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ghb {
    private static final int bykh = -899501319;
    private static final int zb = 1894720351;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mt0bdxwo0m63bg;

    private ghb() {
    }

    private static int skth_2(int n) {
        int n2 = n ^ bykh;
        int n3 = (n2 ^ n2 >>> 11) * -1195338673;
        int n4 = (n3 ^ n3 >>> 10) * 330923639;
        return (n4 ^ n4 >>> 11) + zb;
    }

    public static int zghdh(int n) {
        return ghb.skth_2(n ^ bykh ^ System.identityHashCode(ghb.class) ^ (int)Thread.currentThread().getId() * -707252901);
    }

    public static int sbz_3(int n, int n2) {
        return ghb.skth_2(n2 - n ^ 0xE48BC91B ^ zb);
    }

    public static boolean adn_2(int n, int n2) {
        return ((ghb.sbz_3(n, n2) ^ (int)System.nanoTime()) * -1201132565 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

