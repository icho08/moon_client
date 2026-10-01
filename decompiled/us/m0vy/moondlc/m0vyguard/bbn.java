/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bbn {
    private static final int rght_2 = 633755996;
    private static final int ttsh_2 = -1123698234;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a3mkzjv78no0o3;

    private bbn() {
    }

    private static int tdy_2(int n) {
        int n2 = n ^ rght_2;
        int n3 = (n2 ^ n2 >>> 15) * -1111603789;
        int n4 = (n3 ^ n3 >>> 11) * -1234164811;
        return (n4 ^ n4 >>> 22) + ttsh_2;
    }

    public static int shls(int n) {
        return bbn.tdy_2(Integer.rotateRight(n * 1219554611 - System.identityHashCode(bbn.class), 13) ^ rght_2);
    }

    public static int zfa_2(int n, int n2) {
        return bbn.tdy_2((n2 - n ^ 0xFF807DD0) + ttsh_2 ^ rght_2);
    }

    public static boolean dhkm(int n, int n2) {
        return ((bbn.zfa_2(n, n2) + Thread.currentThread().hashCode()) * -1053885859 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

