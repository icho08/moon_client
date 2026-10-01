/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tthl {
    private static final int hff = 740791704;
    private static final int khmdh = -1811628097;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int igmt249tetw;

    private tthl() {
    }

    public static int aal(int n) {
        int n2 = n ^ System.identityHashCode(tthl.class) ^ (int)Thread.currentThread().getId() * -679003749 ^ hff;
        int n3 = (n2 ^ n2 >>> 16) * -1576186775;
        int n4 = (n3 ^ n3 >>> 14) * -1814143931;
        return n4 ^ n4 >>> 22 ^ khmdh;
    }

    public static int dhsdh_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1429628569 ^ n2, 5) + khmdh ^ hff;
        int n4 = (n3 ^ n3 >>> 17) * 1149809781;
        int n5 = (n4 ^ n4 >>> 12) * 2091492031;
        return n5 ^ n5 >>> 19 ^ khmdh;
    }

    public static boolean rdh_2(int n, int n2) {
        return ((tthl.dhsdh_2(n, n2) ^ (int)System.nanoTime()) * 1502524647 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

