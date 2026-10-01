/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tht_6 {
    private static final int tnf = -1201259881;
    private static final int htb_2 = -988966734;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int bplpr8bnmfctwi;

    private tht_6() {
    }

    private static int zthdh(int n) {
        int n2 = n ^ tnf;
        int n3 = (n2 ^ n2 >>> 11) * -1511120619;
        int n4 = (n3 ^ n3 >>> 13) * -974836535;
        return (n4 ^ n4 >>> 21) + htb_2;
    }

    public static int tdhz_3(int n) {
        return tht_6.zthdh(n ^ System.identityHashCode(tht_6.class) ^ (int)Thread.currentThread().getId() * -1225205563 ^ tnf);
    }

    public static int thrb(int n, int n2) {
        return tht_6.zthdh((n2 ^ Integer.rotateLeft(n, n2 & 0x13)) + htb_2 ^ tnf);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

