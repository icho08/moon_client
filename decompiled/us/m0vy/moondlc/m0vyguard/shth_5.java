/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shth_5 {
    private static final int jjgh = 1195160948;
    private static final int khhb_2 = -352210257;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ip2bowgv8w9msm;

    private shth_5() {
    }

    public static int tjy_2(int n) {
        int n2 = Integer.rotateRight(n * 441256291 - System.identityHashCode(shth_5.class), 19) ^ jjgh;
        int n3 = (n2 ^ n2 >>> 17) * 1772177477;
        int n4 = (n3 ^ n3 >>> 7) * -546927645;
        return n4 ^ n4 >>> 14 ^ khhb_2;
    }

    public static int hdf(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 9) * 101972411 + khhb_2 ^ jjgh;
        int n4 = (n3 ^ n3 >>> 15) * -2068382065;
        int n5 = (n4 ^ n4 >>> 16) * 1201811211;
        return n5 ^ n5 >>> 12 ^ khhb_2;
    }

    public static boolean shhsh(int n, int n2) {
        return ((shth_5.hdf(n, n2) + Thread.currentThread().hashCode()) * 1836617447 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

