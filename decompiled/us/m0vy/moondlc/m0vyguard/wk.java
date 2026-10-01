/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wk {
    private static final int jght_2 = -654985834;
    private static final int dhghk = -1438201992;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gyl7qk1frkilvi;

    private wk() {
    }

    private static int zdn_4(int n) {
        int n2 = n ^ jght_2;
        int n3 = (n2 ^ n2 >>> 9) * -19255793;
        int n4 = (n3 ^ n3 >>> 17) * -573115665;
        return (n4 ^ n4 >>> 11) + dhghk;
    }

    public static int ttd_3(int n) {
        return wk.zdn_4(n ^ jght_2 ^ System.identityHashCode(wk.class) ^ (int)Thread.currentThread().getId() * 1227429701);
    }

    public static int skt_2(int n, int n2) {
        return wk.zdn_4(n2 - n ^ 0x596BD89E ^ dhghk);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

