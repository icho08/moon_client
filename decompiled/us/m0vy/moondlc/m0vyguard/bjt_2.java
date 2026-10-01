/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bjt_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nmwr6zyu2r;

    private bjt_2() {
    }

    public static int dthm(int n) {
        int n2 = Integer.rotateRight(n * -345851853 - System.identityHashCode(bjt_2.class), 19);
        int n3 = (n2 ^ n2 >>> 11) * -1290833021;
        int n4 = (n3 ^ n3 >>> 8) * -1345133607;
        return n4 ^ n4 >>> 16;
    }

    public static int tts_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * 778774707 ^ n2, 14);
        int n4 = (n3 ^ n3 >>> 8) * 1414495945;
        int n5 = (n4 ^ n4 >>> 12) * 1780145533;
        return n5 ^ n5 >>> 12;
    }

    public static boolean zyz_4(int n, int n2) {
        return ((bjt_2.tts_3(n, n2) + Thread.currentThread().hashCode()) * -1548836139 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

