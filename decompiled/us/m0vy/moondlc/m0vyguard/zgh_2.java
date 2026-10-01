/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zgh_2 {
    private static final int thds_3 = -127441956;
    private static final int shtn = 1366027883;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int qd9gt2xvh6h;

    private zgh_2() {
    }

    private static int rmd(int n) {
        int n2 = n ^ thds_3;
        int n3 = (n2 ^ n2 >>> 9) * -264244283;
        int n4 = (n3 ^ n3 >>> 19) * -1471987265;
        return (n4 ^ n4 >>> 17) + shtn;
    }

    public static int snt(int n) {
        return zgh_2.rmd((n ^ zgh_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thds_3);
    }

    public static int sfd_2(int n, int n2) {
        return zgh_2.rmd((n2 - n ^ 0x166A492) + shtn ^ thds_3);
    }

    public static boolean khkhy(int n, int n2) {
        return ((zgh_2.sfd_2(n, n2) ^ (int)System.nanoTime()) * 1755322057 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

