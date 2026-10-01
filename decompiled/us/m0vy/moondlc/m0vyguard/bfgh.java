/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfgh {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sxe49f9e42nj1;

    private bfgh() {
    }

    public static int khlk(int n) {
        int n2 = Integer.rotateRight(n * 825474057 - System.identityHashCode(bfgh.class), 19);
        int n3 = (n2 ^ n2 >>> 18) * 1396462501;
        int n4 = (n3 ^ n3 >>> 9) * 42431839;
        return n4 ^ n4 >>> 18;
    }

    public static int sfh_4(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x13);
        int n4 = (n3 ^ n3 >>> 15) * 389008203;
        int n5 = (n4 ^ n4 >>> 16) * -739932887;
        return n5 ^ n5 >>> 16;
    }

    public static boolean jaz_3(int n, int n2) {
        return ((bfgh.sfh_4(n, n2) + Thread.currentThread().hashCode()) * -2120330159 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

