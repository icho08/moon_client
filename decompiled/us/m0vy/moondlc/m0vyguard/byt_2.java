/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class byt_2 {
    private static final int dkz = 336386818;
    private static final int shkh_3 = -985966357;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int g4nrbxcgmy4;

    private byt_2() {
    }

    private static int tbgh(int n) {
        int n2 = n ^ dkz;
        int n3 = (n2 ^ n2 >>> 9) * -1000106479;
        int n4 = (n3 ^ n3 >>> 11) * 1607002991;
        return (n4 ^ n4 >>> 16) + shkh_3;
    }

    public static int dkhy(int n) {
        return byt_2.tbgh(Integer.rotateLeft(n ^ dkz ^ (int)System.nanoTime(), 7) * -461241707);
    }

    public static int adha(int n, int n2) {
        return byt_2.tbgh(Integer.rotateLeft(n ^ n2, 11) * 1080279991 ^ shkh_3);
    }

    public static boolean ssa_3(int n, int n2) {
        return ((byt_2.adha(n, n2) + Thread.currentThread().hashCode()) * -1374095717 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

