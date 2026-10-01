/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkhy {
    private static final int thzk_2 = -2112790547;
    private static final int jjq = -1520412373;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qa0b6pvnzy6e3;

    private bkhy() {
    }

    public static int tlb(int n) {
        int n2 = Integer.rotateLeft(n ^ thzk_2 ^ (int)System.nanoTime(), 4) * -1986958263;
        int n3 = (n2 ^ n2 >>> 12) * 1093701977;
        int n4 = (n3 ^ n3 >>> 14) * -1922048713;
        return n4 ^ n4 >>> 14;
    }

    public static int tbf_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 16) ^ jjq;
        int n4 = (n3 ^ n3 >>> 12) * -686187181;
        int n5 = (n4 ^ n4 >>> 16) * -221804929;
        return n5 ^ n5 >>> 18;
    }

    public static boolean tmt_3(int n, int n2) {
        return ((bkhy.tbf_2(n, n2) + Thread.currentThread().hashCode()) * -454935431 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

