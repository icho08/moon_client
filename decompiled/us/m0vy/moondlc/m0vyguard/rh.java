/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rh {
    private static final int shm_4 = -314693516;
    private static final int zda_3 = 1980102855;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z3yxb9l1rra;

    private rh() {
    }

    private static int ttl_2(int n) {
        int n2 = n ^ shm_4;
        int n3 = (n2 ^ n2 >>> 13) * 750796321;
        int n4 = (n3 ^ n3 >>> 19) * 46768655;
        return (n4 ^ n4 >>> 23) + zda_3;
    }

    public static int shhs(int n) {
        return rh.ttl_2((n ^ rh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ shm_4);
    }

    public static int dsr_3(int n, int n2) {
        return rh.ttl_2((n + n2 ^ Integer.rotateLeft(n, 4)) + zda_3 ^ shm_4);
    }

    public static boolean ddh_10(int n, int n2) {
        return ((rh.dsr_3(n, n2) ^ (int)System.nanoTime()) * -1366402213 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

