/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class nt_2 {
    private static final int bz_2 = -57000009;
    private static final int dhna = -1146368378;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int h5fljglcqztk;

    private nt_2() {
    }

    public static int thkhk(int n) {
        int n2 = Integer.rotateLeft(n ^ bz_2 ^ (int)System.nanoTime(), 14) * 849243187;
        int n3 = (n2 ^ n2 >>> 14) * -1614398665;
        int n4 = (n3 ^ n3 >>> 13) * 1354493897;
        return n4 ^ n4 >>> 20;
    }

    public static int zka_2(int n, int n2) {
        int n3 = n2 - n ^ 0x6C2BFF19 ^ dhna;
        int n4 = (n3 ^ n3 >>> 17) * 2042110307;
        int n5 = (n4 ^ n4 >>> 13) * -526851227;
        return n5 ^ n5 >>> 17;
    }

    public static boolean ghshh_2(int n, int n2) {
        return ((nt_2.zka_2(n, n2) + Thread.currentThread().hashCode()) * -2115046941 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

