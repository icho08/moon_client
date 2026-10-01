/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thm {
    private static final int khzf_2 = 2065565469;
    private static final int sqh = 318912049;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zhs5v579h8xl;

    private thm() {
    }

    private static int thhz(int n) {
        int n2 = n ^ khzf_2;
        int n3 = (n2 ^ n2 >>> 12) * -656363779;
        int n4 = (n3 ^ n3 >>> 9) * -2141900183;
        return (n4 ^ n4 >>> 20) + sqh;
    }

    public static int asz_2(int n) {
        return thm.thhz(n ^ System.identityHashCode(thm.class) ^ (int)Thread.currentThread().getId() * 1816233393 ^ khzf_2);
    }

    public static int std(int n, int n2) {
        return thm.thhz(Integer.rotateRight(n * 1408230903 ^ n2, 11) + sqh ^ khzf_2);
    }

    public static boolean shddh_2(int n, int n2) {
        return ((thm.std(n, n2) ^ (int)System.nanoTime()) * 408381601 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

