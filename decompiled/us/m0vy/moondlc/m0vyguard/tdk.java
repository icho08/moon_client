/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdk {
    private static final int tnk = 678696311;
    private static final int khah_2 = 1010816297;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ctg14yld;

    private tdk() {
    }

    private static int zndh_2(int n) {
        int n2 = n ^ tnk;
        int n3 = (n2 ^ n2 >>> 7) * -1685226459;
        int n4 = (n3 ^ n3 >>> 11) * 671639923;
        return (n4 ^ n4 >>> 23) + khah_2;
    }

    public static int dqw_2(int n) {
        return tdk.zndh_2(Integer.rotateRight(n * -1159332129 - System.identityHashCode(tdk.class), 14) ^ tnk);
    }

    public static int tsk(int n, int n2) {
        return tdk.zndh_2((n2 - n ^ 0x7C973841) + khah_2 ^ tnk);
    }

    public static boolean sbn_2(int n, int n2) {
        return ((tdk.tsk(n, n2) + Thread.currentThread().hashCode()) * 1721179839 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

