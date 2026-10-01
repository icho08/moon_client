/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class blb {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qn8l785iwk;

    private blb() {
    }

    private static int fj(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 1078201787;
        int n4 = (n3 ^ n3 >>> 16) * 987438709;
        return n4 ^ n4 >>> 11;
    }

    public static int tthz_3(int n) {
        return blb.fj((n ^ blb.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int bdz_4(int n, int n2) {
        return blb.fj(n + n2 ^ Integer.rotateLeft(n, 14));
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

