/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsht_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vcokneffqetja4;

    private bsht_2() {
    }

    public static int hms_2(int n) {
        int n2 = n ^ System.identityHashCode(bsht_2.class) ^ (int)Thread.currentThread().getId() * 1460774397;
        int n3 = (n2 ^ n2 >>> 14) * -204904483;
        int n4 = (n3 ^ n3 >>> 7) * -1325382241;
        return n4 ^ n4 >>> 18;
    }

    public static int jsa_4(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x10);
        int n4 = (n3 ^ n3 >>> 14) * -725706597;
        int n5 = (n4 ^ n4 >>> 9) * 7244693;
        return n5 ^ n5 >>> 22;
    }

    public static boolean bshr(int n, int n2) {
        return ((bsht_2.jsa_4(n, n2) ^ (int)System.nanoTime()) * 701213957 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

