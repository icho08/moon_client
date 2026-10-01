/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class mgh {
    private static final int dhthy = -1440547076;
    private static final int dls_2 = 527510367;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fgvdl0wyk;

    private mgh() {
    }

    private static int bsth(int n) {
        int n2 = n ^ dhthy;
        int n3 = (n2 ^ n2 >>> 13) * -1082971497;
        int n4 = (n3 ^ n3 >>> 13) * 1966974913;
        return (n4 ^ n4 >>> 20) + dls_2;
    }

    public static int tsd_2(int n) {
        return mgh.bsth(Integer.rotateRight(n * 907923513 - System.identityHashCode(mgh.class), 17) ^ dhthy);
    }

    public static int hjj(int n, int n2) {
        return mgh.bsth(Integer.rotateLeft(n ^ n2, 18) * -1117460601 + dls_2 ^ dhthy);
    }

    public static boolean ghbth(int n, int n2) {
        return ((mgh.hjj(n, n2) + Thread.currentThread().hashCode()) * -34970663 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

