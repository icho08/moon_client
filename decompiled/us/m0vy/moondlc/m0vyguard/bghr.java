/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghr {
    private static final int jhgh_2 = 551510779;
    private static final int dhtz = -1909097084;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dqglmb53e;

    private bghr() {
    }

    private static int thla(int n) {
        int n2 = n ^ jhgh_2;
        int n3 = (n2 ^ n2 >>> 7) * 1415623829;
        int n4 = (n3 ^ n3 >>> 15) * -440996747;
        return (n4 ^ n4 >>> 13) + dhtz;
    }

    public static int ztt_5(int n) {
        return bghr.thla(Integer.rotateRight((n ^ jhgh_2) * 542616181 - System.identityHashCode(bghr.class), 10));
    }

    public static int rkhdh(int n, int n2) {
        return bghr.thla(n + n2 ^ Integer.rotateLeft(n, 6) ^ dhtz);
    }

    public static boolean dhss_3(int n, int n2) {
        return ((bghr.rkhdh(n, n2) + Thread.currentThread().hashCode()) * -1208541489 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

