/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btj {
    private static final int jwl = 1902849374;
    private static final int dhths_2 = 1469012630;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int e9dswt11y0i;

    private btj() {
    }

    public static int zsd(int n) {
        int n2 = Integer.rotateRight(n * -920480173 - System.identityHashCode(btj.class), 7) ^ jwl;
        int n3 = (n2 ^ n2 >>> 13) * 2046779007;
        int n4 = (n3 ^ n3 >>> 10) * 578198131;
        return n4 ^ n4 >>> 18 ^ dhths_2;
    }

    public static int thnf(int n, int n2) {
        int n3 = (n2 - n ^ 0x91BBD44) + dhths_2 ^ jwl;
        int n4 = (n3 ^ n3 >>> 12) * 1137213975;
        int n5 = (n4 ^ n4 >>> 18) * -114374265;
        return n5 ^ n5 >>> 14 ^ dhths_2;
    }

    public static boolean thh_8(int n, int n2) {
        return ((btj.thnf(n, n2) + Thread.currentThread().hashCode()) * 1478666457 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

