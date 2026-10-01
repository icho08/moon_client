/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tath {
    private static final int thmq = -1913990904;
    private static final int zzz_3 = -182426289;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hed0lnizus;

    private tath() {
    }

    public static int khal_2(int n) {
        int n2 = Integer.rotateRight(n * 962549847 - System.identityHashCode(tath.class), 14) ^ thmq;
        int n3 = (n2 ^ n2 >>> 12) * 624797513;
        int n4 = (n3 ^ n3 >>> 11) * 978061165;
        return n4 ^ n4 >>> 15 ^ zzz_3;
    }

    public static int ryh_2(int n, int n2) {
        int n3 = (n2 - n ^ 0x8C62A81B) + zzz_3 ^ thmq;
        int n4 = (n3 ^ n3 >>> 13) * -1204422571;
        int n5 = (n4 ^ n4 >>> 15) * 140816087;
        return n5 ^ n5 >>> 15 ^ zzz_3;
    }

    public static boolean dst_2(int n, int n2) {
        return ((tath.ryh_2(n, n2) + Thread.currentThread().hashCode()) * -208082815 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

