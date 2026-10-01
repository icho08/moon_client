/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tha_6 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wl21q4x3l;

    private tha_6() {
    }

    private static int zqh_4(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -577691619;
        int n4 = (n3 ^ n3 >>> 17) * -193813905;
        return n4 ^ n4 >>> 12;
    }

    public static int thfgh(int n) {
        return tha_6.zqh_4(n ^ System.identityHashCode(tha_6.class) ^ (int)Thread.currentThread().getId() * -122320747);
    }

    public static int thz_4(int n, int n2) {
        return tha_6.zqh_4(Integer.rotateRight(n * -2115136629 ^ n2, 10));
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

