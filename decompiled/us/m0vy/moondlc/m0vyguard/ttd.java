/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ttd {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ugtqriquu5;

    private ttd() {
    }

    private static int ghzgh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 7) * -983457949;
        int n4 = (n3 ^ n3 >>> 19) * -670416249;
        return n4 ^ n4 >>> 15;
    }

    public static int tbb(int n) {
        return ttd.ghzgh(Integer.rotateRight(n * -1777013599 - System.identityHashCode(ttd.class), 12));
    }

    public static int hkhsh(int n, int n2) {
        return ttd.ghzgh(n2 - n ^ 0xD78DE8B2);
    }

    public static boolean ngh(int n, int n2) {
        return ((ttd.hkhsh(n, n2) + Thread.currentThread().hashCode()) * -1673025047 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

