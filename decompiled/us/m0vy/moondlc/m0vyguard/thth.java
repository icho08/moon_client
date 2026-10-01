/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thth {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int prpc1fux6ebx;

    private thth() {
    }

    public static int zjl_2(int n) {
        int n2 = Integer.rotateRight(n * 294081251 - System.identityHashCode(thth.class), 15);
        int n3 = (n2 ^ n2 >>> 12) * -949191701;
        int n4 = (n3 ^ n3 >>> 7) * -2096619455;
        return n4 ^ n4 >>> 18;
    }

    public static int thw_3(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 12);
        int n4 = (n3 ^ n3 >>> 8) * 2017390585;
        int n5 = (n4 ^ n4 >>> 10) * 526588231;
        return n5 ^ n5 >>> 14;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

