/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shs_6 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ce8ufwqt4mj;

    private shs_6() {
    }

    public static int thrt(int n) {
        int n2 = Integer.rotateRight(n * -2057221323 - System.identityHashCode(shs_6.class), 20);
        int n3 = (n2 ^ n2 >>> 15) * 2063830007;
        int n4 = (n3 ^ n3 >>> 10) * -1278519525;
        return n4 ^ n4 >>> 22;
    }

    public static int sat_3(int n, int n2) {
        int n3 = n2 - n ^ 0xFE8140DA;
        int n4 = (n3 ^ n3 >>> 14) * -203410039;
        int n5 = (n4 ^ n4 >>> 17) * 1176965885;
        return n5 ^ n5 >>> 21;
    }

    public static boolean sddh_3(int n, int n2) {
        return ((shs_6.sat_3(n, n2) + Thread.currentThread().hashCode()) * 1703923535 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

