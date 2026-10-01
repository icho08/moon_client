/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class kn {
    private static final int ddh_4 = -40971552;
    private static final int thkz_2 = -480462164;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nf6209w6bumah;

    private kn() {
    }

    public static int sqs_2(int n) {
        int n2 = (n ^ ddh_4 ^ kn.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 18) * -1632378331;
        int n4 = (n3 ^ n3 >>> 9) * 1953149125;
        return n4 ^ n4 >>> 17;
    }

    public static int bdn_2(int n, int n2) {
        int n3 = n2 - n ^ 0xF253546D ^ thkz_2;
        int n4 = (n3 ^ n3 >>> 11) * -2080969261;
        int n5 = (n4 ^ n4 >>> 10) * 1729667463;
        return n5 ^ n5 >>> 17;
    }

    public static boolean sa_2(int n, int n2) {
        return ((kn.bdn_2(n, n2) ^ (int)System.nanoTime()) * 1690846723 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

