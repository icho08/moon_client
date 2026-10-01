/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tsha {
    private static final int thjt_2 = -35439398;
    private static final int hkhw = -700049923;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int di58c729zz;

    private tsha() {
    }

    public static int jjq(int n) {
        int n2 = (n ^ tsha.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thjt_2;
        int n3 = (n2 ^ n2 >>> 14) * 32912345;
        int n4 = (n3 ^ n3 >>> 10) * -569560387;
        return n4 ^ n4 >>> 17 ^ hkhw;
    }

    public static int hwh_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 14)) + hkhw ^ thjt_2;
        int n4 = (n3 ^ n3 >>> 17) * 855568491;
        int n5 = (n4 ^ n4 >>> 10) * 359080741;
        return n5 ^ n5 >>> 12 ^ hkhw;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

