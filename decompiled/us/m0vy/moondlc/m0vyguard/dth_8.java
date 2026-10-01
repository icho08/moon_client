/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dth_8 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ugot4c01iv;

    private dth_8() {
    }

    private static int zmw_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * -1662178847;
        int n4 = (n3 ^ n3 >>> 11) * -37332535;
        return n4 ^ n4 >>> 20;
    }

    public static int ttsh_3(int n) {
        return dth_8.zmw_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 19) * -1119855221);
    }

    public static int zdhs_3(int n, int n2) {
        return dth_8.zmw_2(n + n2 ^ Integer.rotateLeft(n, 3));
    }

    public static boolean ddj(int n, int n2) {
        return ((dth_8.zdhs_3(n, n2) + Thread.currentThread().hashCode()) * 1318982481 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

