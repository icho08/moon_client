/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bghw {
    private static final int brm = -17321503;
    private static final int thshd_2 = 242755544;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int e6d8rdi5crh4c;

    private bghw() {
    }

    public static int dnw(int n) {
        int n2 = Integer.rotateRight(n * 1689560461 - System.identityHashCode(bghw.class), 7) ^ brm;
        int n3 = (n2 ^ n2 >>> 15) * 1595422743;
        int n4 = (n3 ^ n3 >>> 13) * 865291711;
        return n4 ^ n4 >>> 20 ^ thshd_2;
    }

    public static int shnn(int n, int n2) {
        int n3 = (n2 - n ^ 0xCEF60FA4) + thshd_2 ^ brm;
        int n4 = (n3 ^ n3 >>> 15) * -1034350345;
        int n5 = (n4 ^ n4 >>> 18) * -727004443;
        return n5 ^ n5 >>> 18 ^ thshd_2;
    }

    public static boolean dhjb(int n, int n2) {
        return ((bghw.shnn(n, n2) + Thread.currentThread().hashCode()) * -1753444639 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

