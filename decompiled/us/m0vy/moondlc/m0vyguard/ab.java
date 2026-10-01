/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ab {
    private static final int rtq = -2102566079;
    private static final int rdhgh = 1498292019;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int unvhg4mqvayu;

    private ab() {
    }

    private static int hhs_3(int n) {
        int n2 = n ^ rtq;
        int n3 = (n2 ^ n2 >>> 7) * -1800256399;
        int n4 = (n3 ^ n3 >>> 14) * -2140679647;
        return (n4 ^ n4 >>> 12) + rdhgh;
    }

    public static int khtm_2(int n) {
        return ab.hhs_3(Integer.rotateRight((n ^ rtq) * 1315293347 - System.identityHashCode(ab.class), 12));
    }

    public static int rhy_2(int n, int n2) {
        return ab.hhs_3(n + n2 ^ Integer.rotateLeft(n, 8) ^ rdhgh);
    }

    public static boolean atz(int n, int n2) {
        return ((ab.rhy_2(n, n2) + Thread.currentThread().hashCode()) * -1533179941 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

