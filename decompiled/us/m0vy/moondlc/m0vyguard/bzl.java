/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzl {
    private static final int khnth = -85459572;
    private static final int stdh_2 = -1086928134;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ldh22zfvf3m9;

    private bzl() {
    }

    private static int bsj(int n) {
        int n2 = n ^ khnth;
        int n3 = (n2 ^ n2 >>> 8) * -212712275;
        int n4 = (n3 ^ n3 >>> 12) * -1065614867;
        return (n4 ^ n4 >>> 19) + stdh_2;
    }

    public static int zyh_2(int n) {
        return bzl.bsj(Integer.rotateLeft(n ^ khnth ^ (int)System.nanoTime(), 18) * 707634985);
    }

    public static int dza_4(int n, int n2) {
        return bzl.bsj(n2 ^ Integer.rotateLeft(n, n2 & 7) ^ stdh_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

