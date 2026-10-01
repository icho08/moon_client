/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brh {
    private static final int shmk = -1413864413;
    private static final int shfd = -2106568472;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int a8nl7w64gchu5y;

    private brh() {
    }

    public static int rzy_2(int n) {
        int n2 = n ^ shmk ^ System.identityHashCode(brh.class) ^ (int)Thread.currentThread().getId() * 1677902343;
        int n3 = (n2 ^ n2 >>> 18) * -1284568725;
        int n4 = (n3 ^ n3 >>> 9) * 1225743817;
        return n4 ^ n4 >>> 22;
    }

    public static int sth_10(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 13) ^ shfd;
        int n4 = (n3 ^ n3 >>> 10) * 772497271;
        int n5 = (n4 ^ n4 >>> 18) * -1623093371;
        return n5 ^ n5 >>> 18;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

