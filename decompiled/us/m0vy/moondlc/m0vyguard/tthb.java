/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthb {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int okllfs766wpc;

    private tthb() {
    }

    public static int lh_2(int n) {
        int n2 = (n ^ tthb.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 17) * 957203599;
        int n4 = (n3 ^ n3 >>> 11) * 1935541017;
        return n4 ^ n4 >>> 21;
    }

    public static int ghz_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 13) * 548028261;
        int n4 = (n3 ^ n3 >>> 14) * -868629855;
        int n5 = (n4 ^ n4 >>> 10) * -1167704941;
        return n5 ^ n5 >>> 13;
    }

    public static boolean hqth(int n, int n2) {
        return ((tthb.ghz_2(n, n2) ^ (int)System.nanoTime()) * -155999497 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

