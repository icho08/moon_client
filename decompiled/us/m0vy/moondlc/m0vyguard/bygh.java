/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bygh {
    private static final int shakh_2 = -1519831655;
    private static final int tmgh = -733155418;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ap0c4kzv5th;

    private bygh() {
    }

    public static int thnb(int n) {
        int n2 = Integer.rotateRight((n ^ shakh_2) * -563614941 - System.identityHashCode(bygh.class), 8);
        int n3 = (n2 ^ n2 >>> 16) * 916153437;
        int n4 = (n3 ^ n3 >>> 13) * -990037491;
        return n4 ^ n4 >>> 17;
    }

    public static int swz_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 17) * 642995021 ^ tmgh;
        int n4 = (n3 ^ n3 >>> 9) * -1929431263;
        int n5 = (n4 ^ n4 >>> 18) * 1563748489;
        return n5 ^ n5 >>> 22;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

