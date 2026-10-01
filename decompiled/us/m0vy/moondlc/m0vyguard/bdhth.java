/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdhth {
    private static final int bbl = -36605862;
    private static final int shss = 69279842;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nhvi3ywcjl84;

    private bdhth() {
    }

    private static int da_2(int n) {
        int n2 = n ^ bbl;
        int n3 = (n2 ^ n2 >>> 16) * 294056371;
        int n4 = (n3 ^ n3 >>> 12) * 1740493997;
        return (n4 ^ n4 >>> 22) + shss;
    }

    public static int thwq(int n) {
        return bdhth.da_2(Integer.rotateRight(n * -910774625 - System.identityHashCode(bdhth.class), 14) ^ bbl);
    }

    public static int dad(int n, int n2) {
        return bdhth.da_2((n2 - n ^ 0x356B5C72) + shss ^ bbl);
    }

    public static boolean rthb(int n, int n2) {
        return ((bdhth.dad(n, n2) + Thread.currentThread().hashCode()) * -436206597 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

