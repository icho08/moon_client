/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhb {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fyk7uxwckuhexx;

    private tkhb() {
    }

    public static int byr(int n) {
        int n2 = n ^ System.identityHashCode(tkhb.class) ^ (int)Thread.currentThread().getId() * 637751327;
        int n3 = (n2 ^ n2 >>> 18) * 974199405;
        int n4 = (n3 ^ n3 >>> 12) * 941624543;
        return n4 ^ n4 >>> 19;
    }

    public static int zdhd(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xE);
        int n4 = (n3 ^ n3 >>> 8) * -1090079721;
        int n5 = (n4 ^ n4 >>> 16) * 816335871;
        return n5 ^ n5 >>> 16;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

