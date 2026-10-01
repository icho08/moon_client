/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bty_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gxvwloagmje4;

    private bty_2() {
    }

    private static int shf_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * -1173673113;
        int n4 = (n3 ^ n3 >>> 15) * 1854139293;
        return n4 ^ n4 >>> 16;
    }

    public static int tghn(int n) {
        return bty_2.shf_2(Integer.rotateRight(n * 1574602177 - System.identityHashCode(bty_2.class), 17));
    }

    public static int tddh_4(int n, int n2) {
        return bty_2.shf_2(Integer.rotateLeft(n ^ n2, 16) * 476842171);
    }

    public static boolean rnf(int n, int n2) {
        return ((bty_2.tddh_4(n, n2) + Thread.currentThread().hashCode()) * -902126157 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

