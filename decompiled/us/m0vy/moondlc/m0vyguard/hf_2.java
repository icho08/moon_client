/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hf_2 {
    private static final int shdt_4 = -1755421642;
    private static final int dhlk = -1721042656;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lv4dkxi49xxy9n;

    private hf_2() {
    }

    private static int shfth(int n) {
        int n2 = n ^ shdt_4;
        int n3 = (n2 ^ n2 >>> 15) * -1369116543;
        int n4 = (n3 ^ n3 >>> 9) * 1934498401;
        return (n4 ^ n4 >>> 24) + dhlk;
    }

    public static int rfdh(int n) {
        return hf_2.shfth(Integer.rotateRight((n ^ shdt_4) * -849110657 - System.identityHashCode(hf_2.class), 23));
    }

    public static int tqs_3(int n, int n2) {
        return hf_2.shfth(n + n2 ^ Integer.rotateLeft(n, 4) ^ dhlk);
    }

    public static boolean rnz(int n, int n2) {
        return ((hf_2.tqs_3(n, n2) + Thread.currentThread().hashCode()) * -1900967619 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

