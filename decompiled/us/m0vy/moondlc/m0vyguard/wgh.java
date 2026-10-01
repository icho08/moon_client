/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class wgh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int a277lgalo0vltp;

    private wgh() {
    }

    private static int trs_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * -1959595015;
        int n4 = (n3 ^ n3 >>> 17) * 1161187443;
        return n4 ^ n4 >>> 23;
    }

    public static int ssj_3(int n) {
        return wgh.trs_3(Integer.rotateLeft(n ^ (int)System.nanoTime(), 12) * -659914547);
    }

    public static int tns(int n, int n2) {
        return wgh.trs_3(n + n2 ^ Integer.rotateLeft(n, 7));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

