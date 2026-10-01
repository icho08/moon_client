/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class blk {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int smk8ii2fqu4;

    private blk() {
    }

    public static int sls_2(int n) {
        int n2 = Integer.rotateRight(n * 1182673069 - System.identityHashCode(blk.class), 13);
        int n3 = (n2 ^ n2 >>> 15) * -1067341619;
        int n4 = (n3 ^ n3 >>> 14) * -1004995883;
        return n4 ^ n4 >>> 14;
    }

    public static int bdf_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -2122909085 ^ n2, 8);
        int n4 = (n3 ^ n3 >>> 14) * -1171114343;
        int n5 = (n4 ^ n4 >>> 14) * -844838805;
        return n5 ^ n5 >>> 12;
    }

    public static boolean hsdh(int n, int n2) {
        return ((blk.bdf_2(n, n2) + Thread.currentThread().hashCode()) * 1800794359 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

