/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class df {
    private static final int hrs_2 = 1365673077;
    private static final int thdth = 850389828;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nvccybar;

    private df() {
    }

    private static int dda(int n) {
        int n2 = n ^ hrs_2;
        int n3 = (n2 ^ n2 >>> 16) * 29245853;
        int n4 = (n3 ^ n3 >>> 14) * 2050153091;
        return (n4 ^ n4 >>> 19) + thdth;
    }

    public static int shhth_2(int n) {
        return df.dda(n ^ hrs_2 ^ System.identityHashCode(df.class) ^ (int)Thread.currentThread().getId() * -1860524433);
    }

    public static int dhab(int n, int n2) {
        return df.dda(n2 - n ^ 0x8C31E3D7 ^ thdth);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

