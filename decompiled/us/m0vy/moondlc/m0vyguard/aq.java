/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class aq {
    private static final int rghb = -855029194;
    private static final int shar = -1166882049;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int p59tbaiql;

    private aq() {
    }

    private static int dhshsh(int n) {
        int n2 = n ^ rghb;
        int n3 = (n2 ^ n2 >>> 13) * 1583648341;
        int n4 = (n3 ^ n3 >>> 20) * 1629058011;
        return (n4 ^ n4 >>> 23) + shar;
    }

    public static int shtha(int n) {
        return aq.dhshsh(Integer.rotateLeft(n ^ (int)System.nanoTime(), 11) * -580079469 ^ rghb);
    }

    public static int ghbq(int n, int n2) {
        return aq.dhshsh((n + n2 ^ Integer.rotateLeft(n, 10)) + shar ^ rghb);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

