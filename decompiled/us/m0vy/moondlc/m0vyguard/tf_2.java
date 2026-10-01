/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tf_2 {
    private static final int khdhd_2 = 962261196;
    private static final int dtf_2 = 91270150;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int pieeceu15wh;

    private tf_2() {
    }

    public static int zdhr(int n) {
        int n2 = Integer.rotateRight(n * 167017937 - System.identityHashCode(tf_2.class), 22) ^ khdhd_2;
        int n3 = (n2 ^ n2 >>> 14) * -1346344603;
        int n4 = (n3 ^ n3 >>> 13) * 522412931;
        return n4 ^ n4 >>> 16 ^ dtf_2;
    }

    public static int sdf(int n, int n2) {
        int n3 = (n2 - n ^ 0x73316AE8) + dtf_2 ^ khdhd_2;
        int n4 = (n3 ^ n3 >>> 16) * -1449918401;
        int n5 = (n4 ^ n4 >>> 15) * 1700869671;
        return n5 ^ n5 >>> 12 ^ dtf_2;
    }

    public static boolean dksh_2(int n, int n2) {
        return ((tf_2.sdf(n, n2) + Thread.currentThread().hashCode()) * 1253993395 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

