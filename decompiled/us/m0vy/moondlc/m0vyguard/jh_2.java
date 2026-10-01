/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class jh_2 {
    private static final int jhl = 1086336978;
    private static final int hrt = -62306850;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mu5kh7x3ashgep;

    private jh_2() {
    }

    public static int zwd_2(int n) {
        int n2 = Integer.rotateRight((n ^ jhl) * -2020587681 - System.identityHashCode(jh_2.class), 22);
        int n3 = (n2 ^ n2 >>> 18) * -1093074365;
        int n4 = (n3 ^ n3 >>> 10) * 190256433;
        return n4 ^ n4 >>> 14;
    }

    public static int san_4(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * -1445999945 ^ hrt;
        int n4 = (n3 ^ n3 >>> 15) * -691978915;
        int n5 = (n4 ^ n4 >>> 15) * -163653183;
        return n5 ^ n5 >>> 22;
    }

    public static boolean ssht_4(int n, int n2) {
        return ((jh_2.san_4(n, n2) + Thread.currentThread().hashCode()) * 233172763 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

