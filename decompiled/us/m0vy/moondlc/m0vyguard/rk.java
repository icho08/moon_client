/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rk {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int pvelgzahqqg6q;

    private rk() {
    }

    public static int tty_3(int n) {
        int n2 = (n ^ rk.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 14) * -290866251;
        int n4 = (n3 ^ n3 >>> 13) * -914646139;
        return n4 ^ n4 >>> 14;
    }

    public static int shjth(int n, int n2) {
        int n3 = Integer.rotateRight(n * -2100560685 ^ n2, 8);
        int n4 = (n3 ^ n3 >>> 8) * -800736985;
        int n5 = (n4 ^ n4 >>> 9) * 1305528197;
        return n5 ^ n5 >>> 17;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

