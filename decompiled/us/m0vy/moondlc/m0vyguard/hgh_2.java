/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hgh_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ibtfxbeetlh74y;

    private hgh_2() {
    }

    public static int bal(int n) {
        int n2 = n ^ System.identityHashCode(hgh_2.class) ^ (int)Thread.currentThread().getId() * -806056209;
        int n3 = (n2 ^ n2 >>> 15) * -762612585;
        int n4 = (n3 ^ n3 >>> 10) * -2005214713;
        return n4 ^ n4 >>> 14;
    }

    public static int sysh_2(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 11);
        int n4 = (n3 ^ n3 >>> 9) * -950456651;
        int n5 = (n4 ^ n4 >>> 16) * -1068549649;
        return n5 ^ n5 >>> 20;
    }

    public static boolean jsm(int n, int n2) {
        return ((hgh_2.sysh_2(n, n2) ^ (int)System.nanoTime()) * -732539881 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

