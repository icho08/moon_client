/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class fdh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cft17gaax7;

    private fdh() {
    }

    public static int zmz_2(int n) {
        int n2 = Integer.rotateRight(n * -228937777 - System.identityHashCode(fdh.class), 15);
        int n3 = (n2 ^ n2 >>> 12) * 655522219;
        int n4 = (n3 ^ n3 >>> 11) * 775798609;
        return n4 ^ n4 >>> 17;
    }

    public static int zghsh(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 12);
        int n4 = (n3 ^ n3 >>> 9) * 1226544871;
        int n5 = (n4 ^ n4 >>> 18) * -1360144871;
        return n5 ^ n5 >>> 18;
    }

    public static boolean thmkh(int n, int n2) {
        return ((fdh.zghsh(n, n2) + Thread.currentThread().hashCode()) * -1414113967 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

