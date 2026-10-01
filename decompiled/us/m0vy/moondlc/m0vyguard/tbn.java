/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tbn {
    private static final int zths = -742942087;
    private static final int jwh = -2008184390;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nbwnxj49asr1;

    private tbn() {
    }

    public static int bak(int n) {
        int n2 = n ^ zths ^ System.identityHashCode(tbn.class) ^ (int)Thread.currentThread().getId() * 1013157839;
        int n3 = (n2 ^ n2 >>> 11) * 860317831;
        int n4 = (n3 ^ n3 >>> 7) * 1773192433;
        return n4 ^ n4 >>> 14;
    }

    public static int szq_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1491204867 ^ n2, 19) ^ jwh;
        int n4 = (n3 ^ n3 >>> 16) * 800449249;
        int n5 = (n4 ^ n4 >>> 16) * -1033164193;
        return n5 ^ n5 >>> 17;
    }

    public static boolean thmt_2(int n, int n2) {
        return ((tbn.szq_3(n, n2) ^ (int)System.nanoTime()) * -1684471577 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

