/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trth {
    private static final int rtb_2 = 23794420;
    private static final int khqd_2 = -877053;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int apu0eaamo;

    private trth() {
    }

    private static int ayb(int n) {
        int n2 = n ^ rtb_2;
        int n3 = (n2 ^ n2 >>> 9) * 951028743;
        int n4 = (n3 ^ n3 >>> 10) * 1929231443;
        return (n4 ^ n4 >>> 12) + khqd_2;
    }

    public static int tthkh(int n) {
        return trth.ayb(n ^ rtb_2 ^ System.identityHashCode(trth.class) ^ (int)Thread.currentThread().getId() * 362262183);
    }

    public static int sdhz_2(int n, int n2) {
        return trth.ayb(n2 - n ^ 0x4E82A125 ^ khqd_2);
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

