/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdhn {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dt281tcozc84;

    private tdhn() {
    }

    private static int bydh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -1697961263;
        int n4 = (n3 ^ n3 >>> 18) * -1017733103;
        return n4 ^ n4 >>> 22;
    }

    public static int dhts_2(int n) {
        return tdhn.bydh(Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * 1765142203);
    }

    public static int tmgh_2(int n, int n2) {
        return tdhn.bydh(n + n2 ^ Integer.rotateLeft(n, 7));
    }

    public static boolean sha_5(int n, int n2) {
        return ((tdhn.tmgh_2(n, n2) + Thread.currentThread().hashCode()) * -1872545381 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

