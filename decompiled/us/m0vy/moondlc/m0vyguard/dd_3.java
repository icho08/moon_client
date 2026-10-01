/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dd_3 {
    private static final int hnt_2 = -1335468545;
    private static final int jan_2 = -1727179323;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int m2vzb3ev1i3n6;

    private dd_3() {
    }

    public static int khkhh(int n) {
        int n2 = n ^ System.identityHashCode(dd_3.class) ^ (int)Thread.currentThread().getId() * -4907743 ^ hnt_2;
        int n3 = (n2 ^ n2 >>> 14) * -1550958619;
        int n4 = (n3 ^ n3 >>> 13) * -66266827;
        return n4 ^ n4 >>> 19 ^ jan_2;
    }

    public static int dhwt_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 7) * 1494483187 + jan_2 ^ hnt_2;
        int n4 = (n3 ^ n3 >>> 16) * -536436263;
        int n5 = (n4 ^ n4 >>> 9) * -218975873;
        return n5 ^ n5 >>> 17 ^ jan_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

