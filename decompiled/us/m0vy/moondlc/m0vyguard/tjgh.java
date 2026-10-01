/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjgh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int n3jc0q5u6xqmg;

    private tjgh() {
    }

    public static int thtb(int n) {
        int n2 = n ^ System.identityHashCode(tjgh.class) ^ (int)Thread.currentThread().getId() * -82716007;
        int n3 = (n2 ^ n2 >>> 16) * -1956225649;
        int n4 = (n3 ^ n3 >>> 8) * -652603505;
        return n4 ^ n4 >>> 17;
    }

    public static int qa_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 16) * 877877557;
        int n4 = (n3 ^ n3 >>> 11) * 907645943;
        int n5 = (n4 ^ n4 >>> 10) * 294503941;
        return n5 ^ n5 >>> 12;
    }

    public static boolean ghdm_2(int n, int n2) {
        return ((tjgh.qa_2(n, n2) ^ (int)System.nanoTime()) * 1668962469 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

