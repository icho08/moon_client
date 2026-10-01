/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bbsh {
    private static final int thghgh = -389097068;
    private static final int thzf = 1691679140;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int szf4n4j8;

    private bbsh() {
    }

    public static int zadh_2(int n) {
        int n2 = (n ^ bbsh.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ thghgh;
        int n3 = (n2 ^ n2 >>> 11) * 1661293697;
        int n4 = (n3 ^ n3 >>> 13) * -860564597;
        return n4 ^ n4 >>> 20 ^ thzf;
    }

    public static int sghz(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 9)) + thzf ^ thghgh;
        int n4 = (n3 ^ n3 >>> 15) * -1999060853;
        int n5 = (n4 ^ n4 >>> 11) * 1607851547;
        return n5 ^ n5 >>> 19 ^ thzf;
    }

    public static boolean jdh_2(int n, int n2) {
        return ((bbsh.sghz(n, n2) ^ (int)System.nanoTime()) * 449704239 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

