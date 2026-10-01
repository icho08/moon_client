/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class baa_4 {
    private static final int rrs_2 = 1132731227;
    private static final int hdsh_2 = 1216598108;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oykmn9byaorpwo;

    private baa_4() {
    }

    public static int drh_3(int n) {
        int n2 = n ^ rrs_2 ^ System.identityHashCode(baa_4.class) ^ (int)Thread.currentThread().getId() * 734901215;
        int n3 = (n2 ^ n2 >>> 16) * -579776911;
        int n4 = (n3 ^ n3 >>> 7) * -1602588307;
        return n4 ^ n4 >>> 21;
    }

    public static int smt_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 3) ^ hdsh_2;
        int n4 = (n3 ^ n3 >>> 8) * -901809563;
        int n5 = (n4 ^ n4 >>> 9) * -133743885;
        return n5 ^ n5 >>> 16;
    }

    public static boolean adm(int n, int n2) {
        return ((baa_4.smt_2(n, n2) ^ (int)System.nanoTime()) * 181591583 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

