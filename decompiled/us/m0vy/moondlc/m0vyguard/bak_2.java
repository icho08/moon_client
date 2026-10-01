/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bak_2 {
    private static final int thms_2 = -661010945;
    private static final int hma = -1923936850;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rlrdawgby6i;

    private bak_2() {
    }

    public static int str_4(int n) {
        int n2 = Integer.rotateRight(n * -489317407 - System.identityHashCode(bak_2.class), 20) ^ thms_2;
        int n3 = (n2 ^ n2 >>> 14) * -234830105;
        int n4 = (n3 ^ n3 >>> 7) * 1038710071;
        return n4 ^ n4 >>> 22 ^ hma;
    }

    public static int khjkh(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x16)) + hma ^ thms_2;
        int n4 = (n3 ^ n3 >>> 14) * -220843447;
        int n5 = (n4 ^ n4 >>> 18) * -233639669;
        return n5 ^ n5 >>> 18 ^ hma;
    }

    public static boolean zkhz_4(int n, int n2) {
        return ((bak_2.khjkh(n, n2) + Thread.currentThread().hashCode()) * 182370061 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

