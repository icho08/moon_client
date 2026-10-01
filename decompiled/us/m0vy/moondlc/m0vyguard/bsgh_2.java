/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsgh_2 {
    private static final int dhsj = 139187327;
    private static final int tbd_2 = -375644698;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ofpmpx1ek1c00;

    private bsgh_2() {
    }

    public static int ady(int n) {
        int n2 = n ^ dhsj ^ System.identityHashCode(bsgh_2.class) ^ (int)Thread.currentThread().getId() * 1777776393;
        int n3 = (n2 ^ n2 >>> 17) * 868309889;
        int n4 = (n3 ^ n3 >>> 7) * -1378735949;
        return n4 ^ n4 >>> 20;
    }

    public static int hshr(int n, int n2) {
        int n3 = Integer.rotateRight(n * 2034779379 ^ n2, 8) ^ tbd_2;
        int n4 = (n3 ^ n3 >>> 17) * -1502103867;
        int n5 = (n4 ^ n4 >>> 16) * -611125727;
        return n5 ^ n5 >>> 22;
    }

    public static boolean thdh_6(int n, int n2) {
        return ((bsgh_2.hshr(n, n2) ^ (int)System.nanoTime()) * 836784709 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

