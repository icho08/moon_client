/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trm {
    private static final int bmz = -1844441961;
    private static final int skhy_2 = 854318856;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int sarxaprp6jp;

    private trm() {
    }

    public static int dkw(int n) {
        int n2 = Integer.rotateRight(n * -939464427 - System.identityHashCode(trm.class), 11) ^ bmz;
        int n3 = (n2 ^ n2 >>> 12) * 159875429;
        int n4 = (n3 ^ n3 >>> 14) * 1945504593;
        return n4 ^ n4 >>> 21 ^ skhy_2;
    }

    public static int zthk(int n, int n2) {
        int n3 = (n2 - n ^ 0x8A39640D) + skhy_2 ^ bmz;
        int n4 = (n3 ^ n3 >>> 9) * 1951567053;
        int n5 = (n4 ^ n4 >>> 12) * -2096032183;
        return n5 ^ n5 >>> 22 ^ skhy_2;
    }

    public static boolean jqgh(int n, int n2) {
        return ((trm.zthk(n, n2) + Thread.currentThread().hashCode()) * 1059250615 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

