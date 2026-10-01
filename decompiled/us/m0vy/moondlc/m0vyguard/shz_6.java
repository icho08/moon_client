/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shz_6 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int g31fs5an;

    private shz_6() {
    }

    public static int thfb(int n) {
        int n2 = Integer.rotateRight(n * 872484489 - System.identityHashCode(shz_6.class), 8);
        int n3 = (n2 ^ n2 >>> 17) * -1363476567;
        int n4 = (n3 ^ n3 >>> 13) * 888726011;
        return n4 ^ n4 >>> 22;
    }

    public static int bmh_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x15);
        int n4 = (n3 ^ n3 >>> 8) * 1428919409;
        int n5 = (n4 ^ n4 >>> 10) * -478166439;
        return n5 ^ n5 >>> 12;
    }

    public static boolean bzkh_2(int n, int n2) {
        return ((shz_6.bmh_2(n, n2) + Thread.currentThread().hashCode()) * 550735973 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

