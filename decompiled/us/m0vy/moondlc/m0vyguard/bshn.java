/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshn {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gab5mxl95ab;

    private bshn() {
    }

    private static int bta_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 7) * 83281179;
        int n4 = (n3 ^ n3 >>> 12) * -1682851631;
        return n4 ^ n4 >>> 19;
    }

    public static int dmf_2(int n) {
        return bshn.bta_3(Integer.rotateRight(n * -1044619083 - System.identityHashCode(bshn.class), 13));
    }

    public static int dnsh_2(int n, int n2) {
        return bshn.bta_3(Integer.rotateLeft(n ^ n2, 17) * -97499131);
    }

    public static boolean tkhsh(int n, int n2) {
        return ((bshn.dnsh_2(n, n2) + Thread.currentThread().hashCode()) * 580851831 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

