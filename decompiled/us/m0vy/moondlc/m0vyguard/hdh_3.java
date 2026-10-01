/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hdh_3 {
    private static final int tghd_2 = -1295432595;
    private static final int bkth = 110513899;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gj5vgourn91jk;

    private hdh_3() {
    }

    private static int jnkh(int n) {
        int n2 = n ^ tghd_2;
        int n3 = (n2 ^ n2 >>> 9) * -1800394807;
        int n4 = (n3 ^ n3 >>> 12) * 1807633347;
        return (n4 ^ n4 >>> 24) + bkth;
    }

    public static int dhh_2(int n) {
        return hdh_3.jnkh(Integer.rotateRight((n ^ tghd_2) * 709365537 - System.identityHashCode(hdh_3.class), 14));
    }

    public static int dhmt_2(int n, int n2) {
        return hdh_3.jnkh(Integer.rotateRight(n * -261651593 ^ n2, 8) ^ bkth);
    }

    public static boolean sshsh(int n, int n2) {
        return ((hdh_3.dhmt_2(n, n2) + Thread.currentThread().hashCode()) * -246130127 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

