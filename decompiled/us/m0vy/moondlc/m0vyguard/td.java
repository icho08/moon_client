/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class td {
    private static final int skhd_4 = -326651032;
    private static final int zwz_2 = -648350940;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int u06estk9625;

    private td() {
    }

    public static int zt(int n) {
        int n2 = Integer.rotateRight((n ^ skhd_4) * -1255362389 - System.identityHashCode(td.class), 24);
        int n3 = (n2 ^ n2 >>> 13) * 51896395;
        int n4 = (n3 ^ n3 >>> 14) * -658167095;
        return n4 ^ n4 >>> 13;
    }

    public static int bhn(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 13) * 322449593 ^ zwz_2;
        int n4 = (n3 ^ n3 >>> 15) * -695423833;
        int n5 = (n4 ^ n4 >>> 9) * -826725413;
        return n5 ^ n5 >>> 12;
    }

    public static boolean thh_6(int n, int n2) {
        return ((td.bhn(n, n2) + Thread.currentThread().hashCode()) * -1790026803 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

