/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sn {
    private static final int rdt_3 = -54379394;
    private static final int ttsh = -2077378147;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v5ianwep;

    private sn() {
    }

    private static int akhy(int n) {
        int n2 = n ^ rdt_3;
        int n3 = (n2 ^ n2 >>> 7) * -1233469067;
        int n4 = (n3 ^ n3 >>> 13) * -372303401;
        return (n4 ^ n4 >>> 19) + ttsh;
    }

    public static int rthh(int n) {
        return sn.akhy(Integer.rotateLeft(n ^ rdt_3 ^ (int)System.nanoTime(), 15) * 2010234981);
    }

    public static int kh_2(int n, int n2) {
        return sn.akhy(Integer.rotateLeft(n ^ n2, 4) * 1862638417 ^ ttsh);
    }

    public static boolean zas_5(int n, int n2) {
        return ((sn.kh_2(n, n2) + Thread.currentThread().hashCode()) * -1653364231 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

