/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dd {
    private static final int tf_2 = -885016263;
    private static final int raw = 1798418472;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z6mupkqca99;

    private dd() {
    }

    public static int ts_2(int n) {
        int n2 = (n ^ dd.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ tf_2;
        int n3 = (n2 ^ n2 >>> 16) * -199834023;
        int n4 = (n3 ^ n3 >>> 9) * 208972595;
        return n4 ^ n4 >>> 16 ^ raw;
    }

    public static int ta_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 11)) + raw ^ tf_2;
        int n4 = (n3 ^ n3 >>> 13) * -1308149689;
        int n5 = (n4 ^ n4 >>> 16) * -688843351;
        return n5 ^ n5 >>> 21 ^ raw;
    }

    public static boolean shdhs_2(int n, int n2) {
        return ((dd.ta_2(n, n2) ^ (int)System.nanoTime()) * 253045793 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

