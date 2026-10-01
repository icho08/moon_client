/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tst_2 {
    private static final int sms_2 = 93641189;
    private static final int has_4 = -859862381;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int skk8113unsh1iw;

    private tst_2() {
    }

    public static int bf(int n) {
        int n2 = n ^ System.identityHashCode(tst_2.class) ^ (int)Thread.currentThread().getId() * 1916620421 ^ sms_2;
        int n3 = (n2 ^ n2 >>> 11) * -1272662211;
        int n4 = (n3 ^ n3 >>> 10) * 1747574201;
        return n4 ^ n4 >>> 16 ^ has_4;
    }

    public static int zwz(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 5)) + has_4 ^ sms_2;
        int n4 = (n3 ^ n3 >>> 17) * 1432623213;
        int n5 = (n4 ^ n4 >>> 9) * 907867251;
        return n5 ^ n5 >>> 16 ^ has_4;
    }

    public static boolean sdsh_3(int n, int n2) {
        return ((tst_2.zwz(n, n2) ^ (int)System.nanoTime()) * 1606318931 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

