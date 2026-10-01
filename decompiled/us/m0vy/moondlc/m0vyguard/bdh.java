/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jr8qakhcprk;

    private bdh() {
    }

    public static int abk(int n) {
        int n2 = Integer.rotateRight(n * -1792382635 - System.identityHashCode(bdh.class), 10);
        int n3 = (n2 ^ n2 >>> 15) * 897903785;
        int n4 = (n3 ^ n3 >>> 9) * -1582776963;
        return n4 ^ n4 >>> 13;
    }

    public static int athsh(int n, int n2) {
        int n3 = n2 - n ^ 0x66A680A0;
        int n4 = (n3 ^ n3 >>> 14) * 313536365;
        int n5 = (n4 ^ n4 >>> 13) * 1693831027;
        return n5 ^ n5 >>> 21;
    }

    public static boolean dhzk_2(int n, int n2) {
        return ((bdh.athsh(n, n2) + Thread.currentThread().hashCode()) * 1694874275 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

