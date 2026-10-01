/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tal {
    private static final int sqm = 295797694;
    private static final int thyj = -1687671439;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int reh6wohd;

    private tal() {
    }

    private static int dws_3(int n) {
        int n2 = n ^ sqm;
        int n3 = (n2 ^ n2 >>> 9) * -1131103345;
        int n4 = (n3 ^ n3 >>> 10) * 754358219;
        return (n4 ^ n4 >>> 12) + thyj;
    }

    public static int azs_3(int n) {
        return tal.dws_3(n ^ System.identityHashCode(tal.class) ^ (int)Thread.currentThread().getId() * 2137049159 ^ sqm);
    }

    public static int qkh(int n, int n2) {
        return tal.dws_3(Integer.rotateRight(n * -1990448845 ^ n2, 8) + thyj ^ sqm);
    }

    public static boolean btha_2(int n, int n2) {
        return ((tal.qkh(n, n2) ^ (int)System.nanoTime()) * 1571917799 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

