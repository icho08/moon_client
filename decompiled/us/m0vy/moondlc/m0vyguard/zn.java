/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zn {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vi291szts6jnj9;

    private zn() {
    }

    public static int adhy(int n) {
        int n2 = Integer.rotateRight(n * 119908007 - System.identityHashCode(zn.class), 16);
        int n3 = (n2 ^ n2 >>> 18) * 19208355;
        int n4 = (n3 ^ n3 >>> 12) * -324598899;
        return n4 ^ n4 >>> 13;
    }

    public static int shay_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x14);
        int n4 = (n3 ^ n3 >>> 15) * -1049453985;
        int n5 = (n4 ^ n4 >>> 13) * -1560198475;
        return n5 ^ n5 >>> 15;
    }

    public static boolean szkh_2(int n, int n2) {
        return ((zn.shay_2(n, n2) + Thread.currentThread().hashCode()) * 853296089 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

