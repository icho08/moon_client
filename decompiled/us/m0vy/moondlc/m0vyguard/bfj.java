/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfj {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int e43fbnm6lxv8;

    private bfj() {
    }

    private static int jt(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * -2129349787;
        int n4 = (n3 ^ n3 >>> 14) * 1054667119;
        return n4 ^ n4 >>> 21;
    }

    public static int dhhth(int n) {
        return bfj.jt((n ^ bfj.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int hhh_3(int n, int n2) {
        return bfj.jt(n + n2 ^ Integer.rotateLeft(n, 6));
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

