/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshs_2 {
    private static final int dhdd_3 = -1810563248;
    private static final int byq = 1442292142;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ce03firr1a;

    private bshs_2() {
    }

    public static int rkhy(int n) {
        int n2 = (n ^ bshs_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dhdd_3;
        int n3 = (n2 ^ n2 >>> 11) * -182709723;
        int n4 = (n3 ^ n3 >>> 11) * 911513017;
        return n4 ^ n4 >>> 17 ^ byq;
    }

    public static int sdl_4(int n, int n2) {
        int n3 = (n2 - n ^ 0x9FC85B) + byq ^ dhdd_3;
        int n4 = (n3 ^ n3 >>> 11) * 1689504069;
        int n5 = (n4 ^ n4 >>> 12) * 300642843;
        return n5 ^ n5 >>> 15 ^ byq;
    }

    public static boolean khaz_4(int n, int n2) {
        return ((bshs_2.sdl_4(n, n2) ^ (int)System.nanoTime()) * -905546577 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

